public class ejercicioCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);
    }
}
class Coche{
    public int puertas = 2;
    public void SumarPuertas(){
        this.puertas++;
    }

}
/*
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
 */