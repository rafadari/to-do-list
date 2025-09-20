package com.mycompany.TarefaServico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TarefaServico tarefaServico = new TarefaServico();

        while (true) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Criar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Atualizar Tarefa");
            System.out.println("4. Excluir Tarefa");
            System.out.println("5. Concluir Tarefa");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    tarefaServico.criarTarefa(titulo, descricao);
                    break;

                case 2:
                    tarefaServico.listarTarefas();
                    break;

                case 3:
                    System.out.print("Digite o ID da tarefa a ser atualizada: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Digite o novo título: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Digite a nova descrição: ");
                    String novaDescricao = scanner.nextLine();
                    tarefaServico.atualizarTarefa(idAtualizar, novoTitulo, novaDescricao);
                    break;
