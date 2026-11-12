package defpackage;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes20.dex */
public class ylu {
    private ylu() {
    }

    private static KeyStore c() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException unused) {
            yit.b("KeystoreUtil", "getKeyStore IOException");
            return null;
        } catch (KeyStoreException unused2) {
            yit.b("KeystoreUtil", "getKeyStore KeyStoreException");
            return null;
        } catch (NoSuchAlgorithmException unused3) {
            yit.b("KeystoreUtil", "getKeyStore NoSuchAlgorithmException");
            return null;
        } catch (CertificateException unused4) {
            yit.b("KeystoreUtil", "getKeyStore CertificateException");
            return null;
        }
    }

    private static KeyStore d(Context context, String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore;
        synchronized (ylu.class) {
            keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(str)) {
                e(context, str);
            }
        }
        return keyStore;
    }

    private static void e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(JceNames.RSA, "AndroidKeyStore");
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("PKCS1Padding").build());
            keyPairGenerator.generateKeyPair();
            yit.a("KeystoreUtil", "AboveApi23 generateKeyStoreKey success!");
        } catch (InvalidAlgorithmParameterException unused) {
            yit.b("KeystoreUtil", "createNewKeys InvalidAlgorithmParameterException");
        } catch (NoSuchAlgorithmException unused2) {
            yit.b("KeystoreUtil", "createNewKeys NoSuchAlgorithmException");
        } catch (NoSuchProviderException unused3) {
            yit.b("KeystoreUtil", "createNewKeys NoSuchProviderException");
        }
    }

    public static String e(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Key key = d(context, str2).getKey(str2, null);
            if (!(key instanceof PrivateKey)) {
                return "";
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, (PrivateKey) key);
            return new String(cipher.doFinal(yll.a(str)), "UTF-8");
        } catch (IOException unused) {
            yit.b("KeystoreUtil", "decryptString IOException");
            return "";
        } catch (InvalidKeyException unused2) {
            yit.b("KeystoreUtil", "decryptString InvalidKeyException");
            return "";
        } catch (KeyStoreException unused3) {
            yit.b("KeystoreUtil", "decryptString KeyStoreException");
            return "";
        } catch (NoSuchAlgorithmException unused4) {
            yit.b("KeystoreUtil", "decryptString NoSuchAlgorithmException");
            return "";
        } catch (UnrecoverableKeyException unused5) {
            yit.b("KeystoreUtil", "decryptString UnrecoverableKeyException");
            return "";
        } catch (CertificateException unused6) {
            yit.b("KeystoreUtil", "decryptString CertificateException");
            return "";
        } catch (BadPaddingException unused7) {
            yit.b("KeystoreUtil", "decryptString BadPaddingException");
            return "";
        } catch (IllegalBlockSizeException unused8) {
            yit.b("KeystoreUtil", "decryptString IllegalBlockSizeException");
            return "";
        } catch (NoSuchPaddingException unused9) {
            yit.b("KeystoreUtil", "decryptString NoSuchPaddingException");
            return "";
        }
    }

    public static SecretKey d() {
        KeyStore keyStoreC = c();
        if (keyStoreC == null) {
            yit.c("KeystoreUtil", "getSecretKeyInternal:keyStore is null");
            return null;
        }
        try {
            if (keyStoreC.containsAlias("com.huawei.wearengine.repository.sign")) {
                Key key = keyStoreC.getKey("com.huawei.wearengine.repository.sign", null);
                if (key instanceof SecretKey) {
                    yit.e("KeystoreUtil", "getSecretKeyForRepositorySign: from keyStore ");
                    return (SecretKey) key;
                }
            }
            return b();
        } catch (InvalidAlgorithmParameterException unused) {
            yit.b("KeystoreUtil", "getSecretKeyForRepositorySign InvalidAlgorithmParameterException");
            return null;
        } catch (KeyStoreException unused2) {
            yit.b("KeystoreUtil", "getSecretKeyForRepositorySign KeyStoreException");
            return null;
        } catch (NoSuchAlgorithmException unused3) {
            yit.b("KeystoreUtil", "getSecretKeyForRepositorySign NoSuchAlgorithmException");
            return null;
        } catch (NoSuchProviderException unused4) {
            yit.b("KeystoreUtil", "getSecretKeyForRepositorySign NoSuchProviderException");
            return null;
        } catch (UnrecoverableKeyException unused5) {
            yit.b("KeystoreUtil", "getSecretKeyForRepositorySign UnrecoverableKeyException");
            return null;
        }
    }

    private static SecretKey b() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder("com.huawei.wearengine.repository.sign", 4).build());
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        yit.e("KeystoreUtil", "getSecretKeyForRepositorySign: from KeyGenerator ");
        return secretKeyGenerateKey;
    }
}
