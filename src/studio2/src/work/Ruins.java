import java.util.*;

public class Ruins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much are you starting with");
        int startAmount = sc.nextInt();

        System.out.println("Win Chance");
        int winChance = sc.nextInt();

        System.out.println("Win Limit");
        int winLimit = sc.nextInt();

        int money = startAmount;

        System.out.println("How many days do you want to run?");
        int days = sc.nextInt();

        for(int i = 0; i<=days; i++) {
            int counter = 0;
            String indicator = "LOSE";
            while (money < winLimit && money > 0) {
                int roll = (int) (Math.random() * 100) + 1;
                if (roll <= winChance) {
                    money += 1;
                    //System.out.println("Win with " + money);
                } else {
                    money -= 1;
                   // System.out.println("Loss with " + money);
                }
                counter++;
            }
            if (money >= winLimit) {
                System.out.println("Success with " + money);
                indicator = "WIN";
            } else {
                System.out.println("Ruin");
            }
                System.out.println("Day: " +(i+1)+ " "+ counter+ " " + indicator);
        }
    }
}
/*
 * import java.util.Scanner;
 * public class Ruin {
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * Scanner input2 = new Scanner(System.in);
 * System.out.println("What is the starting amout of cash?")
 * int startAmount = input.nextInt();
 * System.out.println("What is the chance of winning from 0 to 1?")
 * int winChance = input2.nextDouble();
 * System.out.println("How much money do you need to win?")
 * int winLimit = input.nextInt();
 * 
 * }
 * }
 */