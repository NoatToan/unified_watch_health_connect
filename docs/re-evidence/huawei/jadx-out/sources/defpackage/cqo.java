package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
public class cqo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile SecretKey f31261c;
    private static final Object d = new Object();

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_KeyStoreUtils", "encrypt:plainText is null");
            return "";
        }
        return e(str.getBytes(StandardCharsets.UTF_8));
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        SecretKey secretKeyA = a();
        if (secretKeyA == null) {
            ReleaseLogUtil.d("R_KeyStoreUtils", "encrypt:secretKey is null");
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKeyA);
            return cqv.b(cipher.getIV()).concat(cqv.b(cipher.doFinal(bArr)));
        } catch (InvalidKeyException e) {
            e = e;
            ReleaseLogUtil.b("R_KeyStoreUtils", "encrypt ", e.getClass().getSimpleName());
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            ReleaseLogUtil.b("R_KeyStoreUtils", "encrypt ", e.getClass().getSimpleName());
            return null;
        } catch (ProviderException unused) {
            ReleaseLogUtil.b("R_KeyStoreUtils", "encrypt ProviderException");
            return null;
        } catch (BadPaddingException e3) {
            e = e3;
            ReleaseLogUtil.b("R_KeyStoreUtils", "encrypt ", e.getClass().getSimpleName());
            return null;
        } catch (IllegalBlockSizeException e4) {
            e = e4;
            ReleaseLogUtil.b("R_KeyStoreUtils", "encrypt ", e.getClass().getSimpleName());
            return null;
        } catch (NoSuchPaddingException e5) {
            e = e5;
            ReleaseLogUtil.b("R_KeyStoreUtils", "encrypt ", e.getClass().getSimpleName());
            return null;
        } catch (Exception unused2) {
            ReleaseLogUtil.b("R_KeyStoreUtils", "encrypt Exception");
            return null;
        }
    }

    public static byte[] b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.b("R_KeyStoreUtils", "encryptData data is empty.");
            return null;
        }
        try {
            byte[] bArrB = ckg.b(16);
            byte[] bArrB2 = ckg.b(16);
            byte[] bArrD = ckg.d("AES/CBC/PKCS5Padding", bArr, bArrB, bArrB2);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrD.length + 32);
            byteBufferAllocate.put(bArrB).put(bArrB2).put(bArrD);
            LogUtil.b("R_KeyStoreUtils", "encryptData success");
            return byteBufferAllocate.array();
        } catch (NoSuchAlgorithmException e) {
            LogUtil.d("R_KeyStoreUtils", "encryptData : ", ExceptionUtils.c(e));
            LogUtil.b("R_KeyStoreUtils", "encryptData fail, please check.");
            return null;
        }
    }

    public static byte[] b(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 24) {
            ReleaseLogUtil.d("R_KeyStoreUtils", "decrypt:encryptText is invalid");
            return null;
        }
        SecretKey secretKeyA = a();
        if (secretKeyA == null) {
            ReleaseLogUtil.d("R_KeyStoreUtils", "decrypt:secretKey is null");
            return null;
        }
        try {
            String strSubstring = str.substring(0, 24);
            String strSubstring2 = str.substring(24);
            byte[] bArrD = cqv.d(strSubstring);
            byte[] bArrD2 = cqv.d(strSubstring2);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, secretKeyA, new IvParameterSpec(bArrD));
            return cipher.doFinal(bArrD2);
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            ReleaseLogUtil.b("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            return null;
        } catch (InvalidKeyException e2) {
            e = e2;
            ReleaseLogUtil.b("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            ReleaseLogUtil.b("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            return null;
        } catch (ProviderException unused) {
            ReleaseLogUtil.b("R_KeyStoreUtils", "decrypt ProviderException");
            return null;
        } catch (BadPaddingException e4) {
            e = e4;
            ReleaseLogUtil.b("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            return null;
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            ReleaseLogUtil.b("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            return null;
        } catch (NoSuchPaddingException e6) {
            e = e6;
            ReleaseLogUtil.b("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            return null;
        } catch (Exception unused2) {
            ReleaseLogUtil.b("R_KeyStoreUtils", "decrypt Exception");
            return null;
        }
    }

    private static SecretKey a() {
        if (f31261c != null) {
            return f31261c;
        }
        synchronized (d) {
            if (f31261c != null) {
                return f31261c;
            }
            f31261c = e();
            return f31261c;
        }
    }

    private static SecretKey e() {
        Object e;
        SecretKey secretKey;
        KeyStore keyStoreD = d();
        if (keyStoreD == null) {
            ReleaseLogUtil.d("R_KeyStoreUtils", "getSecretKeyInternal:keyStore is null");
            return null;
        }
        String packageName = BaseApplication.b().getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            ReleaseLogUtil.d("R_KeyStoreUtils", "getSecretKeyInternal:PackageName is null");
            return null;
        }
        try {
            if (keyStoreD.containsAlias(packageName)) {
                Key key = keyStoreD.getKey(packageName, null);
                if (!(key instanceof SecretKey)) {
                    ReleaseLogUtil.d("R_KeyStoreUtils", "getSecretKeyInternal not instance of SecretKey");
                    return null;
                }
                secretKey = (SecretKey) key;
                try {
                    LogUtil.b("R_KeyStoreUtils", "getSecretKeyInternal: from keyStore ");
                    return secretKey;
                } catch (InvalidAlgorithmParameterException e2) {
                    e = e2;
                    ReleaseLogUtil.b("R_KeyStoreUtils", "getSecretKeyInternal ", e.getClass().getSimpleName());
                    return secretKey;
                } catch (KeyStoreException e3) {
                    e = e3;
                    ReleaseLogUtil.b("R_KeyStoreUtils", "getSecretKeyInternal ", e.getClass().getSimpleName());
                    return secretKey;
                } catch (NoSuchAlgorithmException e4) {
                    e = e4;
                    ReleaseLogUtil.b("R_KeyStoreUtils", "getSecretKeyInternal ", e.getClass().getSimpleName());
                    return secretKey;
                } catch (NoSuchProviderException e5) {
                    e = e5;
                    ReleaseLogUtil.b("R_KeyStoreUtils", "getSecretKeyInternal ", e.getClass().getSimpleName());
                    return secretKey;
                } catch (ProviderException e6) {
                    e = e6;
                    ReleaseLogUtil.b("R_KeyStoreUtils", "getSecretKeyInternal ", e.getClass().getSimpleName());
                    return secretKey;
                } catch (UnrecoverableKeyException e7) {
                    e = e7;
                    ReleaseLogUtil.b("R_KeyStoreUtils", "getSecretKeyInternal ", e.getClass().getSimpleName());
                    return secretKey;
                }
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(packageName, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").build());
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            LogUtil.b("R_KeyStoreUtils", "getSecretKeyInternal: from KeyGenerator ");
            return secretKeyGenerateKey;
        } catch (InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException | UnrecoverableKeyException e8) {
            e = e8;
            secretKey = null;
        }
    }

    private static KeyStore d() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            ReleaseLogUtil.b("R_KeyStoreUtils", "getKeyStore ", e.getClass().getSimpleName());
            return null;
        }
    }
}
