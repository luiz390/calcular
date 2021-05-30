package calcularnumero;

import java.util.Scanner;

public class Calculadora4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3,n4,esc;
		double resul;
	    String	resul1; 
		
		System.out.println("********ESCOLHA A OPERAÇÃO**********");
		System.out.println();
        System.out.println("**1 PARA SOMA**");
        System.out.println("**2 PARA SUBTRAÇÃO");
        System.out.println("**3 PARA MULTIPLICAÇÃO");
        System.out.println("**4 PARA DIVISÃO");
        esc = sc.nextInt();
        
        System.out.println("DIGITE O PRIMEIRO NUMERO :");
        n1 = sc.nextInt();
        System.out.println("DIGIET O SEGUNDO NUMERO :");
        n2 = sc.nextInt();
        
        
        switch (esc) {
        case 1:
        	resul = n1 + n2;
        	System.out.println("A SOMA DOS NUMEROS FOI: " + resul);
        	break;
        	
        case 2:
        	resul = n1 - n2;
        	System.out.println("A SUBTRAÇÃO DOS NUMEROS FOI " + resul);
        	break;
        	
        case 3:
        	resul = n1 * n2;
        	System.out.println("A MULTIPLICAÇÃO DOS NUMEROS FOI: " + resul);
        	break;
        	
        case 4:
        	resul = n1 / n2;
        	System.out.println("A DIVISÃO DOS NUMEROS FOI " + resul);
        	break;
        	
        default:
            resul1  = "numero invalido";
            break;
        }
	}

}
