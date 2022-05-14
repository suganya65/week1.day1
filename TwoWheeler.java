package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 121323232L;
	boolean isPunctured = false;
	String bikeName = "Activa";
	double runningKM = 11111111;
	
	//Create object for TwoWheeler and call all the variables inside main method and print the values.
	
	
	public static void main(String[] args) {
		
		TwoWheeler ActivaBike = new TwoWheeler();
		
		System.out.println("No of Wheels =" + ActivaBike.noOfWheels);
		System.out.println("No of Mirrors  = " + ActivaBike.noOfMirrors);
		System.out.println("Chassis Number is = " + ActivaBike.chassisNumber);
		System.out.println("Is Bike Punctured = " + ActivaBike.isPunctured);
		System.out.println("Bike Name is = " + ActivaBike.bikeName);
		System.out.println("runningKM = " + ActivaBike.runningKM);
		
		
				
	}

}
