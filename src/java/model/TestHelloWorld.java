/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Meen
 */
public class TestHelloWorld {
    public String message = null;

    public TestHelloWorld() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String showHelloWorldFromDB(){
        String SQL = "select * from int206";
        Connection con = null;
        try {
            ConnectionBuilder connect = new ConnectionBuilder();
            con = connect.getConnection();
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                this.message = rs.getString("detail");
            }
            System.out.println(this.message);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return this.message;
    }
    
//    public static void main(String[] args) {
//        TestHelloWorld ts = new TestHelloWorld();
//        ts.showHelloWorldFromDB();
//    }
}

