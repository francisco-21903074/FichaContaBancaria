package pt.ulusofona.deisi.lp2.contaBancaria;

public class ContaBancaria {
    int saldo;


    public ContaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
    }



    public void deposita(int valor) {
        this.saldo += valor;
    }

    public boolean levanta(int valor) {
        if(this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;

    }

    public int getSaldo() {
        return saldo;
    }


    public String getSaldoComoString() {
        return String.valueOf(this.saldo);
    }
}

