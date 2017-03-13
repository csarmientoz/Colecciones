
package HashMap;


import java.util.HashMap;


public class Factura {
    private HashMap< String, Producto> productos;
    public Factura(){
    this.productos = new HashMap<>();
    
    }
    
    public void adicionarProducto(Producto producto){  
           this.productos.put(producto.getNombre(),producto);  
                   
                   }
      
      public HashMap<String, Producto> listarProducto(){
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
      
      
              

