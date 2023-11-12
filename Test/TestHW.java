import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.Assertions.assertThat;

public class TestHW {
    MainHW mainHW;
    @BeforeEach
    void SetUp(){
        mainHW = new MainHW();
    }
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    @Test
    void correctEvenOddNumber() {
        assertThat(mainHW.evenOddNumber(10)).isEqualTo(true);
    }
    @Test
    void correctEvenNotOddNumber() {
        assertThat(mainHW.evenOddNumber(9)).isEqualTo(false);
    }
    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100)
    // и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    @Test
    void correctNumberInInterval() {
        assertThat(mainHW.numberInInterval(9)).isEqualTo(false);
    }
}
