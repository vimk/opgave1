package opgave1;
/**
  * @author Kim Vammen
 */
public class Sack {
    private String name;
    private int weight;
    
    public Sack(String navn){
        navn = name;
        weight = 0;
    }
    
    public int addWeight(int x){
        x = x +1;
        return x; 
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
