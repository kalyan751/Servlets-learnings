package in.pwskills.kalyan.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImageFileResponse
 */
@WebServlet("/Image")
public class ImageFileResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				//setting the mime type because now we are not sending the text/html type content
				response.setContentType("image/jpg");
				
				//getting the outputStream to send the response to the client outside of the java project
				ServletOutputStream outputStream= response.getOutputStream();
				
				//reading the videofiles through the inputstream
				String path = getServletContext().getRealPath("image.jpg");
				System.out.println("The path is " + path);
				
				File file = new File(path);
				FileInputStream inputStream = new FileInputStream(file);
				
			    byte[] b = new byte[(int) file.length()];
			    inputStream.read(b);
			    outputStream.write(b);
			    outputStream.flush();
			    inputStream.close();
				
	}

}
