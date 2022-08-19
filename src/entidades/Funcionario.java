package entidades;

public class Funcionario {
    private String nome;
    private Integer horas;
    private Double valorHora;

    public Funcionario() {
    }

    public Funcionario(String nome, int horas, Double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Double pagamento(){
        double pagamento = valorHora * horas;
        return pagamento;
    }
}
