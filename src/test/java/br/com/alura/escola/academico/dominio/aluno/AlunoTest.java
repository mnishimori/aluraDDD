package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {

    Aluno aluno;

    @BeforeEach
    void setUp() {
        aluno = new Aluno(new CPF("123.456.789-00"),
                "Marcelo", new Email(
                        "marcelo@email.com"));
    }

    @Test
    void deveAdicionarTelefoneUmTelefone() {
        aluno.adicionarTelefone("64", "99996666");

        Assertions.assertTrue(aluno.getTelefones().size() == 1);
    }

    @Test
    void deveAdicionarTelefoneDoisTelefones() {
        aluno.adicionarTelefone("64", "99996666");
        aluno.adicionarTelefone("64", "99996667");

        Assertions.assertTrue(aluno.getTelefones().size() == 2);
    }

    @Test
    void naoDeveAdicionarTelefoneDoisTelefones() {
        aluno.adicionarTelefone("64", "99996666");
        aluno.adicionarTelefone("64", "99996667");

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> aluno.adicionarTelefone("64", "99996668"));
    }
}