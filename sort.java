import java.io.*;
import java.util.*;
public class sort
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
Set<Character> a = new HashSet<Character>();
String n=in.nextLine();
int len=n.length();
char[] ab=n.toCharArray();
for(int i=0;i<len;i++)
a.add(ab[i]);
for(char c : a)
System.out.println(c);
		

	}
}