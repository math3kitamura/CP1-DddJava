public class Aluno {
    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    boolean aprovado;

    public void agendarAulaTeorica(int aulasTeoricas){
        this.aulasTeoricas += aulasTeoricas;

        System.out.println("Atualizando o numero de aulas: " + this.aulasTeoricas);
    }

    public void agendarAulaPratica(int aulasPraticas){
        this.aulasPraticas +=  aulasPraticas;

        System.out.println("Atualizando o numero de aulas: " + this.aulasPraticas);
    }

    public void cancelarAulaTeorica(int aulasTeoricas){
        if (this.aulasTeoricas >= aulasTeoricas) {
            this.aulasTeoricas -= aulasTeoricas;
            System.out.println("Atualizando o numero de aulas: " + this.aulasTeoricas);
        } else {
            System.out.println("Nao ha aulas suficientes para cancelar");
        }
    }

    public void cancelarAulaPratica(int aulasPraticas){
        if (this.aulasPraticas >= aulasPraticas) {
            this.aulasPraticas -= aulasPraticas;
            System.out.println("Atualizando o numero de aulas: " + this.aulasPraticas);
        } else {
            System.out.println("Nao ha aulas suficientes para cancelar");
        }
    }

    public void realizarExame(){
        if (aulasTeoricas >= 5 && aulasPraticas >= 5) {
            System.out.println("O aluno pode fazer o exame");

            this.aprovado = Math.random() < 0.5;

            if (this.aprovado) {
                System.out.println("O aluno foi aprovado");
            } else {
                System.out.println("O aluno foi reprovado");
            }

        } else {
            System.out.println("O aluno não pode fazer o exame");
        }
    }
}
