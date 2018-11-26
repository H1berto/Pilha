/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;


import java.util.Scanner;


public class Pilha {

    int inicio, fim, tamanho, qtde_elementos;
    int[] pil;

    public Pilha() {

            Scanner entrada = new Scanner(System.in);
            inicio = fim = -1;
            System.out.println("Informe o tamanho da pilha");
            tamanho = entrada.nextInt();
            pil = new int[tamanho];
            qtde_elementos = 0;
    }

    public boolean Vazia() {

            if (qtde_elementos == 0) {

                System.out.println("Pilha Vazia!");

                return true;

            } else {
                return false;
            }

        }

    public boolean Cheia() {

            if (qtde_elementos == tamanho) {

                System.out.println("Pilha Cheia!");

                return true;

            } else {

                return false;
            }

        }

    public void empilhar(int e) {

            if (!Cheia()) {// se pilha não está cheia

                if (inicio == -1) {

                    inicio = 0;

                }

                fim++;

                pil[fim] = e;

                qtde_elementos++;

                System.out.println("Empilhando o elemento:" + e);

            }

        }

    public void desempilhar() {

            if (!Vazia()) {//se pilha não está vazia

                fim--;

                qtde_elementos--;

                System.out.println("tirando o elemento da pilha:" + pil[fim + 1]);

            }

        }

    public void exibir() {

            int cont, cont2 = 1;
            for (cont = fim; cont >= 0; cont--) {

                System.out.println("Elemento " + cont2 + " da pilha:" + pil[cont]);
                cont2++;

            }
        }

    public void exibir_menu() {

            System.out.println("***MENU*****");

            System.out.println("Digite a opção: ");

            System.out.println("1 - empilhar(PUSH)");

            System.out.println("2 - exibir");

            System.out.println("3 - desempilhar(POP)");

            System.out.println("4 - alterar(PULL)");

            System.out.println("5 - sair");

            System.out.print("Opção:");

        }
}
    
