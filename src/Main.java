import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // get user to enter a number
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10");

        int number = scanner.nextInt();

        String numberString;
        switch (number) {
            case 1:
                numberString = "uno";
                break;
            case 2:
                numberString = "dos";
                break;
            case 3:
                numberString = "tres";
                break;
            case 4:
                numberString = "cuatro";
                break;
            case 5:
                numberString = "cinco";
                break;
            case 6:
                numberString = "seis";
                break;
            case 7:
                numberString = "siete";
                break;
            case 8:
                numberString = "ocho";
                break;
            case 9:
                numberString = "nueve";
                break;
            case 10:
                numberString = "diez";
                break;
            default:
                numberString = "Invalid";
        }

        if (numberString.equals("Invalid")) {
            System.out.println("That number is invalid");
        } else {
            System.out.println("The number " + number + " is " + numberString + " in Spanish");
        }
    }
}