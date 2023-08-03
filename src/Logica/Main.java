package Logica;

public class Main {
    public static void main(String[] args) {

        Squirtle squirtle =new Squirtle();
        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasor bulbasor = new Bulbasor();

        squirtle.atacarAraniazo();
        squirtle.atacarParalizar();
        charmander.atacarMordisco();
        charmander.atacarLanzaLlamas();
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
        bulbasor.atacarPlacaje();
        bulbasor.atacarHidrobomba();
    }
}