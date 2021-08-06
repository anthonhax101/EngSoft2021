package pessoas;

public class Aluno {
  	private int codigo;
	public char localizacao; //default: unidade
	public boolean emprestimos_pendentes;
	private boolean multa_pendente;
	private float multa_valor; //if !multa_pendente: multa_valor == 0 
	
	public int getCodigo() {
		return codigo;
	}

	public float getMulta_valor() {
		return multa_valor;
	}

	public void setMulta_valor(float multa_valor) {
		this.multa_valor = multa_valor;
	}

	public boolean isMulta_pendente() {
		return multa_pendente;
	}

	public void setMulta_pendente(boolean multa_pendente) {
		this.multa_pendente = multa_pendente;
	}
}
