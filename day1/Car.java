package week1.day1;

public class Car {

public static void driveCar() {
	
	System.out.println ("Test Drive an Audi car");
	
}

public void applyBreak() {
	
	System.out.println ("Test Apply Break");
}

public void soundHorn() {
	
	System.out.println ("Test Sound hourn");
	}

public void isPuntured() {
	
	System.out.println ("Puntured yes");
	}


public static void main (String args[]) {
	Car Audi =new Car();
	Audi.driveCar();
	Audi.soundHorn();
	Audi.applyBreak();
	Audi.isPuntured();
	
}
}
