package test;

import org.junit.Test;
import static org.junit.Assert.*;
public class BilTest {

    @Test
    public void testBilFarge(){
        Bil volvo = new Bil();
        volvo.setFarge("Rød");
        String farge = volvo.getFarge();
        assertEquals("Rød",farge);
    }

}
