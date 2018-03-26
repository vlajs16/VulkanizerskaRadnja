package gume;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;


public class AutoGumaTest {
	
	private AutoGuma guma;

	@Before
	public void setUp() throws Exception {
		guma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		guma = null;
	}
	
	@Test
	public void testSetMarkaModel() {
		String model = "Michelin Alpin A3";
		guma.setMarkaModel(model);
		
		assertEquals(model, guma.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		guma.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKrace() {
		guma.setMarkaModel("Ma");
	}
	
	@Test 
	public void testSetPrecnik() {
		int precnik = 18;
		guma.setPrecnik(precnik);
		assertEquals(precnik, guma.getPrecnik());
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManje() {
		int precnik = 9;
		guma.setPrecnik(precnik);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVece() {
		int precnik = 580;
		guma.setPrecnik(precnik);
	}
	
	@Test 
	public void testSetSirina() {
		int sirina = 140;
		guma.setSirina(sirina);
		assertEquals(sirina, guma.getSirina());
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManje() {
		int sirina = 80;
		guma.setSirina(sirina);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVece() {
		int sirina = 500;
		guma.setSirina(sirina);
	}
	
	@Test 
	public void testSetVisina() {
		int visina = 50;
		guma.setVisina(visina);
		assertEquals(visina, guma.getVisina());
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManje() {
		int visina = 10;
		guma.setVisina(visina);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVece() {
		int visina = 150;
		guma.setVisina(visina);
	}
	
	@Test 
	public void testToString() {
		String marka = "Michelin";
		int precnik = 18;
		int sirina = 140;
		int visina = 50;
		
		guma.setMarkaModel(marka);
		guma.setPrecnik(precnik);
		guma.setVisina(visina);
		guma.setSirina(sirina);
		
		assertEquals("AutoGuma [markaModel=Michelin, precnik=18, sirina=140, visina=50]", guma.toString());
	}
	
	@Test
	public void testEquals() {
		String marka = "Michelin";
		int precnik = 18;
		int sirina = 140;
		int visina = 50;
		
		guma.setMarkaModel(marka);
		guma.setPrecnik(precnik);
		guma.setVisina(visina);
		guma.setSirina(sirina);
		
		AutoGuma guma2 = new AutoGuma();
		
		guma2.setMarkaModel(marka);
		guma2.setPrecnik(precnik);
		guma2.setVisina(visina);
		guma2.setSirina(sirina);
		
		assertTrue(guma.equals(guma2));
	}
	
	@Test
	public void testEqualsFalse() {
		String marka = "Michelin";
		int precnik = 18;
		int sirina = 140;
		int visina = 50;
		
		guma.setMarkaModel(marka);
		guma.setPrecnik(precnik);
		guma.setVisina(visina);
		guma.setSirina(sirina);
		
		AutoGuma guma2 = new AutoGuma();
		
		guma2.setMarkaModel(marka);
		guma2.setPrecnik(15);
		guma2.setVisina(visina);
		guma2.setSirina(sirina);
		
		assertFalse(guma.equals(guma2));
	}
	
}
