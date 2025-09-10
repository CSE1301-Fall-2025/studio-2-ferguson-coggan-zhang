package studio2;

import java.util.Random;

public class Pi {
    public static void main(String[] args) {
        Random rand = new Random();
        double hits = 0;
        for (int i = 0; i < 10000; i++) {
            if (throwDart(rand)) {
                hits++;
            }
        }
        double pi = hits * 4 / 10000;
        System.out.println(pi);
    }
    public static boolean throwDart(Random rand) {
        double dartx = rand.nextDouble(-1.0, 1.0);
        double darty = rand.nextDouble(-1.0, 1.0);
        if (Math.sqrt(darty*darty + dartx*dartx) <= 1) {
            System.out.println("Hit");
            return true;
        } else {
            System.out.println("Miss");
        }
        return false;
    }
}
