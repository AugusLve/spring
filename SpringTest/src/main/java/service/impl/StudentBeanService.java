package service.impl;

import org.springframework.stereotype.Service;
import service.BeanService;

/**
 * @author Administrator
 * @date 2024/4/8 13:38
 * @description
 */
@Service
public class StudentBeanService implements BeanService {
	@Override
	public void printName(String name) {
		System.out.println(name);
	}
}
