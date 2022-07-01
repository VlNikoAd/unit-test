import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calc;

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @BeforeEach
    public void init() {
        System.out.println("\nTest started");
        calc = new Calculator();
    }

    @AfterEach
    public void finished() {
        System.out.println("Test completed");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("Tests completed");
    }

    @Test
    public void testPlus() {
        int a = 49;
        int b = 1;
        int expected = 50;

        int result = calc.plus.apply(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testMinus() {
        int a = 100;
        int b = 25;
        int expected = 75;

        int result = calc.minus.apply(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testIsPositive() {
        int a = 7;
        boolean expected = true;

        boolean result = calc.isPositive.test(a);

        Assertions.assertEquals(expected, result);
    }
}
