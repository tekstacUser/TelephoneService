package com.Tek.Telephone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TelephoneServiceTest {
	
	private TelephoneService telephoneService;

    @Before
    public void setUp() {
        telephoneService = new TelephoneService();
    }

    @Test
    public void testValidPhoneNumber() {
        assertTrue(telephoneService.isValidPhoneNumber("1234567890"));
    }

    @Test
    public void testInvalidPhoneNumberWithLetters() {
        assertFalse(telephoneService.isValidPhoneNumber("12345abcde"));
    }

    @Test
    public void testInvalidPhoneNumberTooShort() {
        assertFalse(telephoneService.isValidPhoneNumber("123456789"));
    }

    @Test
    public void testInvalidPhoneNumberTooLong() {
        assertFalse(telephoneService.isValidPhoneNumber("12345678901"));
    }

    @Test
    public void testNullPhoneNumber() {
        assertFalse(telephoneService.isValidPhoneNumber(null));
    }

}
