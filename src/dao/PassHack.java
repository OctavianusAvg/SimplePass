package dao;


public class PassHack {
	static String great;
	static SimplePass sp = new SimplePass();
	static int end = (int)'9';
	static int start = (int)'0';
	static int maxLengtOfPass = 4;
	public static void main(String[] args) {
		sp.mainn();
		String s = "";
	n:	for(int p = 0 ; p < maxLengtOfPass ; p++) {
			
			while(s.length() < p + 1) {
				s = s + '0';
			}
			
			StringBuilder sb = new StringBuilder(s);
			char temp;
			for(int m = 0 ; m <= p  ; m++) {
					if(m != p && sb.charAt(m + 1)  < end ) {
					for(int i = 48; i <= (int)'9'; i++) {
						temp = sb.charAt(m);
						sb.setCharAt(p + 1, sb.charAt(p)++);
						if(checkpass(sb.toString())) {
							System.out.println("Passwor Found : " + sb.toString());
							break n;
							}
					}
					
				}
				char temp = sb.charAt(p);
				for(int i = 48; i <= (int)'9'; i++) {
					for(int f = 48; f <= (int)'9' ;f++ ) {
					sb.setCharAt(p + 1,temp++);
					if(checkpass(sb.toString())) {
						System.out.println("Passwor Found : " + sb.toString());
						break n;
						}
					
				
					}
				}
				
					
				
				
				}
			}
	
		
		
		}
  
	
	private static boolean checkpass(String pass){
		sp.jtf.setText(pass);
		sp.jbt.doClick();
		if(sp.jtf.getText().equalsIgnoreCase("APROVE")) {
			great = pass;
			 return true;
		}else {
			return false;
		}
	
	}

}

