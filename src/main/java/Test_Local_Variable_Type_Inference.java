// package com.test.java10.feature_01.Local_Variable_Type_Inference;

import java.util.ArrayList;
import java.util.List;

public class Test_Local_Variable_Type_Inference {

	public static void main(String[] args) {

		int rollNo = 123;
		System.out.println("Roll No : " + rollNo);
		
		var rollNoVar = 123;
		System.out.println("RollNo (var) : " + rollNoVar);
		
		
		String name = "Rahamath S";
		System.out.println("Name : " + name);

		var nameVar = "Rahamathullah S";
		System.out.println("Name (var) : " + nameVar);
		
		int[] iArr = new int[] {1,2,3,4,5};
		for (int i = 0; i < iArr.length; i++) {
			System.out.println("No# : " + iArr[i]);
		}
		
		var iArrVar = new int[] {1,2,3,4,5};
		for (var i = 0; i < iArrVar.length; i++) {
			System.out.println("No# (var) : " + iArrVar[i]);
		}
		
		List<String> aList = new ArrayList<String>();
		aList.add("India");
		aList.add("USA");
		System.out.println("aList : " + aList);

		List<String> aList_9 = List.of("Apple","Orange"); // Java 9
		System.out.println("aList_9 : " + aList_9);

		var aListVar = List.of("Banana","Carrot"); // Java 10
		System.out.println("aListVar (var) : " + aListVar);

		for (var fruit : aListVar) {
			System.out.println("Fruit Name (var) : " + fruit);
		}				
		
	}
}

/*

Output of the above prog

Roll No : 123
RollNo (var) : 123
Name : Rahamath S
Name (var) : Rahamathullah S
No# : 1
No# : 2
No# : 3
No# : 4
No# : 5
No# (var) : 1
No# (var) : 2
No# (var) : 3
No# (var) : 4
No# (var) : 5
aList : [India, USA]
aList_9 : [Apple, Orange]
aListVar (var) : [Banana, Carrot]
Fruit Name (var) : Banana
Fruit Name (var) : Carrot

*/