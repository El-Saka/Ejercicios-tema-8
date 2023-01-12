import clase1.Clase1;

public class Main {
    public static void main(String[] args) {
        Clase1 objeto1= new Clase1();

        objeto1.setNombre("David");
        System.out.println("El Nombre Es: " +objeto1.getNombre());

        objeto1.setEdad(36);
        System.out.println("La Edad Es: " +objeto1.getEdad());

        objeto1.setTelefono(852144735);
        System.out.println("El Numero de Telefono Es: " +objeto1.getTelefono());
    }
}