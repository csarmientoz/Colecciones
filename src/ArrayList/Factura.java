
package ArrayList;

import java.util.ArrayList;


public class Factura {
    private ArrayList<Producto> productos;
    
    
    public Factura(){
    
    this.productos = new ArrayList<>();
    }
      public void adicionarProducto(Producto producto){  
           this.productos.add(producto);  
                   
                   }
      
      public ArrayList<Producto> listarProducto(){
      return this.productos;
      
      }
      
      public double calcularTotal(){
      double total = 0;
      for(Producto producto: productos){
             total+=producto.getPrecio();
      
             }
        return total;
      }
              
}
