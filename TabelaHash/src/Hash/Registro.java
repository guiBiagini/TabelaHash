package Hash;

public class Registro {
	private int key;
	private String value;
	private Registro proximo;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int hashCode() {
		return key % 100;
	}

	public Registro() {
		this.proximo = null;
	}

	public Registro(int key, String value) {
		this.key = key;
		this.value = value;
		this.proximo = null;
	}
	public void setProximo(Registro proximo) {
		this.proximo = proximo;
	}
	public Registro getProximo() {
		return this.proximo;
	}
}
