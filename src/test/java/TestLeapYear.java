import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLeapYear {
    @Test
    public void Years_Divisible_By_400_Are_Leap_Years() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(800));
        assertTrue(LeapYear.isLeapYear(1200));
        assertTrue(LeapYear.isLeapYear(1600));
    }

    @Test
    public void Years_Divisible_By_4_But_Not_100_Are_Leap_Years() {
        assertTrue(LeapYear.isLeapYear(1992));
        assertTrue(LeapYear.isLeapYear(1980));
        assertTrue(LeapYear.isLeapYear(588));
        assertTrue(LeapYear.isLeapYear(1648));
    }

    @Test
    public void Years_Not_Divisible_By_4_Are_Not_Leap_Years() {
        assertFalse(LeapYear.isLeapYear(1994));
        assertFalse(LeapYear.isLeapYear(3));
        assertFalse(LeapYear.isLeapYear(1557));
        assertFalse(LeapYear.isLeapYear(2019));
    }

    @Test
    public void Years_Divisible_By_100_But_Not_400_Are_Not_Leap_Years() {
        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(500));
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(2100));
    }
}
