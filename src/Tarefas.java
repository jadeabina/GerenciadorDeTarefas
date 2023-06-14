import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) {
        ArrayList<String> listTarefas = new ArrayList<>( );
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" ---LISTA DE TAREFAS--- ");
            System.out.println("1 Adicionar  Tarefas do dia: ");
            System.out.println("2 Remover tarefas:");
            System.out.println("3 Organizar tarefas:");
            System.out.println("4 Exiber minhas tarefas:" );
            System.out.println(" Sair ");
            int opcao = scanner.nextInt( );
            scanner.nextLine( );



            switch (opcao){
                case 1:
                    System.out.println("Digite a tarefa: " );
                    String tarefa= scanner.nextLine();
                    listTarefas.add(tarefa);
                    System.out.println("Tarefa adicionada!" );
                    break;

                case 2:
                    System.out.println("digite a tarefa ser removida" );
                    String tarefaRemover = scanner.nextLine();
                    if (listTarefas.remove(tarefaRemover)){
                        System.out.println("A tarefa foi removida!" );
                    }else {
                        System.out.println("A tarefa não foi encontrada na lista:" );
                    }
                case 3:
                    System.out.println("Tarefas organizadas..." );
                    Collections.sort(listTarefas);
                    System.out.println(listTarefas);

                case 4:
                    System.out.println("Lista de tarefas do dia: " );
                    for (String a : listTarefas ){
                            System.out.println(a);
                     }
                break;

                case 5:
                System.out.println("Saindo...");
                System.exit(0);
                break;


                default:
                    System.out.println("opção inválida. TENTE NOVAMENTE.");


            }
            System.out.println( );



        }


    }
}
