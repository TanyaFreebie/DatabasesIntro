package com.company;

import com.company.User.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args){
        System.out.println("Connection to database..");
        Connection connection = dbConn();


    }

    public static Connection dbConn(){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(User.URL.getNb(), User.USER.getNb(), User.PASSWORD.getNb());
            System.out.println("Database Connected Successfully.");
        } catch (SQLException e){
            System.out.println("Unable to connect to database");
        }
        return connection;




    }
}
