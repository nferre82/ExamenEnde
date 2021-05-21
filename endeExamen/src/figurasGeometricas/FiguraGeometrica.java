/**
 * 
 */
package figurasGeometricas;
/**
 * Clase abstracta de la que heredan Círculo, Cuadrado, Tríangulo y Rectángulo
 * @since 03-05-2020
 * @version 4.0
 * @author Juanan y Ainara
 * @see <a href="#">Disfruta de la geometria </a>
 */
public abstract class FiguraGeometrica {
	/**
	 * 
	 */
	protected double valor;
	
	/**
	 * Constructor.
	 * @param valor Recibe valor del atributo a través del constructor
	 */
	public FiguraGeometrica(double valor) {
		this.valor = valor;
	}
	
	/**
	 * 
	 * Método abstracto que define el servicio calcular área
	 * @return Devuelve el área de la figura
	 */
	public abstract double getArea();
	
	/**
	 * Metodo abstracto que define el servicio calcular perímetro
	 * @return Devuelve el perímetro de la figura
	 */
	public abstract double getPerimetro();
	
	/**
	 * Método modificador del atributo valor
	 * @param valor Recibe valor del atributo a través del método modificador
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * Metodo consultor del atributo valor
	 * @return Devuelve el valor del atributo a través del método consultor
	 */
	public double getValor() {
		return valor;
	}

}

