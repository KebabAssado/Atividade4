package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        try {
            Scanner scanner = new Scanner(System.in);

            LocalDate data = LocalDate.now();

            double valorCompra = 0.0;
            int parcelas = 0;

            System.out.println("Valor da compra: ");
            valorCompra = scanner.nextDouble();
            while (valorCompra <= 0) {
                if (valorCompra <= 0) {
                    System.out.println("Valor inválido, informe novamente: ");
                }

            }
            System.out.println("Numero de Parcelas: ");
            parcelas = scanner.nextInt();

            double valorParcela = valorCompra / parcelas;

            System.out.println("Valor da compra: " + valorCompra);
            System.out.println("Parcelas: " + parcelas);

            LocalDate dataParcela = LocalDate.now();

            LocalDate datas[] = new LocalDate[5];
            datas[0] = dataParcela;
            datas[1] = data.plusDays(7);
            datas[2] = data.plusDays(14);
            datas[3] = data.plusDays(21);
            datas[4] = data.plusDays(28);

            for (int i = 0; i < 5; i++) {
                System.out.println("Data do vencimento da " + (i + 1) + "º parcela: " + (datas[i]));

            }


        } catch (NumberFormatException ne) {
            System.out.println("Erro de entrada inválida: " + ne.getMessage());
        } catch (NullPointerException nue) {
            System.out.println("Erro de entrada nula: " + nue.getMessage());
        } catch (Exception e) {
            // mostra os erros no console
            e.printStackTrace();
            //tratamento da exceção
            System.out.println("Mensagem do erro: " + e.getMessage()
                    + "\nClasse do erro: " + e.getClass());
        }
    }
}

