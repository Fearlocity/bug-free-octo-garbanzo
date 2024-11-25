//CIS 103
//Lab Assignment 07
//Timothy Bryant
import java.util.*;
public class lab7
{
 public static void main(String [] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter weekly hours worked: ");
  double hoursworked;
  hoursworked = input.nextDouble();
  System.out.println("Enter hourly rate: ");
  double hourlyrate;
  hourlyrate = input.nextDouble();
  final double OVERTIME_BONUS = 1.5;
  final double HOURS_BEFORE_OVERTIME = 40;
  double grosspay;
  if (hoursworked>HOURS_BEFORE_OVERTIME)
  grosspay = HOURS_BEFORE_OVERTIME*hourlyrate+OVERTIME_BONUS*hourlyrate*(hoursworked-HOURS_BEFORE_OVERTIME);
  else
  grosspay = hoursworked*hourlyrate;
  System.out.println("Weekly gross pay: $"+grosspay);
   }//end main
}//end class
  
  
  
  
  
  