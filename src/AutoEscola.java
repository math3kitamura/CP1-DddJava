public class AutoEscola {
    Aluno aluno1;
    Aluno aluno2;
    Aluno aluno3;
    Aluno aluno4;

    public void exibirResumo() {
        System.out.println("\nResumo dos alunos");

        mostrarAluno(aluno1);
        mostrarAluno(aluno2);
        mostrarAluno(aluno3);
        mostrarAluno(aluno4);
    }
    private void mostrarAluno(Aluno aluno) {

        System.out.println("\nNome: " + aluno.nome);
        System.out.println("Tipo Veiculo: " + aluno.tipoVeiculo);
        System.out.println("Aulas Teoricas: " + aluno.aulasTeoricas);
        System.out.println("Aulas Praticas: " + aluno.aulasPraticas);
        System.out.println("Aprovado: " + aluno.aprovado);
    }
}

