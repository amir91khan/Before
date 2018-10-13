package com.nt.advice;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class LoanAuditingAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Target class name:"+target.getClass());
		String auditLogMsg=null;
		FileWriter writer=null;
		System.out.println("Target method name:"+method.getName());
		System.out.println("Target method args:"+Arrays.toString(args));
		if((Integer) args[0]<0) {
			args[0]=((Integer)args[0])*-1;
		}
		auditLogMsg=args[0]+"Loan id has come for approval amount"+args[2]+" to the manager"+args[1]+" on Date:: "+new Date()+"\n";
		writer =new FileWriter("D:\\AuditLog.txt",true);
		writer.flush();
		writer.close();

	}

}
