package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by piatr on 05.04.17.
 */
public class MyServlet extends HttpServlet {
    @Override
    public void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.sendRedirect("/index.jsp");
    }
}
