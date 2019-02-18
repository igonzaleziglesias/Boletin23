package boletin23;

import java.util.ArrayList;

public class Boletin23 {

    public static void main(String[] args) {
//        for (int i=0 ; i<=50;i++){
//        int n=(int) (Math.random() * 56) + 5;;
//        System.out.println(n);
//        }
        ArrayList<Persona> cola = new ArrayList<Persona>();
        try {
            Cola obx = new Cola(cola);
            //obx.amosarCola(cola);
            System.out.println("\nRecaudacion: "+obx.recaudacion(cola)+" Euros");
        } catch (ForaDeRangoException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

}
