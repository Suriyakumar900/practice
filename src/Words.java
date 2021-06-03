
public class Words {
	
	public static void main(String[] args) {
		String value = "akash kumar";
		
		String ee = value.replaceAll("akash","surya");
		System.out.println(ee);
		
	boolean a =value.startsWith("a");
	System.out.println(a);
	
	boolean b = value.endsWith("r");
	System.out.println(b);
	
	int c = value.length();
	System.out.println(c);
	
	int d = value.indexOf('k');
	System.out.println(d);
	
	int e = value.lastIndexOf('a');
	System.out.println(e);
	
	boolean f = value.contains("sh");
	System.out.println(f);
	
	String[] g = value.split(" ");
	System.out.println(g[0]);
	System.out.println(g[1]);
	
	boolean h = g[0].startsWith("a");
	System.out.println(h);
	
	String valueCapital = "AKASH KUMAR";
	boolean i = valueCapital.equals(value);
	System.out.println(i);
	
	boolean j = value.equalsIgnoreCase(valueCapital);
	System.out.println(j);
	
	String value1 = "suriya";
	String k = value.replace('a', 'b');
	System.out.println(k);
	
	String l = value.replaceAll(value, value1);
	System.out.println(l);
	
	String m = value.substring(2, 8);
	System.out.println(m);
	
	char n = value.charAt(7);
	System.out.println(n);
	
	String o = value.toUpperCase();
	System.out.println(o);
	
	String p = value.toLowerCase();
	System.out.println(p);
	
	String q = value.trim();
	System.out.println(q);
	
	int r = 20;
	String s = String.valueOf(r);
	System.out.println(s);
	
	String t = "karthi20@40";
	String[] u = t.split("@");
    int v = t.indexOf('2');
    int w = t.indexOf('@');
    String x = t.substring(v,w);
    
    int oo = Integer.parseInt(u[1]);
    int o1 = Integer.parseInt(x);
    int o2 = oo+o1;
    System.out.println(o2);
                           
    String t1 = "karthik20@40";
	String[] u1 = t1.split("@");
    String [] w1 = u1[0].split("k");
    int e1 = Integer.parseInt(w1[1]);
    int e2 = Integer.parseInt(u1[0]);
    
    int e3 = e1+e2;
    System.out.println(e3);
    
	
	
	
	
	
	
	}

}