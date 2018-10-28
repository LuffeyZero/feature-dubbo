import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderQuickStart {
    /**
     * 提供者启动
     * @param args
     */
    public static void main(String[] args)throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationProvider.xml");

        context.start();
        // 提供者持续等待
        System.in.read();
    }
}
