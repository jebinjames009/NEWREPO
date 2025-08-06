package stringprogram;

public class Bufferbuilder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("call  me");
		System.out.println(sb);
		StringBuilder sbs = new StringBuilder ("hello");
		System.out.println(sbs);
       //insert()-Top insert a part element in a string, based on index
		System.out.println(sb.insert(5,"nature"));
		
	}

}
