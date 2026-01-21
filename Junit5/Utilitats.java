package Junit5;

public class Utilitats {

    // assertEquals
    public static int suma(int a, int b) {
        return a + b;
    }

    // Exercici 1
    public static int resta(int a, int b) {
        return a - b;
    }

    // assertTrue / assertFalse
    public static boolean esParell(int n) {
        return n % 2 == 0;
    }

    // Exercici 2
    public static boolean esPositiu(int n) {
        return n > 0;
    }

    // assertThrows
    public static int divideix(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No es pot dividir per zero");
        }
        return a / b;
    }

    // Exercici 3
    public static int arrelQuadradaEntera(int n) {
        if (n < 0) {
            throw new ArithmeticException(
                "No existeix arrel quadrada entera de negatius"
            );
        }
        return (int) Math.sqrt(n);
    }

    // assertNull / assertNotNull
    public static String saludaSiNomValid(String nom) {
        if (nom == null) return null;
        if (nom.trim().isEmpty()) return null;
        return "Hola, " + nom.trim() + "!";
    }

    // Exercici 4
    public static String trobaInicial(String text) {
        if (text == null) return null;
        text = text.trim();
        if (text.isEmpty()) return null;
        return text.substring(0, 1);
    }
}
