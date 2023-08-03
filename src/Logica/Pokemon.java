package Logica;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexoPokemon;
    protected int temporada;

    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();


}