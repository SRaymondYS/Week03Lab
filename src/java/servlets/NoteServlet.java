package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 794471
 */
public class NoteServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {     
        // declare path
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        // read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String title = br.readLine();
        String content = br.readLine();
        
        request.setAttribute("label", title);
        request.setAttribute("stuff", content);
        
        br.close();      
        
        String test  = request.getParameter("edit");
        if(test == null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
        }
        else if(test.equals(""))
        {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);
        }
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        // declare path
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        // to write to a file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        
        String str = request.getParameter("edit");
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
            .forward(request, response);
        
    }

    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }

}
