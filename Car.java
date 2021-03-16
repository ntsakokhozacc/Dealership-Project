package Khoza;

public class Car {
	ModelDetails myObj = new ModelDetails();
	Make make = new Make();
	public Car(String brandName, String countryOfOrigin, String modelName, int modelYear, String driveType, int doors, 
			String color, String driveTrain) {
		super();
		myObj.setBrandName(brandName);
		myObj.setCountryOfOrigin(countryOfOrigin);
		myObj.setModelName(modelName);
		myObj.setModelYear(modelYear);
		myObj.setDriveType(driveType);
		myObj.setDoors(doors);
		myObj.setColor(color);
		myObj.setDriveTrain(driveTrain);
	}
	
	public void DisplayInformation(){
		System.out.println("The information listed below is based on your "+myObj.getBrandName()+" "+myObj.getModelName());
		System.out.println("The car brand: "+myObj.getBrandName());
		System.out.println("The country of origin: "+myObj.getCountryOfOrigin());
		System.out.println("The model name: "+myObj.getModelName());
		System.out.println("The model year: "+myObj.getModelYear());
		System.out.println("The drive type: "+myObj.getDriveType()+"-side drive");
		System.out.println("The number of doors: "+myObj.getDoors());
		System.out.println("The colour of the car: "+myObj.getColor());
		System.out.println("The drive is :"+ myObj.getDriveTrain());
	}
	
	
}
