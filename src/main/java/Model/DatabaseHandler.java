package Model;

import java.sql.*;

public class DatabaseHandler {
    Connection dbConnection;

//
//    String dbURL = "jdbc:sqlite:product.db";
//    Connection conn = DriverManager.getConnection(dbURL);

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:sqlite:C:\\sqlite\\database.db";
        Class.forName("org.sqlite.JDBC");
        dbConnection = DriverManager.getConnection(connectionString);
        return dbConnection;
    }

    public static void authUser(Class user) {
    }
}
