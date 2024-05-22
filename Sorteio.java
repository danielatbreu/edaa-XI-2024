import java.util.HashSet;

public class Sorteio {
    public static void main(String[] args) {
        // Lista de números com repetições
        int[] numeros = {1, 10, 50, 60, 10, 200, 300, 500, 700, 800, 900, 14, 33, 60, 55, 70, 80, 3, 100, 200, 25, 50, 75, 100, 300, 1000, 11, 22, 33, 60, 70, 80, 100, 35, 10, 150, 75, 85, 95, 200};

        // Criando um HashSet para armazenar números únicos
        HashSet<Integer> numerosUnicos = new HashSet<>();

        // Adicionando números únicos ao HashSet
        for (int numero : numeros) {
            numerosUnicos.add(numero);
        }

        // Obtendo o número de números únicos
        int numerosSorteados = numerosUnicos.size();

        System.out.println("Números únicos após filtrar os repetidos: " + numerosSorteados);
    }
}