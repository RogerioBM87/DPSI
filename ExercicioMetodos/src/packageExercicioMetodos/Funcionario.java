package packageExercicioMetodos;

public class Funcionario {
    String nome;
    Double salario;

    void aumento (double valor) {
        this.salario += valor;
    }

    void consultaDados() {
        System.out.println("\nColaborador: " + this.nome + "\nNovo Salário: R$ " + this.salario);;
    }
}
