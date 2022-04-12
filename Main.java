/*
Made by: Lord Saiyan
Date: 03/04/22
*/
public class Main
{
    public static void main(String[] args) {

        StringBuilder oi = new StringBuilder(); //StringBuilder que vai ser usada para construir a fala

        String goku[] = new String [10]; //Vetor de 12 índices que vai armazenar todos os caracteres da fala

        goku[0] = "O";
        goku[1] = "i ";
        goku[2] = "m";
        goku[3] = "e";
        goku[4] = "u ";
        goku[5] = "n";
        goku[6] = "o";
        goku[7] = "b";
        goku[8] = "r";
        goku[9] = "e";

  //Estrutura de repetição 'for' para a construção da String
        for (int i=0; i<10 ;i++){

            System.out.println(oi.append(goku[i])); //Utilizando o método .append que vai adicionar o caractere do vetor que estiver na posição da variável 'i' à StringBuilder para formar a fala.

      //Try catch para dar um delay no código e ficar melhor a visualização da fala sendo construida.
            try{

              Thread.sleep(100);

            }catch(InterruptedException vegeta){


            }

        }


    }
}
