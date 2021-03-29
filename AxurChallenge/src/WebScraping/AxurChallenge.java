package WebScraping;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class AxurChallenge {
	
	static Scanner leia = new Scanner(System.in);	
	private static String link;
	
	public static void main(String[] args) throws IOException{
		

		String mensagemStatus = "Safe";				
		boolean exibeMensagem = false;		
		List<String> palavrasBusca = Arrays.asList( "black friday", "promoção", "senha");
		ArrayList<String> listaTextoParaBusca = new ArrayList<String>();

		
		System.out.println("Digite o seu link HTTP ou HTTPS: ");
		link = leia.next();
		
		Document doc = Jsoup.connect(link).get();		
		Document doc2 = Jsoup.connect(link).post();
		
		for(String p : palavrasBusca){
			listaTextoParaBusca.add(doc.getElementsContainingOwnText(p).toString());			
        } 			
		
		for(int i = 0; i < listaTextoParaBusca.size(); i++) {
			
			for(int x = 0; x < palavrasBusca.size(); x++) {
				
	        	if(listaTextoParaBusca.get(i).toLowerCase().contains(palavrasBusca.get(x).toLowerCase())) {
	        		exibeMensagem = true;       	        		   	
	        	}
	        }			
		}        
        
        if(exibeMensagem) {
        	mensagemStatus = "Suspicious";        	        	
        }
        
        System.out.println(mensagemStatus);
	
	}

}