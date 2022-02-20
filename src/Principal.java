import java.util.Scanner;



public class Principal {
    
    
    public static void main(String[] args) {
  
        listaSimple L1= new listaSimple ();
        
        Scanner teclado = new Scanner (System.in);
        
        
        int opcion=0;
        
        
        do {
          
            System.out.println("\n\n LISTAS SIMPLES");
            
            System.out.println(" 1. Ingresar");
            
            System.out.println(" 2. Buscar");
            
            System.out.println(" 3. Modificar");
            
            System.out.println(" 4. Eliminar");
            
            System.out.println(" 5. Enlistar");
            
            System.out.println(" Escoja su opcion: ");
            
            opcion = teclado.nextInt();
            
            switch (opcion){
            
                case 1:
                    
                    System.out.println("\n INGRESAR NODO");
                    
                    System.out.println(" Ingresa el dato del nodo: ");
                    
                    int dato = teclado.nextInt();
                    
                    L1.insertarDato(dato);
                
                    break;
            
                
                case 2:
                     
                     System.out.println("\n BUSCAR NODO");
                    
                     System.out.println(" Ingresa el dato del nodo a buscar: ");
                     
                     dato = teclado.nextInt();
                     
                     L1.buscarNodo(dato);
                              
                      break;
                
                
                case 3:
                    
                     System.out.println("\n MODIFICAR NODO");
                     
                     System.out.println(" Ingresa el dato del nodo a modificar: ");
                     
                     dato = teclado.nextInt();
                     
                     L1.modificarNodo(dato);
                    
                              
                      break;
                
                
                case 4:
                       
                      System.out.println("\n ELIMINAR NODO");
                      
                      System.out.println(" Ingresa el dato del nodo a eliminar: ");
                      
                      dato = teclado.nextInt();
                      
                      L1.eliminarNodo(dato);
                              
                      break;
                
                
                case 5:
                      
                      System.out.println("\n LISTADO DE NODO");
                      
                      L1.verLista();
                              
                      break;
                
                      default:   
                
                
          
                
                
                
            }
            
        
        } while (opcion <6);
        

    }
    
}
