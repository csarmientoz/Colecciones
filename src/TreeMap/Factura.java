
package TreeMap;


import HashMap.*;
import java.util.HashMap;
import java.util.TreeMap;


public class Factura {
    private TreeMap< String, Producto> productos;
    public Factura(){
    this.productos = new TreeMap<>();
    
    }
    
    public void adicionarProducto(Producto producto){  
           this.productos.put(producto.getNombre(),producto);  
                   
                   }
      
      public TreeMap<String, Producto> listarProducto(){
      return this.productos;
      
      }
      
      public double calcularTotal(){
      double total = 0;
      for(Producto producto: productos.values()){
             total+=producto.getPrecio();
      
             }
        return total;
    }
    
    
    
    
   
    }
      
      
              

