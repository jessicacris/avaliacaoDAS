
public class Acesso {

	public static final float VALOR_FRACAO = (float) 2.0;
	public static final float VALOR_HORA = (float) 7.0;
	public static final Class VALOR_DIARIA = (float) 30.0;
	
	public String placa;
	public int dia, mes, ano;
	public int horaEntrada, 
	           minutosEntrada;
	public int horaSaida, 
			   minutosSaida;


	public Acesso() {}

	
	 Acesso(int horaSaidaArg, int horaEntradaArg, int minutosEntradaArg, int minutosSaidaArg){
	      horaEntrada = horaEntradaArg;
	      horaSaida = horaSaidaArg;
	      minutosEntrada = minutosEntradaArg;
	      minutosSaida = minutosSaidaArg;
	    }

	    Class calculaValor(){

	        int quantidadeHoras;
	        int quantidadeMinutos;
	        

	     if (horaSaida == horaEntrada)
	       quantidadeMinutos = minutosSaida - minutosEntrada;
	     else if (horaSaida > horaEntrada && minutosEntrada == minutosSaida){
	       quantidadeMinutos = 0;
	       quantidadeHoras = horaSaida - horaEntrada;
	     }
	     else if (horaSaida > horaEntrada && minutosEntrada > minutosSaida)
	       quantidadeMinutos = minutosSaida - minutosEntrada;
	     else if (horaSaida > horaEntrada && minutosSaida < minutosEntrada){
	       quantidadeMinutos = minutosSaida + (60 - minutosEntrada);
	       quantidadeHoras = horaSaida - horaEntrada - 1;
	     }
	     else {
	       quantidadeHoras = 0;
	       quantidadeMinutos = 0;
	     }
	     
	     Class valorTotal = quantidadeHoras * VALOR_HORA + Math.ceil(quantidadeMinutos / 15.0) * VALOR_FRACAO;

	     float comparaValor(){
	    	 
	     if (calculaValor.valorTotal >=9)
	       return VALOR_DIARIA;
	     else
	       return valorTotal;
	    }
	}
	
	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}


	public void setMinutosSaida(int minutosSaida) {
		this.minutosSaida = minutosSaida;
	}
	
	
	
}
