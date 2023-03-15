public class Pila {

    private Object[] datos;

    //tope
    private Object cima;

    public boolean estaVacia = true;

    //push
    public void apilar(Object objeto){
       if(estaVacia){
           //System.out.println("Pila Vacia");
           datos = new Object[1];
           datos[0] = objeto;
           estaVacia = false;
           //System.out.println("Quedo con: " + datos.length + " Elementos");
       } else {
           Object[] temporal = datos.clone();
           int cantidad = datos.length;
           //System.out.println(cantidad);
           datos = new Object[cantidad+1];
           for (int i=0; i < cantidad; i++){
               datos[i] = temporal[i];
           }
           datos[cantidad] = objeto;
           //System.out.println("Quedo con: " + datos.length + " Elementos");
       }
    }

    //pop
    public Object desapilar(){
        if(!estaVacia){
            Object[] temporal = datos.clone();
            datos = new Object[temporal.length - 1];
            for (int i=0; i < datos.length; i++){
                datos[i] = temporal[i];
            }
            //System.out.println("Estado de la Pila: ");
            //System.out.println("Esta Vacia? " + estaVacia);
            if(temporal.length == 1) {
                estaVacia = true;
            }
            return temporal[temporal.length-1];
        }
        System.out.println("No se puede desapilar de una pila vacia");
        return null;
    }
}
