package test;

import org.testng.Assert;
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
        Assert.assertEquals(clazz.getCanonicalName(), "java.lang.String", "Error: class is not String.");
    }
}
