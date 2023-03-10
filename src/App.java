import java.util.Locale;
import java.util.Scanner;

import entities.Caneta;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        Caneta bic = new Caneta();

        System.out.println("Qual a cor da caneta? ");
        bic.setCor(tec.nextLine());
        System.out.println("Qual o tipo da ponta?");
        bic.setPonta(tec.nextLine());
        System.out.println("Quanto de carga a caneta ainda tem?");
        bic.setCarga(tec.nextDouble());

        System.out.println(bic.toString());

        
        tec.close();
    }
}
