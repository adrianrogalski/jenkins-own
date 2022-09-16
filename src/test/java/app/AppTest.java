package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testIfStringIsValid() {
        String test = "Jenkins basics";
        String result = App.print();
        assertEquals(test, result);
    }
}