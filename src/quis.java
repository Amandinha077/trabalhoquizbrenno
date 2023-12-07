package classes;

import java.util.Scanner;

public class quis {
    public static void main (String[]orgs){
        Scanner leia = new Scanner(System.in);

        cabecalho cabecalho1  = new cabecalho();
        System.out.println("===================================================================================================================");

        cabecalho1.nome = "Nome: Amanda carmo dos santos";
        cabecalho1.professor = "Professor: Brenno Pimenta";
        cabecalho1.materia = "Materia: Algoritimo e programação II";
        cabecalho1.faculdade = "Faculdade: UNIFAN";

        cabecalho1.escrevaCabecalho();
        System.out.println("===================================================================================================================");

        int acertos = 0;

        questao Q1 = new questao();

        Q1.pergunta = "1. Normalmente, quantos litros de sangue uma pessoa tem?" +
                " Em média, quantos são retirados numa doação de sangue?";
        Q1.opcaoA = "a) Tem entre 2 a 4 litros. São retirados 450 mililitros.";
        Q1.opcaoB = "b) Tem entre 4 a 6 litros. São retirados 450 mililitros.";
        Q1.opcaoC = "c) Tem 10 litros. São retirados 2 litros.";
        Q1.opcaoD = "d) Tem 7 litros. São retirados 1,5 litros.";
        Q1.opcaoE = "e) Tem 0,5 litros. São retirados 0,5 litros.";
        Q1.escrevaquestao();
        Q1.correta = "b";
        System.out.println("Escreva a resposta correta");
        String resposta = leia.nextLine();
        if (resposta.equals(Q1.iscorreta(resposta))) {
        } else {
        }
        if (resposta.equals(Q1.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        questao Q2 = new questao();

        Q2.pergunta = "2. De quem é a famosa frase “Penso, logo existo”?";
        Q2.opcaoA = "a) Platão.";
        Q2.opcaoB = "b) Galileu Galilei.";
        Q2.opcaoC = "c) Descartes.";
        Q2.opcaoD = "d) Sócrates.";
        Q2.opcaoE = "e) Francis Bacon.";
        Q2.escrevaquestao();
        Q2.correta = "c";
        System.out.println("Escreva a resposta correta");
        String resposta2 = leia.nextLine();
        if (resposta.equals(Q2.iscorreta(resposta))) {
        } else {
        }
        if (resposta2.equals(Q2.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        questao Q3 = new questao();

        Q3.pergunta = "3. De onde é a invenção do chuveiro elétrico?";
        Q3.opcaoA = "a) França.";
        Q3.opcaoB = "b) Inglaterra.";
        Q3.opcaoC = "c) Brasil.";
        Q3.opcaoD = "d) Austrália.";
        Q3.opcaoE = "e) Itália.";
        Q3.escrevaquestao();
        Q3.correta = "c";
        System.out.println("Escreva a resposta correta");
        String resposta3 = leia.nextLine();
        if (resposta.equals(Q3.iscorreta(resposta))) {
        } else {
        }
        if (resposta3.equals(Q3.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        questao Q4 = new questao();

        Q4.pergunta = "4.Quais o menor e o maior país do mundo?";
        Q4.opcaoA = "a) Vaticano e Rússia.";
        Q4.opcaoB = "b) INauru e China.";
        Q4.opcaoC = "c) Mônaco e Canadá.";
        Q4.opcaoD = "d) Malta e Estados Unidos.";
        Q4.opcaoE = "e) São Marino e Índia.";
        Q4.escrevaquestao();
        Q4.correta = "a";
        System.out.println("Escreva a resposta correta");
        String resposta4 = leia.nextLine();
        if (resposta.equals(Q4.iscorreta(resposta))) {
        } else {
        }
        if (resposta4.equals(Q4.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");


        questao Q5 = new questao();

        Q5.pergunta = "5.  Qual o livro mais vendido no mundo a seguir à Bíblia?";
        Q5.opcaoA = "a) Senhor dos Anéis.";
        Q5.opcaoB = "b) Dom Quixote.";
        Q5.opcaoC = "c) O Pequeno Príncipe.";
        Q5.opcaoD = "d) Ela, a Feiticeira.";
        Q5.opcaoE = "e) Um Conto de Duas Cidades.";
        Q5.escrevaquestao();
        Q5.correta = "b";
        System.out.println("Escreva a resposta correta");
        String resposta5 = leia.nextLine();
        if (resposta.equals(Q5.iscorreta(resposta))) {
        } else {
        }
        if (resposta5.equals(Q5.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");


        questao Q6 = new questao();

        Q6.pergunta = "6.Quantas casas decimais tem o número pi?";
        Q6.opcaoA = "a) Duas.";
        Q6.opcaoB = "b) Centenas.";
        Q6.opcaoC = "c) Infinitas.";
        Q6.opcaoD = "d) Vinte.";
        Q6.opcaoE = "e) Milhares.";
        Q6.escrevaquestao();
        Q6.correta = "b";
        System.out.println("Escreva a resposta correta");
        String resposta6 = leia.nextLine();
        if (resposta.equals(Q6.iscorreta(resposta))) {
        } else {
        }
        if (resposta6.equals(Q6.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");


        questao Q7 = new questao();

        Q7.pergunta = "7. Atualmente, quantos elementos químicos a tabela periódica possui?";
        Q7.opcaoA = "a) 113.";
        Q7.opcaoB = "b) 109.";
        Q7.opcaoC = "c) 108.";
        Q7.opcaoD = "d) 118.";
        Q7.opcaoE = "e) 92.";
        Q7.escrevaquestao();
        Q7.correta = "d";
        System.out.println("Escreva a resposta correta");
        String resposta7 = leia.nextLine();
        if (resposta.equals(Q7.iscorreta(resposta))) {
        } else {
        }
        if (resposta7.equals(Q7.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        questao Q8 = new questao();

        Q8.pergunta = "8.Quais os países que têm a maior e a menor expectativa de vida do mundo?";
        Q8.opcaoA = "a) Japão e Serra Leoa.";
        Q8.opcaoB = "b)  Austrália e Afeganistão.";
        Q8.opcaoC = "c) Itália e Chade.";
        Q8.opcaoD = "d) Brasil e Congo.";
        Q8.opcaoE = "e)  Estados Unidos e Angola.";
        Q8.escrevaquestao();
        Q8.correta = "a";
        System.out.println("Escreva a resposta correta");
        String resposta8 = leia.nextLine();
        if (resposta.equals(Q8.iscorreta(resposta))) {
        } else {
        }
        if (resposta8.equals(Q8.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        System.out.println("===================================================================================================================");

        questao Q9 = new questao();

        Q9.pergunta = "9.Qual a montanha mais alta do Brasil?";
        Q9.opcaoA = "a) Pico da Neblina.";
        Q9.opcaoB = "b) Pico Paraná.";
        Q9.opcaoC = "c) Pico das agulhas Negras.";
        Q9.opcaoD = "d) Pico Maior de Friburgo.";
        Q9.opcaoE = "e) Pico da Bandeira.";
        Q9.escrevaquestao();
        Q9.correta = "a";
        System.out.println("Escreva a resposta correta");
        String resposta9 = leia.nextLine();
        if (resposta.equals(Q9.iscorreta(resposta))) {
        } else {
        }
        if (resposta9.equals(Q9.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        questao Q10 = new questao();

        Q10.pergunta = "10. Em que oceano fica Madagascar?";
        Q10.opcaoA = "a) Oceano Índico.";
        Q10.opcaoB = "b) Oceano Antártico.";
        Q10.opcaoC = "c) Oceano Atlântico.";
        Q10.opcaoD = "d) Oceano Pacífico.";
        Q10.opcaoE = "e) Oceano Ártico.";
        Q10.escrevaquestao();
        Q10.correta = "a";
        System.out.println("Escreva a resposta correta");
        String resposta10 = leia.nextLine();
        if (resposta.equals(Q10.iscorreta(resposta))) {
        } else {
        }
        if (resposta10.equals(Q10.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        questao Q11 = new questao();

        Q11.pergunta = "11.Quantos graus são necessários para que dois ângulos sejam complementares?";
        Q11.opcaoA = "a) 45.";
        Q11.opcaoB = "b) 60.";
        Q11.opcaoC = "c) 90.";
        Q11.opcaoD = "d) 180.";
        Q11.opcaoE = "e) 380.";
        Q11.escrevaquestao();
        Q11.correta = "c";
        System.out.println("Escreva a resposta correta");
        String resposta11 = leia.nextLine();
        if (resposta.equals(Q11.iscorreta(resposta))) {
        } else {
        }
        if (resposta11.equals(Q11.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        System.out.println("===================================================================================================================");

        questao Q12 = new questao();

        Q12.pergunta = "12. Em que oceano fica Madagascar?";
        Q12.opcaoA = "a) Oceano Índico.";
        Q12.opcaoB = "b) Oceano Antártico.";
        Q12.opcaoC = "c) Oceano Atlântico.";
        Q12.opcaoD = "d) Oceano Pacífico.";
        Q12.opcaoE = "e) Oceano Ártico.";
        Q12.escrevaquestao();
        Q12.correta = "a";
        System.out.println("Escreva a resposta correta");
        String resposta12 = leia.nextLine();
        if (resposta.equals(Q10.iscorreta(resposta))) {
        } else {
        }
        if (resposta12.equals(Q12.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        questao Q13= new questao();

        Q13.pergunta = "13.Quantos graus são necessários para que dois ângulos sejam complementares?";
        Q13.opcaoA = "a) 45.";
        Q13.opcaoB = "b) 60.";
        Q13.opcaoC = "c) 90.";
        Q13.opcaoD = "d) 180.";
        Q13.opcaoE = "e) 380.";
        Q13.escrevaquestao();
        Q13.correta = "c";
        System.out.println("Escreva a resposta correta");
        String resposta13 = leia.nextLine();
        if (resposta.equals(Q12.iscorreta(resposta))) {
        } else {
        }
        if (resposta13.equals(Q13.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        questao Q14= new questao();

        Q14.pergunta = "14.Quem foi o criador da tragédia grega?";
        Q14.opcaoA = "a) Homero.";
        Q14.opcaoB = "b) Eurípedes.";
        Q14.opcaoC = "c) Plutarco.";
        Q14.opcaoD = "d) Ésquilo.";
        Q14.opcaoE = "e) Sófocles.";
        Q14.escrevaquestao();
        Q14.correta = "d";
        System.out.println("Escreva a resposta correta");
        String resposta14 = leia.nextLine();
        if (resposta.equals(Q14.iscorreta(resposta))) {
        } else {
        }
        if (resposta14.equals(Q14.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

        questao Q15= new questao();

        Q15.pergunta = "15.Qual das alternativas contém apenas vacinas contra a covid-19?";
        Q15.opcaoA = "a) VIP/VOP e AstraZeneca.";
        Q15.opcaoB = "b) CoronaVac e AstraZeneca.";
        Q15.opcaoC = "c) HPV e BioNTech.";
        Q15.opcaoD = "d) Pentavalente (DTPa) e Sputnik V.";
        Q15.opcaoE = "e) Rotavírus e CoronaVac.";
        Q15.escrevaquestao();
        Q15.correta = "b";
        System.out.println("Escreva a resposta correta");
        String resposta15 = leia.nextLine();
        if (resposta.equals(Q15.iscorreta(resposta))) {
        } else {
        }
        if (resposta15.equals(Q15.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos: " + acertos);
        } else {
            System.out.println("acertos: " + acertos);

        }
        System.out.println("===================================================================================================================");

    }
}