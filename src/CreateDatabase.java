import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "******";

        // Database name to create
        String dbName = "Hello";

        // SQL query to create database
        String createDatabaseQuery = "CREATE DATABASE " + dbName;

        // Establishing database connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Creating database
            try (Statement statement = connection.createStatement()) {
                // Executing the query to create the database
                statement.executeUpdate(createDatabaseQuery);
                System.out.println("Database '" + dbName + "' created successfully.");
            }
        } catch (SQLException e) {
            // Handling potential errors
            e.printStackTrace();
        }
    }
}
