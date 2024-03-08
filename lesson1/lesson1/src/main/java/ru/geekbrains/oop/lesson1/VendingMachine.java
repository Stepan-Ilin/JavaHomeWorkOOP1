package ru.geekbrains.oop.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }


    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public ChocolateBar getChocolateBar(String name, int calories, double cacao){
        for (Product product : products){
            if (product instanceof ChocolateBar){
                ChocolateBar chocolateBar = (ChocolateBar) product;
                if (chocolateBar.getName().equals(name) && chocolateBar.getCalories() == calories && chocolateBar.getCacao() == cacao){
                    return chocolateBar;
                }
            }
        }
        return null;
    }

}
