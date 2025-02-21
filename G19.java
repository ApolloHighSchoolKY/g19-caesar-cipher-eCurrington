/**
 * @(#)G19.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class G19 {

    public static void main(String[] args) {

		System.out.println("\n");
    	CaesarCipher cipher = new CaesarCipher(4);


		
		
    	System.out.println("Encrypt 1: " + cipher.encrypt("hello world!"));
    	System.out.println("Decrypt 1: " + cipher.decrypt("ukq zez ep!"));
		System.out.println("\n");
    	//Create a new cipher using the shifter(#) method
    	//Encrypt and decrypt a message with your new cipher

		System.out.println("Encrypt 2: " + cipher.encrypt("insert cool message"));
    	System.out.println("Decrypt 2: " + cipher.decrypt("e zkjp hega pdeo"));
    }


}