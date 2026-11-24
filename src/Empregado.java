public class Empregado extends Pessoa{

    private String codigoSetor;
    private  double salarioBase;
    private double imposto;

    public Empregado(String nome, String endereco, String telefone,String codigoSetor,double salarioBase,double imposto) {
        super(nome, endereco, telefone);

        this.codigoSetor=codigoSetor;
        this.salarioBase=salarioBase;
        this.imposto=imposto;

    }

    public String getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(String codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }


    public double CalculoSalrio(){
        return salarioBase-imposto;
    }
}
