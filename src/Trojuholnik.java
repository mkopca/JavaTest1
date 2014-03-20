
public class Trojuholnik {

	public int a;
	public int b;
	public int c;
	
	Trojuholnik (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double obvod() {
		return this.a + this.b + this.c;
	}
	
	public boolean jePravouhly() {
		if (Math.pow(a, 2) + Math.pow(b,  2) == Math.pow(c, 2) ||
			Math.pow(b, 2) + Math.pow(c,  2) == Math.pow(a, 2) ||
			Math.pow(a, 2) + Math.pow(c,  2) == Math.pow(b, 2)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Trojuholnik t = new Trojuholnik(6, 4, 6);
	
		System.out.println("Obvod Trojuholnika je: " + t.obvod());
		if (t.jePravouhly()) {
			System.out.println("Trojuholnik je pravouhly");
		} else {
			System.out.println("Trojuholnik nie je pravouhly");
		}
	}

}
