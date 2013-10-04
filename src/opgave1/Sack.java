//klasse til opgave 1 i første bundne forudsætning
package opgave1;
/**
  * @author Kim Vammen
 */
public class Sack {
    private String name;
    private int weight;
    
    public Sack(String navn){
        name = navn;
        weight = 0;
    }
    
    public void addWeight(int x){
        weight = weight + x; 
    }
    public int emptySack(){
        return weight = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public String valueToString(){      
        return name + ": " + weight;
    }
    
    
}
