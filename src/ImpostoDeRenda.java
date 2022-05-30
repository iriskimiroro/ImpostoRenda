
import java.util.Scanner; // Importei o Scanner
public class ImpostoDeRenda {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
double Salario; // variaveis
double Imposto = 0;
double Diferenca;


System.out.println("Digite seu salário:"); // Impressao do pedido
// Salario vai receber //
Salario = sc.nextDouble(); //nextdouble pois tem casa decimal
 
if (Salario > 4500){
Imposto = 1000 * 0.08 + 1500 * 0.18; //divisao de 8%
Diferenca = Salario - 4500;
Imposto = Imposto + Diferenca * 0.28;

} else if(Salario > 3000){
Imposto = 1000 * 0.08;
Diferenca = Salario - 3000; //divisao 18%
Imposto = Imposto + Diferenca * 0.18;

} else if(Salario > 2000){
    Diferenca = Salario - 2000;
    Imposto = Diferenca * 0.08;


} if(Imposto > 0){
System.out.println("R$" +Imposto);


} else {
    System.out.println("Isento");
}

}
}
