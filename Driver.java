package rescuepets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	 private static ArrayList<Dog> dogList = new ArrayList<Dog>();
	 private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

	    public static void main(String[] args) {

	        initializeDogList();
	        initializeMonkeyList();

	        Scanner input = new Scanner(System.in);
	        char option;
	        // Use a do While loop to allow user to make choice
	        do {
	            displayMenu();
	            option = input.next().charAt(0);
	            if (option == '1') { // intakeNewDog method is called
	                intakeNewDog(input);
	            }

	            else if (option == '2') { // intakeNewMonkey method is called
	                intakeNewMonkey(input);
	            }

	            else if (option == '3') { // reserveAnimal method is called
	                reserveAnimal(input);
	            }

	            else if (option == '4') { // printAnimals method is called to print the dog list
	                printAnimals(option);
	            }

	            else if (option == '5') { // printAnimals method is called to print the monkey list
	                printAnimals(option);
	            }

	            else if (option == '6') { // printAnimals method is called to print all available animals
	                printAnimals(option);
	            }

	            else if (option == 'q') { // exit message prints and application stops running
	                System.out.print("You have exited the application.");
	                break;
	            }

	            else { // in the event of an invalid input, tells user and prompts for a new input
	                System.out.print("You have entered an invalid input. Please enter a valid input.");
	            }
	        } while (option != 'q');

	    }

	    // This method prints the menu options
	    public static void displayMenu() {
	        System.out.println("\n\n");
	        System.out.println("\t\t\t\tRescue Animal System Menu");
	        System.out.println("[1] Intake a new dog");
	        System.out.println("[2] Intake a new monkey");
	        System.out.println("[3] Reserve an animal");
	        System.out.println("[4] Print a list of all dogs");
	        System.out.println("[5] Print a list of all monkeys");
	        System.out.println("[6] Print a list of all animals that are not reserved");
	        System.out.println("[q] Quit application");
	        System.out.println();
	        System.out.println("Enter a menu selection");
	    }

	    // Adds dogs to a list for testing
	    public static void initializeDogList() {
	        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake",
	                false, "United States");
	        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false,
	                "United States");
	        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false,
	                "Canada");

	        dogList.add(dog1);
	        dogList.add(dog2);
	        dogList.add(dog3);
	    }

	    // Optional for testing
	    public static void initializeMonkeyList() {
	        Monkey monkey1 = new Monkey("Bob", "male", "5", "10", "04-04-2020", "United States", "in service", false,
	                "United States", "Capuchin", "12.1", "13", "21.4");
	        monkeyList.add(monkey1);
	    }

	    // Complete the intakeNewDog method
	    // The input validation to check that the dog is not already in the list
	    // is done for you
	    public static void intakeNewDog(Scanner scanner) {
	        System.out.println("What is the dog's name?");
	        String name = scanner.nextLine();
	        
	        for (Dog dog : dogList) {
	            if (dog.getName().equalsIgnoreCase(name)) {
	                System.out.println("\n\nThis dog is already in our system\n\n");
	                return; // returns to menu

	            }
	            scanner.nextLine();
	            // Add a new dog
	            System.out.println("What is the dog's breed?");
	            String breed = scanner.nextLine();
	            System.out.println("What is the dog's gender?");
	            String gender = scanner.nextLine();
	            System.out.println("What is the dog's age?");
	            String age = scanner.nextLine();
	            System.out.println("What is the dog's weight?");
	            String weight = scanner.nextLine();
	            System.out.println("What is the dog's acquisition date?");
	            String acquisitionDate = scanner.nextLine();
	            System.out.println("What is the dog's acquisition country?");
	            String acquisitionCountry = scanner.nextLine();
	            System.out.println("What is the dog's training status?");
	            String trainingStatus = scanner.nextLine();
	            System.out.println("Is this dog reserved?");
	            boolean reserved = scanner.nextBoolean();
	            scanner.nextLine();
	            System.out.println("Which country is the dog in service?");
	            String inServiceCountry = scanner.nextLine();

	            Dog dog4 = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
	                    reserved, inServiceCountry);
	            dogList.add(dog4);
	            System.out.println("Your entry has been added to the Dog List.");
	        }
	    }

	    // Complete intakeNewMonkey
	    public static void intakeNewMonkey(Scanner scanner) {
	    	String[]speciesList = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel Monkey", "Tamarin"}; 
	    	System.out.println("What is the monkey's name?");
	        String name = scanner.nextLine();
	        for (Monkey monkey : monkeyList) {
	            if (monkey.getName().equalsIgnoreCase(name)) {
	                System.out.println("\n\nThis monkey is already in our system\n\n");
	                return; // returns to menu
	            }
	        }
	        scanner.nextLine();
	        System.out.println("What is the monkey's species?");
	        
	        String species = scanner.nextLine();
	        //Created a List here of monkey species, and using for input validation
	        
	        	
	        	if(!Arrays.asList(speciesList).contains(species)) {
	        		System.out.println("Not a valid species. Please try again");
	        		scanner.nextLine();
	        	
	        }
	        System.out.println("What is the monkey's gender?");
	        String gender = scanner.nextLine();
	        System.out.println("What is the monkey's age?");
	        String age = scanner.nextLine();
	        System.out.println("What is the monkey's weight?");
	        String weight = scanner.nextLine();
	        System.out.println("What is the monkey's acquisition date?");
	        String acquisitionDate = scanner.nextLine();
	        System.out.println("What is the monkey's acquisition country?");
	        String acquisitionCountry = scanner.nextLine();
	        System.out.println("What is the monkey's training status?");
	        String trainingStatus = scanner.nextLine();
	        System.out.println("Is this monkey reserved?");
	        boolean reserved = scanner.nextBoolean();
	        scanner.nextLine();
	        System.out.println("Which country is the monkey in service?");
	        String inServiceCountry = scanner.nextLine();
	        System.out.println("What is the monkey's tail length?");
	        String tailLength = scanner.nextLine();
	        System.out.print("What is the monkey's height?");
	        String height = scanner.nextLine();
	        System.out.print("What is the monkey's body length?");
	        String bodyLength = scanner.nextLine();

	        Monkey monkey2 = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
	                reserved, inServiceCountry, species, tailLength, height, bodyLength);
	        monkeyList.add(monkey2);
	        System.out.println("Your entry has been added to the Monkey List.");
	    }

	    // Complete reserveAnimal
	    // You will need to find the animal by animal type and in service country
	    public static void reserveAnimal(Scanner scanner) {

	        scanner.nextLine();
	        System.out.println("Enter animal type: ");
	        
	        String animalType = scanner.nextLine();
	        if (animalType.equalsIgnoreCase("Monkey")) {
	            System.out.println("Enter the monkey's acquisition country: ");
	        
	        	String monkeyCountry = scanner.nextLine();
	          
	        	for (Monkey obj : monkeyList) {
	        		if (obj.getAcquisitionLocation().equalsIgnoreCase(monkeyCountry)) {
	        			obj.setReserved(true);
	        			System.out.println("This monkey is now reserved.");
	        			return;
	                }
	            
	            System.out.println("This monkey is not in the list. Please try again.");
	        	}
	        }	
	     	
	       else if (animalType.equalsIgnoreCase("Dog")) { // how to reserve a dog
	            System.out.println("Enter the dog's acquisition country: ");
	        
	        String dogCountry = scanner.nextLine();
	        
	        	for (Dog obj : dogList) {
	        		if (obj.getAcquisitionLocation().equalsIgnoreCase(dogCountry)) {
	        			obj.setReserved(true);
	        			System.out.println("This dog is now reserved.");
	        			return;
	                }
	            
	        		else System.out.println("This dog is not in the list. Please try again.");
	        		return;
	        	}
	       }	
	       else {
	            System.out.println("Animal type not found. Please enter either dog or monkey.");
	            return;	
	       }
	        
	    }

	    public static void printAnimals(char option) {
	        if (option == '4') {
	            System.out.println(dogList.toString());
	        } else if (option == '5') {
	            System.out.println(monkeyList.toString());
	        } else if (option == '6') {
	            for (int i = 0; i < dogList.size(); i++) {
	                if (dogList.get(i).getTrainingStatus().equals("in service") && dogList.get(i).getReserved() == false) {
	                    System.out.println(dogList.get(i));
	                }
	            }
	            for (int i = 0; i < monkeyList.size(); i++) {
	                if (monkeyList.get(i).getTrainingStatus().equals("in service")
	                        && monkeyList.get(i).getReserved() == false) {
	                    System.out.println(monkeyList.get(i));
	                }
	            }
	        }
	    }
	
}
