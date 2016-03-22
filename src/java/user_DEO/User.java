/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_DEO;

/**
 *
 * @author tommyacton
 */
public class User {
    
    private String firstName;   // User FirstName 
    private String lastName;    // User LastName 
    private String email;       // User's email 
    private String password;    // User password 
    
    // The default constructor 
    public User(){
    }
    
    // The constructor with parameters for normal users 
    public User(String fName, String lName, String userEmail, String pwd){
        super();
        this.firstName = fName;
        this.lastName  = lName;
        this.email = userEmail;
        this.password = pwd;
        
    }
    
    
    //Constructor for admins 
    public User(String adminEmail, String adminPassword){
        this.email = adminEmail;
        this.password = adminPassword;
    }
    
    //Setting first Name 
    public void setFirstName(){
        this.firstName = firstName;
    }
    
    //Setting last Name 
    public void setlastName(){
        this.lastName = lastName;
    }
    
       
    //Setting last Name 
    public void setEmail(){
        this.email = email;
    }

   public void setPassword(){
       this.password = password;
   }
   
   //Get First Name 
   public String getFirstName(){
       return firstName;
   }
   // Get Last name 
    public String getLastName(){
       return lastName;
   }
   
    //get email 
    public String getEmail(){
        return email;
    }
    
    //Get password 
    public String getPassword(){
        return password;
    }
    
}
