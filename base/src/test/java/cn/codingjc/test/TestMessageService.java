package cn.codingjc.test;

import cn.codingjc.service.IMessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @ContextConfiguration
 * spring配置文件的加载
 *
 * @author codingjc
 * @date 2022-06-27 23:32
 */

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"}) // 定义XML配置文件
@ExtendWith(SpringExtension.class) // 表示此时使用外部的测试工具（JUnit5）
public class TestMessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestMessageService.class);

    @Autowired
    private IMessageService messageService; // 要使用的业务接口

    @Test
    public void test1(){
        System.out.println(messageService.echo("Hello,Test"));
        LOGGER.info("11");
        LOGGER.error("11");
        LOGGER.debug("11");

    }
}
