/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author narischa
 */
public class ConnectionBuilder {
    public  Connection getConnection() {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/int206_spm?zeroDateTimeBehavior=convertToNull";
        String driver = "com.mysql.jdbc.Driver";
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Success!!");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return con;
    }
    public static void main(String[] args) {
        ConnectionBuilder c = new ConnectionBuilder();
        c.getConnection();
    }
}
