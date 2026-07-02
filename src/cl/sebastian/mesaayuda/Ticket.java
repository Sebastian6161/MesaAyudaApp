package cl.sebastian.mesaayuda;

public class Ticket {

    private int id;
    private String usuario;
    private String problema;
    private String prioridad;
    private boolean cerrado;

    public Ticket(int id, String usuario, String problema, String prioridad) {
        this.id = id;
        this.usuario = usuario;
        this.problema = problema;
        this.prioridad = prioridad;
        this.cerrado = false;
    }

    public int getId() {
        return id;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void cerrarTicket() {
        this.cerrado = true;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Usuario: " + usuario);
        System.out.println("Problema: " + problema);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Estado: " + (cerrado ? "Cerrado" : "Abierto"));
        System.out.println("---------------------");
    }
}
