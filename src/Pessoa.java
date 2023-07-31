public class Pessoa{

        public String nome;
        public String Cpf;
        public String RG;
        public String Telefone;
        public String TelContado;
        public String Endereço;

        //Construtor padrao
        public Pessoa(){
            this.nome = "Rei";
            this.Cpf = "Cpf";
            this.RG = "RG";
            this.Telefone = "Telefone";
            this.TelContado = "TelContado";
            this.Endereço = "Endereço";
        }

        //Construtor personalizdo
        public Pessoa(String nome, String Cpf,String RG,String Telefone,String TelContado,String Endereço){
            this.nome = nome;
            this.Cpf = Cpf;
            this.RG = RG;
            this.Telefone = Telefone;
            this.TelContado = TelContado;
            this.Endereço = Endereço;
        }

        //Contrutor personalizado

        public Pessoa(String nome,String Telefone){
            this.nome = nome;
            this.Cpf = "";
            this.RG = RG;
            this.Telefone = Telefone;
            this.TelContado = TelContado;
            this.Endereço = Endereço;
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

        //RG
        public void setRG(String rg){
            this.RG = rg;
        }
        public String getRG(){
            return RG;
        }

        //Telefone
        public void setTelefone(String telefone){
            this.Telefone =  telefone;
        }
        public String getTelefone(){
            return Telefone;
        }

        //Telefone para Contato
        public void setTelContado(String telContado){
            this.TelContado =  telContado;
        }
        public String getTelContado(){
            return TelContado;
        }

        //Endereço

        public void setEndereço(String endereço){
            this.Endereço =  endereço;
        }
        public String getEndereço(){
            return Endereço;
        }


}
