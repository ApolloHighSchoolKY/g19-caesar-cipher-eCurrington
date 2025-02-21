/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
    
	private int shift;

    public CaesarCipher() {

        alphabet = new char[26];
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<alphabetString.length(); i++) {
            alphabet[i] = alphabetString.charAt(i);
        }
        
        shifted = new char[alphabet.length];
        shift = 5;
        shifter(shift);

    }

    public CaesarCipher(int num){

        alphabet = new char[26];
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<alphabetString.length(); i++) {
            alphabet[i] = alphabetString.charAt(i);
        }
        shifted = new char[alphabet.length];
        shift = num;
        shifter(shift);
    
    }

    public String encrypt(String message){
        String encryption = "";
        boolean found = false;
        for(int i=0; i<message.length(); i++)
        {
            found = false;
            for(int j=0; j<alphabet.length; j++)
            {
                
                if(message.charAt(i) == alphabet[j])
                {
                    found = true;
                    encryption += shifted[j];
                }
                
            }

            if(found == false)
            encryption += message.charAt(i);
        }
        
        return encryption;
    }

    public String decrypt(String message){

        String decryption = "";
        boolean found = false;

        for(int i=0; i<message.length(); i++)
        {
            found = false;
            for(int j=0; j<shifted.length; j++)
            {
                
                if(message.charAt(i) == shifted[j])
                {
                    found = true;
                    decryption += alphabet[j];
                }
                
            }
            
            if(found == false)
            decryption += message.charAt(i);
        }
        
        return decryption;
    }

    public void shifter(int num)
    {
        
        for(int i=0; i<alphabet.length; i++)
        {
            if((i+num) >= alphabet.length)
                shifted[(i+num)-alphabet.length]=alphabet[i];
            else 
                shifted[i+num]=alphabet[i];
            
        }
        
        System.out.println("Alphabet: ");  
        for(int i=0; i<26; i++)
            System.out.print(alphabet[i]);

        System.out.println("\n");

        System.out.println("Shifted: "); 
        for(int i=0; i<26; i++)
            System.out.print(shifted[i]);

        System.out.println("\n");
        
            
       
    }

}
