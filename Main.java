/* Uma loja possui 4 filiais, cada uma com um código de 1 a 4. Um arquivo contendo todas as vendas feitas durante o dia nas quatro filiais é gerado a partir de uma planilha, sendo que cada linha do arquivo contém o número da filial e o valor de uma venda efetuada, separados por vírgula.
Ex.: 1,189.90
1,45.70
3,29.90
4,55.00
No exemplo acima, a filial 1 fez duas vendas, a primeira totalizando R$ 189,90 e a segunda R$ 45,70. A filial 3 fez uma venda de R$ 29,90 e a 4 também uma de R$ 55,00. Faça um programa que leia este arquivo e informe, ao final, o total e o valor médio das vendas de cada filial. */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    
		Scanner scanner = new Scanner(new FileReader("vendas.txt")).useDelimiter("\n");

		while (scanner.hasNext()) {
			System.out.println( scanner.next() );
		}

  }
}