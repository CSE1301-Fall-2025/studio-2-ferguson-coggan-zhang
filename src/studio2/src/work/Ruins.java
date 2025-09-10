package work;

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

        while (money < winLimit && money > 0) {
            int roll = (int) (Math.random() * 100) + 1;
            if (roll <= winChance) {
                money += 1;
                System.out.println("Win with " + money);
            } else {
                money -= 1;
                System.out.println("Loss with " + money);
            }
        }
        if (money >= winLimit) {
            System.out.println("Success with " + money);
        } else {
            System.out.println("Ruin");
        }
    }
}
