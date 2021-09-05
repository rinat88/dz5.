package com.company;


import java.io.StringReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(305);
        car.acceleration = 3.6;
        car.typeOfCar = "Audi";
        System.out.println("Марка Машины : " + car.typeOfCar + " " + "Максимальная Скорость : "
                + car.getSpeed() + " " + "Разгон до 100метров :" + car.acceleration);
        Car car1 = new Car(10.5, 192, "Honda");
        System.out.println("Марка Машины : " + car1.typeOfCar + " " + "Максимальная Скорость : "
                + car1.getSpeed() + " " + "Разгон до 100метров :" + car1.acceleration);
        Car car2 = new Car("Lamborghini", 354, 2.9);
        System.out.println("Марка Машины : " + car2.typeOfCar + " " + "Максимальная Скорость : "
                + car2.getSpeed() + " " + "Разгон до 100метров :" + car2.acceleration);
        Car car3 = new Car(190, 11.3, "Nissan");
        System.out.println("Марка Машины : " + car3.typeOfCar + " " + "Максимальная Скорость : "
                + car3.getSpeed() + " " + "Разгон до 100метров :" + car3.acceleration);


        Scanner sc = new Scanner(System.in);
        System.out.println("введите любое число : ");

            int number = sc.nextInt();
            System.out.println("Это ваш персональный номер ! " + number);
            sc.close();

    }
}
