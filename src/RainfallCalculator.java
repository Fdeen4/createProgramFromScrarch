import java.util.Scanner;
public class RainfallCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        double length, width, rainfall, runoff;
        final int INCHES_PER_FOOT = 12;
        final int CUBIC_INCHES_PER_GALLON = 231;


        //Prompt for information
        System.out.print("Please enter length of the roof in feet: ");
        length = in.nextDouble();
        System.out.print("Please enter width of the roof in feet: ");
        width = in.nextDouble();
        System.out.print("Please enter rainfall amount in inches: ");
        rainfall = in.nextDouble();


        //Convert feet to inches
        length *= INCHES_PER_FOOT;
        width  *= INCHES_PER_FOOT;


        //calculate runoff in cubic inches
        runoff = length * width * rainfall;

        //calculate runoff in gallons
        runoff /= CUBIC_INCHES_PER_GALLON;

        //Display result
        System.out.printf("The roof runoff is %.2f gallons", runoff);
    }
}

