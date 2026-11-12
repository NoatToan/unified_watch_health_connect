package defpackage;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class nm {
    public static String e = "DESede/CBC/PKCS5Padding";

    public static byte[] b(String str, byte[] bArr, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance(e);
            cipher.init(2, secretKeySpec, new IvParameterSpec(ni.d(cipher, str2)));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] d(String str, byte[] bArr, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance(e);
            cipher.init(1, secretKeySpec, new IvParameterSpec(ni.d(cipher, str2)));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str, String str2, String str3) {
        try {
            return ng.d(d(str, str2.getBytes(), str3));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(String str, String str2, String str3) {
        try {
            return new String(b(str, ng.a(str2), str3));
        } catch (Exception unused) {
            return null;
        }
    }
}
