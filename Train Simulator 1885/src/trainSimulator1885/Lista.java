package trainSimulator1885;

public class Lista {
	Nodo inicio;
	Nodo fin;
	
	public Lista(){
		inicio = null;
		fin = null;
	}
	public void agregarInicio(int a){ //en "a" se guarda la informacion 
		
		Nodo nuevo = new Nodo (a , inicio);
		inicio = nuevo;
		
		if (fin == null)
			fin = inicio;
		
	}
	
	public void agragarFinal(int a ){
		
		Nodo nuevo = new Nodo (a,null);
		if (inicio == null){
			fin = nuevo;
			inicio = fin;
		}else 
			fin.setSiguiente(nuevo);
			fin = nuevo;
	}
	
	public void eliminarposicion(int elemento){
		Nodo temp =inicio, anterior=null;
		
		if (temp == null)
			System.out.println("lista vacioa");
		else{
			while(inicio != null){
				if( inicio.getInfo()== elemento){
					if(anterior == null){
						inicio = inicio.getSiguiente();
					}else{
						anterior.siguiente = temp.siguiente;
						break;
						
					}
				}else{
					anterior = temp;
					temp = temp.siguiente;
				}
				
			}
		}
	}
	
	
	
	public void imprimir(){
		Nodo t = inicio;
		while(t != null){
			System.out.println(t.getInfo());
			t = t.siguiente;
			
			
		}
	}
}
