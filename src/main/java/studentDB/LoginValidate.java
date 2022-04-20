package studentDB;

// Import packages :
import java.sql.*;

public class LoginValidate {
	
	public static boolean validate(String userid, String password) {
		boolean status = false;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("http://localhost:3306/studentdb","root","root");
			String uid = userid;
			String pass = password;
			String query = "select * from studentdb where ID=? and password=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uid);
			st.setString(2, pass);
			
			ResultSet rs = st.executeQuery();
			status = rs.next();
		}catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
}
