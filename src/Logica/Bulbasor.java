package Logica;

public class Bulbasor extends Pokemon implements IAgua{

    public Bulbasor() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasor y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasor y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasor y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Bulbasor y este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Bulbasor y este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Bulbasor y este es mi ataque pistola de agua");
    }
}
