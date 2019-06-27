
package blocktest;
import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 
  
// Java program to calculate SHA hash value 
  
class sha2 { 
	
	
 
    public static String getSHA(String input) 
    {
    	try {
    		MessageDigest digest = MessageDigest.getInstance("SHA-256");
    		
    		byte[] messageDigest = digest.digest(input.getBytes()); 
    		
    		StringBuffer heaxadecimalString= new StringBuffer();
    		
    		System.out.println("dd-"+messageDigest);
    		
    		for(int i=0;i< messageDigest.length;i++) {
    			String heaxa =Integer.toHexString(0xff & messageDigest[i]);
    			
    			if(heaxa.length()==1)
    				heaxadecimalString.append("0");
    			System.out.println("ddd-"+heaxa);
    			
    			heaxadecimalString.append(heaxa);
    		}
    		return heaxadecimalString.toString();
    	}
    	catch(Exception e) {
    		
    	}
		return input; 
    	
    }
   
    // Driver code 
    public static void main(String args[]) throws NoSuchAlgorithmException 
    { 
    	
    	String s1 = "a"; 
        System.out.println("\n" + s1 + " : " + getSHA(s1)); 
       
    } 
    
   
} 