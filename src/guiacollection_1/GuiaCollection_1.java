/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiacollection_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author alvaro
 */
public class GuiaCollection_1 {

    /**
     * @param args the command line arguments Continuando el ejercicio anterior,
     * después de mostrar los perros, al usuario se le pedirá un perro y se
     * recorrerá la lista con un Iterator, se buscará el perro en la lista. Si
     * el perro está en la lista, se eliminará el perro que ingresó el usuario y
     * se mostrará la lista ordenada. Si el perro no se encuentra en la lista,
     * se le informará al usuario y se mostrará la lista ordenada.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> rasas = new ArrayList();
        Iterator<String> it = rasas.iterator();
        System.out.println("Ingrese nombres de razas");
        while (true) {
            String raza = leer.next();
            if (raza.equalsIgnoreCase("Si") || raza.equalsIgnoreCase("s")) {
                break;
            } else if (raza.equalsIgnoreCase("No") || raza.equalsIgnoreCase("n")) {
                continue;
            } else {
                rasas.add(raza);
            }
            System.out.println("¿Desea salir?");

        }
        System.out.println(rasas);
        Collections.sort(rasas);
        System.out.println("Indique que perro desea eliminar de la lista");
        String perro = leer.next();
        while (it.hasNext()) {
            String actual = it.next();
            if (actual.equals(perro)) {
                it.remove();
            }
        }
        System.out.println(rasas);
    }

}
