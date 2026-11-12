package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
final class p extends c {
    private final Mac a;
    private final Key b;
    private final String c;
    private final int d;
    private final boolean e;

    public static final class b extends com.google.common.hash.a {
        private final Mac b;
        private boolean c;

        private void f() {
            Preconditions.checkState(!this.c, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.a
        public void b(byte b) {
            f();
            this.b.update(b);
        }

        @Override // com.google.common.hash.a
        public void c(ByteBuffer byteBuffer) {
            f();
            Preconditions.checkNotNull(byteBuffer);
            this.b.update(byteBuffer);
        }

        @Override // com.google.common.hash.a
        public void d(byte[] bArr) {
            f();
            this.b.update(bArr);
        }

        @Override // com.google.common.hash.a
        public void e(byte[] bArr, int i, int i2) {
            f();
            this.b.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            f();
            this.c = true;
            return HashCode.c(this.b.doFinal());
        }

        private b(Mac mac) {
            this.b = mac;
        }
    }

    public p(String str, Key key, String str2) {
        Mac macA = a(str, key);
        this.a = macA;
        this.b = (Key) Preconditions.checkNotNull(key);
        this.c = (String) Preconditions.checkNotNull(str2);
        this.d = macA.getMacLength() * 8;
        this.e = b(macA);
    }

    private static Mac a(String str, Key key) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static boolean b(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.d;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        if (this.e) {
            try {
                return new b((Mac) this.a.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(a(this.a.getAlgorithm(), this.b));
    }

    public String toString() {
        return this.c;
    }
}
