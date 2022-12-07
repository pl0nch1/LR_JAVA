import java.awt.*;
import java.awt.event.*;

public class CustomCanvas extends Canvas {
    public CustomCanvas(){
        Frame frame = new Frame("ClassTypesDemo Application");
        this.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        frame.add(this);
        frame.setSize(1600, 900);
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
