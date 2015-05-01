package AES;
import AES.LSLAESCrypto;
import AES.LSLAESCrypto.LSLAESCryptoMode;
import AES.LSLAESCrypto.LSLAESCryptoPad;
 
/** */
public class ExampleDecrypt {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(final String[] args) throws Exception {
		final String myKey = "1234567890ABCDEF0123456789ABCDEF";
		final String myIV = "89ABCDEF0123456789ABCDEF01234567";
		final String myMsg = "Mdn6jGTwRPMOKTYTTdDKGm9KScz26LIz96KVOGAeMw3hpwByPfa07PDRHxRW4TIh5dmu5LlhKpTQChi=";
 
		final LSLAESCrypto aes = new LSLAESCrypto(LSLAESCryptoMode.CFB,	LSLAESCryptoPad.NONE,128,myKey,myIV);
		System.out.println(aes.decrypt(myMsg));
	}
}