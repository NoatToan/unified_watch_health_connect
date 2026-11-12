package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
public class ocs {
    private static final String e = "AESCBCUtils";

    public static String a(Context context, String str) {
        return d(str, oct.d(context));
    }

    public static String c(Context context, String str) {
        return a(str, oct.d(context));
    }

    public static byte[] a() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            return keyGenerator.generateKey().getEncoded();
        } catch (NoSuchAlgorithmException unused) {
            Log.d(e, " AESSecureKey is exception");
            return new byte[0];
        }
    }

    public static String d(String str, String str2) {
        byte[] bytes;
        try {
            bytes = str2 != null ? str2.getBytes("UTF-8") : new byte[0];
        } catch (UnsupportedEncodingException unused) {
            bytes = new byte[0];
        }
        if (bytes.length == 0) {
            return null;
        }
        return b(str, bytes);
    }

    public static String b(String str, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            return a(bArr2) + a(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (RuntimeException unused) {
            Log.d(e, " aesEncrypt is RuntimeException ");
            return null;
        } catch (Exception unused2) {
            Log.d(e, " aesEncrypt is exception");
            return null;
        }
    }

    public static String a(String str, String str2) {
        byte[] bytes;
        try {
            bytes = str2 != null ? str2.getBytes("UTF-8") : new byte[0];
        } catch (UnsupportedEncodingException unused) {
            bytes = new byte[0];
        }
        if (bytes.length == 0) {
            return null;
        }
        return c(str, bytes);
    }

    public static String c(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(e(str.substring(0, 32))));
            return new String(cipher.doFinal(e(str.substring(32))), "UTF-8");
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            Log.d(e, " aesDncrypt is exception");
            return null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            if (!TextUtils.isEmpty(hexString)) {
                stringBuffer.append(hexString.toUpperCase(Locale.getDefault()));
            }
        }
        return stringBuffer.toString();
    }

    private static byte[] e(String str) {
        if (str.length() < 1) {
            return new byte[0];
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
        }
        return bArr;
    }
}
