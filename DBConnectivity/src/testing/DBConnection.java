package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public void mysqlDatabaseConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "root");
		Statement s  =con.createStatement();
		ResultSet rs = s.executeQuery("select * from employee;");
		//  5 rows and 3 columns
		while(rs.next()){
			System.out.print(rs.getString("id") + "   ");
			System.out.print(rs.getString("name") + "   ");
			System.out.println(rs.getString("salary"));
		}
	}
	
	
}
