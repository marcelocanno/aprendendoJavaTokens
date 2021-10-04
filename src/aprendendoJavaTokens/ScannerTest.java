package aprendendoJavaTokens;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner("1 true 100 oi");
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		System.out.println("---------------------------------------------------");
		
		
		Scanner scanner1 = new Scanner("1 true 100 oi");
		while(scanner1.hasNext()) {
			if(scanner1.hasNextInt()) {
				int i = scanner1.nextInt();
				System.out.println(i);
			}else if(scanner1.hasNextBoolean()) {
				boolean b = scanner1.nextBoolean();
				System.out.println(b);
			}else {
				System.out.println(scanner1.next());
			}
			
		}
		System.out.println("----------------------------------------------------");
	}
}
