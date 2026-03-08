package com.ssw.model;

public enum Menu
{

    PRINCIPAL ("o-Bem-vida(o) a loja de Eletronicos-o\n"+
               "|                                   |\n"+
               "| (1) Comprar Produtos              |\n"+
               "| (2) Ver Carrinho                  |\n"+
               "| (3) Finalizar Compra              |\n"+
               "| (4) Sair                          |\n"+
               "o-----------------------------------o\n\n"+
               "Seleção: "),

    LOJA ("o----------------Loja---------------o\n"+
          "| (1) TV A                    $700  |\n"+
          "| (2) RADIO B                 $70   |\n"+
          "| (3) CELULAR C               $500  |\n"+
          "| (4) TABLET B                $300  |\n"+
		  "| (5) VIDEOGAME C             $1200 |\n"+
          "| (6) Voltar                        |\n"+
          "o-----------------------------------o\n\n"+
          "Seleção: ");

    private final String text;

	Menu(String text){
        this.text = text;
    }

	public String toString(){
		return text;
	}
}
