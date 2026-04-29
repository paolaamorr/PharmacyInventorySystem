package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

 private Connection c;
 
 public ConnectionManager() {
	 try {
		 Class.forName("org.sqlite.JDBC"); // para registrar el Driver 
		 c = DriverManager.getConnection("jdbc:sqlite:./src/db/pharmacy.db");
		 c.createStatement().execute("")
	 }
	 
 }
}
