package Animais;

public class Passaro extends Animal{
    static int numeroPassaro;

    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }
}
