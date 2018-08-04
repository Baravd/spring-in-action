package tutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import tutorial.model.Knight;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();


    }

}
