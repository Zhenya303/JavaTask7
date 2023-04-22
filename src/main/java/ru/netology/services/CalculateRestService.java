package ru.netology.services;

public class CalculateRestService {
    public int calcRestService(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money < threshold) { // можем ли отдыхать?
                money = money - expenses + income;
            } else {
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            }

        }
        return count;
    }
}

