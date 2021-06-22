package testcases;

import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest {
    @Test
    public void loginSuccess(){
        System.out.println("登录成功");
		Assert.assertEquals("10","11");
    }
}
