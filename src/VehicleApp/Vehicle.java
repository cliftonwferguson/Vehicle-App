package VehicleApp;

public class Vehicle {
private String name;
private int currentSpeed;
private int currentDirection;
public Vehicle(String name) {
	super();
	this.name = name;
	this.currentSpeed = 0;
	this.currentDirection = 0;
}

public void steer(int direction) {
	this.currentDirection += direction;
	System.out.println("Steer method called: Steering at "+ currentDirection+ " degrees.");
}
	public void move(int speed, int direction) {
		currentSpeed = speed;
		currentDirection = direction;
	System.out.println("move method called: Moving at "+currentSpeed+ " in direction" + currentDirection);
	}
}
