package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.academico.dominio.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.AlunoMatriculado;

public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;

	private final PublicadorDeEventos publicadorDeEventos;

	public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicadorDeEventos) {
		this.repositorio = repositorio;
		this.publicadorDeEventos = publicadorDeEventos;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);

		this.publicadorDeEventos.publicar(new AlunoMatriculado(new CPF(novo.getCpf())));
	}

}
