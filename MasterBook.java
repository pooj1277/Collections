package com.bridgelabz.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MasterBook {

	Scanner scanner = new Scanner(System.in);
	HashMap<String, AddressBook> masterBook = new HashMap<>();

	public static void main(String[] args) {
		MasterBook masterBook = new MasterBook();
		masterBook.mainMenuMasterBook();
	}

	public void mainMenuMasterBook() {
		boolean option = false;
		int choice = 1;
		printDetails();
		while (!option) {
			System.out.println("Enter Your Choice : ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				printDetails();
				break;
			case 2:
				addAddressBook();
				break;
			case 3:
				addContactsInAddressBook();
				break;
			case 4:
				option = true;
			}
		}
	}

	public void printDetails() {
		System.out.println("Welcome to the Master Book.");
		System.out.println("Press : ");
		System.out.println("\t 1. Print Menu Again.");
		System.out.println("\t 2. Add New Address Book to the Master Book");
		System.out.println("\t 3. Add contact in the Existing Address Book");
		System.out.println("\t 4. Exit");
	}

	public void addAddressBook() {
		System.out.println("Enter the Name of the City for which you want to add Address Book: ");
		String cityName = scanner.nextLine();
		masterBook.put(cityName, new AddressBook());
	}

	public void addContactsInAddressBook() {
		System.out.println("Enter the name of address Book in which you want to add contact : ");
		String addressBookName = scanner.nextLine();
		if (masterBook.get(addressBookName) == null) {
			System.out.println("Address Book Not Exist. Create new Address Book.");
		} else {
			masterBook.get(addressBookName).mainMenuAddressBook();
		}
	}
}