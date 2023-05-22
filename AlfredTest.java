package Alfred;

public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes Alfred = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = Alfred.basicGreeting();
        String testGuestGreeting = Alfred.guestGreeting("Beth Kane");
        String testDateAnnouncement = Alfred.dateAnnouncement();
        
        String alexisTest = Alfred.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );
        String alfredTest = Alfred.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = Alfred.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );
        
        // Print the greetings to test.
        System.out.println(testGreeting);
        
      
       System.out.println(testGuestGreeting);
       System.out.println(testDateAnnouncement);
     System.out.println(alexisTest);
        System.out.println(alfredTest);
       System.out.println(notRelevantTest);
    }
}
