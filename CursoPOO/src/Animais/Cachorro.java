package Animais;

public class Cachorro extends Animal{
    //Attributes
    static int numeroCachorro;

    //Constructors
    public Cachorro(String nome, String cor, int altura, double peso, int idade) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;

        numeroCachorro ++;
    }

    //Methods
    public static int getNumeroCachorro() {
        return numeroCachorro;
    }

    public static void setNumeroCachorro(int numeroCachorro) {
        Cachorro.numeroCachorro = numeroCachorro;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String interagir(String acao) {

        switch (acao) {
            case "CARINHO": this.estado = "Feliz"; break;
            case "PISAR NA PATA": this.estado = "Triste"; break;
            case "GRITAR": this.estado = "Bravo"; break;
            default: this.estado = "Neutro"; break;
        }
        return this.estado;
    }

    @Override
    public void soar() {
        System.out.println("Au Au");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
