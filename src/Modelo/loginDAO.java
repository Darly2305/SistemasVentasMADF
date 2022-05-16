package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public login log(String _correo , String _pass){
        login l = new login();
        String sql = "SELECT * FROM usuarios WHERE correo = ? AND pass = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, _correo);
            ps.setString(2, _pass);
            rs= ps.executeQuery();
            if (rs.next()) {
                l.setId(rs.getInt("id"));
                l.setNombre(rs.getString("Nombre"));
                l.setCorreo(rs.getString("Correo"));
                l.setPass(rs.getString("pass"));
            } 
            
        } catch (SQLException e) {
            System.out.println(toString());
        }
        return l;
    }

        
    
}
