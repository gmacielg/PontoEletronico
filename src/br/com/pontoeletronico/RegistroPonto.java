package br.com.pontoeletronico;
import java.time.Duration;
import java.time.LocalDateTime;

public class RegistroPonto {
	private LocalDateTime dataHora;
	private TipoRegistro tipo;
	private Duration duracao;
	
	
	
	public enum TipoRegistro{
		ENTRADA, SAIDA, INTERVALO
	}


	public LocalDateTime getDataHora() {
		return dataHora;
	}


	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}


	public TipoRegistro getTipo() {
		return tipo;
	}


	public void setTipo(TipoRegistro tipo) {
		this.tipo = tipo;
	}


	public Duration getDuracao() {
		return duracao;
	}


	public void setDuracao(Duration duracao) {
		this.duracao = duracao;
	}
	
	public void calcularDuracao(LocalDateTime dataHoraFim) {
		this.duracao = Duration.between(dataHora, dataHoraFim);
		
	}
	
	public boolean isAdicionalNoturno(LocalDateTime horarioInicioNoturno, LocalDateTime horarioFimNoturno) {
		
		boolean temAdicionalNoturno = saida.isAdicionalNoturno(LocalDateTime.of(0, 0, 0, 22), LocalDateTime.of(0, 0, 0, 5));
		

		
		
		
		
	}
	

}
