package br.com.reservasbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.reservasbooking.enums.QuartoReserva;

@Entity
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer idReserva;
	
	@Column(name = "nome")
	public String nomeReserva;
	
	@Column(name = "fone")
	public String foneReserva;
	
	@Column(name = "reserva")
	public String dataReserva;
	
	@Column(name = "chekin")
	public String dataChegadaReserva;
	
	@Column(name = "quarto")
	public QuartoReserva quartoReserva;
	
	@Column(name = "qtdPessoas")
	public String qtdPessoasReserva;
	
	@Column(name = "diaria")
	public String valorReserva;
	
	
	
	public Integer getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	public String getNomeReserva() {
		return nomeReserva;
	}
	public void setNomeReserva(String nomeReserva) {
		this.nomeReserva = nomeReserva;
	}
	public String getFoneReserva() {
		return foneReserva;
	}
	public void setFoneReserva(String foneReserva) {
		this.foneReserva = foneReserva;
	}
	public String getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(String dataReserva) {
		this.dataReserva = dataReserva;
	}
	public String getDataChegadaReserva() {
		return dataChegadaReserva;
	}
	public void setDataChegadaReserva(String dataChegadaReserva) {
		this.dataChegadaReserva = dataChegadaReserva;
	}
	public QuartoReserva getQuartoReserva() {
		return quartoReserva;
	}
	public void setQuartoReserva(QuartoReserva quartoReserva) {
		this.quartoReserva = quartoReserva;
	}
	public String getQtdPessoasReserva() {
		return qtdPessoasReserva;
	}
	public void setQtdPessoasReserva(String qtdPessoasReserva) {
		this.qtdPessoasReserva = qtdPessoasReserva;
	}
	public String getValorReserva() {
		return valorReserva;
	}
	public void setValorReserva(String valorReserva) {
		this.valorReserva = valorReserva;
	}

	
}