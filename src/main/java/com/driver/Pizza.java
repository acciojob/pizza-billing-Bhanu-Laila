package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Boolean isCheeseAdded = false;
    public Boolean isToppingsAdded = false;
    public Boolean isPaperBagAdded = false;
    public int basePrice;
    public int cheesePrice;
    public int toppingsPrice;
    public int paperBagPrice;
    public int totalPrice;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(!isVeg){
            basePrice = 400;
            toppingsPrice = 120;
        }else{
            basePrice = 300;
            toppingsPrice = 70;
        }
        cheesePrice = 80;
        paperBagPrice = 20;

    }

    public int getPrice(){
        totalPrice = totalPrice + basePrice;
        bill = bill + "Base Price Of The Pizza:" + basePrice + "/n";
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            totalPrice = totalPrice + cheesePrice;
            bill = bill + "Extra Cheese Added: " + cheesePrice+ "/n";
            isCheeseAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            totalPrice = totalPrice + toppingsPrice;
            bill = bill + "Extra Toppings Added: " + toppingsPrice + "/n";
            isToppingsAdded = true;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            totalPrice = totalPrice + paperBagPrice;
            bill= bill + "Paperbag Added: " + paperBagPrice +"/n";
            isPaperBagAdded = true;
        }

    }

    public String getBill(){
        // your code goes here
        bill = bill + "Total Price: " + totalPrice + "/n";
        return this.bill;
    }
}
