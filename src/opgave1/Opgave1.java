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
                
        while(s1.getWeight() != 99 && s1.getWeight() != 100 && s1.getWeight() <= 99  && s1.getWeight() <= 100 &&  s2.getWeight() != 99 && s2.getWeight() != 100 && s2.getWeight() <= 99  && s2.getWeight() <= 100){
            s1.addWeight(x.nextInt(20)+1);
            s2.addWeight(x.nextInt(20)+1);
            
            System.out.print(s1.valueToString() + " , ");
            System.out.print(s2.valueToString());
            System.out.println("");
            
            while (s1.getWeight() > 100 || s2.getWeight() > 100){
                s1.emptySack();
                s2.emptySack();
                
                System.out.print(s1.valueToString() + " , ");
                System.out.print(s2.valueToString());
                System.out.println("");
            }
        }
        
        
    }
}
