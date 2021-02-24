import java.util.*;
public class StringEx {

	public static void main(String[] args) {
		/*String s="MISSISSIPPI";
		int i=0;
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)=='I')
				i++;
		}
		System.out.println(i);
		s="(a+b)*c(d-c)";
		
		List<Character> c=new ArrayList<>();
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)=='(') {
			try {
				c.add(s.charAt(j+1));
			}
			catch(Exception e) {
				break;
			}
		}}
		System.out.println(c);
		
		s="Hello hi. how are you. i am fine .";
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken("."));
		}
		
		String sa[]=s.split("[.]");

		for (String j:sa) {
			String[] j1=j.split(" ");
			for(String j2:j1) {
				System.out.println(j2);
			}
		}
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)!='.') {
				if(s.charAt(j)!=' ') {
					System.out.print(s.charAt(j));
				}
				else {
					System.out.println("");
				}
			}
		}
		
		for(int j=0;j<s.length();j++) {
			System.out.println(s.charAt(j));
			if(s.charAt(j)=='.')
				break;
		}
		
		s="it is a good bat, it has 7 grains";
		String[] s1=s.split(" ");
		System.out.println("Enter word to search");
		Scanner sc=new Scanner(System.in);
		String s2=sc.nextLine();
		int c1=0;
		for(String j:s1) {
			if(j.equals(s2)) {
				c1+=1;
			}
		}
		System.out.println(c1);
		System.out.println("Enter your mail");
		s2=sc.nextLine();
		if(s2.contains("@")) {
			System.out.println("Correct Email");
		}
		else {
			System.out.println("Incorrect mail id");
		}
		/*s=new String("true");
		String s3=s.intern();
		System.out.println(s==s3);
		*/
		StringBuffer s=new StringBuffer("(((AAA((AA)))))");
		s.replace(6,13,"{BB}");
		System.out.println(s);
		s=new StringBuffer("MADAM");
		StringBuffer s1=new StringBuffer(s);
		s.reverse();
		if(s.equals(s1)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		s=new StringBuffer("CDE201J012");
		char a[]=new char[4];
		int b[]=new int[6];
		int j=0,k=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				a[j++]=s.charAt(i);
			}
			if(Character.isDigit(s.charAt(i))) {
				b[k++]=Integer.parseInt(s.charAt(i)+"");
			}
		}
		for(char c:a) {
			System.out.println(c);
		}
		for(int i:b) {
			System.out.println(i);
		}
		s=new StringBuffer("cure");
		StringBuffer s3=new StringBuffer("Cuery P");
		if(s.length()==s3.length()) {
			System.out.println(""+s+s3);
		}
		else if(s.length()<s3.length()){
			System.out.println(""+s+s3.substring(0,s.length()));
		}
		else {
			System.out.println(""+s.substring(0,s3.length())+s3);
			
		}
	}

}
