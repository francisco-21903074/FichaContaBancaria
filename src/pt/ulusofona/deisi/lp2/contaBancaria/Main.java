package pt.ulusofona.deisi.lp2.contaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(1000);


        System.out.println("Saldo inicial: " + conta.getSaldo());


        conta.depositar(500);
        System.out.println("Após depósito de 500: " + conta.getSaldo());


        boolean levantamento1 = conta.levantar(300);
        System.out.println("Levantamento de 300: " + (levantamento1 ? "Sucesso" : "Falhou"));
        System.out.println("Saldo após levantamento: " + conta.getSaldo());


        boolean levantamento2 = conta.levantar(1500);
        System.out.println("Levantamento de 1500: " + (levantamento2 ? "Sucesso" : "Falhou"));
        System.out.println("Saldo após tentativa de levantamento: " + conta.getSaldo());


        System.out.println("Saldo como String: " + conta.getSaldoComoString());
    }
}
