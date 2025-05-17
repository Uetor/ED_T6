
package tarea;

/**
 *
 * @author pgonz
 */
class Tarea6EDClase {
    private static final int MINIMA_CANTDAD = 3;
    private static final int DESCUENTO_CANTIDAD = 5;
    private static final double DESCUENTO_NORMAL = 0.8;
    private static final double DESCUENTO_MINIMO = 0.95;
            
    public void aplicarDescuento(double precioProducto, int numProductos){    
        double totalPagar;
        if(numProductos > MINIMA_CANTDAD)
            precioProducto-=DESCUENTO_CANTIDAD;
        if (numProductos != 0){
            totalPagar = precioProducto * DESCUENTO_NORMAL ;
        }else {
            totalPagar = precioProducto * DESCUENTO_MINIMO;   
        }
        
        imprimirTotal(totalPagar);
    }
    
    private void imprimirTotal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
}

    