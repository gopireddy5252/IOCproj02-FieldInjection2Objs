package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.appConfig.Config;
import com.nt.sbeans.FindDateNDTime;

public class AppLaunch {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		FindDateNDTime ft=ctx.getBean("DndT",FindDateNDTime.class);
			ft.finddateNDtime(); 
			ctx.close();
	}

}
