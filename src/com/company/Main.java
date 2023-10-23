package com.company;

import java.sql.SQLException;
import java.util.List;

public class Main {
System.out.println("GOLQQQQMA PROMQNA");
    public static void main(String[] args) throws SQLException {
        List<String> users = DBManager.getInstance().getAllUsers();
        for (String username : users) {
            System.out.println(username);
        }
    }


}

