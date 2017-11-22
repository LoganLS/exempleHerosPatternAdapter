package fr.unilim.iut.PatternAdapter2;

public class MageAdapter implements Heros {
	
	Mage mage;
	
	public MageAdapter(Mage mage){
		this.mage=mage;
	}

	@Override
	public void attaquer() {
		this.mage.lancerUnSort();
	}

}
