import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double temp = collectInput();

        while (temp > -460) {
            double fahrenheitToCelsius = convertToCelsius(temp);
            display(fahrenheitToCelsius);
            temp = collectInput();
        }

    }

    static double collectInput(){
        System.out.println("please enter the temp in fahrenheit");
        double fahrenheit = input.nextDouble();
        return fahrenheit;
    }
    
    static double convertToCelsius(double temp){
        double celsius = ((temp - 32) * 5 / 9);
        return celsius;
    }

    static void display(double a){
        System.out.println("The temperature in celsius is " + a + " celsius");
    }
}