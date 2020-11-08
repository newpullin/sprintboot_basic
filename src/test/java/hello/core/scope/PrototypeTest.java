package hello.core.scope;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PrototypeTest {
    @Test
    void prototypeBeanFind() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrototypeBean.class);

        System.out.println("find p1");
        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        System.out.println("find p2");
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        System.out.println("SingletonBean1 = " + prototypeBean1);
        System.out.println("SingletonBean1 = " + prototypeBean2);
        Assertions.assertThat(prototypeBean1).isNotSameAs(prototypeBean2);
        context.close();
    }

    @Scope("prototype")
    static class PrototypeBean {
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


