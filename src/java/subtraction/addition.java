/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subtraction;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class addition extends HttpServlet {


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num1  = Integer.parseInt(request.getParameter("num1"));
        int num2  = Integer.parseInt(request.getParameter("num2"));
        
       CalculatorClass cc = new CalculatorClass();
       int sum = cc.add(num1, num2);
       
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("sum", sum);

        RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
        rd.forward(request, response);
    }


}
