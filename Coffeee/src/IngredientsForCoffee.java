import java.util.Scanner;

    public class IngredientsForCoffee {
        public static void main (String[]args){

            int water = 500;
            int  milk = 200;
            int coffee_beans = 100;
            System.out.println("Write how many cups of coffee you will need ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            System.out.println("For" + number+"cups of coffee you will need");
            System.out.println(water * number+"ml of water");
            System.out.println(milk * number+"ml of milk");
            System.out.println(coffee_beans * number+"g of coffee beans");
    }
}
