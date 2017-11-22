package fr.unilim.iut.PatternAdapter2;

public class Main{
	public static void main(String[] args){
		Heros mage = new MageAdapter(new Mage());
		Heros chevalier = new ChevalierAdapter(new Chevalier());
		
		mage.attaquer();
		chevalier.attaquer();
		System.out.println("\n");
		
	}
}
