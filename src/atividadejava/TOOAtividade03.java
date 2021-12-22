/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadejava;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class TOOAtividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma data: ");
        try {
        String dataEntrada = entrada.nextLine();
        LocalDate data = LocalDate.parse(dataEntrada);
        
        for(int i=0; i<5; i++){
            if (i == 0){
                System.out.println("Data: " + data);
            }else
            System.out.println("Data: " + data.plusDays(i*7));
            i++;
        }
        
        }catch (Exception e){
            System.out.println("Data inválida: " + dataEntrada);
        }
        
        
        
        }
}

