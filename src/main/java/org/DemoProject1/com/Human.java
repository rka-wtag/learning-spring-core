package org.DemoProject1.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heartObject;

    public Human() {

    }



    //for injecting dependency by autowire annotation
//    @Autowired
    public Human(Heart heart) {
        this.heartObject = heart;
        System.out.println("Human constructor called");
    }

    //for injecting dependency using setter method
    @Autowired
    @Qualifier("heart")
    public void setHeartObject(Heart heartObject) {
        System.out.println("setter method called");
        this.heartObject = heartObject;
    }

    public void pumping(){
        heartObject.pump();
    }

}
