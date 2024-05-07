package se.distansakademin.spring_security_cognito_240424.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import se.distansakademin.spring_security_cognito_240424.models.SignUpRequest;

import java.util.ArrayList;
import java.util.List;

    @Service
    public class UserService{


        public List<SignUpRequest> getAllUsers(){
            List<SignUpRequest> result = new  ArrayList<SignUpRequest>();
            SignUpRequest obj = new SignUpRequest();
            obj.setUsername("Hany");
            obj.setPassword("Blahablaha");
            obj.setEmail("GMAIL@GMAIL");

            result.add(obj);
            obj = new SignUpRequest();
            obj.setUsername("Adam");
            obj.setPassword("Blahablaha2");
            obj.setEmail("GMAIL@GMAIL2");

            result.add(obj);

            return result;

           // return getAllUsers();
        }
    }

