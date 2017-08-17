import java.util.Scanner;
public class QuartsToGallonsInteractive {

    public static void main (String[] args)
    {
        int quartsInGallon = 4;
        float paintNeeded; //Amount of paint needed (in quarts)
        Scanner userInput = new Scanner(System.in); //paints needed for the paint job (In quarts)
        //double inGallon;
        System.out.print("How many quarts of Paint do you need for the job?>>");
        paintNeeded = userInput.nextInt();

        double inGallon = paintNeeded / quartsInGallon;
        //calculates how many gallons

        System.out.println("A job that requires " + paintNeeded +" quarts of paint, requires " + inGallon + " gallons of paint.");

    }
}
