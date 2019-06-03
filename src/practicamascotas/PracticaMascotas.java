package practicamascotas;

import java.awt.Color;

public class PracticaMascotas {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Poncho", Color.BLACK, Sexo.MACHO);
        Gato gato1 = new Gato("Felipe", Color.LIGHT_GRAY, Sexo.MACHO);
        Perro perro2 = new Perro("Lila", Color.DARK_GRAY, Sexo.HEMBRA);
        Gato gato2 = new Gato("Kait", Color.WHITE, Sexo.HEMBRA);

        System.out.println (Mascota.getContadorMascota());

       
    perro1.pedirComida();
    gato1.pedirComida();
    
        System.out.println(perro1);
        System.out.println(perro2);
        System.out.println(gato1);
        System.out.println(gato2);
    }

    

   
}
