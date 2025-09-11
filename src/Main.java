import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("menu: ");

        //pon tu opcion

        System.out.println("Opcion 1: caca");
        System.out.println("Opcion 2: carusel");


        System.out.print("Opcion: ");
        switch (sc.nextInt()) {

            case 1: {

            }
            case 2: {
                sc.nextLine();
                System.out.println("¿Que es la vida?");
                String ans = sc.nextLine().toLowerCase();

                if (ans.equalsIgnoreCase("un carusel")){
                    System.out.println("Correcto");
                    break;
                } else {
                    System.out.println("Incorrecto. Esta accion tendra consecuencias.");
                    break;
                }

            }
        }
    }
}