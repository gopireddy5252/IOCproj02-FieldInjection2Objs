package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("DndT")
public class FindDateNDTime {
	
	// this is field injection
//	@Autowired// field injection
//	private LocalDate ld;
//	
//	@Autowired
//	private LocalTime lt;
//	
	private LocalDate ld;
	private LocalTime lt;
	//Zero Param argrument contructor is required without this constructor we can not
	// create bean class objects, if u dont give constructor it will give automatically
	public FindDateNDTime()
	{
		System.out.println("0-param argument constuctor");// systrace ctrl+space
	}
	
	
//	public void finddateNDtime()
//	{
//		System.out.println(ld);
//		System.out.println(lt);
//	}
	
	
	// now i am using constructor injection
	@Autowired
	public FindDateNDTime(LocalDate ld, LocalTime lt) {
		this.ld = ld;
		this.lt = lt;
	}
	public void finddateNDtime()
	{
		System.out.println(ld);
		System.out.println(lt);
	}
	
	
}
