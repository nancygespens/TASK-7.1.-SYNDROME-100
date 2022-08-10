package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    public void shouldFindMax() {

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        StatisticsService service = new StatisticsService();

        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxInTheMiddle() {

        long[] incomesInBillions = {12, 5, 8, 4, 5, 30, 8, 6, 11, 11, 12};

        StatisticsService service = new StatisticsService();

        long expected = 30;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

}