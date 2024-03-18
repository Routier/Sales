package ru.netology.stats;
public class StatsService {
    public long sumAllSales(long[] sales){
        long sumAllSales = 0;
        for (int i = 0; i < sales.length; i++){
            sumAllSales = sumAllSales + sales[i];
        }

        return sumAllSales; //возвращает сумму всех продаж
    }

    public  long arithmeticalMeanSales(long[] sales){
        long arithmeticalMeanSales = 0;
        for (int i =0; i < sales.length; i++){
            arithmeticalMeanSales = arithmeticalMeanSales+ sales[i];
        }

        return arithmeticalMeanSales / sales.length; // возвращает среднее арифметическое
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public  int minCount(long[] sales){
        int minCount = 0;
        long sumAllSales = 0;
        for (int i =0 ;i < sales.length; i++){
            sumAllSales = sumAllSales + sales[i];
        }
        int arithmeticalMeanSales = (int)sumAllSales / sales.length;

        for (int i = 0; i < sales.length; i++){
            if (sales[i] <= arithmeticalMeanSales){
                minCount++;
            }
        }

        return minCount;
    }
    public  int maxCount(long[] sales){
        int maxCount = 0;
        long sumAllSales = 0;
        for (int i =0 ;i < sales.length; i++){
            sumAllSales = sumAllSales + sales[i];
        }
        int arithmeticalMeanSales = (int)sumAllSales / sales.length;

        for (int i = 0; i < sales.length; i++){
            if (sales[i] > arithmeticalMeanSales){
                maxCount++;
            }
        }

        return maxCount;
    }
}
