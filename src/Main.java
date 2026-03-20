public class Main {
    public static void main(String[] args) {
       Aluno aluno1 = new Aluno();
       aluno1.nome = "Andre";
       aluno1.idade = 20;
       aluno1.tipoVeiculo = "Carro";
       aluno1.aulasTeoricas = 4;
       aluno1.aulasPraticas = 3;

       Aluno aluno2 = new Aluno();
       aluno2.nome = "Bruno";
       aluno2.idade = 22;
       aluno2.tipoVeiculo = "Moto";
       aluno2.aulasTeoricas = 6;
       aluno2.aulasPraticas = 5;

       Aluno aluno3 = new Aluno();
       aluno3.nome = "Carla";
       aluno3.idade = 19;
       aluno3.tipoVeiculo = "Carro";
       aluno3.aulasTeoricas = 6;
       aluno3.aulasPraticas = 4;

       Aluno aluno4 = new Aluno();
       aluno4.nome = "Daniel";
       aluno4.idade = 25;
       aluno4.tipoVeiculo = "Moto";
       aluno4.aulasTeoricas = 7;
       aluno4.aulasPraticas = 6;

       Instrutor instrutor1 = new Instrutor();
       instrutor1.nome = "Felipe";
       instrutor1.experiencia = 10;
       instrutor1.categoria = "Carro e moto";

       Veiculo veiculo1 = new Veiculo();
       veiculo1.tipo = "Carro";
       veiculo1.modelo = "Gol";
       veiculo1.placa = "ABC1D23";

       AutoEscola auto = new AutoEscola();

       auto.aluno1 = aluno1;
       auto.aluno2 = aluno2;
       auto.aluno3 = aluno3;
       auto.aluno4 = aluno4;

       aluno1.agendarAulaPratica(2);
       aluno1.cancelarAulaTeorica(6);
       aluno1.realizarExame();

       aluno2.agendarAulaPratica(1);
       aluno2.cancelarAulaPratica(2);
       aluno2.realizarExame();

       aluno3.agendarAulaPratica(3);
       aluno3.cancelarAulaTeorica(1);
       aluno3.realizarExame();

       aluno4.agendarAulaPratica(1);
       aluno4.cancelarAulaPratica(1);
       aluno4.realizarExame();

       auto.exibirResumo();

    }
}
