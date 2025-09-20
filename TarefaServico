package com.mycompany.tarefaservico;

import java.util.ArrayList;
import java.util.List;


public class TarefaServico {
    private List<Tarefa> tarefas = new ArrayList<>();
    private long contadorID = 1;
}

public Tarefas CriarTarefa(String titulo, String descricao) {
    Tarefas tarefa = new Tarefa(contadorID++, titulo, descricao, false);
    tarefas.add(tarefa);

return tarefa;
}

public list<Tarefa> ListarTarefas() {
    return Tarefas;
}

public boolean atualizarTarefa(int id, String novaDescricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setDescricao(novaDescricao);
                return true;
            }
        }
        return false;
    }

    public boolean removerTarefa(int id) {
        return tarefas.removeIf(tarefa -> tarefa.getId() == id);
}
