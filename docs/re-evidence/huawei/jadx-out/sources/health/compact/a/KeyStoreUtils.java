package health.compact.a;

import android.security.keystore.KeyGenParameterSpec;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.io.IOException;
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

/* JADX INFO: loaded from: classes2.dex */
public class KeyStoreUtils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f36589b = true;
    private static volatile SecretKey e;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WhiteBoxManager f36588a = WhiteBoxManager.b();

    private KeyStoreUtils() {
    }

    public static String d(String str) {
        if (!f36589b) {
            return Base64.b(f36588a.e(str));
        }
        return e(str.getBytes(StandardCharsets.UTF_8));
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (!f36589b) {
            return Base64.b(f36588a.e(new String(bArr, StandardCharsets.UTF_8)));
        }
        SecretKey secretKeyC = c();
        if (secretKeyC == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_KeyStoreUtils", "encrypt:secretKey is null");
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKeyC);
            return Base64.b(cipher.getIV()).concat(Base64.b(cipher.doFinal(bArr)));
        } catch (InvalidKeyException e2) {
            e = e2;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "encrypt ", e.getClass().getSimpleName());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "encrypt ", e.getClass().getSimpleName());
            return null;
        } catch (ProviderException unused) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "encrypt ProviderException");
            return null;
        } catch (BadPaddingException e4) {
            e = e4;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "encrypt ", e.getClass().getSimpleName());
            return null;
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "encrypt ", e.getClass().getSimpleName());
            return null;
        } catch (NoSuchPaddingException e6) {
            e = e6;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "encrypt ", e.getClass().getSimpleName());
            return null;
        } catch (Exception unused2) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "encrypt Exception");
            return null;
        }
    }

    public static byte[] b(String str) {
        if (!f36589b) {
            return f36588a.a(Base64.b(str));
        }
        if (health.compact.a.utils.StringUtils.g(str) || str.length() <= 24) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_KeyStoreUtils", "decrypt:encryptText is invalid");
            return null;
        }
        SecretKey secretKeyC = c();
        if (secretKeyC == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_KeyStoreUtils", "decrypt:secretKey is null");
            return null;
        }
        String strSubstring = str.substring(0, 24);
        String strSubstring2 = str.substring(24);
        byte[] bArrB = Base64.b(strSubstring);
        byte[] bArrB2 = Base64.b(strSubstring2);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, secretKeyC, new IvParameterSpec(bArrB));
            return cipher.doFinal(bArrB2);
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt exception text:", Integer.valueOf(str.length()), ",vectorByte:", Integer.valueOf(bArrB.length), ",encryptBytes:", Integer.valueOf(bArrB2.length));
            return null;
        } catch (InvalidKeyException e3) {
            e = e3;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt exception text:", Integer.valueOf(str.length()), ",vectorByte:", Integer.valueOf(bArrB.length), ",encryptBytes:", Integer.valueOf(bArrB2.length));
            return null;
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt exception text:", Integer.valueOf(str.length()), ",vectorByte:", Integer.valueOf(bArrB.length), ",encryptBytes:", Integer.valueOf(bArrB2.length));
            return null;
        } catch (ProviderException unused) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt ProviderException");
            return null;
        } catch (BadPaddingException e5) {
            e = e5;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt exception text:", Integer.valueOf(str.length()), ",vectorByte:", Integer.valueOf(bArrB.length), ",encryptBytes:", Integer.valueOf(bArrB2.length));
            return null;
        } catch (IllegalBlockSizeException e6) {
            e = e6;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt exception text:", Integer.valueOf(str.length()), ",vectorByte:", Integer.valueOf(bArrB.length), ",encryptBytes:", Integer.valueOf(bArrB2.length));
            return null;
        } catch (NoSuchPaddingException e7) {
            e = e7;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt ", e.getClass().getSimpleName());
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt exception text:", Integer.valueOf(str.length()), ",vectorByte:", Integer.valueOf(bArrB.length), ",encryptBytes:", Integer.valueOf(bArrB2.length));
            return null;
        } catch (Exception unused2) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "decrypt Exception");
            return null;
        }
    }

    private static SecretKey c() {
        if (e != null) {
            return e;
        }
        synchronized (d) {
            if (e != null) {
                return e;
            }
            e = d();
            return e;
        }
    }

    private static SecretKey d() {
        Object e2;
        SecretKey secretKey;
        KeyStore keyStoreE = e();
        if (keyStoreE == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_KeyStoreUtils", "getSecretKeyInternal:keyStore is null");
            return null;
        }
        String packageName = BaseApplication.getContext().getPackageName();
        try {
            if (keyStoreE.containsAlias(packageName)) {
                Key key = keyStoreE.getKey(packageName, null);
                if (!(key instanceof SecretKey)) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_KeyStoreUtils", "getSecretKeyInternal not instance of SecretKey");
                    return null;
                }
                secretKey = (SecretKey) key;
                try {
                    com.huawei.hwlogsmodel.LogUtil.a("R_KeyStoreUtils", "getSecretKeyInternal: from keyStore ");
                    return secretKey;
                } catch (InvalidAlgorithmParameterException e3) {
                    e2 = e3;
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getSecretKeyInternal ", e2.getClass().getSimpleName());
                    return secretKey;
                } catch (KeyStoreException e4) {
                    e2 = e4;
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getSecretKeyInternal ", e2.getClass().getSimpleName());
                    return secretKey;
                } catch (NoSuchAlgorithmException e5) {
                    e2 = e5;
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getSecretKeyInternal ", e2.getClass().getSimpleName());
                    return secretKey;
                } catch (NoSuchProviderException e6) {
                    e2 = e6;
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getSecretKeyInternal ", e2.getClass().getSimpleName());
                    return secretKey;
                } catch (UnrecoverableKeyException e7) {
                    e2 = e7;
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getSecretKeyInternal ", e2.getClass().getSimpleName());
                    return secretKey;
                }
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(packageName, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").build());
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            com.huawei.hwlogsmodel.LogUtil.a("R_KeyStoreUtils", "getSecretKeyInternal: from KeyGenerator ");
            return secretKeyGenerateKey;
        } catch (InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException e8) {
            e2 = e8;
            secretKey = null;
        }
    }

    private static KeyStore e() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getKeyStore ", e2.getClass().getSimpleName());
            return null;
        }
    }

    public static SecretKey c(String str) {
        Object e2;
        SecretKey secretKey;
        synchronized (KeyStoreUtils.class) {
            KeyStore keyStoreE = e();
            if (keyStoreE == null) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_KeyStoreUtils", "getAESGCMNoPaddingSecretKey:keyStore is null");
                return null;
            }
            try {
                if (keyStoreE.containsAlias(str)) {
                    Key key = keyStoreE.getKey(str, null);
                    if (!(key instanceof SecretKey)) {
                        health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_KeyStoreUtils", "getAESGCMNoPaddingSecretKey not instance of SecretKey");
                        return null;
                    }
                    secretKey = (SecretKey) key;
                    try {
                        com.huawei.hwlogsmodel.LogUtil.a("R_KeyStoreUtils", "getAESGCMNoPaddingSecretKey: from keyStore ");
                    } catch (InvalidAlgorithmParameterException e3) {
                        e2 = e3;
                        health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getAESGCMNoPaddingSecretKey ", e2.getClass().getSimpleName());
                    } catch (KeyStoreException e4) {
                        e2 = e4;
                        health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getAESGCMNoPaddingSecretKey ", e2.getClass().getSimpleName());
                    } catch (NoSuchAlgorithmException e5) {
                        e2 = e5;
                        health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getAESGCMNoPaddingSecretKey ", e2.getClass().getSimpleName());
                    } catch (NoSuchProviderException e6) {
                        e2 = e6;
                        health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getAESGCMNoPaddingSecretKey ", e2.getClass().getSimpleName());
                    } catch (UnrecoverableKeyException e7) {
                        e2 = e7;
                        health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_KeyStoreUtils", "getAESGCMNoPaddingSecretKey ", e2.getClass().getSimpleName());
                    }
                } else {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(true).build());
                    SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
                    com.huawei.hwlogsmodel.LogUtil.a("R_KeyStoreUtils", "getAESGCMNoPaddingSecretKey: from KeyGenerator ");
                    secretKey = secretKeyGenerateKey;
                }
            } catch (InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException e8) {
                e2 = e8;
                secretKey = null;
            }
            return secretKey;
        }
    }
}
