package pt.ulusofona.deisi.lp2.contaBancaria;

public class ContaBancaria {
    int saldo;



    public void depositar(int valor) {
        this.saldo += valor;
    }

    public boolean levantar(int valor) {
        if(this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;

    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getSaldoComoString() {
        return String.valueOf(this.saldo);
    }
}

