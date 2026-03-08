import com.ssw.model.*;
import java.util.*;

public class Loja
{
    public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
        List<Produto> compras = new ArrayList<>();
		int userInput = 0;
        boolean quit = false;

        while(!quit){
            System.out.print(Menu.PRINCIPAL);
            userInput = sc.hasNextInt() ? sc.nextInt() : 0;
            sc.nextLine();

            switch(userInput){
                case 1: {loja(0, compras, sc); break;}
                case 2: {verCarrinho(compras); break;}
                case 3: {finalizarCompras(compras); quit = true; break;}
                case 4: {
                            if(compras.isEmpty())
                                System.out.println("o------------Saindo-------------o\n");
                            else
                                System.out.println("o-------Compra Cancelada--------o\n");
                            quit = true;
							break;
						}
                default: System.out.println("Opção inválida");
            }
        }
    }

	public static void loja(int entry, List<Produto> compras, Scanner sc){
		int userInput = 0;
		if(entry != -1){
			System.out.print(Menu.LOJA);
            userInput = sc.hasNextInt() ? sc.nextInt() : 0;
            switch(userInput){
                case 1: {compras.add(new Televisao("TV A", 700D)); loja(0, compras, sc); break;}
                case 2: {compras.add(new Radio("RADIO B", 70D)); loja(0, compras, sc); break;}
                case 3: {compras.add(new Radio("CELULAR C", 500D)); loja(0, compras, sc); break;}
                case 4: {compras.add(new Radio("TABLET D", 300D)); loja(0, compras, sc); break;}
                case 5: {compras.add(new Radio("VIDEOGAME E", 1200D)); loja(0, compras, sc); break;}
                case 6: {entry = -1;break;}
                default: System.out.println("Opção invalida");
			}
		}
	}

	public static void verCarrinho(List<Produto> compras){
	    if(compras.isEmpty()){
	        System.out.println("\n***Carrinho Vazio***");
	        return;
        }

	    System.out.println("o-------------Carrinho--------------o");
	    for(Produto p : compras){
	        System.out.printf("| %-12s%20.2f  |\n", p.getName(), p.getPrice());
        }
        System.out.println("|                                   |");
        System.out.printf("| %-12s%18d |\n","Total produtos:", compras.size());
		System.out.println("o-----------------------------------o\n");
	}

	public static void finalizarCompras(List<Produto> compras){
        if(compras.isEmpty()){
            System.out.println("\n***Carrinho Vazio***");
	        return;
        }
	    double total = 0;
	    for(Produto p : compras){
	        total += p.getPrice();
        }

        System.out.println("o-------------Check-out-------------o");
        for(Produto p : compras){
            System.out.printf("| %-12s%19.2f   |\n", p.getName(), p.getPrice());
        }
        System.out.println("|                                   |");
        System.out.printf("| %-12s%18.2f  |\n","Total a pagar:", total);
        System.out.println("o-----------------------------------o\n");
        System.out.println("***** Obrigada pela Preferencia ****\n");
	}
}
