public class Pila {

    private Object[] datos;

    //tope
    private Object cima;

    private boolean estaVacia = true;

    //push
    public void apilar(Object objeto){
       if(estaVacia){
           datos = new Object[1];
           datos[0] = objeto;
       }
    }

    //pop
    public void desapilar(){

    }

}
