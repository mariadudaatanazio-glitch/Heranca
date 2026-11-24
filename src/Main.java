import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("josé", "Rua Oliveiro Marciano", "31987652434");
        Fornecedor fornecedor = new Fornecedor("josé", "rua dos milagres", "319988278281", 1200, 200);


        System.out.println(" ____Fornecedor____");

        System.out.println(" Nome do fornecedor:" + fornecedor.getNome() +
                "\n Valor da divida:" + fornecedor.getValorDivida() +
                "\n Valor de crédito:" + fornecedor.getValorCredito() +
                "\n Valor em conta:" + fornecedor.ValorEmConta());


        Empregado empregado = new Empregado("Ana ", "Rua N", "(31)87653245", "123456", 1200, 0.9);

        System.out.println(" _____Empregado____");

        System.out.println("Nome do Empregado:" + empregado.getNome() +
                "\nCodigo do setor:" + empregado.getCodigoSetor() +
                "\nSalario final:" + empregado.CalculoSalrio());


        Administrador administrador = new Administrador("Sofia", "Rua a", "(31)0987654", "987654", 1200, 0.9, 2000);


        System.out.println(" _____Administrador____");

        System.out.println("Nome do Administrador :" + administrador.getNome() +
                "\nCodigo do setor:" + administrador.getCodigoSetor() +
                "\nSalario final:" + administrador.CalculoAjudaCusto());


        Operario operario = new Operario("Clara", "Rua F", "(31)123456", "123456", 1200, 0.9, 20000, 0.5);

        System.out.println(" _____Operário____");

        System.out.println("Nome do operario:" + operario.getNome() +
                "\nCodigo do setor:" + operario.getCodigoSetor() +
                "\nSalario final:" + operario.Calculocomissao());

        Vendedor vendedor = new Vendedor("Clara", "Rua G", "(31)09876543", "234567", 1200, 0.9, 30000, 0.8);

        System.out.println(" _____Vendedor____");
        System.out.println("Nome do Vendedor:" + vendedor.getNome() +
                "\nCodigo do setor:" + vendedor.getCodigoSetor() +
                "\nSalario final:" + vendedor.SalarioVfinal());

    }
}

