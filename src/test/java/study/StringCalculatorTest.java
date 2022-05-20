package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    void plusTest(){
        String value = "5 + 7";
        assertThat(stringCalculator.operation(value)).isEqualTo(12);
    }

    @Test
    void minusTest(){
        String value = "9 - 2";
        assertThat(stringCalculator.operation(value)).isEqualTo(7);
    }

    @Test
    void divideTest(){
        String value = "5 / 0";
        assertThat(stringCalculator.operation(value)).isEqualTo(0);
    }

    @Test
    void multiplyTest(){
        String value = "5 * 2";
        assertThat(stringCalculator.operation(value)).isEqualTo(10);
    }
}
