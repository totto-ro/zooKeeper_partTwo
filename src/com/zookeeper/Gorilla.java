package com.zookeeper;

public class Gorilla extends Mammal{
    private int currentEnergy = this.getEnergyLevel();

    //Constructor
    public Gorilla(String name, int energyLevel) {
		super(name, energyLevel);
	}


    //Methods
	public void throwSomething() {
        int energy = currentEnergy - 5;
		this.setEnergyLevel( energy );
        System.out.println( "The gorilla has thrown something. Now his energy has lower to: " + this.displayEnergy() );
	}
	public void eatBanana() {
        int energy = currentEnergy + 10;
        this.setEnergyLevel( energy );
        System.out.println( "Happy gorilla loves eating bananas. Now his energy went up to: " + this.displayEnergy() );
	}

	public void climb() {
        int energy = currentEnergy - 10;
        this.setEnergyLevel( energy );
		System.out.println( "The gorilla is tired after climbing a tree. Now his energy has lower to: " + this.displayEnergy() );
	}




}
