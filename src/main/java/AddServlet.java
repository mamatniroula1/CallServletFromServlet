import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int i=Integer.parseInt(request.getParameter("num1"));
        int j=Integer.parseInt(request.getParameter("num2"));


        int k=i+j;
        Cookie cookie= new Cookie("k",k+"");
        response.addCookie(cookie);

        response.sendRedirect("sq");


//        HttpSession httpSession= request.getSession();
//        httpSession.setAttribute("k",k);
        //response.sendRedirect("sq?k="+k);
//        request.setAttribute("k",k);






//        RequestDispatcher requestDispatcher= request.getRequestDispatcher("sq");
//        requestDispatcher.forward(request, response);
    }
}
