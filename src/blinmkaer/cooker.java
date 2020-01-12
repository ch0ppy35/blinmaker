package blinmkaer;

import java.util.Scanner;

public class cooker {

	public static void main(String[] args) {
		int eggsAmount;
		int eggsMin = 1;
		int milkAmount;
		int milkMin = 200; //in milliters
		int flourAmount;
		int flourMin = 100; //in grams
		
		System.out.println("Hello Mike!");
		System.out.println("Blinmaker is starting up...");
		
		//Get eggs
		System.out.println("How many eggs do you have?");
		Scanner userInput;
		userInput = new Scanner(System.in);
		eggsAmount = userInput.nextInt();
		System.out.println("You have " + eggsAmount + " eggs");
		
		//Get milk
		System.out.println("How much milk do you have?");
		userInput = new Scanner(System.in);
		milkAmount = userInput.nextInt();
		System.out.println("You have " + milkAmount + " ml of milk");
		
		//Get flour
		System.out.println("How much flour do you have?");
		userInput = new Scanner(System.in);
		flourAmount = userInput.nextInt();
		System.out.println("You have " + flourAmount + " grams of flour");
		
		//can we make some blin
		if (eggsAmount < eggsMin || milkAmount < milkMin || flourAmount < flourMin) {
			System.out.println("No blin for you today, goto the store " + "\uD83D\uDE1E");
			System.exit(0);
		} else {
			//
			flourAmount = flourAmount / flourMin;
			System.out.println("You have " + flourAmount + " portions of flour");
			
			milkAmount = milkAmount / milkMin;
			System.out.println("You have " + milkAmount + " portions of milk");
			
//			eggsAmount = eggsAmount / eggsMin;
//			System.out.println("You have " + eggsAmount + " portions of eggs");
			
			//find smallest number of the three
			int smallest;
			if (eggsAmount <= milkAmount && milkAmount <=flourAmount) {
				smallest = eggsAmount;
			} else if (milkAmount <= flourAmount && milkAmount <= eggsAmount) {
				smallest = milkAmount;
			} else {
				smallest = flourAmount;
			}
			System.out.println(" ");
			System.out.println("You can make " + smallest*4 + " of blins");
			System.out.println(" ");
			System.out.println("You will need " + smallest*eggsMin + " eggs");
			System.out.println("You will need " + smallest*flourMin + " flour");
			System.out.println("You will need " + smallest*milkMin + " of milk");
			System.out.println(" ");
			System.out.println("Blinmaker shutting down...");
			System.exit(0);
		}
		
	}

}
