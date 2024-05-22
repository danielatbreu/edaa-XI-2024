import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LerDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> agenda = new HashMap<>();

        System.out.println("Digite até 5 CPFs e seus respectivos telefones:");

        for (int i = 0; i < 5; i++) {
            System.out.print("CPF: ");
            String cpf = scanner.next();
            System.out.print("Telefone: ");
            String telefone = scanner.next();

            agenda.put(cpf, telefone);
        }

        System.out.println("\nAgenda:");
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println("CPF: " + entry.getKey() + " - Telefone: " + entry.getValue());
        }

        scanner.close();
    }
}
