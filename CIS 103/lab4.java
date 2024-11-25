//CIS 103
//Lab Assignment 04
//Timothy Bryant
import java.util.*;
public class lab4
{
 public static void main(String [] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the number of dependents:");
  double dependents;
  dependents = input.nextDouble();
  System.out.println("Enter the gross income:");
  double grossincome;
  grossincome = input.nextDouble();
  final double TAX_RATE = 0.2;
  final double STANDARD_DEDUCTION = 10000.00;
  final double DEPENDENT_DEDUCTION = 2000.0;
  double dependentdeduction;4
  dependentdeduction = dependents*DEPENDENT_DEDUCTION;
  double grossafterdeduction;
  grossafterdeduction = grossincome-(dependentdeduction+STANDARD_DEDUCTION);
  double incometax;
  incometax = grossafterdeduction*TAX_RATE;
  double grossincomeaftertax;
  grossincomeaftertax = grossincome-incometax;
  System.out.println("The income tax is $" +incometax);
  System.out.println("The gross income after tax is $" +grossincomeaftertax);
 }//end main
}//end class
  
  