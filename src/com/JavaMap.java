package com;

import java.util.Map;

import org.omg.CORBA.PUBLIC_MEMBER;

public class JavaMap {
	Map<String, String>myMap;
	
	public JavaMap(Map<String, String>myMap) {
		// TODO Auto-generated constructor stub
			
			this.myMap=myMap;
		
	}
	
	public boolean addToMap(String key, String value) {
		if(!this.myMap.containsKey(key)) {
			myMap.put(key, value);
			return true;
		}
		else return false;
	}
	public String retrieveFromMap(String key) {
		return myMap.get(key);
	}

}
