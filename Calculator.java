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
    
    //Integer addition method
    public int add(int int1, int int2)
    {
      int result = 0;
      result = int1 + int2;
      return result;
    }

    //Integer subtraction method
    public int subtract(int int1, int int2)
    {
      int result = 0;
      result = int1 - int2;
      return result;
    }
    
    //Integer multiplication method
    public int multiply(int int1, int int2)
    {
      int result = 0;
      result = int1 * int2;
      return result;
    }

    //Integer division method
    public int divide(int int1, int int2)
    {
      int result = 0;
      result = int1 / int2;
      return result;
    }
    
    //Double addition method
    public double add(double double1, double double2)
    {
      double result = 0;
      result = double1 + double2;
      return result;
    }
    
    //Double subtraction method
    public double subtract(double double1, double double2)
    {
      double result = 0;
      result = double1 - double2;
      return result;
    }
    
    //Double multiplication method
    public double multiply(double double1, double double2)
    {
      double result = 0;
      result = double1 * double2;
      return result;
    }
    
    //Double division method
    public double divide(double double1, double double2)
    {
      double result = 0;
      result = double1 / double2;
      return result;
    }
    
    //Factorial method
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
    Area formula. SIN fucntion will need angle in radians so we need to convert user
    entered degrees values to radians before the calculation 1/2absinC can be run
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
