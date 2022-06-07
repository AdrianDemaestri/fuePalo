package fuePalo;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        Arco arco = new Arco(732,232);
        ArrayList<Pelota> pelotas = new ArrayList<>();
        do{
            pelotas.add(pedirPelota());
            System.out.println("\nDesea seguir ingresando pelotas?\n");
            System.out.println("1) Si. \n0) No.\n");
            System.out.println("Ingrese la opcion que desea realizar: ");
            opcion = entrada.nextInt();
        }while(opcion != 0);
        for (Pelota pelota : pelotas)
            System.out.println(resultado(pelota,arco));
    }
    public static Pelota pedirPelota(){
        int coordenadaX;
        int coordenadaY;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas en X de la pelota: ");
        coordenadaX = entrada.nextInt();
        System.out.println("Ingrese las coordenadas en Y de la pelota: ");
        coordenadaY = entrada.nextInt();
        return new Pelota(coordenadaY, coordenadaX);
    }

    private static String resultado(Pelota pelota, Arco arco){

        if (pelota.getX() < 0
                || pelota.getX() > arco.getDimension().width
                || pelota.getY() > arco.getDimension().height
        )
            return "AFUERA";
        if (pelota.getY() == arco.getDimension().height
                || pelota.getX() == 0
                || pelota.getX() == arco.getDimension().width
        )
            return "PALO";
        return "GOOL";

    }
}
