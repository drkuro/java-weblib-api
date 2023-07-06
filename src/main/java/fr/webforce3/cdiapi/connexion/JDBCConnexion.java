package fr.webforce3.cdiapi.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnexion {

	private static JDBCConnexion instance;
	private Connection connection;

	private String databaseName = "java_lib";
	private String url = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String password = "";

	private JDBCConnexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(url + databaseName, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Connection getConn() {
		return connection;
	}

	public static JDBCConnexion getInstance() {
		if (instance == null) {
			instance = new JDBCConnexion();
		} else if (instance.close()) {
			instance = new JDBCConnexion();
		}
		return instance;
	}

	private boolean close() {
		try {
			return getConn().isClosed();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public static Connection getConnexion() {
		return getInstance().connection;
	}
}
