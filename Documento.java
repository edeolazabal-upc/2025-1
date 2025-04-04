public class Documento {
    private int id;
    private String direccion;

    public void registrar(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }
}
