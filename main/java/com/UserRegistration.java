package com;

import java.util.regex.Pattern;

public class UserRegistration {

    public String validFirstName(String fname) throws Exception
    {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        try
        {
            if(p.matcher(fname).matches())
                return "VALID";
        } catch (Exception e) {
            throw new InvalidException("Invalid First Name, try again");
        }
        return "INVALID";
    }

    public String validLastName(String lname) throws Exception
    {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        try
        {
            if(p.matcher(lname).matches())
                return "VALID";
        } catch (Exception e) {
            throw new InvalidException("Invalid Last Name, try again");
        }
        return "INVALID";
    }

    public String validEmailAddress(String email) throws Exception
    {
        String regex = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
        Pattern p = Pattern.compile(regex);
        try
        {
            if(p.matcher(email).matches())
                return "VALID";
        } catch (Exception e) {
            throw new InvalidException("Invalid Email address, try again");
        }
        return "INVALID";
    }

    public String validMobileNumber(String phno) throws Exception
    {
        String regex = "^(91){1}[ ][6-9]{1}[0-9]{9,9}$";
        Pattern p = Pattern.compile(regex);
        try
        {
            if(p.matcher(phno).matches())
                return "VALID";
        } catch (Exception e) {
            throw new InvalidException("Invalid Mobile Number, try again");
        }
        return "INVALID";
    }

    public String validPasswordRule1(String pswd) throws Exception
    {
        String regex = "^[a-zA-Z0-9@#!_]{8,}$";
        Pattern p = Pattern.compile(regex);
        try
        {
            if(p.matcher(pswd).matches())
                return "VALID";
        } catch(Exception e) {
            throw new InvalidException("Invalid Password, try again");
        }
        return "INVALID";
    }

    public String validPasswordRule2(String pswd) throws Exception
    {
        String regex = "^[a-zA-Z0-9@#!_][A-Z]{1}[a-zA-Z0-9@#!_]{7,}$";
        Pattern p = Pattern.compile(regex);
        try
        {
            if(p.matcher(pswd).matches())
                return "VALID";
        } catch(Exception e) {
            throw new InvalidException("Invalid Password, try again");
        }
        return "INVALID";
    }

    public String validPasswordRule3(String pswd) throws Exception
    {
        String regex = "^[a-zA-Z0-9@#!_]{6,}[A-Z]{1}[0-9]{1}[a-zA-Z0-9]$";
        Pattern p = Pattern.compile(regex);
        try
        {
            if(p.matcher(pswd).matches())
                return "VALID";
        } catch (Exception e) {
            throw new InvalidException("Invalid Password, try again");
        }
        return "INVALID";
    }

    public String validPasswordRule4(String pswd) throws Exception
    {
        String regex = "^[a-zA-Z0-9]{5,}[A-Z]{1}[0-9]{1}[@#!_]{1}[a-zA-Z0-9]$";
        Pattern p = Pattern.compile(regex);
        try
        {
            if(p.matcher(pswd).matches())
                return "VALID";
        } catch (Exception e) {
            throw new InvalidException("Invalid Password, try again");
        }
        return "INVALID";
    }
}
