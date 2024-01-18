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

    @Test
    public void testKm1(){
        Bil volvo = new Bil();
        volvo.setKm(10000);
        assertEquals("Service er ikke nødvendig", volvo.sjekkService());
    }

    @Test
    public void testKm2(){
        Bil volvo = new Bil();
        volvo.setKm(21000);
        assertEquals("20000 km service er nødvendig", volvo.sjekkService());
    }

    @Test
    public void testKm3(){
        Bil volvo = new Bil();
        volvo.setKm(51000);
        assertEquals("50000 km service er nødvendig", volvo.sjekkService());
    }

}
