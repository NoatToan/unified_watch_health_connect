package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
class nvm {
    public static int c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (d(bArr, bArr2, bArr3, bArr4)) {
            return a(bArr, bArr2, bArr3, bArr4);
        }
        return -1;
    }

    private static int a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArrD = d(bArr2, bArr3);
        if (a(bArrD)) {
            return -2;
        }
        byte[] bArrC = c(12);
        byte[] bArrC2 = c(10);
        if (a(bArrC) || a(bArrC2)) {
            return -3;
        }
        byte[] bArrB = b(bArrD, bArrC, bArrC2, bArr);
        if (a(bArrB)) {
            return -4;
        }
        System.arraycopy(bArrC, 0, bArr4, 0, 12);
        System.arraycopy(bArrC2, 0, bArr4, 12, 10);
        System.arraycopy(bArrB, 0, bArr4, 22, bArr.length + 16);
        return 0;
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            return mac.doFinal(bArr2);
        } catch (NullPointerException unused) {
            LogUtil.e("AirActiveEncryptUtils", "getGcmKey occur NullPointerException");
            return new byte[0];
        } catch (InvalidKeyException unused2) {
            LogUtil.e("AirActiveEncryptUtils", "getGcmKey occur InvalidKeyException");
            return new byte[0];
        } catch (NoSuchAlgorithmException unused3) {
            LogUtil.e("AirActiveEncryptUtils", "getGcmKey occur NoSuchAlgorithmException");
            return new byte[0];
        }
    }

    private static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, new GCMParameterSpec(128, Arrays.copyOf(bArr2, 12)));
            cipher.updateAAD(bArr3);
            return cipher.doFinal(bArr4);
        } catch (InvalidAlgorithmParameterException unused) {
            LogUtil.e("AirActiveEncryptUtils", "encryptByAesGcm occur InvalidAlgorithmParameterException");
            return new byte[0];
        } catch (InvalidKeyException unused2) {
            LogUtil.e("AirActiveEncryptUtils", "encryptByAesGcm occur InvalidKeyException");
            return new byte[0];
        } catch (InvalidParameterException unused3) {
            LogUtil.e("AirActiveEncryptUtils", "encryptByAesGcm occur InvalidParameterException");
            return new byte[0];
        } catch (NoSuchAlgorithmException unused4) {
            LogUtil.e("AirActiveEncryptUtils", "encryptByAesGcm occur NoSuchAlgorithmException");
            return new byte[0];
        } catch (BadPaddingException unused5) {
            LogUtil.e("AirActiveEncryptUtils", "encryptByAesGcm occur BadPaddingException");
            return new byte[0];
        } catch (IllegalBlockSizeException unused6) {
            LogUtil.e("AirActiveEncryptUtils", "encryptByAesGcm occur IllegalBlockSizeException");
            return new byte[0];
        } catch (NoSuchPaddingException unused7) {
            LogUtil.e("AirActiveEncryptUtils", "encryptByAesGcm occur NoSuchPaddingException");
            return new byte[0];
        }
    }

    private static byte[] c(int i) {
        try {
            return d(i).getEncoded();
        } catch (InvalidParameterException | NoSuchAlgorithmException unused) {
            try {
                SecretKey secretKeyD = d(16);
                if (a(secretKeyD.getEncoded())) {
                    return new byte[0];
                }
                byte[] bArr = new byte[i];
                System.arraycopy(secretKeyD.getEncoded(), 0, bArr, 0, i);
                return bArr;
            } catch (InvalidParameterException | NoSuchAlgorithmException unused2) {
                LogUtil.e("AirActiveEncryptUtils", "generateRandomBytes occur GCM_TAG_LENGTH exception");
                LogUtil.e("AirActiveEncryptUtils", "generateRandomBytes occur exception");
                return new byte[0];
            }
        }
    }

    private static SecretKey d(int i) throws NoSuchAlgorithmException {
        SecureRandom secureRandom = new SecureRandom();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(i * 8, secureRandom);
        return keyGenerator.generateKey();
    }

    private static boolean d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return (bArr == null || bArr2 == null || bArr3 == null || bArr4 == null || bArr.length == 0 || bArr2.length == 0 || bArr3.length == 0 || bArr4.length == 0 || bArr.length > 256 || bArr4.length > bArr.length + 38) ? false : true;
    }

    private static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }
}
