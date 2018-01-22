package kata.leapyear;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LeapYearShould {

    @Test
    public void typical_leap_year(){
        assertEquals("typical leap year", LeapYearSimple.leapyear(1996));
    }

    @Test
    public void atypical_leap_year(){
        assertEquals("atypical leap year", LeapYearSimple.leapyear(2000));
    }

    @Test
    public void typical_common_year(){
        assertEquals("typical common year", LeapYearSimple.leapyear(2001));
    }
}
