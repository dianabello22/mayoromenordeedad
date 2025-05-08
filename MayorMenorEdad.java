import java.util.Scanner;

public class MayorMenorEdad {
    public static void main(String[] args) throws Exception {
        Scanner entradaUsuario = new Scanner(System.in);

        int edadUsuario;

        System.out.println("Ingresa tu edad: ");
        edadUsuario = entradaUsuario.nextInt();

        if (edadUsuario >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        
        entradaUsuario.close();
    }
}
