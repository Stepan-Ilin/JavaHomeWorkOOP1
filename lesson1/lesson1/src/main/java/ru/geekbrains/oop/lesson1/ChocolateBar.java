package ru.geekbrains.oop.lesson1;

public class ChocolateBar extends Product{

//region Поля
    int calories; // коло-во колорий
    double cacao; // % какао

//endregion

    ChocolateBar(String brand, String name, double price, int calories, int cacao){
        super(brand, name, price);
        this.calories = calories;
        this.cacao = cacao;
    }
    @Override
    public String displayInfo() {
        return String.format("Шоколадный батончик\n\tБренд: %s\n\tНазвание: %s\n\tЦена: %.2f\n\tКоличество калорий: %d\n\tПроцент какао: %.1f",
                brand, name, price, calories, cacao);
    }

    public int getCalories() {
        return calories;
    }

    public double getCacao() {
        return cacao;
    }
}
