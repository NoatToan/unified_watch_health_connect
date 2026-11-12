package defpackage;

import cn.hutool.crypto.CryptoException;
import cn.hutool.crypto.GlobalBouncyCastleProvider;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class u0e {
    public static SecretKey a(String str, byte[] bArr) {
        if (tt3.F(str) || !str.startsWith("DES")) {
            throw new CryptoException("Algorithm [{}] is not a DES algorithm!");
        }
        if (bArr == null) {
            return b(str);
        }
        try {
            return e(str, str.startsWith("DESede") ? new DESedeKeySpec(bArr) : new DESKeySpec(bArr));
        } catch (InvalidKeyException e) {
            throw new CryptoException(e);
        }
    }

    public static SecretKey b(String str) {
        return c(str, -1);
    }

    public static SecretKey c(String str, int i) {
        return d(str, i, null);
    }

    public static SecretKey d(String str, int i, SecureRandom secureRandom) {
        String strI = i(str);
        KeyGenerator keyGeneratorH = h(strI);
        if (i <= 0 && SymmetricAlgorithm.AES.getValue().equals(strI)) {
            i = 128;
        }
        if (i > 0) {
            if (secureRandom == null) {
                keyGeneratorH.init(i);
            } else {
                keyGeneratorH.init(i, secureRandom);
            }
        }
        return keyGeneratorH.generateKey();
    }

    public static SecretKey e(String str, KeySpec keySpec) {
        try {
            return j(str).generateSecret(keySpec);
        } catch (InvalidKeySpecException e) {
            throw new CryptoException(e);
        }
    }

    public static SecretKey f(String str, byte[] bArr) {
        qk1.p(str, "Algorithm is blank!", new Object[0]);
        if (str.startsWith("PBE")) {
            return g(str, bArr == null ? null : lio.J0(bArr).toCharArray());
        }
        if (str.startsWith("DES")) {
            return a(str, bArr);
        }
        return bArr == null ? b(str) : new SecretKeySpec(bArr, str);
    }

    public static SecretKey g(String str, char[] cArr) {
        if (tt3.F(str) || !str.startsWith("PBE")) {
            throw new CryptoException("Algorithm [{}] is not a PBE algorithm!");
        }
        if (cArr == null) {
            cArr = nbj.g(32).toCharArray();
        }
        return e(str, new PBEKeySpec(cArr));
    }

    public static KeyGenerator h(String str) {
        Provider provider = GlobalBouncyCastleProvider.INSTANCE.getProvider();
        try {
            return provider == null ? KeyGenerator.getInstance(i(str)) : KeyGenerator.getInstance(i(str), provider);
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoException(e);
        }
    }

    public static String i(String str) {
        qk1.p(str, "Algorithm must be not blank!", new Object[0]);
        int iIndexOf = str.indexOf(47);
        return iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
    }

    public static SecretKeyFactory j(String str) {
        Provider provider = GlobalBouncyCastleProvider.INSTANCE.getProvider();
        try {
            return provider == null ? SecretKeyFactory.getInstance(i(str)) : SecretKeyFactory.getInstance(i(str), provider);
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoException(e);
        }
    }
}
