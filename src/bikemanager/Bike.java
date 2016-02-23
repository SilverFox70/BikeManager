package bikemanager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Bike {
    String riderName;
    int numOfGears;
    int velocity;
    
    public Bike(){
        riderName = "Joe";
        numOfGears = 10;
        velocity = 5;
    }
    
    public Bike(String name){
        riderName = name;
        numOfGears = 3;
        velocity = 4;
    }
    
    public String getRiderName(){
        return riderName;
    }
    
}
