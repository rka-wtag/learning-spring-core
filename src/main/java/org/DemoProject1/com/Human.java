package org.DemoProject1.com;

public class Human {
    private Heart heart;

//for injecting dependency by constructor
    public Human(Heart heart) {
        this.heart = heart;
    }

    //for injecting dependency using setter method
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void pumping(){
        heart.pump();
    }

}
