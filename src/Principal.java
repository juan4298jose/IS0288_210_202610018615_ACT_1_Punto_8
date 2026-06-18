 public class Principal{
    public static void main(String[] args){
        SistemaSoporte AtencionCliente= new SistemaSoporte();
         AtencionCliente.ClinteRegistrado("clienteA");
         AtencionCliente.ClinteRegistrado("clienteB");
         AtencionCliente.ClinteRegistrado("clientec");
         System.out.println("----RECTIFICACION-------");
         AtencionCliente.SiguienteClienteFila(); 
          System.out.println("----EN ATENCION-----");
             AtencionCliente.SiguienteClienteFila();   
            AtencionCliente.SiguienteClienteFila();     
               AtencionCliente.SiguienteClienteFila();  
                  System.out.println("----PRUVAS COLA VACIA-----"); 

               AtencionCliente.PorAtender(); 
          
         
    }
 }