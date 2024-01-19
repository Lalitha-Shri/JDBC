import java.sql.*;
//This program will insert the query string into the mysql table 'Empl1'.
public class JdbcConnection {
    public static void main(String[] args) throws SQLException {
//        Exception can occur for table not found so need to surround with try catch block
        try{
//      Insert Query is written as string in java
        String  query="Insert into Empl1(empcode,ename,empage ,esalary)values(106,'Aadira',25,90000)";
//        Storing connection URl in a string
        String url="jdbc:mysql://localhost/customer?user=root&password=kvlali2310";
//        Below line will connect with database
        Connection con= DriverManager.getConnection(url);
        PreparedStatement p=con.prepareStatement(query);
//        To insert a query we need to use executeUpdate() function
        p.executeUpdate();}
        catch (SQLException e)
        {
            System.out.println("Records cannot be inserted");
        }
        System.out.println("Records succesfully added");

        }
    }
