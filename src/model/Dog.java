/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author apont
 */
public class Dog {
    
    String name;
    String breed;
    boolean vaccined;
    
    public Dog(String name){
        this.name = name;
        this.breed = "Mixed";
        this.vaccined = false;    
        
        Person p1 = new Person("Amilcar", 35, 1.77);
        p1.run();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isVaccined() {
        return vaccined;
    }

    public void setVaccined(boolean vaccined) {
        this.vaccined = vaccined;
    }
    
    
    
}
