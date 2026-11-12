package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class ckg {
    public static byte[] d(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr2.length == 0 || bArr3 == null) {
            return new byte[16];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        try {
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (BadPaddingException e) {
            LogUtil.e("EncryptUtil", "encrypt BadPaddingException is", ExceptionUtils.c(e));
            return new byte[16];
        } catch (InvalidAlgorithmParameterException e2) {
            LogUtil.e("EncryptUtil", "encrypt InvalidAlgorithmParameterException is", ExceptionUtils.c(e2));
            return new byte[16];
        } catch (NoSuchPaddingException e3) {
            LogUtil.e("EncryptUtil", "encrypt NoSuchPaddingException is", ExceptionUtils.c(e3));
            return new byte[16];
        } catch (NoSuchAlgorithmException e4) {
            LogUtil.e("EncryptUtil", "encrypt NoSuchAlgorithmException is", ExceptionUtils.c(e4));
            return new byte[16];
        } catch (InvalidKeyException e5) {
            LogUtil.e("EncryptUtil", "encrypt InvalidKeyException is", ExceptionUtils.c(e5));
            return new byte[16];
        } catch (IllegalBlockSizeException e6) {
            LogUtil.e("EncryptUtil", "encrypt IllegalBlockSizeException is", ExceptionUtils.c(e6));
            return new byte[16];
        } finally {
            LogUtil.e("EncryptUtil", "encrypt finally");
        }
    }

    public static byte[] a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr2.length == 0 || bArr3 == null) {
            return new byte[16];
        }
        try {
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException e) {
            LogUtil.e("EncryptUtil", "decrypt InvalidKeyException is", ExceptionUtils.c(e));
            return new byte[16];
        } catch (NoSuchPaddingException e2) {
            LogUtil.e("EncryptUtil", "decrypt NoSuchPaddingException is", ExceptionUtils.c(e2));
            return new byte[16];
        } catch (NoSuchAlgorithmException e3) {
            LogUtil.e("EncryptUtil", "decrypt NoSuchAlgorithmException is", ExceptionUtils.c(e3));
            return new byte[16];
        } catch (InvalidAlgorithmParameterException e4) {
            LogUtil.e("EncryptUtil", "decrypt InvalidAlgorithmParameterException is", ExceptionUtils.c(e4));
            return new byte[16];
        } catch (BadPaddingException e5) {
            LogUtil.e("EncryptUtil", "decrypt BadPaddingException is", ExceptionUtils.c(e5));
            return new byte[16];
        } catch (IllegalBlockSizeException e6) {
            LogUtil.e("EncryptUtil", "decrypt IllegalBlockSizeException is", ExceptionUtils.c(e6));
            return new byte[16];
        } finally {
            LogUtil.e("EncryptUtil", "decrypt finally");
        }
    }

    public static byte[] e(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return new byte[16];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr3);
        try {
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(1, secretKeySpec, gCMParameterSpec);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException unused) {
            LogUtil.d("EncryptUtil", "encrypt InvalidKeyException");
            return new byte[16];
        } catch (IllegalBlockSizeException unused2) {
            LogUtil.d("EncryptUtil", "encrypt IllegalBlockSizeException");
            return new byte[16];
        } catch (NoSuchAlgorithmException unused3) {
            LogUtil.d("EncryptUtil", "encrypt NoSuchAlgorithmException");
            return new byte[16];
        } catch (NoSuchPaddingException unused4) {
            LogUtil.d("EncryptUtil", "encrypt NoSuchPaddingException");
            return new byte[16];
        } catch (InvalidAlgorithmParameterException unused5) {
            LogUtil.d("EncryptUtil", "encrypt InvalidAlgorithmParameterException");
            return new byte[16];
        } catch (BadPaddingException unused6) {
            LogUtil.d("EncryptUtil", "encrypt BadPaddingException");
            return new byte[16];
        } finally {
            LogUtil.e("EncryptUtil", "encrypt finally");
        }
    }

    protected static byte[] b(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return new byte[16];
        }
        try {
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, bArr3));
            return cipher.doFinal(bArr);
        } catch (NoSuchAlgorithmException unused) {
            LogUtil.d("EncryptUtil", "decrypt NoSuchAlgorithmException");
            return new byte[16];
        } catch (InvalidAlgorithmParameterException unused2) {
            LogUtil.d("EncryptUtil", "decrypt InvalidAlgorithmParameterException");
            return new byte[16];
        } catch (NoSuchPaddingException unused3) {
            LogUtil.d("EncryptUtil", "decrypt NoSuchPaddingException");
            return new byte[16];
        } catch (BadPaddingException unused4) {
            LogUtil.d("EncryptUtil", "decrypt BadPaddingException");
            return new byte[16];
        } catch (InvalidKeyException unused5) {
            LogUtil.d("EncryptUtil", "decrypt InvalidKeyException");
            return new byte[16];
        } catch (IllegalBlockSizeException unused6) {
            LogUtil.d("EncryptUtil", "decrypt IllegalBlockSizeException");
            return new byte[16];
        } finally {
            LogUtil.e("EncryptUtil", "decrypt finally");
        }
    }

    public static byte[] b(int i) throws NoSuchAlgorithmException {
        SecureRandom secureRandom = new SecureRandom();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(i * 8, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        if (bArr == null || bArr2 == null) {
            LogUtil.d("EncryptUtil", "input param is invalid.");
            return new byte[0];
        }
        LogUtil.b("EncryptUtil", "hmacSha256 start");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return mac.doFinal(bArr2);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? str : e(cqq.d(str.getBytes(StandardCharsets.UTF_8)));
    }

    private static String e(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(128);
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null) {
            return new byte[16];
        }
        byte[] bArr2 = new byte[16];
        byte[] bArrDigest = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            bArrDigest = messageDigest.digest();
            System.arraycopy(bArrDigest, 0, bArr2, 0, 16);
            return bArr2;
        } catch (NoSuchAlgorithmException unused) {
            return bArrDigest;
        }
    }
}
