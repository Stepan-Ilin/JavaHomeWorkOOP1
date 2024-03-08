package ru.geekbrains.oop.lesson1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        int a = 1;

        Product product1 = new Product("Brand #1", " ", -1000 );
        Product product2 = new Product("Name #2", 350);


        product1.setPrice(-300);
        /*product1.name = "Name #1";
        product1.brand = "Brand #1";
        product1.price = -100;

        product2.name = null;
        product2.brand = "Brand #1";
        product2.price = 0;*/

        System.out.println(product1.displayInfo());
        System.out.println(product2.displayInfo());


        product1.setPrice(500);
        System.out.println(product1.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Name #3", 250, 0.33);
        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #1", "Name #2", 350, 0.5, 1);
        ChocolateBar chocolateBar1  = new ChocolateBar("Шоколадный планетарий","Марс", 200, 450, 35);
        ChocolateBar chocolateBar2  = new ChocolateBar("Шоколадный планетарий","Марс", 200, 450, 50);

        System.out.println(bottleOfWater1.displayInfo());
        System.out.println(bottleOfMilk1.displayInfo());
        System.out.println(chocolateBar1.displayInfo());
        System.out.println(chocolateBar2.displayInfo());

        Product product11 = new BottleOfWater("Name #3", 250, 0.5);
        Product product22 = new BottleOfMilk("Brand #1", "Name #2", 350, 0.5, 1);
        Product product23   = new ChocolateBar("Шоколадный планетарий","Меркурий", 200, 450, 35);
        Product product24   = new ChocolateBar("Шоколадный планетарий","Марс", 200, 245, 35);

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfWater1);
        list.add(bottleOfMilk1);
        list.add(product11);
        list.add(product22);
        list.add(chocolateBar1);

        VendingMachine vendingMachine = new VendingMachine(list);
        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Name #3", 0.5);
        ChocolateBar chocolateBarRes = vendingMachine.getChocolateBar("Марс", 450, 35);
        sale(chocolateBarRes);
        sale(bottleOfWaterRes);
//        if (bottleOfWaterRes != null){
//            System.out.println("Вы купили: ");
//            System.out.println(bottleOfWaterRes.displayInfo());
//        }
//        else {
//            System.out.println("Такой бутылки с водой нет в автомате.");
//        }
    }
    private static void sale (Product product) {
        if (product!= null) {
            System.out.println("Вы купили: ");
            System.out.println(product.displayInfo());
        } else {

            System.out.println("Такого продукта нет в автомате.");
        }
    }
}
