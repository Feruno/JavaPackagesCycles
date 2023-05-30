package ru.netology.services;

public class FreelancerWorkSchedule {
    public int calculate(int threshold, int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money > threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (threshold + expenses) / 3;
            } else {
                money += income - expenses;
            }
        }
        return count;
    }
}
