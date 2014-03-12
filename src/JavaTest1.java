/**
 * test class
 */
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Milan Kopèa
 *
 */
public class JavaTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Zadaj 1. realne cislo: ");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.print("Zadaj 2. realne cislo: ");
		double b = sc.nextDouble();
		sc.nextLine();
		System.out.print("Zadaj 3. realne cislo: ");
		double c = sc.nextDouble();
		sc.nextLine();
		System.out.println();

		double sucet = a + b + c;
		double sucin = a * b * c;
		double priemer = sucet / 3;
		
		double min = a;
		if (b < a && b < c) min = b;
		else if (c < b && c < a) min = c;
		
		double max = a;
		if (b > a && b > c) max = b;
		else if (c > b && c > a) max = c;
		
		System.out.println("Sucet: " + sucet);
		System.out.println("Sucin: " + sucin);
		System.out.println("Priemer: " + priemer);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

	}

}

