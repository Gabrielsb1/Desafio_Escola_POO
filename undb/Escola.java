package undb;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        int op = 0;

        do{
            System.out.println();
            System.out.println("=-=-=PAINEL DE CONTROLE=-=-=\n");
            System.out.println("1 -> Cadastrar Aluno");
            System.out.println("2 -> Cadastrar Professor");
            System.out.println("3 -> Cadastrar Pessoal terceirizado");
            System.out.println("4 -> Cadastrar Pessoal da administração");
            System.out.println("5 -> Sair \n");
            System.out.print("Digite uma opção: ");
            op = leitor.nextInt();

            switch(op){
                case 1:
                    System.out.println("Sistema de Cadastro de Alunos\n");

                    Aluno aluno = new Aluno();
                    System.out.print("Nome: ");
                    String nome = leitor.next();

                    System.out.print("Data de nascimento: ");
                    String data_de_nascimento = leitor.next();

                    System.out.print("CPF: ");
                    String cpf = leitor.next();
                    aluno.addCpf(cpf);

                    System.out.print("RG: ");
                    String rg = leitor.next();
                    aluno.addRg(rg);

                    System.out.print("Genero(M/F): ");
                    char genero = leitor.next().charAt(0);

                    System.out.print("Matricula: ");
                    String numero_matricula = leitor.next();
                    aluno.addNumero_matricula(numero_matricula);

                    break;

                case 2:
                    System.out.println();
                    System.out.println("Sistema de Cadastro de Professores");

                    Professor professor = new Professor();

                    System.out.print("Nome: ");
                    nome = leitor.next();

                    System.out.print("Data de nascimento: ");
                    data_de_nascimento = leitor.next();

                    System.out.print("CPF: ");
                    cpf = leitor.next();
                    professor.addCpf(cpf);

                    System.out.print("RG: ");
                    rg = leitor.next();
                    professor.addRg(rg);

                    System.out.print("Código funcioário: ");
                    int cod_funcionario = leitor.nextInt();

                    System.out.print("Genero(M/F): ");
                    genero = leitor.next().charAt(0);

                    break;
                
                case 3:
                    System.out.println();
                    System.out.println("Sistema de Cadastro de Pessoal Terceirizado");

                    Terceirizada pessoal_terceirizado = new Terceirizada();

                    System.out.print("Nome: ");
                    nome = leitor.next();

                    System.out.print("Data de nascimento: ");
                    data_de_nascimento = leitor.next();

                    System.out.print("CPF: ");
                    cpf = leitor.next();
                    pessoal_terceirizado.addCpf(cpf);

                    System.out.print("RG: ");
                    rg = leitor.next();
                    pessoal_terceirizado.addRg(rg);

                    System.out.print("Código funcioário: ");
                    cod_funcionario = leitor.nextInt();

                    System.out.print("Genero(M/F): ");
                    genero = leitor.next().charAt(0);

                    break;
                
                case 4:
                    System.out.println();
                    System.out.println("Sistema de Cadastro da Administração");

                    Administração pessoal_da_administração = new Administração();

                    System.out.print("Nome: ");
                    nome = leitor.next();

                    System.out.print("Data de nascimento: ");
                    data_de_nascimento = leitor.next();

                    System.out.print("CPF: ");
                    cpf = leitor.next();
                    pessoal_da_administração.addCpf(cpf);

                    System.out.print("RG: ");
                    rg = leitor.next();
                    pessoal_da_administração.addRg(rg);

                    System.out.print("Código funcioário: ");
                    cod_funcionario = leitor.nextInt();

                    System.out.print("Genero(M/F): ");
                    genero = leitor.next().charAt(0);

                    break;

                case 5:
                    System.out.println();
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }while(op != 5);
        
        leitor.close();
    }
}
