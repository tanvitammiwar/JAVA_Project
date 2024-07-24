package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Statement statement;

    public Con()
    {
        Connection connection;

        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem ","root","TA123");
            statement=connection.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {

    }

}
