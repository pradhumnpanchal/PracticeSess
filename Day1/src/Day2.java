import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Day2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        JFrame frame  = new JFrame("ItelliJ");
        //JPanel panel = new JPanel();
        String str = s.nextLine();
        JLabel label = new JLabel(str);
        label.setBounds(50,50,250,20);
        frame.add(label);
        //panel.add(label);
        frame.setSize(250,250);
        frame.getContentPane().setBackground(Color.pink);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
