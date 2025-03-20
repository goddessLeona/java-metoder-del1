import java.util.Random;
import java.util.Arrays;

//Övning 4: Metodkombination
public class metodkombination {

    static int[] randomArray = null;

    public static void main(String[] args) {
        // Testa alla dina metoder här
        arrayNr();
        bigestNr();
    }

    //Beräkna summan av värdena i en array
    public static void arrayNr(){

        int sum= 0;
        for(int nr: random()){
            sum= sum+nr;
        }
        System.out.println("The sum of the random array is: " + sum);

    }

    //Hitta det största värdet i en array
    public static void bigestNr(){
        int highestNr = randomArray[6];

        for(int nr: randomArray){
            if(highestNr<nr){
                highestNr=nr;
            }
        }
        System.out.println("The highest nr in the array is: " + highestNr);
    }

    //Skapa och returnera en array med slumpmässiga tal
    public static int[] random(){
        Random tal = new Random();
        randomArray = new int[7];
        //int[] randomArray = new int[7];
        int index = 0;

        while(index<7){
            int slumptal = tal.nextInt(21);
            randomArray[index] = slumptal;
            index++;
        }

        System.out.println("This is the array: " + Arrays.toString(randomArray));
        return randomArray;
    }
}
