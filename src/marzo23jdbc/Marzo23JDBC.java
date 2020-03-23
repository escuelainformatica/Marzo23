/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marzo23jdbc;

import java.sql.*;

/**
 *
 * @author jorge
 */
public class Marzo23JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojava2020", "root", "abc.123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from PRODUCTO");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
