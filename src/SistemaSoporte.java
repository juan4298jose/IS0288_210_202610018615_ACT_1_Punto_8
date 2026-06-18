import java.util.LinkedList;
import java.util.Queue;
public class SistemaSoporte{
    private Queue<String> colaSoporte = new LinkedList<>();

    public void  ClinteRegistrado (String NombreCliente){
        colaSoporte.offer(NombreCliente);
        System.out.println("el nombre del cliente es :"+NombreCliente);
    }
    public void SiguienteClienteFila(){ 

        String proximo = colaSoporte.peek();
        if (proximo != null) {
            System.out.println(" PROXIMO EN LA FILA : "  + proximo);
        } else {
            System.out.println("-----La cola está vacía.-----");
        }

    }
    public void PorAtender(){
       String ClienteAtendido = colaSoporte.poll();
       if (ClienteAtendido != null ){
        System.out.println("SE ESTA ATENDIENDO A :" +ClienteAtendido);
       }else{
        System.out.println("-----no hay nadie por atender-----");
       }
    }
}