package Khoza;
import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		String brandName;
		String countryOfOrigin;
		String modelName;
		int modelYear;
		String driveType;
		int doors;
		String color;
		String driveTrain;
		
		System.out.print("Please enter the Brand of car: ");
		brandName = scanner.nextLine();
		
		System.out.print("Please enter the Country of origin of the car: ");
		countryOfOrigin = scanner.nextLine();
		
		System.out.print("Please enter the model name of the car: ");
		modelName = scanner.nextLine();
		
		System.out.print("Please enter the model year of the car: ");
		modelYear = scanner.nextInt();
		
		System.out.println("Please enter the drive type(LEFT OR RIGHT SIDED) of the car: ");
		driveType = scanner.nextLine();
		
		
		System.out.print("How many doors does the car have? ");
		doors = scanner.nextInt();
		
		System.out.println("What colour is the car? ");
		color = scanner.nextLine();
		
		System.out.println("What is the drive train of the car (AWD or 2WD)? ");
		driveTrain=scanner.nextLine();
		
		Car myObj = new Car(brandName, countryOfOrigin, modelName, modelYear, driveType, doors, color, driveTrain);
		myObj.DisplayInformation();
	}

}
