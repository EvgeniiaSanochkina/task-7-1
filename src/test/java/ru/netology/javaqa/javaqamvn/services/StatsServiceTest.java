package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testSalesSum() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        long actual = service.salesSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSalesSum() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        long actual = service.averageSalesSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        long actual = service.maxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        long actual = service.minSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsLowerThanAvg() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        long actual = service.monthsLowerThanAvg(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsHigherThanAvg() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        long actual = service.monthsHigherThanAvg(sales);
        Assertions.assertEquals(expected, actual);
    }
}
