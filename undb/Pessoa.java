package undb;

public class Pessoa {

    public String nome;
    public String data_nascimento;
    private String cpf;
    private String rg;
    public int cod_funcionario;
    public char genero;

    public Pessoa() {

    }

    public Pessoa(String nome, String data_nascimento, String cpf, String rg, int codigo_funcionario, char genero) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.cod_funcionario = codigo_funcionario;
        this.genero = genero;
    }

    public Pessoa(String nome, String data_nascimento, String cpf, String rg, char genero) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void addCpf(String cpf) {
        this.cpf = cpf;
    } 

    public void addRg(String rg) {
        this.rg = rg;
    } 

    public String toString() {
        return nome
            + ", data de nascimento:"
            + data_nascimento
            + ", CPF:"
            + cpf
            + ", RG:"
            +rg
            + ",código funcionario:"
            + cod_funcionario
            + ", genero:"
            + genero;
    }

}