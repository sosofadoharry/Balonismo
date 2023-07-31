public class Piloto {
    //identificado pelo nome, CPF e número de registro da ANAC.

    public String nome;
    public String Cpf;
    public String numeroRegistro;

    //Construtor padrão
    public Piloto(){
        this.nome = "Carlos";
        this.Cpf = "098877621";
        this.numeroRegistro = "22";
    }

    //Construtor personalizado
    public Piloto(String nome, String Cpf, String numeroRegistro){
        this.nome = nome;
        this.Cpf = Cpf;
        this.numeroRegistro = numeroRegistro;
    }

    //Contrutor personalizado

    public Piloto(String nome){
        this.nome = "Carlos";
        this.Cpf = "indisponivel";
        this.numeroRegistro = "indisponivel";
    }

    //Nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    //CPF
    public void setCpf(String cpf){
        this.Cpf =  cpf;
    }
    public String getCpf(){
        return Cpf;
    }

    //Numero de Registro
    public void setNumeroRegistro(String numeroRegistro){ this.numeroRegistro = numeroRegistro;}
    public String getNumeroRegistro(){ return numeroRegistro;}
}
