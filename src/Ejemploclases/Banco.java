
package Ejemploclases;

public class Banco 
{
    //Atributos
    private String NombreCliente;
    private int NumeroCuenta;
    private double deposito;
    private double saldo;
    private double retiro;
    
    //Constructor Vacio
    public Banco()
    { }
    //Constructor con parametros
    public Banco(String NombreCliente, int NumeroCuenta, double deposito, double saldo, double retiro) {
        this.NombreCliente = NombreCliente;
        this.NumeroCuenta = NumeroCuenta;
        this.deposito = deposito;
        this.saldo = saldo;
        this.retiro = retiro;
    }   
    //Metodos
    public double Retiro(double valor){
         if(retiro>saldo)
        {
            System.out.println("El dinero que desea retirar excede a su saldo");
        }
        else
        {
            valor=(saldo-retiro);
            System.out.println("Su retiro se a realizado excitosamente");
            this.retiro=valor;
        }
         return valor;
    }
    public void setNombreCliente(String NombreCliente)
    {
        this.NombreCliente=NombreCliente;
        
    }
    public String getNombreCliente()
    {
        return NombreCliente;
    }
     public void setNumeroCuenta(int NumeroCuenta)
    {
        this.NumeroCuenta=NumeroCuenta;
        
    }
    public int getNumeroCuenta()
    {
        return NumeroCuenta;
    }
     public void setdeposito(double deposito)
    {
        this.deposito=deposito;
        
    }
    public double getdeposito()
    {
        return deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }
    

    
}
