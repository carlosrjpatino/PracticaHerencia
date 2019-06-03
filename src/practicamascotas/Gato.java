package practicamascotas;

import java.awt.Color;

public class Gato extends Mascota {

    public Gato(String nombre, Color color, Sexo sexo) {
        super(nombre, color, sexo);
    }

    @Override
    public void pedirComida() {
        System.out.println("Gato Miu comida");
    }

}
