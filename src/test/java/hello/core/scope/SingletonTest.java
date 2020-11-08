package hello.core.scope;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SingletonTest {
    @Test
    void singletoneBeanFind(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SingletonBean.class);

        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
        System.out.println("SingletonBean1 = " + singletonBean1);
        System.out.println("SingletonBean1 = " + singletonBean2);
        Assertions.assertThat(singletonBean1).isSameAs(singletonBean2);
        context.close();

    }

    @Scope("singleton")
    static class SingletonBean {
        @PostConstruct
        public void init(){
            System.out.println("Singleton Bean init");
        }

        @PreDestroy
        public void destory(){
            System.out.println("Singletone Bean destroy");
        }
    }
}
