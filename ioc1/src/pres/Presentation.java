package pres;

import metier.MetierImpl;

public class Presentation {
	private static MetierImpl metier;
	
	public static void main(String[] args) {
		metier=new MetierImpl();
		System.out.println(metier.calcul());
	}
}
