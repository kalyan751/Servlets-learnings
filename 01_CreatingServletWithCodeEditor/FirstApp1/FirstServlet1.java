import javax.servlet.*;
public class FirstServlet1 implements Servlet {
	
	static{
		System.out.println("Servlet loading");
	}

	public FirstServlet1(){
		System.out.println("Servlet instantiation ****");
	}

	public void init(ServletConfig config){
		System.out.println("Servlet initialization");
	}
	public void service(ServletRequest request, ServletResponse response){
		System.out.println("Request processing");
	}

	public ServletConfig getServletConfig(){
		return null;
	}
	public String getServletInfo(){
		return "Developed by kalyan";
	}
	public void destroy(){
		System.out.println("Servlet de-instantiation");
	}
	
}
