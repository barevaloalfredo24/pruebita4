
package prueba27092024;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.Vector;
/**
 *
 * @author DELL
 */
public class EstructuraList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
   {
ArrayList <Boolean> hola = new ArrayList<>();
ArrayList <Boolean> hola1 = new ArrayList<>();
ArrayList <Integer> hola3 = new ArrayList<>();


List<String> list2 = new LinkedList<>();


Stack<Integer> list3 = new Stack<>();
Vector<Integer> list4 = new Vector<>();

hola.add(Boolean.TRUE);
hola.add(Boolean.TRUE);
hola.add(Boolean.TRUE);
hola.add(Boolean.FALSE);
hola.add(Boolean.FALSE);
hola.add(Boolean.TRUE);


        System.out.println("list despues del .add " + hola);
        
        hola.remove(1); //ELIMINACION POR INDICE
        hola.remove(Boolean.TRUE ); //ELIMINACION POR ELEMEnTO
        System.out.println("list depues del .remove " + hola);
        
        
        //REEMPLAZANDO EN LA LiSTA
        hola.set(0, Boolean.FALSE); 
        hola.set(2, Boolean.TRUE);
        System.out.println("lista despues de reemplazar: " + hola);
        
         //BUSQUEDA EN LA LISTA

         hola.ensureCapacity(0);
         System.out.println(hola);
       
        //ORDENANDO LA LISTA  (primero muestra todos los valores "false" luego los "true".
        hola.sort((o1,o2)-> o1.compareTo(o2));
        System.out.println("lista ordenada: " + hola);
        
        //ORDENANDO LA LISTA DE OTRA MANERA (usando este método primero muestro los valores "true" luego los "false"
       Collections.sort(hola,  Collections.reverseOrder());
       for(Boolean valor : hola){
           System.out.print("la valores son: " + hola);
       }
         

        
        
        //ITERANDO LA LISTA
        
        Iterator<Boolean> iterator = hola.iterator();
        
  while(iterator.hasNext()){
      
      boolean valorbooleano = iterator.next();
      System.out.print(valorbooleano);
      System.out.print(", ");

  }

int indice = hola.indexOf(Boolean.FALSE);

        System.out.println("el indice de la palabra FALSE dentro de la coleccion es: " + indice);
        
       
        System.out.println("el valro contentido en el indice 1 es: "+hola.get(1)); 

        
        
        
hola3.add(1);
hola3.add(12);
hola3.add(12);
hola3.add(16);
hola3.add(20);
hola3.add(25);
hola3.add(26);
hola3.add(111);

// ITERANDO LA LISTA
Iterator<Integer> itertor3 = hola3.iterator();

while(itertor3.hasNext()){
    int elementosListaHola3 = itertor3.next();
    System.out.print(elementosListaHola3);
    System.out.print(", ");
    
    
  
}
  //CLONACION DE ARRAYLIST (una manera)
    ArrayList <Integer> hola4 = new ArrayList<>();
  hola4 = (ArrayList<Integer>) hola3.clone();
    hola4.add(5);
    System.out.print("\n clonacion" + hola4);
    
      //CLONACION DE ARRAYLIST (otra manera) clone una lista clonada, es decir es una copia de la copia
    ArrayList <Integer> hola5 = (ArrayList<Integer>) (hola4.clone());
  
    hola5.add(7);
    System.out.print("\n clonacion, segunda manera: " + hola5);

//devolviendo el ultimo indice de la aparicion del elemento dentro de la lista
System.out.println("ultimo indice de la lista:  " + hola3.lastIndexOf(12) ); //dado que la interfaz LIST acepta elemento repetidos, la ultima aparicion del elemento 12 dentro de la lista  fue en el indice 2.
        
 //PERSONALIZANDO LA CANTIDAD DE ELEMENTOS QUE PODRÁ TENER LA LISTA
     hola3.ensureCapacity(50); //asegura que la lista hola3 solo podrá almacenas 50 elementos como máximo.
        
     
       //Si necesitas convertir un ArrayList a un LinkedList, puedes crear un nuevo LinkedList y pasar el ArrayList al constructor del LinkedList
       //no se pueden clonar objetos de diferente clase como es en este caso, pero si se pueden clonar cuando son de  la misma clase como por ejemplo de la clase ArrayList
       List<Integer> list1 = new LinkedList<>(hola3);
        
        System.out.println("\n elementos de la ArrayList  hola3: " + hola3);
        System.out.println("\n elementos de LinkedList list1 a la cual se le atribuyó la clonacion  de ArrayList hola3: " + list1);
        
        
        
        
        // BUSCAR ELEMENTOS DENTRO DEL LINKEDLIST
        if( list1.contains(111)){
            
           int valorindice =  list1.indexOf(25);
            System.out.println("elemento encontrado en la posición: " + valorindice);
            
        }
        else {
            
            System.out.println("valor no encontrado");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        }
    
}
