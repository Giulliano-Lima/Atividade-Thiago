public class Estabelecimento {

    private int numero;
    private String endereco;

    public Estabelecimento(String endereco, int numero) {
        this.numero = numero;
        this.endereco = endereco;
    }
    public void socializar() {
        System.out.println("O numero do estabelecimento é "  + numero + "e o endereço é " + endereco);
    }
}
