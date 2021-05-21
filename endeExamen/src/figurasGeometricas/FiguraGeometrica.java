/**
 * 
 */
package figurasGeometricas;
/**
 * Clase abstracta de la que heredan C�rculo, Cuadrado, Tr�angulo y Rect�ngulo
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
	 * @param valor Recibe valor del atributo a trav�s del constructor
	 */
	public FiguraGeometrica(double valor) {
		this.valor = valor;
	}
	
	/**
	 * 
	 * M�todo abstracto que define el servicio calcular �rea
	 * @return Devuelve el �rea de la figura
	 */
	public abstract double getArea();
	
	/**
	 * Metodo abstracto que define el servicio calcular per�metro
	 * @return Devuelve el per�metro de la figura
	 */
	public abstract double getPerimetro();
	
	/**
	 * M�todo modificador del atributo valor
	 * @param valor Recibe valor del atributo a trav�s del m�todo modificador
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * Metodo consultor del atributo valor
	 * @return Devuelve el valor del atributo a trav�s del m�todo consultor
	 */
	public double getValor() {
		return valor;
	}

}

