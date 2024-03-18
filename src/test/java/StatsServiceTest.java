import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();
        long[] s = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sumAllSales(s);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arithmeticalMeanSales() {
        StatsService service = new StatsService();
        long[] s = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.arithmeticalMeanSales(s);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] s = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.maxSales(s);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] s = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(s);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minCount() {
        StatsService service = new StatsService();
        long[] s = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.minCount(s);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxCount() {
        StatsService service = new StatsService();
        long[] s = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.maxCount(s);

        Assertions.assertEquals(expected, actual);
    }
}
