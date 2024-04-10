import java.util.InputMismatchException;

public class CosasdelMenu {

    static int contardigitos(int x) {
        if (x < 10) {
            return 1;
        } else {
            return 1 + contardigitos(x / 10);
        }
    }

    static int sumardigitos(int x) {
        if (x < 10) {
            return x;
        } else {
            return x % 10 + sumardigitos(x / 10);
        }
    }

    static int maximocd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return maximocd(y, x % y);
        }
    }

    static String invertir(String s) {
        if (s.length() == 1) {
            return s;
        } else {
            return invertir(s.substring(1)) + s.charAt(0);
        }
    }

}
