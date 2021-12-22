//Crie uma classe Java para funcionários. Ele deve ter o nome do funcionário, o departamento onde
// trabalha,seu salário (double), a data de entrada no banco (String) e seu RG (String).
//Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método recebeAumentoque
// aumenta o salário do funcionário de acordo com o parâmetro passado como argumento. Crie também
// um método calculaGanhoAnual, que não recebe parâmetro algum, devolvendo o valor do salário multiplicado por 12.
//Teste-a, usando uma outra classe que tenha o main. Você deve criar a classe do funcionário com
// o nome Funcionario, mas pode nomear como quiser a classe de testes, contudo, ela deve possuir o método main.

public class Main {
    public static void main(String args[]) {

        Funcionario funcionario01 = new Funcionario("João", "A", 2500.0, "20/12/2021", "0123456789" );

        System.out.println("Ganho anual: " + funcionario01.calculaGanhoAnual());
        System.out.println("Salario: " + funcionario01.getSalario());
        funcionario01.recebeAumento(0.1);
        System.out.println("Salario+aumento: " + funcionario01.getSalario());
    }
}
