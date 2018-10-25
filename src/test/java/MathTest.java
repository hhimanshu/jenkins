import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathTest {
  @Test
  public void testSum() {
    assertEquals("sum should be equal", 4, Math.sum(1, 3));
  }
}