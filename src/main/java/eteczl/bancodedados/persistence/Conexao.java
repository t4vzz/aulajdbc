package eteczl.bancodedados.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String host;
	private String port; 
	private String dbname;
	private String dbuser;
	private String dbpass;

	public Conexao(String host, String port, String dbname, String dbuser, String dbpass) {
		this.host = host;
		this.port = port;
		this.dbname = dbname;
		this.dbuser = dbuser;
		this.dbpass = dbpass;
	}
	
	public Connection getConnection() {
		String strConn = "jdbc:mysql://"+this.host+":"+this.port+"/"+this.dbname;
		Connection connection = null;
	
		try {
			connection = DriverManager.getConnection(strConn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection; 
	}
	
	
}
