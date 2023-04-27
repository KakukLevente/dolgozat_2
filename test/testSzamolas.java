//Kakuk Levente
//Szoft/1/N
//2023.04.27



import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

//JUnit4 import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
//JUnit4 import org.junit.Test;
import org.junit.jupiter.api.Test;



public class testSzamolas {
    Szamitas szamitas;
    @BeforeEach
    public void init() {
        this.szamitas = new Szamitas();
    }
    @Test
    public void testSzamitTerfogat() {        
        double actual = szamitas.szamitTerfogat(3, 12, 6);
        assertEquals(actual, 216.0, 0.01, "Nem 216-t kaptam");
    }
    @Test
    public void testSzamitTerfogatSecond() {
        double actual = szamitas.szamitTerfogat(7, 19, 2);
        assertEquals(actual, 266.0, 0.1, "Nem 266-t kaptam");
    }

    @Test
    public void testCheckInput() {
        boolean actual = szamitas.checkInput("33");
        assertTrue(actual);
    }
    @Test
    public void testCheckInputFloat() {
        boolean actual = szamitas.checkInput("33.5");
        assertTrue(actual);
    }
    @Test 
    public void testCheckInputFalse() {
        boolean actual = szamitas.checkInput("a");
        assertFalse(actual);
    }
    @Test 
    public void testCheckInputSpecial() {
        boolean actual = szamitas.checkInput("@");
        assertFalse(actual);
    }
}
