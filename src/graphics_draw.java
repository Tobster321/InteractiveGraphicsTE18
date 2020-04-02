import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
@SuppressWarnings("serial")
public class graphics_draw extends JPanel {
    private Point lastpoint;
    public graphics_draw() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastpoint = new Point(e.getX(),e.getY());
            }
        });
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.drawLine(lastpoint.x,lastpoint.y, e.getX(),e.getY());
                g.dispose();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Great Graphics Program");
                frame.getContentPane().add(new graphics_draw(),BorderLayout.CENTER);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,400);
frame.setVisible(true);
    }






}
