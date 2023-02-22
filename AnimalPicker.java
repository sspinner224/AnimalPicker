import java.util.Scanner;

public class AnimalPicker{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String animal;
        
        System.out.println("What animal would you like to see: dog or cat?");

        animal = input.nextLine();

        while(!animal.equals("dog") || !animal.equals("cat")) {
          if(animal.equals("dog")) {
            System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
            break;
        } else if (animal.equals("cat")) {
            System.out.println("  ^~^  ,\n (\'Y\') )\n /   \\/ \n(\\|||/)");
            break;
        } else {
            System.out.println("Please enter 'dog' or 'cat'");
            animal = input.nextLine();
        }  
        }
        



    }
}