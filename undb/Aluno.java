package undb;

public class Aluno extends Pessoa {

    public String numero_matricula;

    public Aluno(){

    }

    public Aluno(String nome, String data_nascimento, String cpf, String rg, char genero, String numero_matricula) {
        super(nome, data_nascimento, cpf, rg, genero);
        this.numero_matricula = numero_matricula;
    }

    public void addNumero_matricula(String numero_matricula){
        this.numero_matricula = numero_matricula;
    } 

    public String toString() {
        return numero_matricula;

    }

}
