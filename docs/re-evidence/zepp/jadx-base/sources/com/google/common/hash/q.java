package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
final class q extends com.google.common.hash.c implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public static final class b extends com.google.common.hash.a {
        private final MessageDigest b;
        private final int c;
        private boolean d;

        private void f() {
            Preconditions.checkState(!this.d, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.a
        public void b(byte b) {
            f();
            this.b.update(b);
        }

        @Override // com.google.common.hash.a
        public void c(ByteBuffer byteBuffer) {
            f();
            this.b.update(byteBuffer);
        }

        @Override // com.google.common.hash.a
        public void e(byte[] bArr, int i, int i2) {
            f();
            this.b.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            f();
            this.d = true;
            return this.c == this.b.getDigestLength() ? HashCode.c(this.b.digest()) : HashCode.c(Arrays.copyOf(this.b.digest(), this.c));
        }

        private b(MessageDigest messageDigest, int i) {
            this.b = messageDigest;
            this.c = i;
        }
    }

    public static final class c implements Serializable {
        private static final long serialVersionUID = 0;
        private final String a;
        private final int b;
        private final String c;

        private Object readResolve() {
            return new q(this.a, this.b, this.c);
        }

        private c(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }
    }

    public q(String str, String str2) {
        MessageDigest messageDigestA = a(str);
        this.a = messageDigestA;
        this.b = messageDigestA.getDigestLength();
        this.d = (String) Preconditions.checkNotNull(str2);
        this.c = b(messageDigestA);
    }

    private static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean b(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.b * 8;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        if (this.c) {
            try {
                return new b((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(a(this.a.getAlgorithm()), this.b);
    }

    public String toString() {
        return this.d;
    }

    public Object writeReplace() {
        return new c(this.a.getAlgorithm(), this.b, this.d);
    }

    public q(String str, int i, String str2) {
        this.d = (String) Preconditions.checkNotNull(str2);
        MessageDigest messageDigestA = a(str);
        this.a = messageDigestA;
        int digestLength = messageDigestA.getDigestLength();
        Preconditions.checkArgument(i >= 4 && i <= digestLength, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = b(messageDigestA);
    }
}
