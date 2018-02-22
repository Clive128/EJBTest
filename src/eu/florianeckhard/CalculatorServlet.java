package eu.florianeckhard;

import javax.ejb.EJB;
import eu.florianeckhard.CalculatorEJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/index.html"})
public class CalculatorServlet extends HttpServlet {

    @EJB
    CalculatorEJB calculatorEJB;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.calculatorEJB.addieren(1,2);
        // Anfrage an die JSP weiterleiten
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.getParameter("name");
        double result = this.calculatorEJB.addieren(Double.parseDouble(request.getParameter("eins")), Double.parseDouble(request.getParameter("zwei")));
        session.setAttribute("sum", result);
        // Browser auffordern, die Seite neuzuladen
        response.sendRedirect(request.getContextPath());
    }


}
