package Hotel.Management.System;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;

    public Conn(){
        try {
            // Optional, but good practice
           //Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hotelMS", 
                "root", 
                "2001"
            );
            statement = connection.createStatement();
            //System.out.println("Connected successfully to database.");
            //connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Conn();
    }
}
