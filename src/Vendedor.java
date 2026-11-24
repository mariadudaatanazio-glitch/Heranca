public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissaoVendas;

    public Vendedor(String nome, String endereco, String telefone, String codigoSetor, double salarioBase, double imposto, double valorVendas, double comissaoVendas) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);

        this.valorVendas = valorVendas;
        this.comissaoVendas = comissaoVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissaoVendas() {
        return comissaoVendas;
    }

    public void setComissaoVendas(double comissaoVendas) {
        this.comissaoVendas = comissaoVendas;
    }

    public double CalculoComissao() {
        return valorVendas * comissaoVendas;
    }

    public double SalarioVfinal() {
        return CalculoSalrio() + CalculoComissao();
    }
}
