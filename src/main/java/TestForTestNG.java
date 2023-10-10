import org.testng.annotations.Test;

public class TestForTestNG {
    @Test(priority = 3)
    public void SysOut1(){
        System.out.println("SysOut 1 LP");
    }
    @Test(priority = 2)
    public void SysOut2(){
        System.out.println("SysOut 2 MP");
    }
    @Test(priority = 1)
    public void SysOut3(){
        System.out.println("SysOut 3 HP");
    }
}
