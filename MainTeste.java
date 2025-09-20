package ucb.at2.n1.tarefaServico;

import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TarefaServico servico = new TarefaServico();

        while (true) {
            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1. Criar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar como Completa");
            System.out.println("4. Excluir Tarefa");
            System.out.println("5. Editar Tarefa");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Entre com o Titulo: ");
                    String titulo = entrada.nextLine();
                    System.out.print("Digite a Descricao: ");
                    String descricao = entrada.nextLine();

                    Tarefa nova = servico.criarTarefa(titulo, descricao);
                    System.out.println("Tarefa criada com sucesso: " + nova.getTitulo());
                }
                case 2 -> servico.mostrarTarefas();

                case 3 -> {
                    System.out.print("Digite o ID da tarefa para marcar como completa: ");
                    int idCompleta = entrada.nextInt();

                    if (servico.concluirTarefa(idCompleta)) {
                        System.out.println("Tarefa marcada como completa!");
                    } else {
                        System.out.println("Tarefa nao encontrada!");
                    }
                }
                case 4 -> {
                    System.out.print("Digite o ID da tarefa para excluir: ");
                    int idRemover = entrada.nextInt();

                    if (servico.removerTarefa(idRemover)) {
                        System.out.println("Tarefa excluida com sucesso!");
                    } else {
                        System.out.println("Tarefa nao encontrada!");
                    }
                }
                case 5 -> {
                    System.out.print("Digite o ID da tarefa para editar: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine(); 

                    System.out.print("Novo Titulo: ");
                    String novoTitulo = entrada.nextLine();
                    System.out.print("Nova Descricao: ");
                    String novaDescricao = entrada.nextLine();

                    if (servico.atualizarTarefa(idEditar, novoTitulo, novaDescricao)) {
                        System.out.println("Tarefa atualizada com sucesso!");
                    } else {
                        System.out.println("Tarefa nao encontrada!");
                    }
                }
                case 6 -> {
                    System.out.println("Saindo...");
                    entrada.close();
                    return;
                }
            }
        }
    }
}
