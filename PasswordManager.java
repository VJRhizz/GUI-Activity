/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Prog;

/**
 *
 * @author chokodoy
 */
public class PasswordManager {
    private String password;
    public PasswordManager() {
        this.password = "1234"; 
    }
    public void resetPassword() {
        password = "1234";
       
    }
    
   
     public boolean changePassword(String oldPassword, String newPassword) {
        if (!password.equals(oldPassword)) {
           
            return false;
        } else if (newPassword == null || newPassword.isEmpty()) {
           
            return false;
        } else{
        password = newPassword;
       
        return true;
     }
     }
   
    public boolean login(String inputPassword) {
        if (password.equals(inputPassword)) {
         
            return true;
        } else {
            
            return false;
        }
    }
}