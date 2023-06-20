/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author vaibh
 */
public class TestUserprofile {


    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
   
        // Get the user's name
        System.out.print("Enter userID: ");
        String userId = input.nextLine();

                
        // Display the list of possible genres
        System.out.println("Choose your favorite genre: Comedy, Drama, Action, Mystery");
        String genre = input.nextLine();

        UserProfile user1 = new UserProfile(userId, genre);
        System.out.println("userProfile is created. userID: " + user1.getUserID() + " And Genre: " + user1.getGenre());
    }

  
    
}









