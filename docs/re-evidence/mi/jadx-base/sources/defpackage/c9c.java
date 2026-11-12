package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public final class c9c {
    public static final byte[] d = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f5079b;
    public SecretKey c = null;

    public c9c(String str) {
        if (str.startsWith("Hmac")) {
            this.f5078a = str;
            this.f5079b = null;
        } else {
            throw new IllegalArgumentException("Invalid algorithm " + str + ". Hkdf may only be used with Hmac algorithms.");
        }
    }

    public static c9c e(String str) throws NoSuchAlgorithmException {
        Mac.getInstance(str);
        return new c9c(str);
    }

    public final void a() throws IllegalStateException {
        if (this.c == null) {
            throw new IllegalStateException("Hkdf has not been initialized");
        }
    }

    public final Mac b() {
        try {
            Provider provider = this.f5079b;
            Mac mac = provider != null ? Mac.getInstance(this.f5078a, provider) : Mac.getInstance(this.f5078a);
            mac.init(this.c);
            return mac;
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void c(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, ShortBufferException {
        a();
        if (i < 0) {
            throw new IllegalArgumentException("Length must be a non-negative value.");
        }
        if (bArr2.length < i2 + i) {
            throw new ShortBufferException();
        }
        Mac macB = b();
        if (i > macB.getMacLength() * 255) {
            throw new IllegalArgumentException("Requested keys may not be longer than 255 times the underlying HMAC length.");
        }
        byte[] bArrDoFinal = d;
        byte b2 = 1;
        int i3 = 0;
        while (i3 < i) {
            try {
                macB.update(bArrDoFinal);
                macB.update(bArr);
                macB.update(b2);
                bArrDoFinal = macB.doFinal();
                int i4 = 0;
                while (i4 < bArrDoFinal.length && i3 < i) {
                    bArr2[i3] = bArrDoFinal[i4];
                    i4++;
                    i3++;
                }
                b2 = (byte) (b2 + 1);
            } catch (Throwable th) {
                Arrays.fill(bArrDoFinal, (byte) 0);
                throw th;
            }
        }
        Arrays.fill(bArrDoFinal, (byte) 0);
    }

    public byte[] d(byte[] bArr, int i) throws IllegalStateException {
        byte[] bArr2 = new byte[i];
        try {
            c(bArr, i, bArr2, 0);
            return bArr2;
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public void f(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr2 == null ? d : (byte[]) bArr2.clone();
        byte[] bArrDoFinal = d;
        try {
            try {
                Provider provider = this.f5079b;
                Mac mac = provider != null ? Mac.getInstance(this.f5078a, provider) : Mac.getInstance(this.f5078a);
                if (bArr3.length == 0) {
                    bArr3 = new byte[mac.getMacLength()];
                    Arrays.fill(bArr3, (byte) 0);
                }
                mac.init(new SecretKeySpec(bArr3, this.f5078a));
                bArrDoFinal = mac.doFinal(bArr);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDoFinal, this.f5078a);
                Arrays.fill(bArrDoFinal, (byte) 0);
                g(secretKeySpec);
                Arrays.fill(bArrDoFinal, (byte) 0);
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("Unexpected exception", e);
            }
        } catch (Throwable th) {
            Arrays.fill(bArrDoFinal, (byte) 0);
            throw th;
        }
    }

    public void g(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey.getAlgorithm().equals(this.f5078a)) {
            this.c = secretKey;
            return;
        }
        throw new InvalidKeyException("Algorithm for the provided key must match the algorithm for this Hkdf. Expected " + this.f5078a + " but found " + secretKey.getAlgorithm());
    }
}
