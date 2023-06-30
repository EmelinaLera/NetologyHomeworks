
package ru.netology.stats;

public class StatsService {
    public long sumOfAllSales(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
        }
        return totalSum;


    }

    public long average(long[] sales) {
        long totalSum = sumOfAllSales(sales);
        long average = totalSum / 12;
        return average;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth])
                maxMonth = i;


        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int numberOfMonthsBelowAverage(long[] sales) {
        int numberOfMonth = 0;
        long averageSale = average(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageSale) {
                numberOfMonth++;
            }
        }

        return numberOfMonth;
    }

    public int numberOfMonthsHigherAverage(long[] sales) {
        int numberOfMonth = 0;
        long averageSale = average(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > averageSale) {
                numberOfMonth++;
            }


        }

        return numberOfMonth;
    }
}
