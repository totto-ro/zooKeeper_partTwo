package com.zookeeper;

public class BatTest{

    public static void main( String[] args ){

        Bat marucia = new Bat("Marucia the bat", 300);
        
        marucia.print();
        
        marucia.attackTown();
        marucia.attackTown();
        marucia.attackTown();
        
        
        
        marucia.eatHumans();
        marucia.eatHumans();
       
        marucia.fly();
        marucia.fly();
       
        marucia.print();
		

        

    }



}

