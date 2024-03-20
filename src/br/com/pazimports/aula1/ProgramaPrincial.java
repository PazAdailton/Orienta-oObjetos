package br.com.pazimports.aula1;

public class ProgramaPrincial {

	public static void main(String[] args) {
		
		Estado ms = new Estado();
		ms.setNome("Mato Grosso do Sul");
		ms.setUf("MS");
		
		
		Cidade campogrande = new Cidade();
		campogrande.setNome("Campo Grande");
		campogrande.setEstado(ms);
		
		Cidade jardim = new Cidade();
		jardim.setNome("Jardim");
		jardim.setEstado(ms);
		
		
		Cliente carlos = new Cliente();
		carlos.setNome("Carlos Jão");
		carlos.setCpf("857858");
		carlos.setRg("98989");
		carlos.setCidade(jardim);
		
		
		Cliente adailton = new Cliente();
		adailton.setNome("Adailton da Paz");
		adailton.setCpf("909190");
		adailton.setRg("515151");
		adailton.setCidade(campogrande);
		
		Cliente maria = new Cliente();
		maria.setNome("Maria da Silva");
		maria.setCpf("565546");
		maria.setRg("545454");
		maria.setCidade(campogrande);
		
		System.out.println(adailton.getNome()+" "+ 
		adailton.getCidade().getNome()+" "+ 
		adailton.getCidade().getEstado().getNome() +" "+
		adailton.getCidade().getEstado().getUf());

	}

}
