
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RaelNaReal
 */
public class conection {
 
    
    Connection conn = null;
    public static Connection MyConn(){

    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","");
        return conn;

    } catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
    
    
    
    
    
    
    
    
}
