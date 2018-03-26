package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * Klasa koja predstavlja vulkanizersku radnju
 * @author Vladimir Belca
 * @version 0.1
 *
 */

public class VulkanizerskaRadnja {
	/**
	 * Lista guma koje se nalaze u vulkanizerskoj radnji
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda koja dodaje novu gumu u listu guma
	 * @param a nova guma koja se dodaje u listu guma
	 * @throws java.lang.RuntimeException ako
	 * <ul>
	 * <li> je uneta guma null </li>
	 * <li> uneta guma vec postoji u listi </li>
	 * </ul>
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	
	/**
	 * Pronalazi i vraca listu sa svim gumama iz vulkanizerske radnje koje odgovaraju upitu
	 * @param markaModel marka i model guma koje se traze
	 * @return lista sa svim gumama koje odgovaraju upitu
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
	
	/**
	 * Vraca listu svih guma u vulkanizerskoj radnji
	 * @return listu svih guma u radnji
	 */
	public LinkedList<AutoGuma> getGume() {
		return gume;
	}
	
	
}
