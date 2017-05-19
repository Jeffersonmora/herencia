
package fundamen;

public class Main {
    public static void main(String[] args) {
     
       CuentaBancaria cta1=new CuentaAhorro();
       CuentaBancaria cta2=new CuentaAhorro();

       CuentaBancaria cta3=new CuentaCorriente();
        
        //Seteamos los valor utilizando el metodo set es decir enviamos los valores
	cta1.setNombre("Cta1");
	cta2.setNombre("Cta2");
	cta3.setNombre("Cta3");
        
	cta1.setSaldo(50);
        cta2.setSaldo(70);
        cta3.setSaldo(35);
                
        cta1.deposito(299);
        cta2.deposito(500);
        cta3.deposito(456);
                      
        imprimirSaldo(cta1);
        imprimirSaldo(cta2);
        imprimirSaldo(cta3);

        
       
	}
	
	public static void imprimirSaldo(CuentaBancaria cta){
		System.out.println("Cuenta: " + cta.getNombre() + " Saldo: " + cta.getSaldo());
	}
    }
    

