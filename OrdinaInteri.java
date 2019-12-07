
import java.util.Scanner;

public class OrdinaInteri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci un intero: ");
		int a = input.nextInt();
		
		System.out.print("Inseriscine un altro: ");
		int b = input.nextInt();
		
		System.out.print("Inseriscine un altro: ");
		int c = input.nextInt();
		
		if (a < b) {
			if (c < a)
				System.out.println(c+ a+ b);
			else {
				if (b < c)
					System.out.println(a,b,c);
				else
					System.out.println(a+ c+ b);
			}
		}
		
		else{
			if (c < b)
				System.out.println(c+ b+ a);
			else{
				if (c < a)
					System.out.println(b+ c+ a);
				else
					System.out.println(b+ a+ c);
			}
		}
	}
}