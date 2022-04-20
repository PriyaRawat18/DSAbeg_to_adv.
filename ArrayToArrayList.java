//Using Arrays.asList() Method :

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListExample 
{  	
	public static void main(String[] args) 
	{	
		String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
		
		System.out.println(list);
	}	
}

//Output :

//[ANDROID, JSP, JAVA, STRUTS, HADOOP, JSF]

//Using Collections.addAll() Method

import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayToArrayListExample 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        ArrayList<String> list = new ArrayList<String>();
         
        Collections.addAll(list, array);
         
        System.out.println(list);
    }   
}
//Output :

//[ANDROID, JSP, JAVA, STRUTS, HADOOP, JSF]



//Using ArrayList.addAll() Method :


import java.util.ArrayList;
import java.util.Arrays;
 
public class ArrayToArrayListExample 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        ArrayList<String> list = new ArrayList<String>();
         
        list.addAll(Arrays.asList(array));
         
        System.out.println(list);
    }   
}


//Using Streams from Java 8


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class ArrayToArrayListExample 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        List<Object> list = Arrays.stream(array).collect(Collectors.toList());
         
        System.out.println(list);
    }   
}



//ArrayList To Array In Java :

import java.util.ArrayList;
 
public class ArrayListToArrayExample 
{   
    public static void main(String[] args) 
    {   
        ArrayList<String> list = new ArrayList<String>();
         
        list.add("JAVA");
         
        list.add("JSP");
         
        list.add("ANDROID");
         
        list.add("STRUTS");
         
        list.add("HADOOP");
         
        list.add("JSF");
         
        String[] array = new String[list.size()]; 
         
        list.toArray(array);
         
        for (String string : array)
        {
            System.out.println(string);
        }
    }   
}
Output :

JAVA
JSP
ANDROID
STRUTS
HADOOP
JSF
