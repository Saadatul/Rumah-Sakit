/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;


public class konfigurasi {
    public static Connection connect;
    
    public static Connection Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/db_rumahsakit", "root", "");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return connect;
    }
    
    public static void main(String args[]) {
        System.out.println(konfigurasi.Connect());
    }
}
