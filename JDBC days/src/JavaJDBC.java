import java.sql.*;
public class JavaJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/try","root","root");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM example");
            while(rs.next()) {
                System.out.println(rs.getString(1));
            }
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
