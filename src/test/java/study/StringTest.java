package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String string1 = "1,2";
        String string2 = "1";

        assertThat(string1.split(",")).containsExactly("1", "2");
        assertThat(string2.split(",")).contains("1");
    }

    @Test
    void subString(){
        String tempString = "(1,2)";
        assertThat(tempString.substring(1, 4)).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt의 범위를 벗어난 경우")
    void charAt(){
        String tempString = "abc";

        assertThat(tempString.charAt(0)).isEqualTo('a');
        assertThatThrownBy(() ->
            tempString.charAt(5)
        ).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 5");
    }
}
