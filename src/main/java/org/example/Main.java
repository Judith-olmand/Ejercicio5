package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                DBConfig.getUrl(),
                DBConfig.getUser(),
                DBConfig.getPassword())){
            System.out.println("Conexión establecida con Oracle."); //Mediante Maven
            String sql = "UPDATE empleado SET salario = ? WHERE ID = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, 355.15);
            ps.setInt(2, 10);
            int filasActualizadas = ps.executeUpdate();
            System.out.println("Empleado modificado con éxito" + filasActualizadas);

        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }
}