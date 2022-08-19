package app;

import entidades.Funcionario;
import entidades.FuncionarioTerceiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Entre com o número de funcionários: ");
        int n = sc.nextInt();

        for (int i =0; i < n; i++){
            System.out.println("Funcionário nº " + (i+1) + ": ");

            System.out.println("O funcionário é terceiro? s/n");
            char ch = sc.next().charAt(0);

            System.out.println("Nome: ");
            String nome = sc.next();

            System.out.println("Horas: ");
            int horas = sc.nextInt();

            System.out.println("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if (ch == 's'){
                System.out.println("Despesa adicional: ");
                double despesaAdicional = sc.nextDouble();

                Funcionario func = new FuncionarioTerceiro(nome, horas, valorPorHora, despesaAdicional);
                //Adicionar pagamento tmb:
                funcionarios.add(func);
            }else if(ch == 'n'){
                Funcionario func = new Funcionario(nome, horas, valorPorHora);
                //Adicionar pagamento tmb:
                funcionarios.add(func);

            }else{
                System.out.println("Resposta invalida");
                break;
            }
        }

        System.out.println();
        System.out.println("Pagamentos: ");

        //Percorrendo e imprimindo nome e pagamentos dos funcionarios:
        for (Funcionario func : funcionarios){
            System.out.println(func.getNome() + " - $ " + func.pagamento());
        }


        sc.close();
    }
}
