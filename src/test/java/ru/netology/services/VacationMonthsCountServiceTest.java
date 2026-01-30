package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationMonthsCountServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    void vacationMonthsCalculateTest(int income, int expenses, int threshold, int expected) {
        VacationMonthsCountService service = new VacationMonthsCountService();
        int actual = service.vacationMonthsCalculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
