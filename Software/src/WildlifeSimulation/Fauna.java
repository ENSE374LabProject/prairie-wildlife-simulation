/**
* Fauna.java
*
* DESCRIPTION:
* This file contains the unique characteristics of the Fauna Wildlife descendant. This abstract class inherits from
* the Wildlife abstract class and contains additional properties utilized by its descendants.
*
* AUTHORS: 	Tristan Heisler 200351317
* 			Jonathon Wells 200328640
* 			Quinn Bast 200352973		
*/

package WildlifeSimulation;

public class Fauna extends Wildlife 
{
	//This abstract class will eventually be used to store fauna-specific members and methods.
	//Potential examples include movement, eating and a list of the fauna's prey.
	
	//Initializing constructor
	public Fauna(String name, char symbol)
	{
		super(name, symbol);
	}
	
	//Eat function stub
	public void eat()
	{
		System.out.println("The " + getName() + " is eating.");
	}
	
	//Move function stub
	public void move()
	{
		System.out.println("The " + getName() + " is moving.");
	}
}
