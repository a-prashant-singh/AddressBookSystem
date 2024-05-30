import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Project . ");

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        String op;

        do {
            System.out.println("Press 1 for Adding Contact    ");
            System.out.println("Press 2 for Display Contact   ");
            System.out.println("Press 3 for Edit Contact      ");
            System.out.println("Press 4 for Delete contact    ");
            System.out.println("Press 5 for Exit              ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                addressBook.addContact();
            }
            if (choice == 2) {
                addressBook.displayContacts();
            }
            if (choice==3)
            {
                System.out.println("Enter the id for edit : ");
                int id= scanner.nextInt();
                addressBook.editContact(id);
            }
            if (choice==4)
            {
                System.out.println("Enter the id for delete : ");
                int id= scanner.nextInt();
                addressBook.deleteContact(id);
            }
            if (choice==5)
                break;
            System.out.println("Do you want to continue : (yes/no): ");
            op = scanner.next();
        } while (op.equalsIgnoreCase("yes"));
    }
}
