package vn.edu.vnuk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectingFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jbdc:mysql://localhost/vnuk_personal",
					"root",
					"Thanhquang123");
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
