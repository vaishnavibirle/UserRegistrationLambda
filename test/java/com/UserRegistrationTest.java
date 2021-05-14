package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_whenMin3Chars_FirstCharCaps_ReturnValid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validFirstName("Vaishnavi");
        Assertions.assertEquals("VALID", result);
    }

    @Test
    public void givenFirstName_whenMin3Chars_FirstCharNotCaps_ReturnInvalid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validFirstName("vaishnavi");
        Assertions.assertEquals("INVALID", result);
    }

    @Test
    public void givenLastName_whenMin3Chars_FirstCharCaps_ReturnValid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validLastName("Birle");
        Assertions.assertEquals("VALID", result);
    }

    @Test
    public void givenLastName_whenMin3Chars_FirstCharNotCaps_ReturnInvalid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validLastName("birle");
        Assertions.assertEquals("INVALID", result);
    }

    @Test
    public void givenEmail_withOnlyMandatoryPart_ReturnValid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validEmailAddress("abc@bl.co");
        Assertions.assertEquals("VALID", result);
    }

    @Test
    public void givenEmail_withMandatoryAndOptionalPart_ReturnValid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validEmailAddress("abc.xyz@bl.co.in");
        Assertions.assertEquals("VALID", result);
    }

    @Test
    public void givenPhno_startWithCountryCode_FollowedBySpace_AndHas10digits_ReturnValid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validMobileNumber("91 7098654321");
        Assertions.assertEquals("VALID", result);
    }

    @Test
    public void givenPhno_startWithCountryCode_NoSpace_AndHas10digits_ReturnInvalid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validMobileNumber("917098654321");
        Assertions.assertEquals("INVALID", result);
    }

    @Test
    public void givenPassword_whenMin8Chars_ReturnValid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validPasswordRule1("as_Df@gh");
        Assertions.assertEquals("VALID", result);
    }

    @Test
    public void givenPassword_whenLessThan8Chars_ReturnInvalid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validPasswordRule1("as_Df@g");
        Assertions.assertEquals("INVALID", result);
    }

    @Test
    public void givenPassword_whenMin8Chars_AtleastOneUppercase_ReturnValid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validPasswordRule2("as5Df@gh");
        Assertions.assertEquals("VALID", result);
    }

    @Test
    public void givenPassword_whenMin8Chars_NoUppercase_ReturnInvalid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validPasswordRule2("as_df@gh");
        Assertions.assertEquals("INVALID", result);
    }

    @Test
    public void givenPassword_whenMin8Chars_AtleastOneNumeric_AtleastOneUppercase_ReturnValid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validPasswordRule3("as4@dFg!");
        Assertions.assertEquals("VALID", result);
    }

    @Test
    public void givenPassword_whenMin8Chars_NoNumeric_AtleastOneUppercase_ReturnInvalid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validPasswordRule3("asDf@gh#");
        Assertions.assertEquals("INVALID", result);
    }

    @Test
    public void givenPassword_whenMin8Chars_AtleastOneNumeric_AtleastOneUppercase_ExactlyOneSpecialChar_ReturnValid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validPasswordRule4("as4@dFgh");
        Assertions.assertEquals("VALID", result);
    }

    @Test
    public void givenPassword_whenMin8Chars_AtleastOneNumeric_AtleastOneUppercase_NoSpecialChar_ReturnInvalid() throws Exception {
        UserRegistration u = new UserRegistration();
        String result = u.validPasswordRule4("as4DdFghj");
        Assertions.assertEquals("INVALID", result);
    }


}
