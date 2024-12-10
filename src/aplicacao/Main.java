package aplicacao;

import aplicacao.conta.ContaBancaria;


public class Main {
    public static void main(String[] args) {

        ContaBancaria cb =
                new ContaBancaria("Santander",
                        "Joao");

        System.out.println("Dados do Titular\n");
        System.out.println("Banco: " + cb.getNomeBanco());
        System.out.println("Nome Titular: " + cb.getNomeTitular());
        System.out.println("Saldo da conta:" + cb.getSaldo());

        System.out.println("===============");

        System.out.println("Depositando saldo e saldo atualizado");
        cb.depositar(100);

        System.out.println("================");

        System.out.println("Sacando saldo e saldo atualizado:");
        cb.sacar(100);

        //Validação de erros
        cb.sacar(-10);




    }
}
