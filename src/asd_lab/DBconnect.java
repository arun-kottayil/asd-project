package asd_lab;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;


public class DBconnect {

    public static Connection connect() throws ClassNotFoundException{ 

    Connection con =null; 

    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

    String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=asdproject;user=admin;password=pass"; 

    try{

    con=DriverManager.getConnection(connectionURL);
    System.out.println("Connection is successfull");

    }

    catch(SQLException e){

     System.out.println(e);

    }
        return con;
    }
}
    
    