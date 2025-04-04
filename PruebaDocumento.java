public class PruebaDocumento {
    public static void main(String[] args) {
        Documento doc = new Documento();
        doc.registrar(1001, "Av. Lima 123");
        System.out.println("ID: " + doc.getId());
        System.out.println("Dirección: " + doc.getDireccion());
    }
}