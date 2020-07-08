
package Ejemploclases;
import java.util.Scanner;

public class PrincipalBanco 
{
    public static void main(String []args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta");
        int NumeroCuenta=reader.nextInt();
        System.out.println("Ingrese su nombre de cuenta");
        String NombreCuenta=reader.next();
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        double retiro = reader.nextDouble();
        
        Banco cliente1= new Banco();
        int saldo = 3000;
        cliente1.setSaldo(saldo);
        cliente1.setNombreCliente(NombreCuenta);
        cliente1.setNumeroCuenta(NumeroCuenta);
        cliente1.setRetiro(retiro);
       
        System.out.println( "Cliente: "+ cliente1.getNombreCliente());
        System.out.println("Saldo Anterior : " +cliente1.getSaldo());
        System.out.println("Cantidad a retirar : " +cliente1.getRetiro());
        System.out.println("Saldo Actual: "+(cliente1.getSaldo()-cliente1.getRetiro()));
        
    }
    
}
