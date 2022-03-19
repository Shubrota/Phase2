

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostHandler
 */
@WebServlet("/PostHandler")
public class PostHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		{
		PrintWriter out = response.getWriter();
        
        
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        if (name.equalsIgnoreCase("Shubrota")) {
        	request.setAttribute(name, "correct");
        	
        	RequestDispatcher rd = request.getRequestDispatcher("Welcome.html");
        	rd.forward(request, response);
        }else {
        	request.setAttribute(name, "Wrong");
        	
        	RequestDispatcher rd = request.getRequestDispatcher("Error.html");
        	rd.include(request, response);
        }
        
        
        
}

	}

}
