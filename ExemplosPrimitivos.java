public class ExemplosPrimitivos {
    public static void main(String[] args) {
        
        // --- 1. TIPOS INTEIROS ---
        
        // byte: 8 bits. Armazena números de -128 a 127.
        byte idade = 25;
        System.out.println("Exemplo de byte: " + idade);
        
        // short: 16 bits. Armazena números de -32.768 a 32.767.
        short ano = 2026;
        System.out.println("Exemplo de short: " + ano);
        
        // int: 32 bits. É o mais comum para números inteiros.
        int populacao = 1500000;
        System.out.println("Exemplo de int: " + populacao);
        
        // long: 64 bits. Usado para números enormes. Requer o 'L' no final.
        long estrelasNoUniverso = 7000000000000000000L;
        System.out.println("Exemplo de long: " + estrelasNoUniverso);
        
        
        // --- 2. TIPOS DECIMAIS (PONTO FLUTUANTE) ---
        
        // float: 32 bits. Precisão simples. Requer o 'f' ou 'F' no final.
        float preco = 19.99f;
        System.out.println("Exemplo de float: " + preco);
        
        // double: 64 bits. Precisão dupla. É o padrão para números com vírgula.
        double pi = 3.141592653589793;
        System.out.println("Exemplo de double: " + pi);
        
        
        // --- 3. TIPO CARACTERE ---
        
        // char: 16 bits. Armazena um único caractere (usa aspas simples '').
        char inicial = 'G';
        System.out.println("Exemplo de char: " + inicial);
        
        
        // --- 4. TIPO BOOLEANO ---
        
        // boolean: Apenas 'true' (verdadeiro) ou 'false' (falso).
        boolean javaETranquilo = true;
        System.out.println("Exemplo de boolean: " + javaETranquilo);
    }
}