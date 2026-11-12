package defpackage;

import cn.hutool.crypto.CryptoException;
import cn.hutool.crypto.GlobalBouncyCastleProvider;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
public class fql {
    public static Cipher a(String str) {
        Provider provider = GlobalBouncyCastleProvider.INSTANCE.getProvider();
        try {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        } catch (Exception e) {
            throw new CryptoException(e);
        }
    }

    public static Mac b(String str) {
        Provider provider = GlobalBouncyCastleProvider.INSTANCE.getProvider();
        try {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoException(e);
        }
    }

    public static MessageDigest c(String str) {
        Provider provider = GlobalBouncyCastleProvider.INSTANCE.getProvider();
        try {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoException(e);
        }
    }

    public static byte[] d(String str) {
        return enq.a(str) ? m7c.c(str) : o12.a(str);
    }

    public static SecretKey e(String str) {
        return u0e.b(str);
    }

    public static SecretKey f(String str, byte[] bArr) {
        return u0e.f(str, bArr);
    }
}
