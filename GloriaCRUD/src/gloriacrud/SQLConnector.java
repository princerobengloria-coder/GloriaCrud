package gloriacrud;

import java.sql.*;
import javax.swing.JOptionPane;

public class SQLConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/gloria";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
//            JOptionPane.showMessageDialog(null, "Connected");
        }catch(ClassNotFoundException | SQLException err){
            JOptionPane.showMessageDialog(null, "Error in connection: " + err);
        }
        return connection;
    }
}
