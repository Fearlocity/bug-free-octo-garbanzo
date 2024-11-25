//CIS 103
//Lab Assignment 08
//Timothy Bryant
import java.util.*;
public class lab8
{
 public static void main(String [] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter last name: ");
  String lastname = input.nextLine();
  System.out.println("Enter first name: ");
  String firstname = input.nextLine();
  System.out.println("Enter this year's units: ");
  int firstunits;
  firstunits = input.nextInt();
  System.out.println("Enter last year's units: ");
  int lastunits;
  lastunits = input.nextInt();
  double BONUS;
  if (lastunits>firstunits)
   BONUS = 0;
   else
    if (firstunits<1000)
     BONUS = 25;
    else
     if (firstunits<3000)
      BONUS = 50;
     else
      if (firstunits<6000)
       BONUS = 100;
      else
       BONUS = 200;
  System.out.println(""+lastname+", "+firstname);
  System.out.println("Bonus is $"+BONUS);
 }//end main
}//end class
  
  
 
