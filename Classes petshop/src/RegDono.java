public class RegDono {

    private String nome;
    private int cpf;
    private int telefone;
    private String email;

    public RegDono(String nome, int cpf, int telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public void socializar(){
        System.out.println("O nome do Dono é: " + nome + "O cpf do Dono é: " + cpf + "O telefone do dono é: " + telefone + "O email do dono é " + email);
    }

}
