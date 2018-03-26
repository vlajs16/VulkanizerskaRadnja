package gume;

/**
 * 
 * Klasa koja predstavlja auto gumu sa osnovnim funkcijama.
 * @author Vladimir Belca
 * @version 0.1
 *
 */

public class AutoGuma {
	
	/**
	 * Marka i model gume
	 */
	private String markaModel = null;
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	/**
	 * Visina gume
	 */
	private int visina = 0;
	
	
	/**
	 * Vraca vrednost atributa markaModel.
	 * @return naziv marke i modela kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * Postavlja novu vrednost za naziv marke i modela gume.
	 * @param markaModel model i marka koji se traze
	 * @throws java.lang.RuntimeException ako je unet
	 * <ul>
	 * <li> Null String </li> 
	 * <li> Duzina String-a manja od 3 </li> 
	 * </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	
	/**
	 * Vraca vrednost atributa precnik.
	 * @return precnik gume kao int
	 */
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * Postavlja novu vrednost za precnik gume.
	 * @param precnik precnik gume
	 * @throws java.lang.RuntimeException ako je
	 * unet 
	 * <ul>
	 * <li> Precnik manji od 13 </li> 
	 * <li> Precnik veci od 22 </li> 
	 * </ul>
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	
	/**
	 * Vraca vrednost atributa sirina.
	 * @return sirinu gume kao int
	 */
	public int getSirina() {
		return sirina;
	}
	
	/**
	 * Postavlja novu vrednost atributa sirina.
	 * @param sirina sirina gume
	 * @throws java.lang.RuntimeException ako je 
	 * uneta sirina manja od 135 ili veca od 355
	 * <ul>
	 * <li> Sirina manja od 135 </li> 
	 * <li> Sirina veca od 355 </li> 
	 * </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	
	/**
	 * Vraca vrednost atributa visina.
	 * @return visinu gume kao int
	 */
	public int getVisina() {
		return visina;
	}
	
	/**
	 * Postavlja novu vrednost atributa visina.
	 * @param visina visina gume
	 * @throws java.lang.RuntimeException ako je 
	 * uneta
	 * <ul>
	 * <li> Visina manja od 25 </li> 
	 * <li> Visina veca od 95 </li> 
	 * </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
