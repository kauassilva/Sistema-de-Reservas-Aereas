package DAO;

import MODEL.UsuarioMODEL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author kauas
 */
public class UsuarioDAO {
    
    Connection conn;
    
    public ResultSet validarUsuario(UsuarioMODEL objUsuario) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "SELECT * FROM usuario WHERE email_usuario = ? AND senha_usuario = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);            
            pstm.setString(1, objUsuario.getEmail_usuario());
            pstm.setString(2, objUsuario.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: "+e);
            return null;
        }
    }
}
