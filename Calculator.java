package project1;

public class Calculator
{
	 /*
    This is the java file containing all the methods and constructor for the calculator program.
    It contains methods for addition, subtraction, multiplication, division of integers and doubles.
    It also contains methods for calculating the factorial of an integer and the area of a triangle 
    using the SAS method.
    */
    
    //Constructor for calculator
    Calculator()
    {
        
    }
    
    //Integer addition method. Will take two integers input from user, add them together and return the result
    public int add(int int1, int int2)
    {
      int result = 0;
      result = int1 + int2;
      return result;
    }

    //Integer subtraction method. Will take two integers input from user, subtract them and return the result
    public int subtract(int int1, int int2)
    {
      int result = 0;
      result = int1 - int2;
      return result;
    }
    
    //Integer multiplication method. Will take two integers input from user, multiply them and return the result
    public int multiply(int int1, int int2)
    {
      int result = 0;
      result = int1 * int2;
      return result;
    }

    //Integer division method. Will take two integers input from user, divide them and return the result
    public int divide(int int1, int int2)
    {
      int result = 0;
      result = int1 / int2;
      return result;
    }
    
    //Double addition method. Will take two doubles input from user, add them and return the result
    public double add(double double1, double double2)
    {
      double result = 0;
      result = double1 + double2;
      return result;
    }
    
    //Double subtraction method. Will take two doubles input from user, subtract them and return the result
    public double subtract(double double1, double double2)
    {
      double result = 0;
      result = double1 - double2;
      return result;
    }
    
    //Double multiplication method. Will take two doubles input from user, multiply them and return the result
    public double multiply(double double1, double double2)
    {
      double result = 0;
      result = double1 * double2;
      return result;
    }
    
    //Double division method. Will take two doubles input from user, divide them and return the result
    public double divide(double double1, double double2)
    {
      double result = 0;
      result = double1 / double2;
      return result;
    }
    
    //Factorial method. Will take an integer input from user, calculate the factorial of it and return result
    public int factorial(int int1)
    {
      int result = 1;
      for(int i = 1; i <= int1; i++)
        {
            result = multiply(result, i);
            
        }

           return result;
    }
    
    /*SAS Triangle area method
    Will take doubles input from user for side A, side B and angle value in degrees
    and calculate the area of a triangle using the SAS method.
    Math.sin() method will need angle in radians so we need to convert user
    entered degrees values to radians using Math.toRadians() method on the user inputed
    angle in degrees value before the calculation of 1/2absinC can be run
    */
    public double sasArea(double sideA, double sideB, double angleInDegrees)
    {
         double result = 0;
         double result1 = 0;
         double result2 = 0;
         double half = 0.5;
         double radAngle = Math.toRadians(angleInDegrees);
         result1 = multiply(sideA, sideB);
         result2 = multiply(result1, Math.sin(radAngle));
         result = multiply(half, result2);
         return result;
    }

}
