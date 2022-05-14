package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 121323232L;
	boolean isPunctured = false;
	String bikeName = "Activa";
	double runningKM = 11111111;
	
	//Create object for TwoWheeler and call all the variables inside main method and print the values.
	
	public void noOfWheels() {
		System.out.println("No of Wheels = " + noOfWheels );
	}
		
	public void noOfMirrors() {
		System.out.println("No of Mirrors  = " + noOfMirrors );
	}
	
	public void chassisNumber() {
		System.out.println("Chassis Number is = " + chassisNumber );
	}
	
	public void Punctured() {
		System.out.println("Is Bike Punctured = " + isPunctured );
	}
	
	public void bikeName() {
		System.out.println("Bike Name is = " + bikeName );
	}
	
	public void runningKM() {
		System.out.println("runningKM = " + runningKM );
	}
	
		
	public static void main(String[] args) {
		
		TwoWheeler ActivaBike = new TwoWheeler();
		
		ActivaBike.noOfWheels();
		ActivaBike.noOfMirrors();
		ActivaBike.chassisNumber();
		ActivaBike.Punctured();
		ActivaBike.bikeName();
		ActivaBike.runningKM();
		
		
				
	}

}
