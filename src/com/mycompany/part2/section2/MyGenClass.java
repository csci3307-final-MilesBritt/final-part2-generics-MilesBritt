/**
 * 
 */
package com.mycompany.part2.section2;

/**
 * @author Miles
 *
 */
public class MyGenClass<K, V> implements MyGenInterface<K, V> 
{
	private K Key;
	private V Value;

	public MyGenClass(K _key, V _value)
	{
		Key = _key;
		Value = _value;
	}

	public K getKey() 
	{
		return Key;
	}

	public V getValue() 
	{
		return Value;
	}
	
}
