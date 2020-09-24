package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss =  new Boss(300, 50, new Weapon("AK74", "Rifle"));
        Boss boss1 = new Boss(400, 30, new Weapon("Makarov", "Pistol"));
        Boss boss2 = new Boss(500, 50, new Weapon("SVD", "Sniper rifle"));

        boss.printInfo();
        boss1.printInfo();
        boss2.printInfo();
    }

}