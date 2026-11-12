package com.huawei.secure.android.common.encrypt.aes;

import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes42.dex */
public class CipherUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22783a = "CipherUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22784b = "AES/GCM/NoPadding";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22785c = "AES/CBC/PKCS5Padding";
    private static final String d = "AES";
    private static final String e = "";
    private static final int f = 16;
    private static final int g = 12;
    private static final int h = 16;

    private static Cipher a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2 != null && bArr2.length >= 16) {
            return a(bArr, bArr2, i, f22785c);
        }
        b.b(f22783a, "cbc iv param is not right");
        return null;
    }

    private static Cipher b(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2 != null && bArr2.length >= 12) {
            return a(bArr, bArr2, i, f22784b);
        }
        b.b(f22783a, "gcm iv param is not right");
        return null;
    }

    public static Cipher getAesCbcDecryptCipher(byte[] bArr, Cipher cipher) {
        return getAesCbcDecryptCipher(bArr, cipher.getIV());
    }

    public static Cipher getAesCbcEncryptCipher(byte[] bArr) {
        if (bArr != null) {
            return getAesCbcEncryptCipher(bArr, EncryptUtil.generateSecureRandom(16));
        }
        b.b(f22783a, "getAesCbcEncryptCipher: key is null");
        return null;
    }

    public static int getAesCbcEncryptContentLen(byte[] bArr, byte[] bArr2) {
        return getAesCbcEncryptContentLen(bArr, bArr2, EncryptUtil.generateSecureRandom(16));
    }

    public static Cipher getAesGcmDecryptCipher(byte[] bArr, Cipher cipher) {
        return getAesGcmDecryptCipher(bArr, cipher.getIV());
    }

    public static Cipher getAesGcmEncryptCipher(byte[] bArr) {
        if (bArr == null) {
            b.b(f22783a, "getAesGcmEncryptCipher: key is null");
            return null;
        }
        byte[] bArrGenerateSecureRandom = EncryptUtil.generateSecureRandom(12);
        b.a(f22783a, "getEncryptCipher: iv is : " + HexUtil.byteArray2HexStr(bArrGenerateSecureRandom));
        return getAesGcmEncryptCipher(bArr, bArrGenerateSecureRandom);
    }

    public static int getAesGcmEncryptContentLen(byte[] bArr, byte[] bArr2) {
        return getAesGcmEncryptContentLen(bArr, bArr2, EncryptUtil.generateSecureRandom(12));
    }

    public static int getContent(Cipher cipher, byte[] bArr, byte[] bArr2) {
        if (cipher == null || bArr == null) {
            b.b(f22783a, "getEncryptCOntent: cipher is null or content is null");
            return -1;
        }
        try {
            return cipher.doFinal(bArr, 0, bArr.length, bArr2);
        } catch (BadPaddingException unused) {
            b.b(f22783a, "getContent: BadPaddingException");
            return -1;
        } catch (IllegalBlockSizeException unused2) {
            b.b(f22783a, "getContent: IllegalBlockSizeException");
            return -1;
        } catch (ShortBufferException unused3) {
            b.b(f22783a, "getContent: ShortBufferException");
            return -1;
        }
    }

    public static Cipher getAesCbcDecryptCipher(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, 2);
    }

    public static int getAesCbcEncryptContentLen(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return a(getAesCbcEncryptCipher(bArr2, bArr3), bArr);
    }

    public static Cipher getAesGcmDecryptCipher(byte[] bArr, byte[] bArr2) {
        return b(bArr, bArr2, 2);
    }

    public static int getAesGcmEncryptContentLen(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return a(getAesGcmEncryptCipher(bArr2, bArr3), bArr);
    }

    public static Cipher getAesCbcEncryptCipher(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, 1);
    }

    private static Cipher a(byte[] bArr, byte[] bArr2, int i, String str) {
        AlgorithmParameterSpec ivParameterSpec;
        if (bArr != null && AesGcm.isBuildVersionHigherThan19()) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, d);
                Cipher cipher = Cipher.getInstance(str);
                if (f22784b.equals(str)) {
                    ivParameterSpec = AesGcm.getGcmAlgorithmParams(bArr2);
                } else {
                    ivParameterSpec = new IvParameterSpec(bArr2);
                }
                cipher.init(i, secretKeySpec, ivParameterSpec);
                return cipher;
            } catch (GeneralSecurityException e2) {
                b.b(f22783a, "GCM encrypt data error" + e2.getMessage());
                return null;
            }
        }
        b.b(f22783a, "gcm encrypt param is not right");
        return null;
    }

    public static Cipher getAesGcmEncryptCipher(byte[] bArr, byte[] bArr2) {
        return b(bArr, bArr2, 1);
    }

    @Deprecated
    public static int getContent(Cipher cipher, byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        if (cipher != null && bArr != null) {
            return cipher.doFinal(bArr, i, i2, bArr2, i3);
        }
        b.b(f22783a, "getEncryptCOntent: cipher is null or content is null");
        return -1;
    }

    public static int getContent(CipherConfig cipherConfig) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        if (cipherConfig == null) {
            return -1;
        }
        return getContent(cipherConfig.getCipher(), cipherConfig.getInput(), cipherConfig.getInputOffset(), cipherConfig.getInputLen(), cipherConfig.getOutput(), cipherConfig.getOutputOffset());
    }

    public static byte[] getContent(Cipher cipher, byte[] bArr) {
        if (cipher == null) {
            b.b(f22783a, "getContent: cipher is null");
            return new byte[0];
        }
        if (bArr == null) {
            b.b(f22783a, "getContent: input is null");
            return new byte[0];
        }
        try {
            return cipher.doFinal(bArr, 0, bArr.length);
        } catch (BadPaddingException unused) {
            b.b(f22783a, "getContent: BadPaddingException");
            return new byte[0];
        } catch (IllegalBlockSizeException unused2) {
            b.b(f22783a, "getContent: IllegalBlockSizeException");
            return new byte[0];
        }
    }

    private static int a(Cipher cipher, byte[] bArr) {
        if (cipher == null || bArr == null) {
            return -1;
        }
        return cipher.getOutputSize(bArr.length);
    }
}
