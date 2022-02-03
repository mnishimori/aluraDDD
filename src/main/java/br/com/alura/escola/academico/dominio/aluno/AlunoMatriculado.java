package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.academico.dominio.Evento;
import br.com.alura.escola.shared.dominio.CPF;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    private final CPF cpf;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpf) {
        this.cpf = cpf;
        this.momento = LocalDateTime.now();
    }

    public CPF getCpf() {
        return cpf;
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }
}
