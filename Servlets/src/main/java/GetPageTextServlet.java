import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/page")
public class GetPageTextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        BufferedReader br = new BufferedReader(new FileReader("F:\\Учебная практика\\Servlets\\src\\main\\webapp\\WEB-INF\\page.html"));
        PrintWriter printWriter = resp.getWriter();
        String str;
        while ((str = br.readLine()) != null) {
            printWriter.write(str);
        }
        printWriter.close();
    }
}
