package entidades;

public class FuncionarioTerceiro extends Funcionario{
    //despesa adicional corresponde a 110.0%
    private Double despesaAdicional;

    public FuncionarioTerceiro() {
        super();
    }

    public FuncionarioTerceiro(String nome, int horas, Double valorHora, Double despesaAdicional) {
        super(nome, horas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public Double pagamento(){
        double pagamento = super.pagamento();
        double total = pagamento + ((despesaAdicional / 100) * 110);

        return total;
    }
}
