import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Toda a lógica e dados residem no mesmo local
    public static void main(String[] args) {
        List<String> nomesProdutos = new ArrayList<>();
        List<Double> precosProdutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- SISTEMA DE PRODUTOS (MONOLÍTICO) ---");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();

                // Lógica de validação misturada com entrada de dados
                if (preco > 0) {
                    nomesProdutos.add(nome);
                    precosProdutos.add(preco);
                    System.out.println("Produto salvo com sucesso!");
                } else {
                    System.out.println("Erro: Preço inválido!");
                }
            } else if (opcao == 2) {
                System.out.println("\nLista de Produtos:");
                for (int i = 0; i < nomesProdutos.size(); i++) {
                    // Formatação e exibição manual
                    System.out.printf("- %s: R$ %.2f\n", nomesProdutos.get(i), precosProdutos.get(i));
                }
            } else if (opcao == 3) {
                break;
            }
        }
        scanner.close();
    }
}