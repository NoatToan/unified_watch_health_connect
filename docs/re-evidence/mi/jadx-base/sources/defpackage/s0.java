package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class s0 {
    public static String a(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(al5.c(str), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(al5.c("00000000000000000000000000000000")));
        return al5.a(cipher.doFinal(str2.getBytes("UTF-8")));
    }

    public static String b() {
        try {
            byte[] bArr = new byte[16];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return al5.a(bArr);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
