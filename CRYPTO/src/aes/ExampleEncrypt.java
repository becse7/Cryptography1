
package AES;
import AES.LSLAESCrypto;
import AES.LSLAESCrypto.LSLAESCryptoMode;
import AES.LSLAESCrypto.LSLAESCryptoPad;

/** */
public class ExampleEncrypt {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(final String[] args) throws Exception {
		final String myKey = "1234567890ABCDEF0123456789ABCDEF";
		final String myIV = "89ABCDEF0123456789ABCDEF01234567";

		final String myMsg = "Hello world! I am a lovely message waiting to be encrypted!";



 
		final LSLAESCrypto aes = new LSLAESCrypto(LSLAESCryptoMode.CFB,LSLAESCryptoPad.NONE,128,myKey,myIV);


		String g=aes.encrypt(myMsg);

		System.out.println(g);

		final LSLAESCrypto aes1 = new LSLAESCrypto(LSLAESCryptoMode.CFB,LSLAESCryptoPad.NONE,128,myKey,myIV);
		
		String g1=aes1.decrypt(g);

		System.out.println(g1);


	}
}