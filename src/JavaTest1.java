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
		
		System.out.print("Zadaj cele cislo: ");
		
		int a = sc.nextInt();
		sc.nextLine();
		
		
		
		System.out.println();
		
		int aa = (int) (a / 100);
		int ab = (int) ((a - (aa * 100)) / 10);
		int ac = a - (aa * 100) - (ab * 10);
		
		System.out.println("" + aa + "  " + ab + "  " + ac);
	}
	
	/**
	 * Input two characters 0-9 or a-f and output converted to dec number
	 * 
	 * @param args
	 */
	public static void convertHexToDec(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Zadaj 1. znak: ");
		char a = sc.nextLine().charAt(0);
//		sc.nextLine();
		System.out.print("Zadaj 2. znak: ");
		char b = sc.nextLine().charAt(0);
//		sc.nextLine();
		int c = 0;
		int a_fin;
		
		if (a >= 48 && a < 58) {
			c += 16 * ((int) a - 48);
		} else {
			c += 16 * ((int) a - 87);
		}
		
		if (b >= 48 && b < 58) {
			c += ((int) b - 48);
		} else {
			c += ((int) b - 87);
		}
		System.out.println();
		
		System.out.println("Hex " + a + b + " = Dec " + c);
	}

}

