/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikemanager;
import java.util.*;

/**
 *
 * @author William
 */
public class BikeManager {

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    public BikeManager(){
        
    }
    List<Bike> list = new ArrayList<>();
    
    
    public void createBike(){
        list.add(new Bike());
    }
    
    public void createBike(String name){
        list.add(new Bike(name));
    }
    
    public String getThisBike(){
        Bike temp = list.get(list.size()-1);
        return temp.riderName + "\t" + temp.numOfGears + "\t" + temp.velocity + "\n";
    }
    
    public String getBikeList(){
        String s = "";
        for (Bike b: list){
            s += b.riderName + "\t" + b.numOfGears + "\t" + b.velocity + "\n";
        }
        return s;
    }
}
