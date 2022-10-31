package week7_softarequalitytesting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is a comment
		//System.out.println("Hello World");
		double myDouble = 9.78d;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs ?
	    System.out.println(myInt); 
	    
	//}
//}
	    /*Strings
	    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    System.out.println("The length of the txt string is: " + txt.length());
	    
	    String txt2= "Hello World";
	    System.out.println(txt2.toUpperCase());   // Outputs : HELLO WORLD
	    System.out.println(txt2.toLowerCase());   // Outputs : hello world 
	    /*String Concatenation
	    String firstName = "John";
	    String lastName = "Doe";
	    System.out.println(firstName + " " + lastName); // John Doe
	    */ 
	    //Java methods-You can also use the concat() method to concatenate two strings:
	    //String firstName2 = "John";
	    //String lastName2= "Doe";
	    //System.out.println(firstName2.concat(" "+lastName2));*/
	    //Java If ... Else
	    /*Less than: a < b
		Less than or equal to: a <= b
		Greater than: a > b
		Greater than or equal to: a >= b
		Equal to a == b
		Not Equal to: a != b
	
	    if (20 > 18) {
	    	  System.out.println("x is more than y");
	    	}
	    else
	    {
	    	System.out.print("x is less than y");
	    }
	   
	    int x = 20;
	    int y = 18;
	    if (x > y) {
	      System.out.println("x is greater than y");
	    }
	    */
	   /* 
	    int time = 20;
	    if (time < 18) {
	      System.out.println("Good day.");
	    } else {
	      System.out.println("Good evening.");
	    }
	}
	
	    // Outputs ?
	    
	    int time2 = 22;
	    if (time2 < 10) {
	      System.out.println("Good morning.");
	    } else if (time2 < 20) {
	      System.out.println("Good day.");
	    } else {
	      System.out.println("Good evening.");
	    }  */
	    // Outputs ?
	    
	    /*Java Switch Statements
		Instead of writing many if..else statements, you can use the switch statement.
		The switch statement selects one of many code blocks to be executed:
		--------------------
		switch(expression) {
		  case x:
		    // code block
		    break;
		  case y:
		    // code block
		    break;
		  default:
		    // code block
		}
		/*
	    int day = 2;
	    switch (day) {
	      case 1: //STATEMENT
	        System.out.println("Monday");
	        break;
	      case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      case 4:
	        System.out.println("Thursday");
	        break;
	      case 5:
	        System.out.println("Friday");
	        break;
	      case 6:
	        System.out.println("Saturday");
	        break;
	      case 7:
	        System.out.println("Sunday");
	        break;
	    }
	}}   
	   //The break Keyword: When Java reaches a break keyword, it breaks out of the switch block. This will stop the execution of more code and case testing inside the block.
	   //The default Keyword: The default keyword specifies some code to run if there is no case match:
	   /*int day3 = 6;
	    switch (day3) {
	      case 6:
	        System.out.println("Today is Saturday");
	        break;
	      case 7:
	        System.out.println("Today is Sunday");
	        break;
	      default:
	        System.out.println("Looking forward to the Weekend");
	       
	        //Java While Loop   
	}
	}}
	   int i = 0;
	    while (i < 5) {
	      System.out.println(i);

	    }
	   
	    
	}}
	    int j = 6;
	    do {
	      System.out.println(j);
	      j++;
	    }
	    while (j < 5);
	}}
	    for (int k = 0; k < 5; k++) {
	    	  System.out.println(k);
	    	}
	    
	    for (int b = 0; b <= 10; b = b + 2) {
	    	  System.out.println(b);
	    	}
	}}*/
	    /*For-Each Loop: There is also a "for-each" loop, which is used exclusively to loop through elements in an array:*/
	    
	    /*for (type variableName : arrayName) {
	    	  // code block to be executed
	    	}*/
	    /*
	    String[] cars = {"Volvo", "BMW", "Ford", "Mazda","Volvo", "BMW", "Ford", "Mazda"};
	    for (int i=0;i< cars.length;i++) {
	    	System.out.println("Cars [i]: " + " " +cars[i]);
	    }
	}}
	    for (String i : cars) {
	      System.out.println(i);
	    }
	}}*/
	    
	    /*
	     Java Break: You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.
	     The break statement can also be used to jump out of a loop.
	      Tüm döngüden çıkarır
	   for (int u = 0; u < 10; u++) 
	   {
	    	  if (u == 4) 
	    	    break;
	   	   System.out.println(u);
	   }
	}}*/
	    /* Java Continue: The continue statement breaks one iteration (in the loop), 
	     if a specified condition occurs, and continues with the next iteration in the loop.
	    for (int m = 0; m < 10; m++) {
	    	  if (m == 4) {
	    	    continue;
	    	  }
	    	  System.out.println(m);
	    	}
	}}

	    int a = 0;
	    while (a < 10) {
	      if (a == 4) {
	        a++;
	        continue;
	      }
	      System.out.println(a);
	      a++;
	    }
	}}
	    // Outputs ?
	    
	    /*Java Arrays: Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
	     * To declare an array, define the variable type with square brackets: */
	    
	    //String[] carss = {"Volvo", "BMW", "Ford", "Mazda"};
	    /*System.out.println(carss[0]);
	    System.out.println(carss[3]);
	    carss[0] = "Opel";
	    for (int j=0; j<carss.length;j++) {
		    System.out.println(carss[j]);
	    }
	    //foreach
	    for(String counter: carss) {
		    System.out.println(counter);
	    }
	}}
	    
	    int[] myNum = {10, 20, 30, 40};
	    
	    for (int l = 0; l < myNum.length; l=l+2) {
	    	  System.out.println(myNum[l]);
	    	}
	}}
	    */
	    
	   /* for (String g : carss) {
	      System.out.println(g);
	    }

	    /* Multidimensional Arrays: A multidimensional array is an array of arrays.
	     To create a two-dimensional array, add each array within its own set of curly braces:*/

	    int[][] twoList = { 
	    		{1, 2, 3, 4},
	    		{5, 6, 7} };
	    
	    System.out.println(twoList[1][2]);
	}}
	    // Outputs ?*/

	//}
//}
