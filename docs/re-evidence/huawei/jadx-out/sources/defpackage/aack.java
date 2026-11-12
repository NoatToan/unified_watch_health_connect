package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.eclipse.californium.scandium.dtls.cipher.CCMBlockCipher;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class aack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f126a = aaex.a((Class<?>) aack.class);

    public static final boolean d(String str) {
        return "AES/CCM/NoPadding".equalsIgnoreCase(str) || "AES/CCM".equalsIgnoreCase(str);
    }

    public static final boolean d(String str, int i) {
        int maxAllowedKeyLength;
        try {
            maxAllowedKeyLength = Cipher.getMaxAllowedKeyLength(str);
        } catch (NoSuchAlgorithmException unused) {
            maxAllowedKeyLength = 0;
        }
        if (maxAllowedKeyLength == 0) {
            f126a.debug("{} is not supported!", str);
        } else if (maxAllowedKeyLength == Integer.MAX_VALUE) {
            f126a.debug("{} is not restricted!", str);
        } else {
            f126a.debug("{} is restricted to {} bits.", str, Integer.valueOf(maxAllowedKeyLength));
        }
        return i * 8 <= maxAllowedKeyLength;
    }

    public static final byte[] b(CipherSuite cipherSuite, SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) throws GeneralSecurityException {
        if (d(cipherSuite.getTransformation())) {
            return CCMBlockCipher.c(secretKey, bArr, bArr2, bArr3, i, i2, cipherSuite.getMacLength());
        }
        return d(cipherSuite, secretKey, bArr, bArr2, bArr3, i, i2);
    }

    public static final byte[] c(CipherSuite cipherSuite, SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (d(cipherSuite.getTransformation())) {
            return CCMBlockCipher.a(cipherSuite.getRecordIvLength(), secretKey, bArr, bArr2, bArr3, cipherSuite.getMacLength());
        }
        return a(cipherSuite.getRecordIvLength(), cipherSuite, secretKey, bArr, bArr2, bArr3);
    }

    private static final byte[] d(CipherSuite cipherSuite, SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) throws GeneralSecurityException {
        Cipher threadLocalCipher = cipherSuite.getThreadLocalCipher();
        threadLocalCipher.init(2, secretKey, new GCMParameterSpec(cipherSuite.getMacLength() * 8, bArr));
        threadLocalCipher.updateAAD(bArr2);
        try {
            return threadLocalCipher.doFinal(bArr3, i, i2);
        } catch (AEADBadTagException e) {
            throw new aaci(e.getMessage());
        }
    }

    private static final byte[] a(int i, CipherSuite cipherSuite, SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        Cipher threadLocalCipher = cipherSuite.getThreadLocalCipher();
        threadLocalCipher.init(1, secretKey, new GCMParameterSpec(cipherSuite.getMacLength() * 8, bArr));
        threadLocalCipher.updateAAD(bArr2);
        byte[] bArr4 = new byte[threadLocalCipher.getOutputSize(bArr3.length) + i];
        threadLocalCipher.doFinal(bArr3, 0, bArr3.length, bArr4, i);
        return bArr4;
    }
}
