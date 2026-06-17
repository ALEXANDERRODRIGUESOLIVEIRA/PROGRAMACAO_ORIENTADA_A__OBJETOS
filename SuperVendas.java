public class SuperVendas {
    public static void main(String[] args) {
    
    // CRIANDO VARIAVEIS DE TIPOS DIFERENTES
    
    // RELATÓRIO DE VENDA DE PRODUTOS

    // PRODUTOS QUE FORAM VENDIDOS
    int sapatos = 50;
    int tenis = 39;
    int sandalias = 80;
    int botas = 13;
    int chuteiras = 25;
    
    // PRECO DE CADA PRDUTO
    float precoPorSapato = 19.99f;
    float precoPorTenis = 29.99f;
    float precoPorSandalia = 8.99f;
    float precoPorBota = 49.99f;
    float precoPorChuteira = 99.99f;
    
    // CALCULO DE CADA  GRUPO DE PRODUTOS
    float faturamentoDeSapatos = sapatos * precoPorSapato;
    float faturamentoDeTenis = tenis * precoPorTenis;
    float faturamentoDeSandalias = sandalias * precoPorSandalia;
    float faturamentoPorBotas = botas * precoPorBota;
    float faturamentoPorChuteiras = chuteiras * precoPorChuteira;
    
    // FATURAMENTO TOTAL DOS PRODUTOS
    float faturamentoTotal = faturamentoDeSapatos + faturamentoDeTenis + faturamentoDeSandalias + faturamentoPorBotas + faturamentoPorChuteiras;
    char moeda = '$';

    System.out.println("RELATORIO DA VENDA DE PRODUTOS");
    System.out.println();

    // IMPRIMIR VARIAVEIS DE SAPATOS
    System.out.println("Numero de sapatos vendidos: " + sapatos);
    System.out.println("Preco de cada sapato: " + precoPorSapato + moeda);
    System.out.println("Faturamento da venda dos sapatos : " + faturamentoDeSapatos + moeda);
    System.out.println();
    
    // IMPRIMIR VARIAVEIS DE TENIS
    System.out.println("Numero de tenis vendidos: " + tenis);
    System.out.println("Preco de cada tenis: " + precoPorTenis + moeda);
    System.out.println("Faturamento da venda dos tenis: " + faturamentoDeTenis + moeda);
    System.out.println()
    ;
    // IMPRIMIR VARIAVEIS DE SANDALIAS
    System.out.println("Numero de sandalias vendidas: " + sandalias);
    System.out.println("Preco de cada sandalia: " + precoPorSandalia + moeda);
    System.out.println("Faturamento da venda das sandlaias: " + faturamentoDeSandalias + moeda);
    System.out.println();
    
    // IMPRIMIR VARIAVEIS DE BOTAS
    System.out.println("Numero de botas vendidas: " + botas);
    System.out.println("Preco de cada bota: " + precoPorBota + moeda);
    System.out.println("Faturmanto da venda das botas: " + faturamentoPorBotas + moeda);
    System.out.println();
    
    
    // IMPRIMIR VARIAVEIS DE CHUTEIRAS
    System.out.println("Numero de chuteiras vendidas: " + chuteiras);
    System.out.println("Preco de cada chuteira: " + precoPorChuteira + moeda);
    System.out.println("Faturamento da venda de chuteiras: " + faturamentoPorChuteiras + moeda);
    System.out.println();
    
    // IMPRIMIR FATURAMENTO TOTAL DA LOJA
    System.out.println("Faturamento total da loja: " + faturamentoTotal + moeda);
  }
}
