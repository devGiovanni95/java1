import java.util.scanner;
public class operadoresAritimeticos{
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite sua idade em anos:");
        int idade = dados.nextLine;
        System.out.println("Digite os meses: ");
        int meses = dados.nextLine;
        System.out.println("Digite os dias: ");
        int dias = dados.nextLine;

        int idadeEmDias = idade * 365 + meses * 30 + dias;
        System.out.println("Sua idade em dias são:");
        System.out.println(idadeEmDias + " dias.");
    }
}
