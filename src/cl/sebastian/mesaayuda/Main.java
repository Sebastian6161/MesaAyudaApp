package cl.sebastian.mesaayuda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        TicketService servicio = new TicketService();

        int opcion;

        do {

            System.out.println("\n===== MESA DE AYUDA =====");
            System.out.println("1. Crear ticket");
            System.out.println("2. Ver tickets");
            System.out.println("3. Buscar ticket");
            System.out.println("4. Cerrar ticket");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch(opcion){

                case 1:

                    System.out.print("ID: ");
                    int id = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Usuario: ");
                    String usuario = teclado.nextLine();

                    System.out.print("Problema: ");
                    String problema = teclado.nextLine();

                    System.out.print("Prioridad (Alta/Media/Baja): ");
                    String prioridad = teclado.nextLine();

                    Ticket nuevoTicket =
                            new Ticket(id, usuario, problema, prioridad);

                    servicio.crearTicket(nuevoTicket);

                    break;

                case 2:

                    servicio.mostrarTickets();

                    break;

                case 3:

                    System.out.print("Ingrese ID: ");
                    int buscar = teclado.nextInt();

                    servicio.buscarTicket(buscar);

                    break;

                case 4:

                    System.out.print("Ingrese ID del ticket: ");
                    int cerrar = teclado.nextInt();

                    servicio.cerrarTicket(cerrar);

                    break;

                case 5:

                    System.out.println("Programa finalizado");

                    break;

                default:

                    System.out.println("Opción inválida");

            }

        } while(opcion != 5);

        teclado.close();

    }
}
