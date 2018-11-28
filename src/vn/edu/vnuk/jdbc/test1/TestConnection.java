package vn.edu.vnuk.jdbc.test1;

import java.sql.Connection;
import java.sql.SQLException;
import vn.edu.vnuk.jdbc.ConnectingFactory;

public class TestConnection {

	public static void main(String[] args) throws SQLException{
		try {
			Connection connection = new ConnectingFactory().getConnection();
			System.out.println("Connection is open!");
			connection.close();
					
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Done!");
		}
	}
}