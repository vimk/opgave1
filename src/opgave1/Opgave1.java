///opgave 1 i første bundne forudsætning
package opgave1;

import java.util.Random;

/**
 * @author Kim Vammen
 */
public class Opgave1 {

    public static void main(String[] args) {

        Sack s1 = new Sack("Kartoffelsæk");
        Sack s2 = new Sack("Affaldssæk");
        Random x = new Random();

        while (s1.getWeight() != 99 && s1.getWeight() != 100 && s2.getWeight() != 99 && s2.getWeight() != 100) {

            if (s1.getWeight() > s2.getWeight()) {
                s2.addWeight(x.nextInt(20) + 1);
                System.out.println(s2.valueToString());

            } else {
                s1.addWeight(x.nextInt(20) + 1);
                System.out.println(s1.valueToString());
            }

            if (s1.getWeight() > 100) {
                s1.emptySack();
                System.out.println(s1.valueToString());
            }

            if (s2.getWeight() > 100) {
                s2.emptySack();
                System.out.println(s2.valueToString());
            }
        }
    }
}
