package studentDB;
import java.sql.*;

public class DbConnection {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			Statement st = con.createStatement();
			st.executeUpdate("insert into studentlogin(ID,Password) values('1902006','sivakumar')");
			ResultSet rs = st.executeQuery("select * from studentlogin");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"   "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
