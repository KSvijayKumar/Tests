package com.dummytest.TestData;

//import org.omg.CORBA.Object;
import org.testng.annotations.DataProvider;

public class TocData {

    @DataProvider
    public static Object[][] SetTestData(){


        return new Object[][]{
                {"Inverness","Glasgow","vijay.kumar@thetrainline.com","password1","111"},
                {"Inverness","Glasgow","vijay.kumar@thetrainline.com","password1","1111"}
        };
    }


}
