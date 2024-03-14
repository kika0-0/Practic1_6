/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.practical16;

public class Seller {
    String producer;
    String newProducer = "noName";
    

    public Seller (String producer) {
        this.producer = producer;
    }

    public String getName() {
        return producer;
    }

    public void setName(String name) {
        this.producer = producer;
    }  
     public String getNewName() {
        return newProducer;
    }

    public void setNewName(String name) {
        this.newProducer = newProducer;
    }
    public String modify()
    {
        newProducer = this.producer.replaceAll("o", "a");
        if  (newProducer.charAt(0)== 'n' || newProducer.charAt(0) == 'N') {
            this.newProducer = newProducer;
            return newProducer;
        }
        this.newProducer = newProducer.toLowerCase();
        return newProducer;
    }

    @Override
    public String toString() {
        return ("Изначальное: " + this.producer + 
                "," + "измененное: " + this.newProducer);
    }
}
