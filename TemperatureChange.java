package TemperatureChange;

public class TemperatureChange extends App{
	
	private double degree;
	
	public void getName() {
		System.out.println("\tTemperature Change");
	}
	
	public void getNote() {
		
	}
	
	public TemperatureChange() {
		this(0);
	}
	
	public TemperatureChange(double degree) {
		setDegree(degree);
	}
	
	public void setDegree(double degree) {
		this.degree = degree;
	}
	
	public double getCelcius (double degree) {
		double celcius = 0;
		celcius = 5*(degree-32)/9;
		return celcius;
	}
	
	public double getFahrenheit (double degree) {
		double fahrenheit = 0;
		fahrenheit = degree*9/5 + 32.0;
		return fahrenheit;
	}

}
