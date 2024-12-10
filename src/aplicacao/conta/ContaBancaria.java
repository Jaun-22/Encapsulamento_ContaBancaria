package aplicacao.conta;

public class ContaBancaria {

    //ATRIBUTOS
    private String nomeBanco;
    private String nomeTitular;
    private double saldo;

    //METODO CONSTRUTOR SEM ARGUMENTO
    public ContaBancaria() {

    }

    //METODO CONSTRUTOR COM ARGUMENTO
    public ContaBancaria(String nomeBanco, String nomeTitular) {
        this.nomeBanco = nomeBanco;
        this.nomeTitular = nomeTitular;
        this.saldo = 10000.0;

    }
    // === Getter e Setters do atributo nomeBanco === //

    //Getter
    public String getNomeBanco() {
        return this.nomeBanco;
    }

    //Setter
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    // === Getter e Setters do atributo nomeTitular === //

    //Getter
    public String getNomeTitular() {
        return this.nomeTitular;
    }

    //Setter
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    // === Getter do atributo saldo === //

    //Setter
    public double getSaldo() {
        return saldo;
    }

    // === Novos Métodos === //

    //Depositar
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor; //Saldo + Valor depositado
            System.out.println("Deposito de " + valor + " Realizado com sucesso");
            System.out.println("Seu saldo atual é de " + this.saldo);

        } else {
            System.out.println("Valor Invalido");
        }

    }

    //Sacar
    public void sacar(double valor) {
        if (valor > 0) {
            this.saldo -= valor; //Saldo - valor sacado
            System.out.println("Saque de " + valor + " Realizado com suceso");
            System.out.println("Seu saldo atual é de " + this.saldo);
        }
        else {
            System.out.println("Saque invalido");
        }
    }
}
