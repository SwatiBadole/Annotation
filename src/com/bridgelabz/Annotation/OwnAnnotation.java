package com.bridgelabz.Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Markup Annotation:don't have any variable
//single value annotation
//Multivalue annotation

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//create annotation
@interface SmartPhone{
	 String os() default "symbion";
	 
	 int version()default 1;
}

@SmartPhone//(os="Android",version=6)
class NokiaASeries{
	String model;
	int Size;
	public NokiaASeries(String model, int size) {
		
		this.model = model;
		Size = size;
	}
	
}
public class OwnAnnotation {

	public static void main(String[] args) {
		
       NokiaASeries obj=new NokiaASeries("fire", 5);
       Class c =obj.getClass();
       Annotation an=c.getAnnotation(SmartPhone.class);
       SmartPhone s=(SmartPhone)an;
       System.out.println(s.os());
       }

}
