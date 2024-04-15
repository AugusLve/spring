import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.impl.StudentBeanService;

/**
 * @author Administrator
 * @date 2024/4/8 13:42
 * @description
 */

public class Test {


	public static void main(String[] args) {
			AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext("service");
			StudentBeanService studentBeanService = (StudentBeanService) annotationConfigApplicationContext.getBean("studentBeanService");
			System.out.println("----"+studentBeanService);
	}
}
