package com.zookeeper;

public class Mammal{
    //Attributes
    private String name;
    private int energyLevel;
    
    //Constructor
    public Mammal( String name, int energyLevel ){
        this.name = name;
        this.energyLevel = energyLevel;
    }
    
    public Mammal( String name){
        this.name = name;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public int getEnergyLevel(){
        return this.energyLevel;
    }


    //Setters
    public void setName( String name ){
        this.name = name;
    }

    public void setEnergyLevel( int energyLevel ) {
		this.energyLevel = energyLevel;
	}


    //Methods
    public int displayEnergy() {
    	this.getEnergyLevel();
		return energyLevel;
	}

    public void print() {
        System.out.println( "Mammal Name: " + this.name + "." + " Current Energy: " + this.displayEnergy() );
        
    }

	



}