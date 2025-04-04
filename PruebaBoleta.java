public class PruebaBoleta {
    public static void main(String[] args) {
        Boleta boleta = new Boleta();
        boleta.registrar(2001, "Av. Sol 456");
        boleta.setDatos("12345678", "Pérez", "Juan");
        boleta.mostrarDatos();
    }
}