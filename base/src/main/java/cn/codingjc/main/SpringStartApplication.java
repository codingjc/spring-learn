package cn.codingjc.main;

import cn.codingjc.service.IMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring容器启动类
 * @author codingjc
 * @date 2022-06-19 10:02
 */
public class SpringStartApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-base.xml");
        IMessageService messageService = applicationContext.getBean("MessageService", IMessageService.class);
        System.out.println(messageService.echo("Spring"));

    }
}
