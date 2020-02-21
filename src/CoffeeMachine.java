import java.util.Scanner;

public class CoffeeMachine {
    static int amountOfWater = 400;
    static int amountOfMilk = 540;
    static int amountOfCoffeeBeans = 120;
    static int amountOfDisposableCups = 9;
    static int amountOfMoney = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to do? (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffeeType = scanner.nextLine();
                if (coffeeType.equals("back")){

                } else {
                    switch (Integer.parseInt(coffeeType)) {
                        case 1: {
                            makeEspresso();
                            break;
                        }
                        case 2: {
                            makeLatte();
                            break;
                        }
                        case 3: {
                            makeCappuccino();
                            break;
                        }
                    }
                }
            } else if (action.equals("fill")) {
                System.out.println("Write how many ml of water do you want to add:");
                amountOfWater += scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                amountOfMilk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                amountOfCoffeeBeans += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                amountOfDisposableCups += scanner.nextInt();
                scanner.nextLine();
            } else if (action.equals("take")) {
                System.out.println("I gave you $" + amountOfMoney);
                amountOfMoney = 0;
            } else if (action.equals("remaining")){
                printState();
            } else if (action.equals("exit")){
                System.out.println("Goodbye :) Hope to see you again soon");
                break;
            } else if (action.isEmpty()){
                System.out.println("No action detected, please input a valid action");
            } else {
                System.out.println("\"" + action + "\" is an invalid action, please try again");
            }
        }

    }

    public static void printState(){
        System.out.println("The coffee machine has:");
        System.out.println(amountOfWater + "ml. of water");
        System.out.println(amountOfMilk + "ml. of milk");
        System.out.println(amountOfCoffeeBeans + "gr. of coffee beans");
        System.out.println(amountOfDisposableCups + " disposable cups");
        System.out.println(amountOfMoney + "$");

    }

    public static void makeEspresso(){
        if (amountOfWater < 250){
            System.out.println("Sorry, I do not have enough water!");
        } else if (amountOfCoffeeBeans < 16){
            System.out.println("Sorry, I do not have enough coffee beans");
        } else if (amountOfDisposableCups < 1){
            System.out.println("Sorry, I do not have enough disposable cups of coffee");
        } else {
            System.out.println("I have enough resources, making you the best espresso ever!");
            amountOfWater -= 250;
            amountOfCoffeeBeans -= 16;
            amountOfDisposableCups--;
            amountOfMoney += 4;
        }

    }

    public static void makeLatte(){
        if (amountOfWater < 350){
            System.out.println("Sorry, I do not have enough water!");
        } else if (amountOfMilk < 75){
            System.out.println("Sorry, I do not have enough milk!");
        } else if (amountOfCoffeeBeans < 20){
            System.out.println("Sorry, I do not have enough coffee beans!");
        } else if (amountOfDisposableCups < 1){
            System.out.println("Sorry, I do not have enough disposable cups of coffee!");
        } else {
            System.out.println("I have enough resources, making you an awesome latte!");
            amountOfWater -= 350;
            amountOfMilk -= 75;
            amountOfCoffeeBeans -= 20;
            amountOfDisposableCups--;
            amountOfMoney += 7;
        }

    }

    public static void makeCappuccino(){
        if (amountOfWater < 200){
            System.out.println("Sorry, I do not have enough water!");
        } else if (amountOfMilk < 100){
            System.out.println("Sorry, I do not have enough milk!");
        } else if (amountOfCoffeeBeans < 12){
            System.out.println("Sorry, I do not have enough coffee beans!");
        } else if (amountOfDisposableCups < 1){
            System.out.println("Sorry, I do not have enough disposable cups of coffee!");
        } else {
            System.out.println("I have enough resources, making you a delicious cappuccino!");
            amountOfWater -= 200;
            amountOfMilk -= 100;
            amountOfCoffeeBeans -= 12;
            amountOfDisposableCups--;
            amountOfMoney += 6;
        }
    }
}
