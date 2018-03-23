import java.util.Scanner;

public class ChangeTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    double fahrentheit = input.nextInt();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrentheit));
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    double celsius = input.nextInt();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9 * celsius) / 5 + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
