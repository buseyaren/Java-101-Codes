package week7_softarequalitytesting;

public class methods {

	
	/*Create a Method: A method must be declared within a class. It is defined with the name of the method, 
followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), 
but you can also create your own methods to perform certain actions:*/
	
	/* public class Main {
		  static void myMethod() {
		    // code to be executed
		  }
		}
	
	static, yöntemin Main sınıfının bir nesnesi değil, Main sınıfına ait olduğu anlamına gelir. */

	public static void myMethod() {
	    System.out.println("I just got executed!");
	  }
	//ana blok
	public static void main(String[] args) {
		    myMethod(); //call - çağırmak
		    myMethod();
		    myMethod();
		    myMethod();
		    
	  }
	
	//A method can also be called multiple times!
	/*
	 public static void main(String[] args) {
	    myMethod();
	    myMethod();
	    myMethod();
  	}*/
	
	}
