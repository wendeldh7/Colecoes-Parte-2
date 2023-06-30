import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararPorSexo {
    public static void main(String[] args) {
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, tente novamente.");
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
}