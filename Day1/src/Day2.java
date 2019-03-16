import java.util.*;
import javax.swing.*;
public class Day2 {
    public static void main(String[] args) {
        JFrame frame  = new JFrame("ItelliJ");
        JLabel label = new JLabel("Its day 2 GUI");
        label.setBounds(0,0,25,2);
        frame.add(label);
        frame.setSize(50,50);
        frame.setVisible(true);
    }
}
