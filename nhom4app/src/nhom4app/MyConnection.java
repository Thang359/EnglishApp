/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4app;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Zero
 */
public class MyConnection {
     public Connection getConnection(){
         try {
               Class.forName("com.mysql.cj.jdbc.Driver");

             String URL = "jdbc:mysql://localhost/currency?user=root&password=";
             Connection con = DriverManager.getConnection(URL);
             return con;
         } catch (Exception e) {
             System.out.println(e.toString());
             JOptionPane.showMessageDialog(null, e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
             return null;
         }
     }
}
