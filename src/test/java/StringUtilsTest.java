import org.junit.jupiter.api.Test;
import ru.clevertec.gradleStudy.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testIsPositiveNumber() {
      assertTrue(StringUtils.isPositiveNumber("123"));
      assertFalse(StringUtils.isPositiveNumber("-123"));
      assertFalse(StringUtils.isPositiveNumber("abc"));
  }
}
