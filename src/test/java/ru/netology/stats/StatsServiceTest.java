package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindSumOfSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumOfAllSales(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldFindMaxSaleMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void ShouldFindMinSaleMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void findNumbersOfMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberOfMonth = 5;
        int actualNumberOfMonth = service.numberOfMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedNumberOfMonth, actualNumberOfMonth);
    }

    @Test
    public void findNumbersOfMonthsHigherAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberOfMonth = 5;
        int actualNumberOfMonth = service.numberOfMonthsHigherAverage(sales);

        Assertions.assertEquals(expectedNumberOfMonth, actualNumberOfMonth);
    }

}
