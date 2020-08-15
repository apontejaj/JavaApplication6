/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import model.Dog;
import model.Person;

/**
 *
 * @author apont
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person p1 = new Person("Amilcar", 35, 1.77);
        p1.run();
        
        Person p2 = new Person("Peter", 35, 1.77);
        p2.run();
        
        Dog d1 = new Dog("Fluffy");
        
    }
    
}
