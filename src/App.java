public class App {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
