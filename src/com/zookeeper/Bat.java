package com.zookeeper;

public class Bat extends Mammal{

    //Constructor
    public Bat(String name, int energyLevel) {
		super(name, energyLevel);
	}
    
    public Bat(String name) {
		super(name);
		this.setEnergyLevel( 300 );
	}


    //Methods
	public void fly() {
		int currentEnergy = this.getEnergyLevel();
        int energy = currentEnergy - 50;
		this.setEnergyLevel( energy );
        System.out.println( "flying it's really hard, it drains my energy!: " + this.displayEnergy() );
	}
	public void eatHumans() {
		int currentEnergy = this.getEnergyLevel();
        int energy = currentEnergy + 25;
        this.setEnergyLevel( energy );
        System.out.println( "Yummy! eating humans right now: " + this.displayEnergy() );
	}

	public void attackTown() {
		int currentEnergy = this.getEnergyLevel();
        int energy = currentEnergy - 100;
        this.setEnergyLevel( energy );
		System.out.println( "So tiring! Attacking the town: " + this.displayEnergy() );
	}




}