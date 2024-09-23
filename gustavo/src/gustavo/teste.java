package gustavo;
import java.util.Scanner;
public class teste {
	public static void main (String []Args) {
		Scanner ler = new Scanner(System.in);
		int a, n, i;
		
		System.out.println("Digite seu ano de nascimento");
		n = ler.nextInt();
		
		System.out.println("Digite o ano atual");
		a = ler.nextInt();
		
		i=a-n;
		
		if (i<10){
			System.out.println("Criança");
		} else if (i<18) {
			System.out.println("Adolescente");
		} else if (i<60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
	}
		

}