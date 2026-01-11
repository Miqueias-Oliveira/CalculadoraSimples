import java.util.Scanner;

public class CalculadoraSimples {
    static void main(String[] args) {
        System.out.println("Bem vindos a Calculadora Simples!");

        //Input com Scanner
        Scanner input = new Scanner(System.in);

        //Adicionando valores
        System.out.println("Digite o primeiro número: ");
            var n1 = input.nextInt();

        System.out.println("DIGITE :1 para somar (+), 2 para multiplicar (*) , 3 para dividir (/) , 4 para subtrair: (-) ");
            var resultado = input.nextInt();

        System.out.println("Digite o segundo número:");
            var n2 = input.nextInt();

        //Resultado de acordo com o Operador.
        if (resultado == 1){
            var soma = n1 + n2;
            System.out.println("O resultado é: " + soma);
        }
        else if (resultado == 2){
            var multiplicacao = n1 * n2;
            System.out.println("O resultado é: " + multiplicacao);
        }
        else if (resultado == 3){
            var dividir = n1 / n2;
            System.out.println("O resultado é: " + dividir);
        }
        else if (resultado == 4){
            var subtrair = n1 - n2;
            System.out.println("O resultado é: " + subtrair);
        }
        else{
            System.out.println("Erro no operador.");
        }
    }
}
