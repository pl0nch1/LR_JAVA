import java.awt.*;
import java.util.Objects;

public class LR2_3 extends CustomCanvas {
    private String[] args;
    public static void main(String[] args) {
        LR2_3 canvas = new LR2_3(args);
    }
    public LR2_3(String[] args){
        super();
        this.args = args;
    }

    @Override
    public void paint(Graphics g){
        String[] temp = new String[args.length];
        for (int i=0; i<args.length; i++){
            temp[i] = args[i];
        }

        int maxLength = 0;
        int index = 0;
        g.drawString("До работы", 50, 50);
        g.drawString("После работы", 450, 50);

        for (int i=0; i<temp.length; i++){
            if (temp[i].length()>maxLength){
                maxLength = temp[i].length();
                index = i;
            }
            g.drawString(temp[i], 50, 100+i*50);
        }

        String target = temp[index];
        for (int i=index; i>0; i--){
            temp[i] = temp[i-1];
        }
        temp[0] = target;
        for (int i=0; i<temp.length; i++){
            temp[i] = temp[i].substring(0, temp[i].length() / 2) + String.valueOf(temp[i].length()) +
                    temp[i].substring(temp[i].length() / 2, temp[i].length());
            g.drawString(temp[i], 450, 100+i*50);
        }

    }
}
