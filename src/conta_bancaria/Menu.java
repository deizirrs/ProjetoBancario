package conta_bancaria;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaPoupanca;
import conta.model.ContaCorrente;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		int numero;
		int agencia;
		int tipo;
		int aniversario;
		int numeroDestino;
		String titular;
		float saldo;
		float limite;
		float valor;	
		
		ContaPoupanca cp1 = new ContaPoupanca(1, 123, 1, "Deiziane Rodrigues", 100000.00f, 31);
		cp1.visualizar();
		
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Adriel Santos", 100000.00f, 1000.00f);
		cc1.visualizar();

		


				
while (true) {
	System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"*************************************************");
    System.out.println("                                                 ");
    System.out.println(Cores.TEXT_YELLOW +"                 DevGirls Bank                   ");
    System.out.println("                                                 ");
    System.out.println(Cores.TEXT_PURPLE +"*************************************************");
    System.out.println("                                                 ");
    System.out.println(Cores.TEXT_WHITE+"            1 - Criar Conta                      ");             
    System.out.println("            2 - Listar todas as Contar           ");
    System.out.println("            3 - Buscar Conta por Número          ");                        
    System.out.println("            4 - Atualizar dados da Conta         ");                               
    System.out.println("            5 - Apagar Conta                     ");
    System.out.println("            6 - Sacar                            ");
    System.out.println("            7 - Depositar                        ");
    System.out.println("            8 - Tranferir valores entre coisa    ");
    System.out.println("            9 - Sair                             ");
    System.out.println("                                                 ");
    System.out.println(Cores.TEXT_PURPLE +"*************************************************");
    
    System.out.println("\nEscolha uma opção: ");
    
    opcao = leia.nextInt();
	
	if (opcao == 9) {
		System.out.println("\nDevGirls Bank - O seu Futuro começa aqui");
	//fechar Scanner
		leia.close();
		System.exit(0);
}
	switch(opcao) {
	case 1 ->{
		System.out.println("Criar Conta\n\n");
		System.out.println("Digite o Numero da Agência: ");
        agencia = leia.nextInt();
        System.out.println("Digite o Nome do Titular: ");
        leia.skip("\r?");
        titular = leia.nextLine();
	}
	
	case 2 -> System.out.println("Listar todas as Contar");
	
	case 3 -> {
		System.out.println("Buscar Conta por Número");
	System.out.println("Digite o número da conta: ");
    numero = leia.nextInt();
	}
	
	case 4 -> {
	System.out.println("Atualizar dados da Conta");
	System.out.println("Digite o número da conta: ");
    numero = leia.nextInt();
	}
	
	case 5 ->{
	System.out.println("Apagar Conta");
	System.out.println("Digite o número da conta: ");
    numero = leia.nextInt();
	}
	case 6 ->{
	System.out.println("Sacar");
	System.out.println("Digite o valor do Saque: ");
    valor = leia.nextInt();
	}
	
	case 7 ->{
	System.out.println("Depositar");
	System.out.println("Digite o valor do Depósito : ");
    valor = leia.nextInt();
	}
	
	case 8 -> {
	System.out.println("Tranferir valores entre coisa");
		
	System.out.println("Digite o Numero da Conta de Origem: ");
    numero = leia.nextInt();
    
    System.out.println("Digite o Numero da Conta de Destino: ");
    numeroDestino = leia.nextInt();

    do {
        System.out.println("Digite o Valor da Transferência (R$): ");
        valor = leia.nextFloat();
        
	} while (valor <= 0);
}
default -> System.out.println("\nOpção inválida\n");
}
}

}


}
