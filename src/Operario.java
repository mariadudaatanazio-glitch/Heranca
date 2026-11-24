public class Operario extends Empregado {

    private double valorProdrucao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, String codigoSetor, double salarioBase, double imposto, double valorProdrucao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProdrucao = valorProdrucao;
        this.comissao = comissao;
    }

    public double getValorProdrucao() {
        return valorProdrucao;
    }

    public void setValorProdrucao(double valorProdrucao) {
        this.valorProdrucao = valorProdrucao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double Calculocomissao() {
        return valorProdrucao * comissao;
    }

    public double SalarioFinal() {
        return CalculoSalrio() + Calculocomissao();
    }
}
