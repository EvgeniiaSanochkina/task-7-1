import ru.netology.javaqa.javaqamvn.services.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 31, 7, 14, 14, 18
        };
        int summary = service.salesSum(sales);
        int avgSalesSum = service.averageSalesSum(sales);
        int maxMonth = service.maxSalesMonth(sales);
        int minMonth = service.minSalesMonth(sales);
        int monthsLowerThanAvg = service.monthsLowerThanAvg(sales);
        int monthsHigherThanAvg = service.monthsHigherThanAvg(sales);
        System.out.println(summary + "; " + avgSalesSum + "; " + maxMonth + "; " + minMonth + "; " + monthsLowerThanAvg + "; " + monthsHigherThanAvg);
    }
}
