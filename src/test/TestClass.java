package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestClass {

    Class<?> clazz;

    @BeforeClass
    public void build() throws ClassNotFoundException {
        clazz = Class.forName("java.lang.String");
    }

    @Test
    public void classTest(){
        System.out.println(clazz.getCanonicalName());
    }
}
