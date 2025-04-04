public class Boleta extends Documento {
    private String dni;
    private String apellido;
    private String nombre;

    public void setDatos(String dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
        System.out.println("ID Documento: " + getId());
        System.out.println("Dirección Documento: " + getDireccion());
    }
}
