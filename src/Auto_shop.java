import java.lang.invoke.StringConcatFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Conexion_BDD {
	
	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/world";
	
	static final String USER="root";
	static final String PASS="154199jt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement stmt=null;
		
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("Conectando a la base de datos...");
			connection=DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Creando sentencia...");
			stmt=connection.createStatement();
			String sql="Select * from city;";
			ResultSet rs= stmt.execut


	}

}
