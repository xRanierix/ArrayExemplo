import java.util.ArrayList; //Tipo da Lista
import java.util.List; //Tipo List
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //Criando e instanciando a array
		
		//Alimentando com os dados
		list.add("Jubileu");
		list.add("Zequinha");
		list.add("Jacobino");
		list.add("Motocicleyson");
		list.add("Bredypity");
		
		//Adicionando numa posi��o espec�fica
		list.add(3,"Bilu");

		
		System.out.println("----Primeira Busca----");
		//Criar Visualiza��o com o foreach
				for(String x : list) {
					System.out.println(x);
				}
		//Mostrar tamanho da lista
		System.out.println("\n" + "Minha lista possui = "+ list.size() + " itens" +"\n");
	
		
		//Removendo item por busca pelo nome
		list.remove("Bredypity");
		
		//Removendo utilizando a posi��o
		list.remove(4);
		
		
		System.out.println("----Segunda Busca----");
		list.removeIf(x -> x.charAt(0) == 'M'); //Removendo por compara��o (predicado/lambda)
		
		//Criar Visualiza��o com o foreach
		for(String x : list) {
			System.out.println(x);
		}
		//Mostrar tamanho da lista
		System.out.println("\n" + "Minha lista possui = "+ list.size() + " itens" +"\n");
		
		System.out.println("----Buscando posi��o do item----");
		
		//Buscando a posi��o do elemento
		System.out.println("Index of Zequinha: " + list.indexOf("Zequinha"));
		
		System.out.println("\n" + "----Busque apenas itens come�ando pela letra J ----");
		
		//Criando nova lista que ser� associada a primeira, convertida para string para que possa
		//utilizado o filter e por fim convertida novamente para list
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J')
							.collect(Collectors.toList());
		
			//Criar Visualiza��o com o foreach
					for(String x : result) {
						System.out.println(x);
		
			System.out.println("------------");
		
	}
  
  }
	
}
