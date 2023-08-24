package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Boolean isCheeseAdded = false;
    public Boolean isToppingsAdded = false;
    public Boolean isPaperBagAdded = false;
    public Boolean isBillGenerated = false;
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
        this.totalPrice = this.basePrice;


    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded = true;
            this.totalPrice = this.totalPrice + this.cheesePrice;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            isToppingsAdded = true;
            this.totalPrice = this.totalPrice + this.toppingsPrice;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            isPaperBagAdded = true;
            this.totalPrice = this.totalPrice + this.paperBagPrice;
        }

    }

    public String getBill(){
        // your code goes here

        if(!isBillGenerated){
            this.bill = "Base Price Of The Pizza: "+this.basePrice+"\n";
            if(isCheeseAdded){
                this.bill = this.bill + "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingsAdded){
                this.bill = this.bill + "Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isPaperBagAdded){
                this.bill= bill + "Paperbag Added: "+this.paperBagPrice+"\n";
            }
            this.bill = this.bill + "Total Price: " + this.totalPrice+"\n";
            isBillGenerated = true;
        }

        return this.bill;
    }
}
