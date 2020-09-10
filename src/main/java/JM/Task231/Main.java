package JM.Task231;

import JM.Task231.dao.UserDAOImpl;
import JM.Task231.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/task231?serverTimezone=Europe/Moscow&useSSL=false";
        String username = "root";
        String password = "12345iB";
        System.out.println("Connecting...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }

       
    }
}
