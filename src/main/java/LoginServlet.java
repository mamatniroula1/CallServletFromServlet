import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/auth")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        loginDao loginDao= new LoginDaoImpl();
        String result= loginDao.validateUser(username, password);
        if ("norole".equals(result)){
            RequestDispatcher dispatcher= request.getRequestDispatcher("no.jsp");
            dispatcher.forward(request, response);
        }else{
            RequestDispatcher dispatcher= request.getRequestDispatcher("yes.jsp");
            dispatcher.forward(request, response);
        }
    }

}
