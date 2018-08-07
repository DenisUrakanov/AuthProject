package system;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RenderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("textName");
        String password = req.getParameter("password");

        AuthManager authManager = new AuthManager();
        if (authManager.isAuth(username,password)){
            HttpSession session = req.getSession(false);
            session.setAttribute("user","admin");
            resp.sendRedirect("secret.jsp");
        }else{
            resp.sendRedirect("form.html");
        }
    }
}
