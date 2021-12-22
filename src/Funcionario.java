public class Funcionario {
    private String nome;
    private String departamento;
    private Double salario;
    private String data_de_entrada;
    private String rg;

    public Funcionario() {
    }

    public Funcionario(String nome, String departamento, Double salario, String data_de_entrada, String rg) {
        setNome(nome);
        setSalario(salario);
        setData_de_entrada(data_de_entrada);
        setDepartamento(departamento);
        setRg(rg);
    }

    @Override
    public String toString() {
        return "Funcionario" +
                "nome='" + nome +
                ", departamento='" + departamento +
                ", salario=" + salario +
                ", data_de_entrada='" + data_de_entrada +
                ", rg='" + rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getData_de_entrada() {
        return data_de_entrada;
    }

    public void setData_de_entrada(String data_de_entrada) {
        this.data_de_entrada = data_de_entrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }


    public void recebeAumento(double parametro) {
        double aumento = getSalario() * parametro;
        setSalario(getSalario()+aumento);
    }

    public Double calculaGanhoAnual() {
        return getSalario() * 12;
    }
}

