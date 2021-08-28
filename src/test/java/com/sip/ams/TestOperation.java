package com.sip.ams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Operation;

class TestOperation {

	@Test
	public void testSomme() {
		Operation op = new Operation();
		int res = op.somme(10, 20);
		assertEquals(res, 30);
	}
	
	@Test
	public void testProduit() {
		Operation op = new Operation();
		int res = op.produit(10, 20);
		assertEquals(res, 200);
	}

}
