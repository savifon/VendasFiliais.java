/* Uma loja possui 4 filiais, cada uma com um código de 1 a 4. Um arquivo contendo todas as vendas feitas durante o dia nas quatro filiais é gerado a partir de uma planilha, sendo que cada linha do arquivo contém o número da filial e o valor de uma venda efetuada, separados por vírgula.
Ex.: 1,189.90
1,45.70
3,29.90
4,55.00
No exemplo acima, a filial 1 fez duas vendas, a primeira totalizando R$ 189,90 e a segunda R$ 45,70. A filial 3 fez uma venda de R$ 29,90 e a 4 também uma de R$ 55,00. Faça um programa que leia este arquivo e informe, ao final, o total e o valor médio das vendas de cada filial. */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import static java.lang.Integer.*;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    
		Scanner scanner = new Scanner(new FileReader("vendas.txt")).useDelimiter("\n");

		double totalf1=0, totalf2=0, totalf3=0, totalf4=0, valor=0;
		int loja=0, qndf1=0, qndf2=0, qndf3=0, qndf4=0;
		String[] linha;

		while (scanner.hasNext()) {
			linha = scanner.next().split(",");
			loja = Integer.parseInt(linha[0]);
			valor = Double.parseDouble(linha[1]);

			if (loja==1) {
				totalf1 += valor;
				qndf1 += 1;
			} else if (loja==2) {
				totalf2 += valor;
				qndf2 += 1;
			} else if (loja==3) {
				totalf3 += valor;
				qndf3 += 1;
			} else if (loja==4) {
				totalf4 += valor;
				qndf4 += 1;
			}
		}

		calcVendas("Filial 1", totalf1, qndf1);
		calcVendas("Filial 2", totalf2, qndf2);
		calcVendas("Filial 3", totalf3, qndf3);
		calcVendas("Filial 4", totalf4, qndf4);

  }

	public static void calcVendas(String f, double t, int q) {
		System.out.printf("\n\nA " + f + " vendeu um total de R$%.2f e teve uma média de R$%.2f.", t, t/q);
	}
}