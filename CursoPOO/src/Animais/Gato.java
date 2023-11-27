package Animais;

public class Gato extends Animal{
    static int numeroGatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void soar() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
