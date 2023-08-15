public class Balao {
    //número de identificação, além de registro de regularidade.

    public String indeti;
    public String registro;

    //Construtores
    public Balao(){
        this.indeti = "15";
        this.registro = "indisponivel";
    }

    
    public Balao(String identi, String registro){
        
        this.indeti = identi;
        this.registro = registro;
    }

   

    public Balao(String indeti){
        this.indeti = indeti;
        this.registro = "indisponivel";
    }

    //Indentidade
    public void setIndeti(String indeti){
        this.indeti = indeti;
    }

    public String getIndeti(){
        return indeti;
    }

    //Registro
    public void setRegistro(String registro){
        this.registro = registro;
    }

    public String getRegistro(){
        return registro;
    }

}
