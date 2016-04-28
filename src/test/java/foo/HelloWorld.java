package foo;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.context.WebApplicationContext;

public class HelloWorld {
	@Test
	public void Hello() {
		final Logger logger = Logger.getLogger(HelloWorld.class);
		logger.info("Hello");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-context.xml"});
		Person p = ctx.getBean("person",Person.class);
		p.setName("wyw472231");
		p.info();
	}
}
