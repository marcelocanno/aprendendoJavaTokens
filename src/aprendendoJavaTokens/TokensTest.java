package aprendendoJavaTokens;

public class TokensTest {

	public static void main(String[] args) {
		
		String str = "Marcos, Jose, Luiz, Joaquim, Walter, Matheus";
		String[] tokens = str.split(",");
		for(String arr:tokens) {
			System.out.println(arr.trim()); // trim elimina espaços em branco
			
		}
		

		
		
	}

}
