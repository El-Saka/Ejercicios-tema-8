package clase1;

public class Clase1 {
    private String Nombre;
    private int Edad;
    private int Telefono;

    //Metodo Setter: establecemos Nombre, Edad, y Telefono
    public void setNombre(String nombre){
        this.Nombre= nombre;
    }

    public void setEdad(int edad){
        this.Edad= edad;
    }

    public void setTelefono(int telefono){
        this.Telefono= telefono;
    }

    //Metodo Getter: mostramos Nombre, Edad, y Telefono
    public String getNombre(){
        return Nombre;
    }
    public int getEdad(){
        return Edad;
    }

    public int getTelefono(){
        return Telefono;
    }
}
