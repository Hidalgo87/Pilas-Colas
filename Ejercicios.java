public class Ejercicios {

    public static void main(String[] args) {
        //System.out.println("El programa Inicia");
        Pila p = new Pila();
        System.out.println("Como deberia estar la pila aca?");
        System.out.println(p.estaVacia); //Vacia (true)
        p.apilar("Primer Objeto");
        System.out.println("Como deberia estar la pila aca?");
        System.out.println(p.estaVacia); //Llena (false)
        p.desapilar();
        System.out.println("Como deberia estar la pila aca?");
        System.out.println(p.estaVacia); //Vacia (true)
        //p.apilar("Esta es la prueba mortal");
        p.desapilar();
        //System.out.println("El programa Finaliza");
    }

}
