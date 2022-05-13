package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Set Collection의 사이즈 메소드 검증")
    void size(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    @DisplayName("Set Collection의 값 검증")
    void containsTrue(int argument) {
        assertThat(numbers).contains(argument);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true" , "3:true", "4:false", "5:false"}, delimiter = ':')
    @DisplayName("Set Collection의 값 검증")
    void containsTrueAndFalse(int argument, boolean flag) {
        assertThat(numbers.contains(argument)).isEqualTo(flag);
    }
}
