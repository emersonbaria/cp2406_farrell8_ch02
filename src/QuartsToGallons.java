public class QuartsToGallons {

    public static void main (String[] args)
    {
        int quartsInGallon = 4;
        int paintNeeded = 18;
        //paints needed for the paint job (In quarts)
        int inGallon;

        inGallon = paintNeeded / quartsInGallon;
        //calculates how many gallons

        System.out.println("A job that requires " + paintNeeded +" quarts of paint, requires " + inGallon + " gallons of paint.");

    }
}
