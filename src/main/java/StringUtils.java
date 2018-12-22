import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringUtils {


    public static String ChangeCode(String s, Charset encode , Charset decode ) {
        byte[] sBytes = s.getBytes(encode);
        return new String(sBytes,decode);
    }



}
