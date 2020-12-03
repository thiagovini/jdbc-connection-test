package test;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException {

        try {
            Connection connection = DB.getConnection();
            DB.closeConnection();
            System.out.println("Connection successful");
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

}
