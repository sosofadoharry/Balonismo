public class Main {
    public static void main(String[] args) {

        //Criando Objetos

        //Pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        //Piloto
        Piloto piloto1 = new Piloto();

        //Balao
        Balao balao1 = new Balao();

        //Atribuindo Valores

        //Pessoa1

        pessoa1.setNome("Cirilo");
        pessoa1.setCpf("2878991887");
        pessoa1.setRG("928739ui");
        pessoa1.setTelefone("1199887278");
        pessoa1.setTelContado("1192761221");
        pessoa1.setEndereço("Rua Carldos dumont");



        //Pessoa 2

        pessoa2.setNome("Maria Joaquina");
        pessoa2.setCpf("29836702791");
        pessoa2.setRG("2328127ty");
        pessoa2.setTelefone("11942324050");
        pessoa2.setTelContado("11995578798");
        pessoa2.setEndereço("Rua Carldos dumont");



        //Piloto

        piloto1.setNome("Kleiton");
        piloto1.setCpf("00999888765");
        piloto1.setNumeroRegistro("22");



        //Balão

        balao1.setIndeti("Caça");
        balao1.setRegistro("321");

        System.out.println(balao1);

        //Testando alguns valorez

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());
        System.out.println(piloto1.getNome());
        System.out.println(balao1.getIndeti());
    }
}