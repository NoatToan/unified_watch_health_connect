package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class ks {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f39374c = "idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#";

    public static byte[] d(PBEKeySpec pBEKeySpec, byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr.length <= 16) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(pBEKeySpec.getPassword(), Arrays.copyOf(bArr, 16), 10, 128)).getEncoded(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        return cipher.doFinal(bArr, 16, bArr.length - 16);
    }

    public static byte[] a() {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 48; i += 2) {
                sb.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i));
            }
            return kn.d(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static PBEKeySpec c(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(new String(kn.d("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object objNewInstance = cls.newInstance();
        byte[] bArr = new byte[16];
        Method method = cls.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(objNewInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }

    public static String e(String str, String str2) {
        try {
            byte[] bArrD = d(c(str), b(str2), a());
            if (bArrD == null) {
                throw new Exception();
            }
            String str3 = new String(bArrD);
            if (kj.d(str3)) {
                return str3;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] a(PBEKeySpec pBEKeySpec, byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, ShortBufferException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(pBEKeySpec).getEncoded(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
        byte[] salt = pBEKeySpec.getSalt();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(salt.length + cipher.getOutputSize(bArr.length));
        byteBufferAllocate.put(salt);
        cipher.doFinal(ByteBuffer.wrap(bArr), byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    public static byte[] b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static void d(StringBuffer stringBuffer, byte b2) {
        stringBuffer.append("0123456789ABCDEF".charAt((b2 >> 4) & 15)).append("0123456789ABCDEF".charAt(b2 & 15));
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b2 : bArr) {
            d(stringBuffer, b2);
        }
        return stringBuffer.toString();
    }

    public static String c(String str, String str2) {
        try {
            return e(a(c(str), str2.getBytes(), a()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String e() {
        String str = new String();
        for (int i = 0; i < f39374c.length() - 1; i += 4) {
            str = str + f39374c.charAt(i);
        }
        return str;
    }
}
