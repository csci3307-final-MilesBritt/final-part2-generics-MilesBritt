/**
 * 
 */
package com.mycompany.part2.section2;

/**
 * @author Miles
 *
 */
public class MainEntry 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		MyGenInterface<Integer, String> mgi1 = new MyGenClass<Integer, String>(1, "Miles Britt");
		MyGenInterface<Integer, Integer> mgi2 = new MyGenClass<Integer, Integer>(1, 2017);
		
		Integer i1 = MyRegularClass.getSum(10, 20);
		Float f1 = MyRegularClass.getSum(100f, 200f);
		
		System.out.printf("This is the key of mgi1: %d.%nThis is the value of mgi1: %s.%n" , 
				mgi1.getKey() , mgi1.getValue());
		System.out.printf("This is the key of mgi2: %d.%nThis is the value of mgi2: %s.%n" , 
				mgi2.getKey() , mgi2.getValue());
		
		System.out.println("This is i1: " + i1);
		System.out.println("This is f1: " + f1);
		
	}

}
