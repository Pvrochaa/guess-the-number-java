import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int segredo = (int)(Math.random() * 50) +1;
        int palpite = 0;

        while(segredo != palpite){
            System.out.println("Adivinhe o número secreto de (1 a 50):");
            palpite = leitor.nextInt();

            if (palpite == segredo){
                System.out.println("Acertou!");
            } else if (palpite < segredo) {
                System.out.println("Muito baixo, Tente um número maior.");
            } else{
                System.out.println("Muito alto, Tente um número menor.");
            }
        }
    }
}