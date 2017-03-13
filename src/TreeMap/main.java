
package TreeMap;


import java.util.TreeMap;


public class main {

  
    public static void main(String[] args) {
       Factura factura = new Factura();
       Producto p1 = new Producto();
       p1.setNombre("gaseosa");
       p1.setPrecio(1500);
       
       Producto p2 = new Producto();
       p2.setNombre("papas");
       p2.setPrecio(1000);
       
       
       factura.adicionarProducto(p1);
       factura.adicionarProducto(p2);
       
       TreeMap< String,Producto> lista = factura.listarProducto();
       for(String clave: lista.keySet()){
              Producto p = lista.get(clave);
              System.out.println(p.getNombre() + " " + p.getPrecio());
       
           }
       
       
//       for(Producto p: lista.values()){
//       
//           System.out.println(p.getNombre() + " " + p.getPrecio());
//          }
    }
    
}
