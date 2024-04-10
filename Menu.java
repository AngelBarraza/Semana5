import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        Scanner leer = new Scanner(System.in);
        int op = 0;
        int temp;
        do {
            System.out.println("Menu.");
            System.out.println("1- Contar Digitos.");
            System.out.println("2- Sumar Digitos.");
            System.out.println("3- Maximo como un Divisor.");
            System.out.println("4- Invertir un String.");
            System.out.println("5- Salir.");
            try {
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Opción contar digitos.");
                        System.out.println("Ingrese un entero positivo: ");
                        try {
                            int x = leer.nextInt();
                            while (x < 0) {
                                System.out.println("Debe ser positivo: ");
                                x = leer.nextInt();
                            }
                            int y = CosasdelMenu.contardigitos(x);
                            System.out.println(y);
                        } catch (InputMismatchException e) {
                            System.out.println("Debe ser un entero positivo.");
                            leer.next();
                            op = 0;
                        }
                        break;
                    case 2:
                        System.out.println("Opción sumar digitos.");
                        System.out.println("Ingrese un entero positivo: ");
                        try {
                            int x = leer.nextInt();
                            while (x < 0) {
                                System.out.println("Debe ser positivo: ");
                                x = leer.nextInt();
                            }
                            int y = CosasdelMenu.sumardigitos(x);
                            System.out.println(y);
                        } catch (InputMismatchException e) {
                            System.out.println("Debe ser un entero positivo.");
                            leer.next();
                            op = 0;
                        }
                        break;
                    case 3:
                        System.out.println("Opción maximo como un divisor.");
                        System.out.println("Debe ingresar dos numeros positivos:");
                        try {
                            int x = leer.nextInt();
                            while (x < 0) {
                                System.out.println("Debe ser positivo: ");
                                x = leer.nextInt();
                            }
                            System.out.println("Ingrese otro numero: ");
                            int y = leer.nextInt();
                            while (y < 0){
                                System.out.println("Debe ser positivo: ");
                                y = leer.nextInt();
                            }
                            int z = CosasdelMenu.maximocd(x,y);
                            System.out.println("El maximo comun divisor es: ");
                            System.out.println(z);
                        } catch (InputMismatchException e) {
                            System.out.println("Debe ser un entero positivo.");
                            leer.next();
                            op = 0;
                        }
                        break;
                    case 4:
                        System.out.println("Opción invertido.");
                        System.out.println("Ingrese la palabra a invertir: ");
                        String palabra = leer.next();
                        String girado = CosasdelMenu.invertir(palabra);
                        System.out.println(girado);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se pueden ingresar las opciones seleccionadas.");
            }
        } while (op != 5);
    }

}
