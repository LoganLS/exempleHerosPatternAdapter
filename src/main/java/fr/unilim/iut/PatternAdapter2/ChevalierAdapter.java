package fr.unilim.iut.PatternAdapter2;

public class ChevalierAdapter implements Heros {
	
	Chevalier chevalier;
	
	public ChevalierAdapter(Chevalier chevalier){
		this.chevalier=chevalier;
	}
	
	@Override
	public void attaquer(){
		this.chevalier.utiliserSonEpee();
	}
}
