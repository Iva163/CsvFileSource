package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void testRegistered(long expected, long amount, boolean isRegistered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, isRegistered);
        Assertions.assertEquals(expected, actual);
    }
}
