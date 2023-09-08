import java.util.Scanner;

public class NotasEscolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Insira a nota 1");
        double n1 = scanner.nextDouble();
        System.out.println("Insira a nota 2");
        double n2 = scanner.nextDouble();
        System.out.println("Insira a nota 3");
        double n3 = scanner.nextDouble();
        System.out.println("Insira a nota 4");
        double n4 = scanner.nextDouble();

        double media = ((n1 + n2 + n3 + n4)/4);

        if (media >=6 && media <=7 ){
            System.out.println("Sua média é : "+ media + " Voce esta de recuperação");
        }else if(media > 7 && media <=10 ){
            System.out.println("Sua média é : "+ media +" Voce esta APROVADO");
        }else if(media >= 0 && media <=6){
            System.out.println("Sua média é : "+ media + " Voce está REPROVADO");
        }else{
            System.out.println("INSIRA UM NUMERO VALIDO ( 0 a 10 ) NAS NOTAS 1, 2, 3 e 4 !");
        }
    }
}
