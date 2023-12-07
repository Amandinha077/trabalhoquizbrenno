package classes;

public class questao {

    public String pergunta = "";
    public String opcaoA = "";
    public String opcaoB = "";
    public String opcaoC = "";
    public String opcaoD = "";
    public String opcaoE = "";
    public String correta = "";

    public void escrevaquestao(){

        System.out.println(this.pergunta);
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println(this.correta);

    }
    public boolean iscorreta (String resposta){
        if (resposta.equals(this.correta)){
            System.out.println("Resposta correta letra" + this.correta);
            return false;
        } else {
            System.out.println("Resposta errada!");
            System.out.println("A opção correte é a letra:" + this.correta);
            return false;
        }
    }
}