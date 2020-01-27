import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        int k=(int) request.getAttribute("k");
//        k=k*k;

        int k=0;
        Cookie cookiess[]=request.getCookies();
        for (Cookie c: cookiess){
            if(c.getName().equals("k"))
                k=Integer.parseInt(c.getValue());
        }

      //  HttpSession httpSession= request.getSession();
       // int k= (int)httpSession.getAttribute("k");
       // int k= Integer.parseInt( .getParameter("k"));
        k=k*k;

//        PrintWriter printWriter= response.getWriter();
//        printWriter.println("Result is "+k);

        PrintWriter printWriter= response.getWriter();
        printWriter.println("Result is "+k);

    }


}
