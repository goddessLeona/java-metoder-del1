
import java.util.Scanner;

public class temperaturOmvandlare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("write in a for Celcius and b for fahrenhait");
        String choice = scanner.next();

        System.out.println("write in temperature");
        double temperature = scanner.nextDouble();

        if(choice.equals("a")){
            double fahrenhait = (temperature*9/5)+32;
            System.out.println("The temperature " + temperature + " Celsius is equal to " + fahrenhait + " Fahrenheit.");
        }else if(choice.equals("b")){
            double celsius = (temperature-32)*5/9;
            System.out.println("The temperature " + temperature + " Fahrenheit is equal to " + celsius + " Celsius.");
        }else{
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
