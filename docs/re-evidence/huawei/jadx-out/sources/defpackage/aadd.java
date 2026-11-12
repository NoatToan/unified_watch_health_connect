package defpackage;

import java.security.MessageDigest;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aadd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f148c = aaex.a((Class<?>) aadd.class);

    public static void e(SecretKey secretKey) {
        if (secretKey instanceof Destroyable) {
            a((Destroyable) secretKey);
        }
    }

    public static void a(Destroyable destroyable) {
        if (destroyable != null) {
            try {
                destroyable.destroy();
            } catch (DestroyFailedException e) {
                f148c.warn("Destroy on {} failed!", destroyable.getClass(), e);
            }
        }
    }

    public static boolean a(SecretKey secretKey) {
        if (secretKey == null) {
            return true;
        }
        if (secretKey instanceof Destroyable) {
            return secretKey.isDestroyed();
        }
        return false;
    }

    public static boolean b(Destroyable destroyable) {
        return destroyable == null || destroyable.isDestroyed();
    }

    public static SecretKey e(byte[] bArr, String str) {
        return new d(bArr, str);
    }

    public static SecretKey e(byte[] bArr, int i, int i2, String str) {
        return new d(bArr, i, i2, str);
    }

    public static SecretKey d(SecretKey secretKey) {
        if (secretKey == null) {
            return null;
        }
        byte[] encoded = secretKey.getEncoded();
        d dVar = new d(encoded, secretKey.getAlgorithm());
        zzg.a(encoded);
        return dVar;
    }

    public static aacw a(aacw aacwVar) {
        if (aacwVar != null) {
            return new aacw(aacwVar);
        }
        return null;
    }

    public static aacw c(byte[] bArr, int i, int i2) {
        return new aacw(bArr, i, i2);
    }

    public static aacw d(byte[] bArr) {
        return new aacw(bArr, 0, bArr.length);
    }

    public static boolean e(SecretKey secretKey, SecretKey secretKey2) {
        if (secretKey == secretKey2) {
            return true;
        }
        if (secretKey == null || secretKey2 == null || !secretKey.getAlgorithm().equals(secretKey2.getAlgorithm())) {
            return false;
        }
        byte[] encoded = secretKey.getEncoded();
        byte[] encoded2 = secretKey2.getEncoded();
        boolean zEquals = Arrays.equals(encoded, encoded2);
        zzg.a(encoded);
        zzg.a(encoded2);
        return zEquals;
    }

    static class d implements KeySpec, SecretKey, Destroyable {
        private static final long serialVersionUID = 6578238307397289933L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f151c;
        private volatile boolean e;

        private d(byte[] bArr, String str) {
            this(bArr, 0, bArr == null ? 0 : bArr.length, str);
        }

        private d(byte[] bArr, int i, int i2, String str) {
            if (bArr == null) {
                throw new NullPointerException("Key missing");
            }
            if (str == null) {
                throw new NullPointerException("Algorithm missing");
            }
            if (bArr.length == 0) {
                throw new IllegalArgumentException("Empty key");
            }
            if (bArr.length - i < i2) {
                throw new IllegalArgumentException("Invalid offset/length combination");
            }
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("len is negative");
            }
            this.f151c = Arrays.copyOfRange(bArr, i, i2 + i);
            this.f150b = str;
            this.f149a = c();
        }

        private int c() {
            return this.f149a;
        }

        @Override // java.security.Key
        public String getAlgorithm() {
            return this.f150b;
        }

        @Override // java.security.Key
        public String getFormat() {
            return "RAW";
        }

        @Override // java.security.Key
        public byte[] getEncoded() {
            if (this.e) {
                throw new IllegalStateException("secret destroyed!");
            }
            return (byte[]) this.f151c.clone();
        }

        public int hashCode() {
            return this.f149a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecretKey)) {
                return false;
            }
            SecretKey secretKey = (SecretKey) obj;
            if (!this.f150b.equalsIgnoreCase(secretKey.getAlgorithm())) {
                return false;
            }
            if (this.e) {
                throw new IllegalStateException("secret destroyed!");
            }
            byte[] encoded = secretKey.getEncoded();
            boolean zIsEqual = MessageDigest.isEqual(this.f151c, encoded);
            zzg.a(encoded);
            return zIsEqual;
        }

        @Override // javax.security.auth.Destroyable
        public void destroy() throws DestroyFailedException {
            zzg.a(this.f151c);
            this.e = true;
        }

        @Override // javax.security.auth.Destroyable
        public boolean isDestroyed() {
            return this.e;
        }
    }
}
