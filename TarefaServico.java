package ucb.at2.n1.tarefaServico;

import java.util.ArrayList;
import java.util.List;

public class TarefaServico {

    private List<Tarefa> tarefas = new ArrayList<>();
    private long contadorID = 1;

    // Criar uma nova tarefa
    public Tarefa criarTarefa(String titulo, String descricao) {
        Tarefa tarefa = new Tarefa((int)contadorID++, titulo, descricao);
        tarefas.add(tarefa);
        return tarefa;
    }

    // Listar todas as tarefas
    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    // Atualizar título e descrição da tarefa pelo ID
    public boolean atualizarTarefa(int id, String novoTitulo, String novaDescricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setTitulo(novoTitulo);
                tarefa.setDescricao(novaDescricao);
                return true;
            }
        }
        return false;
    }

    // Remover tarefa pelo ID
    public boolean removerTarefa(int id) {
        return tarefas.removeIf(tarefa -> tarefa.getId() == id);
    }

    // Marcar tarefa como concluída pelo ID
    public boolean concluirTarefa(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setCompleta(true);
                return true;
            }
        }
        return false;
    }

    // Método para imprimir todas as tarefas no console
    public void mostrarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println("------------------------");
                tarefa.mostrarInfo();
            }
        }
    }
}
