import java.util.*;

public class FirstRepeated{
public static void main(String[] args){
	String s1 = "abacdee";
	System.out.println(firstRepeatedChar(s1));
}
public static char firstRepeatedChar(String str){
		//Using for Loops
//	
//	for(int i=0;i<str.length()-1;i++){
//	char first = str.charAt(i);
//	for(int j=i+1;j<str.length();j++){
//		if(first == str.charAt(j)){
//			return first;
//		}
//}	
//}
//	return 0;

	HashSet<Character> bin = new HashSet<Character>();
	for(int i=0;i<str.length();i++){
		char c = str.charAt(i);
		if(bin.contains(c)){
			return c;
		}else{
			bin.add(c);
}
}
	return '\0';
}
}