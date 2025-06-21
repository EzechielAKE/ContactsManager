public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        // Création et ajout de 5 contacts
        Contact c1 = new Contact();
        c1.name = "Alice";
        c1.phoneNumber = "123-456-7890";
        myContactsManager.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Bob";
        c2.phoneNumber = "987-654-3210";
        myContactsManager.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "Charlie";
        c3.phoneNumber = "555-555-5555";
        myContactsManager.addContact(c3);

        Contact c4 = new Contact();
        c4.name = "Diane";
        c4.phoneNumber = "111-222-3333";
        myContactsManager.addContact(c4);

        Contact c5 = new Contact();
        c5.name = "Emma";
        c5.phoneNumber = "444-444-4444";
        myContactsManager.addContact(c5);

        // Recherche d'un contact
        Contact result = myContactsManager.searchContact("Diane");

        if (result != null) {
            System.out.println("Numéro de Diane : " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
