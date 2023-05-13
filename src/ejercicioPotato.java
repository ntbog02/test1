public class ejercicioPotato {
    public static void main(String[] args) {
        //objeto
        Potato miPotato = new Potato();
        miPotato.SumarBrazos();
        miPotato.SumarBrazos();
        miPotato.SumarBrazos();
        System.out.println(miPotato.brazos);
    }
}

class Potato{
    public int brazos = 0;
    public void SumarBrazos(){
        this.brazos++;
    }
}
