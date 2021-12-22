/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadejava;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class TOOAtividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Informe o seu salário:");
        Double salario = entrada.nextDouble();
        
        
        double desconto = 0;
        double novoSalario = 0;
        
        if(salario <= 1100 & salario > 00){
            novoSalario = salario - (salario * 0.075);
            desconto = salario * 0.075;
        } 
        else if (salario <= 2203.48 & salario >= 1100.01){
            novoSalario = salario - (salario * 0.09);
            desconto = salario * 0.09;   
        } 
        else if(salario <= 3305.22 & salario >= 2203.49){
            novoSalario = salario - (salario * 0.12);
            desconto = salario * 0.12;
        } 
        else if(salario <= 6433.57 & salario >= 3305.23){
            novoSalario = (salario * 0.14) - salario;
            desconto = salario * 0.14;
        } 
        else if(salario > 6433.57){
            novoSalario = salario - 900.70;
            desconto = 900.70;
        }
        
        System.out.println("Nome: " +nome);
        System.out.println("Salário bruto: " +salario);
        System.out.println("INSS " +desconto);
        System.out.println("Salário líquido " +novoSalario);
        }catch (NumberFormatException ne) {
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
