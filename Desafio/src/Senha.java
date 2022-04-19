

import java.util.Scanner;
public class Senha {
	String senha;
	boolean encontrou = false;
	private int cont;
	Senha(String senha){
		this.senha=senha;
		
			
	}

	void verificarSenha() {
			String letraMinuscula="";
			String letraMaiscula="";
			String digito="";
			String caracteres="";
			int i = 0, j = 0;
			cont = 0;
			char c,d;
			char[] letra;
			boolean encontrou = false;
			letra = new char[senha.length()];
			for (j = 0; j < senha.length(); j++)
			{
			for(i = j + 1 ; i < senha.length();i++)
			{
			c = senha.charAt(i);
			d = senha.charAt(j);
		
			for (int l=0; l < senha.length(); l++) {
                if (d==letra[l]) {
                    encontrou=true;                 
                    break;
                }
            }
            if ((c == d) && !encontrou) {
                cont++;                                        
                letra[j] = d;
            }
            encontrou=false;
        }
    }
			
			if(senha.length()>=9) {
				
			 	
				
				for(char a: senha.toCharArray()) {
				
					if(a>=65 && a<=90)
						letraMaiscula+=Character.toString(a);
					else if(a>=97 && a<=122)
						letraMinuscula+=Character.toString(a);
					else if(a>=48 && a<=57)
						digito+=Character.toString(a);
					else if((a>=33 && a<=43) || a==64) 
						caracteres+=Character.toString(a);
			
				}	

				if(letraMaiscula.length()==0 || letraMinuscula.length()==0 || digito.length()==0 || 
					caracteres.length()==0 || cont>=1){
						System.out.println("Senha Invalida");
				
					} 
					
					
					else {
						System.out.println("Senha valida");
					
					}
				} else {
				System.out.println("Senha Invalida");
				}
				
				
				}
			
			
		

public static void main (String args[]){
	
	try (Scanner Leitor = new Scanner(System.in)) {
		System.out.println("Digite sua senha");
		String pass = Leitor.nextLine();
		Senha p = new Senha(pass);
	
	p.verificarSenha();
}
}
}