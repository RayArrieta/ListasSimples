import java.util.Scanner;


public class listaSimple {
    
    Scanner teclado = new Scanner (System.in);
    
    nodo primero;
    
    nodo ultimo;
    
    public listaSimple (){
    
        
        primero = null;
        
        ultimo = null; 
        
        
    }
    
    
    public void insertarDato(int dato){
        
         nodo nodoNuevo = new nodo ();
    
        nodoNuevo.dato =  dato;
        
        if (primero == null){
        
            primero = nodoNuevo;
            
            primero.siguiente = null;
            
            ultimo = primero;
            
        }
        
        else {
        
             ultimo.siguiente = nodoNuevo;
             
             nodoNuevo.siguiente = null;
             
             ultimo = nodoNuevo;
        
             
             
             }
        
        
    }
    
  
    
    public  void buscarNodo ( int dato ){
    
    nodo actual = new nodo();
    
    actual = primero;
    
    while (actual!=null){
        
    
    
    if (actual.dato==dato){
        
      System.out.println(" Nodo encontrado: Si existe en la lista");  
            }
       
    
    actual = actual.siguiente;
    
    
        }
    
    
    }
    
    
    
    public void modificarNodo (int dato){
    
        nodo actual = new nodo();
    
        actual = primero;
    
         while (actual!=null) {
             
             if (actual.dato==dato){
                 
               System.out.println(" Ingrese el nuevo dato para este nodo: ");
               
               actual.dato = teclado.nextInt();
               
             }
         
             actual = actual.siguiente;
         
         }
             
             
    }
    
    
    
    
    public void eliminarNodo (int dato){
        
        nodo actual = new nodo();
    
        actual = primero;
        
        nodo anterior = new nodo ();
        
        anterior = null;
        
        boolean encontrado = false;
        
        System.out.println(" Ingrese el dato del nodo a eliminar");
        
        int nodoBuscado = teclado.nextInt();
 
        
        
        
    
    }
    
    
    
    public void verLista (){
    
    nodo actual = new nodo();
    
    actual = primero;
    
    while (actual!=null){
        
    System.out.println(actual.dato);
    
    actual = actual.siguiente;
    
    }
        
    }
    
    
    
    
}
