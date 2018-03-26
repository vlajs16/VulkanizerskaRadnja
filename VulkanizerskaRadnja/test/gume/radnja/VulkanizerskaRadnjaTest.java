package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	
	private AutoGuma guma;
	private VulkanizerskaRadnja radnja;
	private AutoGuma guma2;

	@Before
	public void setUp() throws Exception {
		guma = new AutoGuma();
		guma2 = new AutoGuma();
	
		radnja = new VulkanizerskaRadnja();
		
		String marka = "Michelin";
		int precnik = 18;
		int sirina = 140;
		int visina = 50;
		
		guma.setMarkaModel(marka);
		guma.setPrecnik(precnik);
		guma.setVisina(visina);
		guma.setSirina(sirina);
		
		guma2.setMarkaModel(marka);
		guma2.setPrecnik(20);
		guma2.setVisina(visina+1);
		guma2.setSirina(sirina+2);
	}

	@After
	public void tearDown() throws Exception {
		guma = null;
		guma2 = null;
		radnja = null;
	}
	
	@Test
	public void testDodajGumu() {
		radnja.dodajGumu(guma);
		assertEquals(1, radnja.getGume().size());
	}
	
	@Test
	public void testDodajGumu2() {
		radnja.dodajGumu(guma);
		radnja.dodajGumu(guma2);
		
		assertEquals(2, radnja.getGume().size());
		assertEquals(guma2, radnja.getGume().get(0));
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
		radnja.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuContain() {
		radnja.dodajGumu(guma);
		radnja.dodajGumu(guma);
	}
	
	@Test 
	public void testPronadjiGumu() {
		radnja.dodajGumu(guma);
		radnja.dodajGumu(guma2);
		
		LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
		gume.add(guma);
		gume.addFirst(guma2);
		
		assertTrue(radnja.pronadjiGumu(guma.getMarkaModel()).equals(gume));	
	}
	
	@Test 
	public void testPronadjiGumuNema() {
		AutoGuma guma3 = new AutoGuma();
		guma3.setMarkaModel("Tiger");
		guma3.setPrecnik(15);
		guma3.setVisina(40);
		guma3.setSirina(200);
		
		radnja.dodajGumu(guma);
		radnja.dodajGumu(guma2);
		
		assertTrue(radnja.pronadjiGumu(guma3.getMarkaModel()).isEmpty());
	}
	
	@Test 
	public void testPronadjiGumuNull() {	
		assertEquals(null, radnja.pronadjiGumu(null));
	}
}
