import java.util.Scanner;

public class AnimalPicker{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String animal;
        
        System.out.println("What animal would you like to see: dog or cat?");

        animal = input.nextLine();

        if(animal.equals("dog")) {
            System.out.println("DOG ASCII ART HERE");
        } else if (animal.equals("cat")) {
            System.out.println("CAT ASCII ART HERE");
        }
    }
}