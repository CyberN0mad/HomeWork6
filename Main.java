package com.company;

import kg.geek.boss.Boss;
import kg.geek.boss.Weapon;

public class Main {

    public static void main(String[] args) {
        Boss boss =  new Boss(120, 20,new Weapon("ak47", "Gun"));
        Boss boss1 = new Boss(500, 30, new Weapon("M16", "Gun"));
        Boss boss2 = new Boss(320, 25, new Weapon("MREG", "Gun"));
        boss.printInfo();
        boss1.printInfo();
        boss2.printInfo();
    }

    }