package practicamascotas;

import java.awt.Color;

public abstract class Mascota {

    private String nombre;
    private Color color;
    private Sexo sexo;
    private static int contadorMascota = 0;

    public abstract void pedirComida();

    @Override
    public String toString() {
        return "Mascota{" + "nombre= " + nombre + ", color= " + color + ", sexo=" + sexo +  '}';
    }

    public Mascota(String nombre, Color color, Sexo sexo) {
        this.nombre = nombre;
        this.color = color;
        this.sexo = sexo;
        contadorMascota++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static int getContadorMascota() {
        return contadorMascota;
    }

    public static void setContadorMascota(int contadorMascota) {
        Mascota.contadorMascota = contadorMascota;
    }

}
