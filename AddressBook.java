
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contacts;
    Scanner scanner = new Scanner(System.in);

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact() {
        System.out.println("Enter contact details:");
        System.out.print("Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("ZIP: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(id, firstName, lastName, address, city, state, zip, phoneNumber, email);
        contacts.add(contact);
    }


    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void editContact(int id ) {
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("ZIP: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact ncontact = new Contact(id, firstName, lastName, address, city, state, zip, phoneNumber, email);
      //  contacts.add(contact);
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getId()==id) {
                contacts.set(i, ncontact);
                return;
            }
        }
    }

    public void deleteContact(int id) {
        contacts.removeIf(contact -> contact.getId()==id);
    }

}

