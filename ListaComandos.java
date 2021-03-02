
public class ListaComandos {
	String comando [] = new String [5];
    String descripcion [] = new String [5];
    
	String tema[] = new String [5];
	String descripcionTema[] = new String [5];

    ListaComandos(){

    comando[0] = "pwd";
    comando[1] = "ls";
    comando[2] = "cd";
    comando[3] = "mkdir";
    comando[4] = "touch";

    descripcion[0]= "El comando pwd indica la dirección donde estamos ubicados";
    descripcion[1]= "Enlista los elmentos del del directorio actual o al que se le dirija";
    descripcion[2]= "Permite movernos entre directorios o desde los directorios ~   y  / ";
    descripcion[3]= "Se utiliza para crear un directorio nuevo";
    descripcion[4]= "Utilizado para crear un archivo nuvo";

    
    tema[0]="directorio";
    
    descripcionTema[0]="\n CREAR UN DIRECTORIO:\n     para crear un directorio utiliza\n     el siguientes"
    + " comando.\n\n     mkdir nombreDirectorio\n"
    + " \n ELIMINAR UN DIRECTORIO:\n"
    + "     utiliza el siguiente comando seguido\n     del nombre del directorio a eliminar."
    + "\n\n     mkdir nombreDirectorio\n";
    
    }

    public void buscarComando(String comando) {
    	ListaComandos insta = new ListaComandos();
    	String comandoIngresado = comando;
    	
        for(int i = 0; i < insta.comando.length; i++ ){
        	
        	if(comandoIngresado.equals(insta.comando[i])){
        		System.out.println("     "+descripcion[i]);
        	}else {
        		if(comandoIngresado.equals(insta.tema[i])) {
        			System.out.println("     "+descripcionTema[i]);
        		}
        	}
        	
        }
     }

}
