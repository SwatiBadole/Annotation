package com.bridgelabz.Annotation;

@FunctionalInterface //it will give compile time error
interface Abc{
	void show();
	//void uu();
}
class A{
	public void showMyDatafromLastYearDatabase() {
		System.out.println("in A");
	}
}
class B extends A{

	@Deprecated //don't use this method this method for available for you but can use for
	public void show() {
		
	}
	@Override  //it check the compile time 
	           //it will check name of the method
	           //it will comment for other programmers
	
	public void showMyDatafromLastYearDatabase(){
		System.out.println("In B");
	}
}


public class Annotation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 B obj=new B();
	        obj.showMyDatafromLastYearDatabase();
	        obj.show();
		
	}

}
