package telefno;
import java.util.Scanner;
public class smart {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserire marca");
		String marca=scan.nextLine();
		System.out.println("inserire modello");
		String modello=scan.nextLine();
		System.out.println("inserire prezzo di lancio");
		int pdl=scan.nextInt();
		System.out.println("inserire il numero di pollici ");
		int np=scan.nextInt();
		System.out.println("inserire ram");
		int ram=scan.nextInt();
		
		fasciaprezzo(pdl);
		tipologiasma(np);
		tipologiaram(ram);
	}
	public static void fasciaprezzo(int pdl) {
		if(pdl>500) {
			System.out.println("fascia alta");
		}
		else if(pdl<500 && pdl>200) {
			System.out.println("fascia media");
		}
		else if(pdl<200) {
			System.out.println("fascia bassa");
		}
	}
	public static void tipologiasma(int np) {
		if(np>=7) {
			System.out.println("maxi");
		}
		else if(np<7 && np>5) {
			System.out.println("nolmal");
		}
		else if(np<=5) {
			System.out.println("mini");
		}
	}
	public static void tipologiaram(int ram) {
		if(ram>=16) {
			System.out.println("molto alta");
		}
		else if(ram>=12 && ram<16) {
			System.out.println("abbastanza alta");
		}
		else if(ram<12 && ram>8) {
			System.out.println("normale");
		}
		else if(ram<=8) {
			System.out.println("leggermente bassa");
		}
	}
}
package telefno;
public class metodo {

	public static void fasciaprezzo(int pdl) {
		if(pdl>500) {
			System.out.println("fascia alta");
		}
		else if(pdl<500 && pdl>200) {
			System.out.println("fascia media");
		}
		else if(pdl<200) {
			System.out.println("fascia bassa");
		}
	}
	public static void tipologiasma(int np) {
		if(np>7) {
			System.out.println("maxi");
		}
		else if(np<7 && np>5) {
			System.out.println("nolmal");
		}
		else if(np<5) {
			System.out.println("mini");
		}
	}
	public String toString() {
		System.out.println();
		return null;
		
		
	}
	
}
