package ca.sait.services;

import ca.servlets.models.User;

/**
 *
 * @author RJ
 */
public class AccountService {
    public User Login(String username,String password){
        //if(username == null)
            //return null;
        
        if("abe".equals(username) && "password".equals(password)){
            User user = new User(username,password);
            return user;
        }else if("barb".equals(username) && "password".equals(password)){
            User user = new User(username,password);
            return user;
        } else{
            return null;
        }
    }
}
