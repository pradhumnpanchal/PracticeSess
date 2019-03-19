import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class JavaForm implements ActionListener {
    static JTextField a = new JTextField("Click fetch to get data from DB");
    JButton b = new JButton("fetch");

    JavaForm() {
        JFrame frame = new JFrame("Form");
        b.setBounds(0,0,100,40);
        a.setBounds(0,50,400,400);
        frame.add(b);
        frame.add(a);
        b.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = "yeah";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/try","root","root");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM example");
            while(rs.next()) {
                //System.out.println(rs.getString(1)+" "+rs.getInt(2));
                str = str + " " +rs.getString(1) ;}
            con.close();
        }catch(Exception e1){ System.out.println(e);}
        a.setText(str.trim());
    }

    public static void main(String[] args) {
        new JavaForm();
    }
}
