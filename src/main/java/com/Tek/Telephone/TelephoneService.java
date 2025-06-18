package com.Tek.Telephone;

public class TelephoneService {
	public boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) {
            return false;
        }
        // Basic validation: Phone number should be 10 digits
        return phoneNumber.matches("\\d{10}");
    }
}
