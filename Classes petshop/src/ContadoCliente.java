public class ContadoCliente {

    private  String raca;
    private String nome;
    private int idade;
    private String dono;
    private int peso;

    public ContadoCliente(String raca, String nome, int idade, String dono, int peso) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
        this.peso = peso;
    }

    public void registrarcliente() {
        System.out.println("A raça do animal é: " + raca );
        System.out.println("O nome do animal é: " + nome );
        System.out.println("A idade do animal é: " + idade );
        System.out.println("O nome do dono é: " + dono );
        System.out.println("O peso do animal é: " + peso );
    }
}
