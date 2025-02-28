package packageExercicioMetodos;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Rogério";
        f1.salario = 1234.56;

        Funcionario f2 = new Funcionario();
        f2.nome = "Epaminondas";
        f2.salario = 1345.67;

        System.out.println("\nColaborador: " + f1.nome + "\nSalário: R$ " + f1.salario);
        System.out.println("\nColaborador: " + f2.nome + "\nSalário: R$ " + f2.salario);

        f1.aumento(200);
        f1.consultaDados();

        f2.aumento(100);
        f2.consultaDados();
    }
}
