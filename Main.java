import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

	        /*BUSCAR COMANDO*/
	        ListaComandos instaListadoComandos = new ListaComandos();
	        
	        
	        
	        System.out.println("      COMANDOS DISPONIBLES");
	        System.out.println("_________________________________");
	        System.out.println(" ingresa el nombre del comando o");
	        System.out.println(" rmls  para ver el listado de\n comandos\n");

	     
	        
	        boolean programaOn = true;
	        do {
		        Scanner preguntaComando = new Scanner(System.in);
		        System.out.print(" comando: ");
		        String datoUsuario = preguntaComando.nextLine();
		        
		        if(datoUsuario.equals("")) {
		        	System.out.println("ingresa un comando");
		        }else if(datoUsuario.equals("exit")) {
		        	programaOn = false;
		        }else{
		        	instaListadoComandos.buscarComando(datoUsuario);
		        }
	        }while(programaOn);
	        
	}

}
