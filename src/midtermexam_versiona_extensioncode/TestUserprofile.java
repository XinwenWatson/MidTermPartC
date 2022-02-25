package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        /*The user will enter their name and choose their favourite Genre 
        from a displayed list of the possible Genres. The user will 
        then see a message that their userProfile was created. */
        String[] genreList = {"Comedy", "Drama", "Action", "Mystery"};
        
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String nameID=input.next();
        
        System.out.println("list of the possible Genres: ");
        for(int i=0; i<genreList.length; i++){
            System.out.print(i+1+". "+genreList[i]+", ");
        }
        System.out.print("\nPlease choose your favourite Genre from list above(No. 1~4): ");
        int genreNo=input.nextInt();
        
        UserProfile user1=new UserProfile(nameID, genreList[genreNo-1]);
        System.out.println("your userProfile was created.");
        System.out.println("UserID:"+user1.getUserID()+", favourite Genre: "+user1.getGenre());
    }

}
