package TemperatureChange;

import java.util.Scanner;


public class ClientTemperatureChange {

	public static void main(String[] args) {
		
		boolean mode = false;
		
		TemperatureChange first = new TemperatureChange();
		//headline
		first.getName();
		boolean check = false;
		do {
		do {
			mode = false;
			check = false;
			System.out.println("--------------------------------");
			System.out.println("1. Celcius -> Fahrenheit?");
			System.out.println("2. Fahrenheit -> Celcius?");
			System.out.println("0. Exit");
			System.out.println("---------------");
			System.out.print("Your choice (0~2): ");
			Scanner input = new Scanner (System.in);
			String answer = input.next();
			if(answer.equals("1")) {
				System.out.print("Degree Celcius: ");
				double degree = input.nextDouble();
				TemperatureChange one = new TemperatureChange(degree);
				System.out.println("= " + one.getFahrenheit(degree) + " degree Fahrenheit");
				check = true;
				mode = first.calculateAgain(input); //ask if they wanna calculate more
			}
			else if(answer.equals("2")) {
				System.out.print("Degree Fahrenheit: ");
				double degree = input.nextDouble();
				TemperatureChange two = new TemperatureChange(degree);
				System.out.println("= " + two.getCelcius(degree) + " degree Celcius");
				check = true;
				mode = first.calculateAgain(input); //ask if they wanna calculate more
			}
			else if(answer.equals("0")) {
				System.out.println("Thank you!");
				check = true;
				mode = false;
			}
			else {
				check = false;
				mode = false;
				System.out.println("\nThe valid command is 0-2");
			}
		} while(!check);
		} while(mode);
	}

}
