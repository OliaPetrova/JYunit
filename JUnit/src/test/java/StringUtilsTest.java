import org.example.Main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testConcat_validArguments_success() {
        // given:
        Main stringUtils = new Main();
        String str1 = "Hello";
        String str2 = "World";

        // when:
        String result = stringUtils.concat(str1, str2);

        // then:
        Assertions.assertEquals("HelloWorld", result);
    }

    @Test
    public void testConcat_nullFirstArgument_throwsException() {
        // given:
        Main stringUtils = new Main();
        String str1 = null;
        String str2 = "World";

        // when & then:
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.concat(str1, str2);
        });
    }

    @Test
    public void testConcat_nullSecondArgument_throwsException() {
        // given:
        Main stringUtils = new Main();
        String str1 = "Hello";
        String str2 = null;

        // when & then:
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.concat(str1, str2);
        });
    }

    @Test
    public void testConcat_emptyStrings_success() {
        // given:
        Main stringUtils = new Main();
        String str1 = "";
        String str2 = "";

        // when:
        String result = stringUtils.concat(str1, str2);

        // then:
        Assertions.assertEquals("", result);
    }

    @Test
    public void testConcat_nonEmptyAndEmptyString_success() {
        // given:
        Main stringUtils = new Main();
        String str1 = "Hello";
        String str2 = "";

        // when:
        String result = stringUtils.concat(str1, str2);

        // then:
        Assertions.assertEquals("Hello", result);
    }
}