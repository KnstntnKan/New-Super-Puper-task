package knstntn.kn;

import exigen.students.App;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        
        PrintWriter pw = resp.getWriter();
        
        pw.print("<html>"); 
        pw.print("<head><title>ksjfghfkjs</title></head>");
        pw.print("<body>Карамба"+
                "<Form method=\"post\">"+
                "Тварь я дрожащая али право имею? <INPUT NAME=\""+KEY+"\">"+
                "</Form>" 
                + "</body>");
         
        pw.print("</html>");
        pw.close();
    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
       resp.setContentType("text/html");        
        
        PrintWriter pw = resp.getWriter();
        
        pw.print("<html>"); 
        pw.print("<head><title>ksjfghfkjs</title></head>");
        pw.print("<body>Карамба"+
                "<Form method=\"post\">"+
                "Тварь я дрожащая али право имею? <INPUT NAME=\""+KEY+"\">"+
                "</Form>" + App.getAnswer(req.getParameter(KEY))
                + "</body>");
         
        pw.print("</html>");
        pw.close();
    }
    public static final String KEY = "qu";
    
}
