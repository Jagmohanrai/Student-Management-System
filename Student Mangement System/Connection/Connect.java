
package Connection;


import java.sql.*;
import javax.swing.JOptionPane;

public class Connect {
 public Connection conn;
    
 public Connection Connect()
  {
      try{
        String url= "jdbc:mysql://localhost:3306/students";
        String user= "root";
        String pass= "";
        Class.forName("com.mysql.jdbc.Driver");
        conn= DriverManager.getConnection(url,user,pass);
      }
      catch (ClassNotFoundException | SQLException e)
      {
          JOptionPane.showMessageDialog(null, e.getMessage());
      }
      return conn;
  }
    
}

