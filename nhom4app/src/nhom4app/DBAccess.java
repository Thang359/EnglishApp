/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Zero
 */
public class DBAccess {
    private Connection con;
    private Statement stmt;
    
    public DBAccess(){
        try {
            MyConnection mycon = new MyConnection();
            con = mycon.getConnection();
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Eror when try connect");
        }
    }
    
    public int Update(String str){
        try {
            int i = stmt.executeUpdate(str);
            return i;
        } catch (Exception e) {
            return -1;
        }
    }
    
    public ResultSet Query(String str){
        try {
            ResultSet rs = stmt.executeQuery(str);
            return rs;
        } catch (Exception e) {
            return null;
        }
    } 
}
