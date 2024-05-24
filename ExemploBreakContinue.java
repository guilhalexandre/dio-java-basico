public class ExemploBreakContinue {
	public static void main(String[] args) {
	
        //break detecta e interrompe a execução verdade
        //continue mudou o fluxo daquela unica iteracao não parou o restante da aplicaçao
	for(int numero = 1; numero <=5; numero ++){
		if(numero == 3)
			continue;
		
		System.out.println(numero);
		
    }
}
}
