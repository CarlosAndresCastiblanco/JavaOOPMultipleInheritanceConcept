package co.com.java;

/**
 * @author carlos.castiblanco
 *
 */

//Java program to illustrate the
//concept of Multilevel inheritance
public class MainJavaOOPMultipleInheritanceConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		threem g = new threem();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}

}

class onem {
	public void print_geek()
	{
		System.out.println("Geeks");
	}
}

class twom extends onem {
	public void print_for() { System.out.println("for"); }
}

class threem extends twom {
	public void print_geek()
	{
		System.out.println("Geeks");
	}
}


//Java program to illustrate the
//concept of Hierarchical inheritance

class Ah {
	public void print_A() { System.out.println("Class A"); }
}

class Bh extends Ah {
	public void print_B() { System.out.println("Class B"); }
}

class Ch extends Ah {
	public void print_C() { System.out.println("Class C"); }
}

class Dh extends Ah {
	public void print_D() { System.out.println("Class D"); }
}

//Driver Class
class Testh {
	public static void main(String[] args)
	{
		Bh obj_B = new Bh();
		obj_B.print_A();
		obj_B.print_B();

		Ch obj_C = new Ch();
		obj_C.print_A();
		obj_C.print_C();

		Dh obj_D = new Dh();
		obj_D.print_A();
		obj_D.print_D();
	}
}

//Java Program to Illustrate Unsupportance of
//Multiple Inheritance

//Class 1
//First Parent class
class Parent1 {

	//Method inside first parent class
	void fun() {
	
		// Print statement if this method is called
		System.out.println("Parent1");
	}
}

//Class 2
//Second Parent Class
class Parent2 {

	//Method inside first parent class
	void fun() {
	
		// Print statement if this method is called
		System.out.println("Parent2");
	}
}

//Class 3
//Trying to be child of both the classes
class Test extends Parent1, Parent2 {

	//Main driver method
	public static void main(String args[]) {
	
		// Creating object of class in main() method
		Test t = new Test();
	
		// Trying to call above functions of class where
		// Error is thrown as this class is inheriting
		// multiple classes
		t.fun();
	}
}

//Java Program to Illustrate Unsupportance of
//Multiple Inheritance
//Diamond Problem Similar Scenario

//Class 1
//A Grand parent class in diamond
class GrandParent {

	void fun() {
	
		// Print statement to be executed when this method is called
		System.out.println("Grandparent");
	}
}

//Class 2
//First Parent class
class Parent1n extends GrandParent {
	void fun() {
	
		// Print statement to be executed when this method is called
		System.out.println("Parent1");
	}
}

//Class 3
//Second Parent Class
class Parent2n extends GrandParent {
	void fun() {
	
		// Print statement to be executed when this method is called
		System.out.println("Parent2");
	}
}

//Class 4
//Inheriting from multiple classes
class Testn extends Parent1n, Parent2n {

	//Main driver method
	public static void main(String args[]) {
	
		// Creating object of this class i main() method
		Test t = new Test();
	
		// Now calling fun() method from its parent classes
		// which will throw compilation error
		t.fun();
	}
}


//Java program to demonstrate Multiple Inheritance
//through default methods

//Interface 1
interface PI1 {

	// Default method
	default void show()
	{

		// Print statement if method is called
		// from interface 1
		System.out.println("Default PI1");
	}
}

//Interface 2
interface PI2 {

	// Default method
	default void show()
	{

		// Print statement if method is called
		// from interface 2
		System.out.println("Default PI2");
	}
}

//Main class
//Implementation class code
class TestClass implements PI1, PI2 {

	// Overriding default show method
	@Override
	public void show()
	{

		// Using super keyword to call the show
		// method of PI1 interface
		PI1.super.show();//Should not be used directly in the main method;

		// Using super keyword to call the show
		// method of PI2 interface
		PI2.super.show();//Should not be used directly in the main method;
	}

	//Method for only executing the show() of PI1
	public void showOfPI1() {
		PI1.super.show();//Should not be used directly in the main method;
	}

	//Method for only executing the show() of PI2
	public void showOfPI2() {
		PI2.super.show(); //Should not be used directly in the main method;
	}

	// Mai driver method
	public static void main(String args[])
	{

		// Creating object of this class in main() method
		TestClass d = new TestClass();
		d.show();
		System.out.println("Now Executing showOfPI1() showOfPI2()");
		d.showOfPI1();
		d.showOfPI2();
	}
}

//Java program to demonstrate How Diamond Problem
//Is Handled in case of Default Methods

//Interface 1
interface GPId {

	// Default method
	default void show()
	{

		// Print statement
		System.out.println("Default GPI");
	}
}

//Interface 2
//Extending the above interface
interface PI1d extends GPId {
}

//Interface 3
//Extending the above interface
interface PI2d extends GPId {
}

//Main class
//Implementation class code
class TestClassd implements PI1d, PI2d {

	// Main driver method
	public static void main(String args[])
	{

		// Creating object of this class
		// in main() method
		TestClass d = new TestClass();

		// Now calling the function defined in interface 1
		// from whom Interface 2and 3 are deriving
		d.show();
	}
}

//Java program to illustrate the
//concept of Multiple inheritance
interface one {
	public void print_geek();
}

interface two {
	public void print_for();
}

interface three extends one, two {
	public void print_geek();
}
class child implements three {
	@Override public void print_geek()
	{
		System.out.println("Geeks");
	}

	public void print_for() { System.out.println("for"); }
}

//Drived class
class Main {
	public static void main(String[] args)
	{
		child c = new child();
		c.print_geek();
		c.print_for();
		c.print_geek();
	}
}

///////////////////////////

class SolarSystem {
}
class Earth extends SolarSystem {
}
class Mars extends SolarSystem {
}
class Moon extends Earth {
}
///////////////////////////
class SolarSysteme {
}
class Earthe extends SolarSysteme {
}
class Marse extends SolarSysteme {
}
class Moone extends Earthe {
	public static void main(String args[])
	{
		SolarSysteme s = new SolarSysteme();
		Earthe e = new Earthe();
		Marse m = new Marse();

		System.out.println(s instanceof SolarSysteme);
		System.out.println(e instanceof Earthe);
		System.out.println(m instanceof SolarSysteme);
	}
}



