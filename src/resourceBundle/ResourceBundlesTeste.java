package resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlesTeste {

	public static void main(String[] args) {
		
		System.out.println(Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
		System.out.println(rb.getString("ola"));
		System.out.println(rb.getString("bom.dia"));
		System.out.println(rb.getString("casa"));
		
		// utilização de herança
		
		System.out.println(rb.getString("show"));
		System.out.println(rb.getString("concert"));
	
	}

}
