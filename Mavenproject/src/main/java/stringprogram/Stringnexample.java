package stringprogram;

public class Stringnexample {

	public static void main(String[] args) {
	String a = "hello";
	System.out.println(a);
	
	String c = new String ("hi");
	System.out.println(c);
	//length()-its returns the size of the length
	System.out.println(a.length());
	//charAt()-return charcter based on index
	System.out.println(a.charAt(3));
	//concat()-add the 2 strings
	System.out.println(a.concat(c));
	//contains()-it check character in the string
	String name="this is new method";
	System.out.println(name.contains("new"));
	System.out.println(name.contains("special"));
	System.out.println(a.contains(c));
	//touppercase()-to convert small letter to capital letter
	System.out.println(a.toUpperCase());
	//tolowercase()-to capital letter to small letter
	System.out.println(a.toLowerCase());
	//equals()-
	String f="java";
	String g="java";
	String h="Java";
	String k="selinium";
	System.out.println(f.equals(g));
	System.out.println(f.equals(h));
	System.out.println(f.equals(k));
	//equalsIgnorecase()-
	System.out.println(f.equalsIgnoreCase(h));
	System.out.println(f==g);
	String j = new String("java");
	System.out.println(f==j);  // for different memory location
	System.out.println(f.equals(j)); // content is same
	//isempty()-to check weather an string is empty or not
	System.out.println(f.isEmpty());
	String u="";
	System.out.println(u.isEmpty());
	//trim()-to remove white space
	String l=" i can take";
	System.out.println(l.trim().replaceAll(" ","" ));
	//substring()-extract the string based on index
    System.out.println(name.substring(0, 7));
    //valueof()-to covert any data type to string
    int z=55;
    System.out.println(String.valueOf(z));
	

	}

}
