import java.security.SecureRandom; //Se importan las librerias
import java.util.Scanner;         //las librerias que se van a usar para el ejercicio

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //se lee la entrada del usuario
        System.out.println("ingrese el numero de veces que quiere tirar el dado: ");
        int numveces = scanner.nextInt();

        scanner.close();

        SecureRandom random = new SecureRandom(); // Se define el generador de los numeros aleatorios
        int cara1 = 0; //Definimos las variables para cada cara del dado
        int cara2 = 0;
        int cara3 = 0;
        int cara4 = 0;
        int cara5 = 0;
        int cara6 = 0;

        for (int i = 0; i < numveces; i++) { //Se hace el ciclo for para hacer la simulacion del lanzamiento
            int tiros = 1 + random.nextInt(6); //Aca se genera el numero de 1 a 6

            switch (tiros) { //Se contabiliza la frecuencia
                case 1: cara1++;
                break;
                case 2: cara2++;
                break;
                case 3: cara3++;
                break;
                case 4: cara4++;
                break;
                case 5: cara5++;
                break;
                case 6: cara6++;
                break;

            }
        }

        System.out.println("Resultado"); //Se realiza esta tabla mostrando la frecuencia de cada cara del dado
        System.out.println("Caras Del Dado");
        System.out.println("Cara1 frecuencia  "+ cara1);
        System.out.println("Cara2 frecuencia  "+ cara2);
        System.out.println("Cara3 frecuencia  "+ cara3);
        System.out.println("Cara4 frecuencia  "+ cara4);
        System.out.println("Cara5 frecuencia  "+ cara5);
        System.out.println("Cara6 frecuencia  "+ cara6);
    }
}