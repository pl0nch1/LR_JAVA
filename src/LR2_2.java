import java.awt.*;

public class LR2_2 extends CustomCanvas {
    private String[] args, temp;
    public static void main(String[] args) {
        LR2_2 canvas = new LR2_2(args);
    }
    public LR2_2(String[] args){
        super();
        this.args = args.clone();
        this.temp = args.clone();
        for (int i=0; i<args.length-1; i++){
            for (int j=i+1; j<args.length; j++){
                if (this.temp[j].length()<this.temp[i].length()){
                    String temp = this.temp[j];
                    this.temp[j] = this.temp[i];
                    this.temp[i] = temp;
                }
            }
        }
        for (int i=0; i<args.length; i++) {
            int len = 0;
            while (len != (String.valueOf(len) + this.temp[i]).length()) {
                len = (String.valueOf(len) + this.temp[i]).length();
            }
            this.temp[i] = Integer.toString(len) + this.temp[i];
        }
    }

    @Override
    public void paint(Graphics g){
        g.drawString("До работы", 50, 50);
        g.drawString("После работы", 450, 50);
        for (int i=0; i<this.args.length; i++){
            g.drawString(this.args[i], 50, 100 + 50*i);
            g.drawString(this.temp[i], 450, 100 + 50*i);
        }
    }
}
