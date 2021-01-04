package asd_lab;

import static asd_lab.DBconnect.connect;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;



/**
 *
 * @author arunk
 */
public class Asd_lab {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws ClassNotFoundException {

        // TODO code application logic here

        connect(); 
     }
    
    
}
