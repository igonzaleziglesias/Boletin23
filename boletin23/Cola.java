package boletin23;

import java.util.ArrayList;
import utilidades.pedirDatos;

public class Cola {

    private int tamaño;

    private Persona crearPersona() {
        return new Persona((int) (Math.random() * 56) + 5);
    }

    private void añadirPersona(ArrayList<Persona> cola) {
        cola.add(crearPersona());
    }

    public Cola(ArrayList<Persona> cola) throws ForaDeRangoException {

        this.tamaño = pedirDatos.enteiro("Tamaño de la cola(0-50 personas):");

        if ((tamaño < 0) || (tamaño > 50)) {
            throw new ForaDeRangoException("Cola fora dos parametros.");
        }

        for (int i = 0; i < tamaño; i++) {
            añadirPersona(cola);
        }
    }

    public float recaudacion(ArrayList<Persona> cola) {
        float cont=0;
        for (Persona ele:cola){
            cont=cont+ele.getPrecio();
        }
        return cont;
    }

    public void amosarCola(ArrayList<Persona> cola) {

        for (Persona ele : cola) {
            System.out.println(ele);
        }
    }
}
