package practicamascotas;

import java.awt.Color;

public class Perro extends Mascota {

    public Perro(String nombre, Color color, Sexo sexo) {
        super(nombre, color, sexo);
    }

    @Override
    public void pedirComida() {
        System.out.println("Guao comida");
    }

}
