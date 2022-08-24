package ru.netology.javaqa.javaqamvn.services;

public class StatsService {
    public int salesSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSalesSum(int[] sales) {
        int sum = 0;
        int quantity = sales.length;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int avg = sum / quantity;
        return avg;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxMonth) {
                maxMonth = sales[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsLowerThanAvg(int[] sales) {
        int sum = 0;
        int quantity = sales.length;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int avg = sum / quantity;
        int months = 0;
        int month = 0;
        for (long sale : sales) {
            if (avg > sales[month]) {
                months = months + 1;
            }
            month = month + 1;
        }
        return months;
    }

    public int monthsHigherThanAvg(int[] sales) {
        int sum = 0;
        int quantity = sales.length;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int avg = sum / quantity;
        int months = 0;
        int month = 0;
        for (long sale : sales) {
            if (avg < sales[month]) {
                months = months + 1;
            }
            month = month + 1;
        }
        return months;
    }
}
