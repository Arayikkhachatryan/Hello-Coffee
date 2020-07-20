import java.util.Scanner;

    public class Machine {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int water = 400;
            int milk = 540;
            int cups = 9;
            int coffee = 120;
            int money = 550;

            boolean b1 = true;
            do {
                System.out.print("Write action (buy, fill, take, remaining, exit)");
                String str = scanner.next();

                switch (str) {

                    case "buy":
                        System.out.print("What do you want to buy? 1 - espresso, 2 - latte , 3 - cappuccino, back - to main menu : ");
                        String option = scanner.next();
                        System.out.println(" ");


                        switch (option) {
                            case "1":
                                if (water >= 250 && coffee >= 16 && cups >= 1) {
                                    water = water - 250;
                                    coffee = coffee - 16;
                                    cups = cups - 1;
                                    money = money + 7;
                                    System.out.println("We have started making your coffee, please wait :)");
                                    break;
                                } else if (water < 250) {
                                    System.out.println("Sorry not enough water");
                                } else if (coffee < 16) {
                                    System.out.println("Sorry not enough coffee beans");
                                } else if (cups < 1) {
                                    System.out.println("Sorry not enough cups");
                                }
                                break;


                            case "2":
                                if (water >= 300 && milk >= 105 && coffee >= 20 && cups >= 1 ) {
                                    water = water - 300;
                                    milk = milk - 105;
                                    coffee = coffee - 20;
                                    cups = cups - 1;
                                    money = money + 5;
                                    System.out.println("We have started making your coffee, please wait ;)");
                                    break;
                                } else if (water < 300) {
                                    System.out.println("Sorry not enough water");
                                } else if (coffee < 20) {
                                    System.out.println("Sorry not enough coffee beans");
                                } else if (milk < 105) {
                                    System.out.println("Sorry not enough milk");
                                } else if (cups < 1) {
                                    System.out.println("Sorry not enough cups");
                                }
                                break;

                            case "3":
                                if (water >= 350 && coffee >= 25 && cups >= 1 && milk >= 110) {
                                    water = water - 350;
                                    milk = milk - 110;
                                    coffee = coffee - 25;
                                    cups = cups - 1;
                                    money = money + 9;
                                    System.out.println("We have started making your coffee, please wait :)");
                                    break;
                                } else if (water < 200) {
                                    System.out.println("Sorry not enough water");
                                } else if (coffee < 12) {
                                    System.out.println("Sorry not enough coffee beans");
                                } else if (milk < 100) {
                                    System.out.println("Sorry not enough milk");
                                } else if (cups < 1) {
                                    System.out.println("Sorry not enough cups");
                                }
                                break;
                        }
                        break;

                    case "fill":
                        System.out.print("Write how many ml of water do you want to add");
                        int addWater = scanner.nextInt();
                        water = water + addWater;
                        System.out.print("Write how many ml of milk do you want to add");
                        int addMilk = scanner.nextInt();
                        milk = milk + addMilk;
                        System.out.print("Write how many grams of coffee beans do you want to add");
                        int addCoffee = scanner.nextInt();
                        coffee = coffee + addCoffee;
                        System.out.print("Write how many disposable cups of coffee do you want to add");
                        int addCups = scanner.nextInt();
                        cups = cups + addCups;
                        break;

                    case "take":
                        System.out.println(" ");
                        System.out.println("I gave you $" + money + "");
                        money = 0;
                        break;

                    case "remaining":
                        System.out.println(" ");
                        System.out.println("The coffee machine has:");
                        System.out.println(water + " " + "of water");
                        System.out.println(milk + " " + "of milk");
                        System.out.println(coffee + " " + "coffee beans");
                        System.out.println(cups + " " + "of disposable cups");
                        System.out.println("$" + money + " " + "of money");
                        break;

                    case "exit":
                        b1=false;
                        break;

                }


            }while(b1);
        }

    }

