import java.util.Scanner;
public class InchesToFeetInteractive {

    public static void main (String[] args){
        int inches;
        int inchesInFoot = 12;
        int lengthInFoot;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please provide lenght in Inches>>");
        inches = userInput.nextInt();

        lengthInFoot = inches/inchesInFoot;
        System.out.println(inches + " Inches is " + lengthInFoot + " Ft.");

    }
}
