public class Pila3   {
    private ListaEnlazada Esquina;
	private int NoElementos;
	private Nodo Inicio;
    private Nodo Fin;
        int length;

	
		//contructor completo
	public Pila3(int n){    
		NoElementos = 0;
        Esquina = new ListaEnlazada();
	}
	public int cantidad(){
		return NoElementos ;
	}
	public void apilar(int valor) throws DesbordamientoPila{ 
	Esquina.agregarAlFin(new Nodo(null,valor));
	NoElementos++;
	}
	/*
	public void apilar(T valor) throws DesbordamientoPila{ 
		if(this.llena()){
			throw new DesbordamientoPila();
		}
	Esquina[indice] = valor;
	indice++;
	}*/
	public int sacar() throws SubDesborPila{
	if(this.vacia()){
			throw new SubDesborPila();
	}
	int esacar;
	    esacar = NoElementos-1;
        NoElementos--;
	
		return esacar;
	}
	
	public boolean vacia(){
	if(NoElementos == 0){
			return true;
	}
	return false;
	}/*
	public boolean llena(){
	if (NoElementos == Esquina.length){
			return true;
		}
	return false;
	}
	public int capacidad(){
	return Esquina.length;
	}
	public void vaciarPila()throws SubDesborPila
    {
	while(!vacia()){
		sacar();
	               }
    }*/
     
}
