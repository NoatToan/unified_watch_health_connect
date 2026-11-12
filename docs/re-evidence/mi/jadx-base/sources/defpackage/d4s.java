package defpackage;

import com.miui.tsmclient.common.util.Coder;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class d4s {
    public static String a(String str, String str2) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        byte[] bArrDecodeBase64Bytes = Coder.decodeBase64Bytes(str);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str2.getBytes("UTF-8"))), new IvParameterSpec(str2.getBytes("UTF-8")));
        return new String(cipher.doFinal(bArrDecodeBase64Bytes));
    }

    public static String b(String str, String str2) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(1, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str2.getBytes("UTF-8"))), new IvParameterSpec(str2.getBytes("UTF-8")));
        return Coder.encodeBase64NoWrap(cipher.doFinal(str.getBytes("UTF-8")));
    }
}
