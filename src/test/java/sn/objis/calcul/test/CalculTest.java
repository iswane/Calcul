package sn.objis.calcul.test;

import junit.framework.TestCase;
import sn.objis.calcul.service.Calcul;

public class CalculTest extends TestCase {
	
	private Calcul calcul;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		calcul = new Calcul();
	}
	
	public void testSomme() {
		assertTrue(calcul.somme(15, 5) == 20);
	}
	
	public void testProduit() {
		assertTrue(calcul.produit(5, 5) == 25);
	}
}
