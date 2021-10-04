package resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlesTest {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en","US"));
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		System.out.println("home");
		
		// utilizando herança
		
		System.out.println(rb.getString("show"));
		System.out.println(rb.getString("concert"));
		
		// não está funcionando como BR
		
	   //ResourceBundle rb1 = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
	   //System.out.println("ola");
	   //System.out.println("bom dia");
	}
}
