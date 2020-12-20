package TemperatureChange;

public class TemperatureChange extends App{
	
	private double degree;
	
   //post: get name of the program
	public void getName() {
		System.out.println("\tTemperature Change");
	}
	
   //post: get note(optional)
	public void getNote() {
		
	}
	
	public TemperatureChange() {
		this(0);
	}
	
	public TemperatureChange(double degree) {
		setDegree(degree);
	}
	
   //post: set the degree
	public void setDegree(double degree) {
		this.degree = degree;
	}
	
   //pre: Fahrenheit degree
   //post: transfer from Fahrenheit degree into Celcius degree
	public double getCelcius (double degree) {
		double celcius = 0;
		celcius = 5*(degree-32)/9;
		return celcius;
	}
	
   //pre: Celcius degree
   //post: transfer from Celcius degree into Fahrenheit degree
	public double getFahrenheit (double degree) {
		double fahrenheit = 0;
		fahrenheit = degree*9/5 + 32.0;
		return fahrenheit;
	}

}
