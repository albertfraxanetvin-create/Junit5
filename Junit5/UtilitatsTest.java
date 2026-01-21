package Junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UtilitatsTest {

    // ---------- assertEquals ----------
    @Test
    void testSuma() {
        assertEquals(5, Utilitats.suma(2, 3));
    }

    @Test
    void testRestaCasBasic() {
        assertEquals(7, Utilitats.resta(10, 3));
    }

    @Test
    void testRestaResultatNegatiu() {
        assertEquals(-7, Utilitats.resta(3, 10));
    }

    @Test
    void testRestaZeros() {
        assertEquals(0, Utilitats.resta(0, 0));
    }

    // ---------- assertTrue / assertFalse ----------
    @Test
    void testEsParellTrue() {
        assertTrue(Utilitats.esParell(10));
    }

    @Test
    void testEsParellFalse() {
        assertFalse(Utilitats.esParell(7));
    }

    @Test
    void testEsPositiu() {
        assertTrue(Utilitats.esPositiu(1));
        assertFalse(Utilitats.esPositiu(0));
        assertFalse(Utilitats.esPositiu(-1));
    }

    // ---------- assertThrows ----------
    @Test
    void testDivideixExcepcio() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Utilitats.divideix(10, 0));
    }

    @Test
    void testArrelQuadradaNegativa() {
        assertThrows(
                ArithmeticException.class,
                () -> Utilitats.arrelQuadradaEntera(-1));
    }

    // ---------- assertNull / assertNotNull ----------
    @Test
    void testSaluda() {
        assertNull(Utilitats.saludaSiNomValid(null));
        assertNull(Utilitats.saludaSiNomValid("   "));
        assertEquals("Hola, Cristian!", Utilitats.saludaSiNomValid("Cristian"));
    }

    @Test
    void testTrobaInicial() {
        assertNull(Utilitats.trobaInicial(null));
        assertNull(Utilitats.trobaInicial(" "));
        assertEquals("J", Utilitats.trobaInicial("Java"));
        assertEquals("h", Utilitats.trobaInicial(" hola"));
    }

    // ---------- assertEquals arrel ----------
    @Test
    void testArrelQuadradaValida() {
        assertEquals(3, Utilitats.arrelQuadradaEntera(9));
        assertEquals(0, Utilitats.arrelQuadradaEntera(0));
    }
}
