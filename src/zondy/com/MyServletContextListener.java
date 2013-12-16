package zondy.com;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class MyServletContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext destroyed!");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext created!");
	}

}
