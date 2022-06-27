package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kauas
 */
public class ConexaoDAO {
    public Connection conectaBD() {
        Connection conn = null;
        
        try {
            String URL = "jdbc:mysql://localhost:3306/sistema_de_reservas_aereas";
            String USER = "root";
            String PASSWORD = "";
            
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO: "+e);
        }
        return conn;
    }
}
