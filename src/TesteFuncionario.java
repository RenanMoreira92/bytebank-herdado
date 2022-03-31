
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario renan = new Funcionario();
		renan.setNome("Renan Moreira");
		renan.setCpf("123123123-23");
		renan.setSalario(3000.00);
		
		System.out.println(renan.getNome());
		System.out.println(renan.getBonificacao());

	}

}
