/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Koneksi {
    
    public Connection con;
    public Statement stt;   
    
    public Connection KoneksiDB()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bengkel?zeroDateTimeBehavior=convertToNull","root","");
            } catch (Exception e){
            
            }
        return con;
    }
    
    public void TesKoneksi()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bengkel?zeroDateTimeBehavior=convertToNull","root","");
            stt = con.createStatement();
            JOptionPane.showMessageDialog(null,"Koneksi Berhasil");
            } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Gagal terhubung ke Database CEK ULANG DATABASE!");
            }
    }
}
