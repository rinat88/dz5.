package com.company;
public class Car {
   private int speed;
    double acceleration;
    String typeOfCar;
    public Car(){

    }
    public Car(double acceleration, int speed , String typeOfCar) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.typeOfCar = typeOfCar;

    }
    public Car(String typeOfCar,int speed , double acceleration ){
        this.speed = speed;
        this.acceleration = acceleration;
        this.typeOfCar = typeOfCar;
    }
    public Car(int speed , double acceleration , String typeOfCar){
        this.speed = speed;
        this.acceleration = acceleration;
        this.typeOfCar = typeOfCar;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0){
            System.out.println("Неверные Данные !");
        }else {
        this.speed = speed; }
    }
}

