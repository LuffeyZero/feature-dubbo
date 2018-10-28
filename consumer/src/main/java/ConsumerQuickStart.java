import com.dubbo.test.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 消费者快速启动
 */
public class ConsumerQuickStart {
    /**
     * 消费者
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConsumer.xml");
        context.start();

        HelloService helloService = (HelloService)context.getBean("helloService");
        String tom = helloService.testHello("Tom");
        System.out.print(tom);
        // 线程阻塞，等待消费
        System.in.read();
    }
}
