import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        uppgift1(15,"Nills");
        uppgift2();

    }

    //Övning 1: Grundläggande metodanrop
    public static void uppgift1(int a, String b){

        int age = a;
        String name = b;

        System.out.println("Your name is: " + name + " and you are: " + age + " years old");
    }

    //Övning 2: Returvärden
    public static void uppgift2(){

        double areaR = rectangel(5,6);
        System.out.println("The area of the rectangel is: " +areaR);

        double areaT = triangel(5,6);
        System.out.println("The triangel's area is: " + areaT);

        double circleA = circle(5);
        System.out.println("The circles area is: " + circleA);
    }

    // Rektangel Area
    public static double rectangel(double hight, double width){
        return hight*width ;
    }

    //Triangel Area
    public static double triangel(double base, double hight){
        return (base*hight)/2;
    }

    //Circle Area
    public static double circle(double radius){
        return Math.PI*radius*radius;
    }



}