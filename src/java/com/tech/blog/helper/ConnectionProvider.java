/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tech.blog.helper;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class ConnectionProvider { 
    private static Connection con;  
    public static Connection getConnection(){
        //connection 
        try{
              
            //driver load   
            if(con==null){
          Class.forName("com.mysql.cj.jdbc.Driver"); 
          String url="jdbc:mysql://localhost:3306/techblog"; 
          String username="root"; 
          String password="1234";
        //create connection  
         con=DriverManager.getConnection(url,username,password); 
            
            }
        }
        catch(Exception e){ 
            e.printStackTrace();
            
        }
        return con;
    }
    
    
}
