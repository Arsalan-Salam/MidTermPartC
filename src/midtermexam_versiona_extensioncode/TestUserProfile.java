package midtermexam_versiona_extensioncode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arsal
 */

import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        UserProfile newUser = new UserProfile("","");
        System.out.print("Please enter a new use Id: ");
        String newId = input.nextLine();
        System.out.print("Please select one of the following genre of Drama, Comedy, Action or Mystery: ");
        String newGenre = input.nextLine();
        newUser.setUserID(newId);
        newUser.setGenre(newGenre);
        System.out.println("New user has been created with ID of " + newUser.getUserID() + " and favourite genre of " + newUser.getGenre());
    }
}
