
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql. SQLException;

public class Conexion {
    Connection con;

    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://localhost:3306/sistemaventalsac?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
