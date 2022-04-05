/*
Made by: Lord Saiyan
Date: 03/04/22
*/
public class Main
{
    public static void main(String[] args) {

        StringBuilder oi = new StringBuilder(); //StringBuilder que vai ser usada para construir a fala

        String goku[] = new String [12]; //Vetor de 12 índices que vai armazenar todos os caracteres da fala

        goku[0] = "O";
        goku[1] = "i";
        goku[2] = " ";
        goku[3] = "m";
        goku[4] = "e";
        goku[5] = "u";
        goku[6] = " ";
        goku[7] = "n";
        goku[8] = "o";
        goku[9] = "b";
        goku[10] = "r";
        goku[11] = "e";

  //Estrutura de repetição 'for' para a construção da String
        for (int i=0; i<12 ;i++){

            System.out.println(oi.append(goku[i])); //Utilizando o método .append que vai adicionar o caractere do vetor que estiver na posição da variável 'i' à StringBuilder para formar a fala.

      //Try catch para dar um delay no código e ficar melhor a visualização da fala sendo construida.
            try{

              Thread.sleep(100);

            }catch(InterruptedException vegeta){


            }

        }


    }
}
