package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.LoanApproval;

public class BeforeAdvice {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		LoanApproval proxy=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		proxy=ctx.getBean("pfb", LoanApproval.class);
		System.out.println(proxy.LoanApproval(1001, 50000, "agriculcture"));
		System.out.println("----");
		System.out.println(proxy.LoanApproval(1002, 150000, "agriculcture"));
		((AbstractApplicationContext) ctx).close();
				

	}

}
