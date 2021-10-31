package project1;

public class CalculatorClient 
{
	/*
    This is a program for a calculator that will allow for addition, subtraction, multiplication, 
    and division of two intergers or doubles. It will also calculate the factorial of a chosen integer.
    Another feature is the ability to use the SAS method to calculate the area of a triangle.
    Program will continue to ask for input until user chooses to exit the program.
    */
	
	
	public static void main(String[] args) 
	{

			
		
		//Following line is necessary to get readInt() and readDouble() to work correctly. The ConsoleProgram.java contains those methods.
		//This program was originally written in CodeHS sandbox. 
		//ConsoleProgram was ported here to allow for the functionality available in the sandbox.
		ConsoleProgram a1 = new ConsoleProgram();
		
		
		//Initial setting of all variables to 0
	       int int1 = 0;
	       int int2 = 0;
	       int userChoice = 0;
	       int intResult = 0;
	       int dataSelect = 0;
	       int factorialResult = 0;
	       double double1 = 0;
	       double double2 = 0;
	       double doubleResult = 0;
	       double sideA = 0;
	       double sideB = 0;
	       double angleInDegrees = 0;
	       double areaResult = 0;
	       
	       //Creating a new calculator object named calc
	       Calculator calc = new Calculator();
	       
	       //Welcome message and function choices  
	       System.out.println("Welcome to the Space XYZ Inc. Calculator!!!");
	        
	       System.out.println();
	       System.out.println();
	       
	     //Loops program to this point after function choice is executed or until exit program is chosen or an invalid choice is made.
	    while(true) 
	    {
	       System.out.println("Please choose one of the following:");
	       System.out.println("1-Addition");
	       System.out.println("2-Subtraction");
	       System.out.println("3-Multiplication");
	       System.out.println("4-Division");
	       System.out.println("5-Factorial");
	       System.out.println("6- SAS Triangle Area"); 
	       System.out.println("7- Exit Program");
	       
	       System.out.println();   
	       System.out.println();
	    
	       userChoice = a1.readInt("Please enter your choice -->");
	    
	       if(userChoice < 5) //Choose Integers or double if simple math functions are chosen
	       {
	           System.out.println("Please choose one of the following");
	           System.out.println();
	           System.out.println("1-Integers");
	           System.out.println("2-Doubles");
	           
	           dataSelect = a1.readInt("Please enter your selection -->");
	       }
	       else if(userChoice == 5) //Ask for integer input and call factorial method and print result
	       {
	          int1 = a1.readInt("Please input interger to calculate factorial of -->");
	          System.out.println();   
	          System.out.println();
	          factorialResult = calc.factorial(int1);
	          System.out.println("Factorial result is " + factorialResult);
	          System.out.println();   
	          System.out.println();
	          continue;
	          
	       }
	       else if(userChoice == 6)  //Ask for parameter input and call triangle area method and print result
	       {
	           System.out.println();   
	           System.out.println();
	           sideA = a1.readDouble("Please enter side A as a double -->");
	           sideB = a1.readDouble("Please enter side B as a double -->");
	           angleInDegrees = a1.readDouble("Please enter angle in degrees -->");
	           System.out.println();   
	           System.out.println();
	           areaResult = calc.sasArea(sideA, sideB, angleInDegrees);
	           System.out.println("The area of entered triangle is " + areaResult + " square units");
	           System.out.println();   
	           System.out.println();
	           continue;
	       }
	       
	       else if(userChoice == 7)  //Exit Program with a happy goodbye
	       {
	           System.out.println();   
	           System.out.println();
	           System.out.println("Goodbye. Thanks for using me!");
	           break;
	       }
	       
	       else if (userChoice > 7) //Generates error message and redirects back to start if invalid choice is made
	       {
	    	   System.out.println();   
	           System.out.println();
	           System.out.println("Invalid selection, please try again.");
	           System.out.println();   
	           System.out.println();
	           continue;
	       }
	       
	       /*This section of the program contains the basic math functions for when the user chose
	        * integers or doubles. Prompts user to enter the integers or doubles and calls the appropriate method.
	        */
	      
	       if(dataSelect == 1) //integers chosen by user
	       {
	           //populate integers
	           int1 = a1.readInt("Enter first integer -->");
	           int2 = a1.readInt("Enter second integer -->");
	       }
	       else if (dataSelect == 2) //doubles chosen by user
	       {
	           //populate doubles
	           double1 = a1.readDouble("Pease enter first double -->");
	           double2 = a1.readDouble("Please enter second double -->");
	       }
	       else if(dataSelect > 2) //Generates error message and redirects back to start if invalid choice is made
	       {
	    	   System.out.println();   
	           System.out.println();
	           System.out.println("Invalid selection, please try again.");
	           System.out.println();   
	           System.out.println();
	           continue;
	       }
	      
	      
	       
	       if(dataSelect == 1)  //integers chosen by user
	       {
	           if(userChoice ==1)  //integer addition. Calls appropriate method and prints results.
	           {
	               intResult = calc.add(int1, int2);
	               System.out.println("Your addition result is " + intResult);
	               System.out.println();   
	               System.out.println();
	           }
	           else if(userChoice == 2)  //integer subtraction. Calls appropriate method and prints results.
	           {
	               intResult = calc.subtract(int1, int2);
	               System.out.println("Your subtraction result is " + intResult);
	               System.out.println();   
	               System.out.println();
	           }
	           else if (userChoice == 3)  //integer multiplication. Calls appropriate method and prints results.
	           {
	               intResult = calc.multiply(int1, int2);
	               System.out.println("Your multiplication result is " + intResult);
	               System.out.println();   
	               System.out.println();
	           }
	           else if(userChoice == 4)  //integer division. Calls appropriate method and prints results.
	           {
	               intResult = calc.divide(int1, int2);
	               System.out.println("Your division result is " + intResult);
	               System.out.println();   
	               System.out.println();
	           }
	       }
	       if(dataSelect == 2)  //doubles chosen by user
	       {
	           if(userChoice ==1)  //double addition.  Calls appropriate method and prints results.
	           {
	               doubleResult = calc.add(double1, double2);
	               System.out.println("Your addition result is " + doubleResult);
	               System.out.println();   
	               System.out.println();
	           }
	           else if(userChoice == 2)  //double subtraction. Calls appropriate method and prints results.
	           {
	               doubleResult = calc.subtract(double1, double2);
	               System.out.println("Your subtraction result is " + doubleResult);
	               System.out.println();   
	               System.out.println();
	           }
	           else if (userChoice == 3)  //double multiplication. Calls appropriate method and prints results.
	           {
	               doubleResult = calc.multiply(double1, double2);
	               System.out.println("Your multiplication result is " + doubleResult);
	               System.out.println();   
	               System.out.println();
	           }
	           else if(userChoice == 4)  //double division. Calls appropriate method and prints results.
	           {
	               doubleResult = calc.divide(double1, double2);
	               System.out.println("Your division result is " + doubleResult);
	               System.out.println();   
	               System.out.println();
	           }
	                      
	       }
	    
	         
	   
    
	    }   
	
	}

	}

