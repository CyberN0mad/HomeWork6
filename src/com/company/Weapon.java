package com.company;

public class Weapon {
    private String TypeOfWeapon;
    private String nameOfWeapon;



    public  Weapon(String typeOfWeapon, String nameOfWeapon) {
        this.TypeOfWeapon = typeOfWeapon;
        this.nameOfWeapon = nameOfWeapon;
    }

    public String getTypeOfWeapon() {
        return TypeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        TypeOfWeapon = typeOfWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}


