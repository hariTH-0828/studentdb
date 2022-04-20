package studentDB;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ValidateServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			
			out.print("ValidateServlet File working");
			String userid = req.getParameter("userid");
			String password = req.getParameter("password");
			
			if(LoginValidate.validate(userid, password)) {
				jakarta.servlet.RequestDispatcher rd = req.getRequestDispatcher("success");
				rd.forward(req, res);
			}else {
				out.print("Sorry username and password error");
				jakarta.servlet.RequestDispatcher rd = req.getRequestDispatcher("index.html");
				rd.include(req, res);
			}
			out.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
