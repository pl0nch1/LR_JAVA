import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;

public class LR2_1 extends CustomCanvas {
    private String[] args;
    public static void main(String[] args) {
        LR2_1 canvas = new LR2_1(args);
    }
    public LR2_1(String[] args){
        super();
        this.args = args;
    }

    @Override
    public void paint(Graphics g){
        g.drawString("До работы", 50, 50);
        int count = 0;
        for (int i=0; i<this.args.length; i++){
            g.drawString(args[i], 50, 100 + i*25);
            for (int j=0; j<args[i].length(); j++){
                if ((48 <= args[i].charAt(j)) & (args[i].charAt(j) <= 57)){
                    count++;
                    break;
                }
            }
        }

        g.drawString("После работы", 250, 50);
        String[] result = new String[count];
        int offset=0;
        for (int i=0; i<count+offset; i++){
            result[i-offset] = "";
            for (int j=0; j<args[i].length(); j++){
                if ((48 <= args[i].charAt(j)) & (args[i].charAt(j) <= 57)){
                    result[i-offset] += args[i].charAt(j);
                }
            }
            g.drawString(result[i-offset], 250, 100 + (i-offset)*25);
            if (Objects.equals(result[i-offset], ""))
                offset++;
        }
    }
}
