package cl.sebastian.mesaayuda;

import java.util.ArrayList;

public class TicketService {

    ArrayList<Ticket> listaTickets = new ArrayList<>();

    public void crearTicket(Ticket ticket) {
        listaTickets.add(ticket);
        System.out.println("Ticket creado correctamente.");
    }

    public void mostrarTickets() {

        if (listaTickets.isEmpty()) {
            System.out.println("No existen tickets registrados.");
            return;
        }

        for (Ticket ticket : listaTickets) {
            ticket.mostrarInfo();
        }
    }

    public void buscarTicket(int id) {

        for (Ticket ticket : listaTickets) {

            if (ticket.getId() == id) {
                ticket.mostrarInfo();
                return;
            }
        }

        System.out.println("Ticket no encontrado.");
    }

    public void cerrarTicket(int id) {

        for (Ticket ticket : listaTickets) {

            if (ticket.getId() == id) {
                ticket.cerrarTicket();
                System.out.println("Ticket cerrado correctamente.");
                return;
            }
        }

        System.out.println("Ticket no encontrado.");
    }
}