import java.util.Scanner;

public class Main {
    public static void main(String args[]) {


        Scanner scnr = new Scanner(System.in);
     System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        int MPG = scnr.nextInt();

        if (MPG <= 0)
        {System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!"); }
        else
        { System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        double tankCapacity = scnr.nextDouble();
            if (tankCapacity <= 0)
            {
          System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            }
            else
            {
                System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
                Double percentage = scnr.nextDouble();
                if (percentage < 0 || percentage > 100)
                {System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100" +
                        "(INCLUSIVE)!!!");}
                        else {
                    double rawRange = MPG * tankCapacity * (percentage * .01);
                    if(rawRange <= 25 )
                    {System.out.print("Attention! Your current estimated range is running low: " + (int)(rawRange)+ " miles left!!!");}
                    else
                    {System.out.print("Keep driving! Your current estimated range is: " + (int)(rawRange)+ " miles!");}


                }




            }








        }













    }



}


