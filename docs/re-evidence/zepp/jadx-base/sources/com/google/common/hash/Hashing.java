package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import com.huami.identity.auth.alexa.ConstantsKt;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
public final class Hashing {
    public static final int a = (int) System.currentTimeMillis();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Immutable
    public static abstract class b implements k<Checksum> {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ADLER_32;
        public static final b CRC_32;
        public final HashFunction hashFunction;

        public static enum a extends b {
            public a(String str, int i, String str2) {
                super(str, i, str2);
            }

            @Override // com.google.common.base.Supplier
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Checksum get() {
                return new CRC32();
            }
        }

        /* JADX INFO: renamed from: com.google.common.hash.Hashing$b$b, reason: collision with other inner class name */
        public static enum C0223b extends b {
            public C0223b(String str, int i, String str2) {
                super(str, i, str2);
            }

            @Override // com.google.common.base.Supplier
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Checksum get() {
                return new Adler32();
            }
        }

        static {
            a aVar = new a("CRC_32", 0, "Hashing.crc32()");
            CRC_32 = aVar;
            C0223b c0223b = new C0223b("ADLER_32", 1, "Hashing.adler32()");
            ADLER_32 = c0223b;
            $VALUES = new b[]{aVar, c0223b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        private b(String str, int i, String str2) {
            super(str, i);
            this.hashFunction = new com.google.common.hash.h(this, 32, str2);
        }
    }

    public static final class c extends com.google.common.hash.b {
        @Override // com.google.common.hash.b
        public HashCode b(Hasher[] hasherArr) {
            byte[] bArr = new byte[bits() / 8];
            int iWriteBytesTo = 0;
            for (Hasher hasher : hasherArr) {
                HashCode hashCodeHash = hasher.hash();
                iWriteBytesTo += hashCodeHash.writeBytesTo(bArr, iWriteBytesTo, hashCodeHash.bits() / 8);
            }
            return HashCode.c(bArr);
        }

        @Override // com.google.common.hash.HashFunction
        public int bits() {
            int iBits = 0;
            for (HashFunction hashFunction : this.a) {
                iBits += hashFunction.bits();
            }
            return iBits;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(this.a, ((c) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.a);
        }

        private c(HashFunction... hashFunctionArr) {
            super(hashFunctionArr);
            for (HashFunction hashFunction : hashFunctionArr) {
                Preconditions.checkArgument(hashFunction.bits() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", hashFunction.bits(), (Object) hashFunction);
            }
        }
    }

    public static final class d {
        private long a;

        public d(long j) {
            this.a = j;
        }

        public double a() {
            long j = (this.a * 2862933555777941757L) + 1;
            this.a = j;
            return ((double) (((int) (j >>> 33)) + 1)) / 2.147483648E9d;
        }
    }

    public static class e {
        public static final HashFunction a = new q("MD5", "Hashing.md5()");

        private e() {
        }
    }

    public static class f {
        public static final HashFunction a = new q("SHA-1", "Hashing.sha1()");

        private f() {
        }
    }

    public static class g {
        public static final HashFunction a = new q(ConstantsKt.ALGORITHM_SHA_256, "Hashing.sha256()");

        private g() {
        }
    }

    public static class h {
        public static final HashFunction a = new q("SHA-384", "Hashing.sha384()");

        private h() {
        }
    }

    public static class i {
        public static final HashFunction a = new q("SHA-512", "Hashing.sha512()");

        private i() {
        }
    }

    private Hashing() {
    }

    public static int a(int i2) {
        Preconditions.checkArgument(i2 > 0, "Number of bits must be positive");
        return (i2 + 31) & (-32);
    }

    public static HashFunction adler32() {
        return b.ADLER_32.hashFunction;
    }

    private static String b(String str, Key key) {
        return String.format("Hashing.%s(Key[algorithm=%s, format=%s])", str, key.getAlgorithm(), key.getFormat());
    }

    public static HashCode combineOrdered(Iterable<HashCode> iterable) {
        Iterator<HashCode> it2 = iterable.iterator();
        Preconditions.checkArgument(it2.hasNext(), "Must be at least 1 hash code to combine.");
        int iBits = it2.next().bits() / 8;
        byte[] bArr = new byte[iBits];
        Iterator<HashCode> it3 = iterable.iterator();
        while (it3.hasNext()) {
            byte[] bArrAsBytes = it3.next().asBytes();
            Preconditions.checkArgument(bArrAsBytes.length == iBits, "All hashcodes must have the same bit length.");
            for (int i2 = 0; i2 < bArrAsBytes.length; i2++) {
                bArr[i2] = (byte) ((bArr[i2] * 37) ^ bArrAsBytes[i2]);
            }
        }
        return HashCode.c(bArr);
    }

    public static HashCode combineUnordered(Iterable<HashCode> iterable) {
        Iterator<HashCode> it2 = iterable.iterator();
        Preconditions.checkArgument(it2.hasNext(), "Must be at least 1 hash code to combine.");
        int iBits = it2.next().bits() / 8;
        byte[] bArr = new byte[iBits];
        Iterator<HashCode> it3 = iterable.iterator();
        while (it3.hasNext()) {
            byte[] bArrAsBytes = it3.next().asBytes();
            Preconditions.checkArgument(bArrAsBytes.length == iBits, "All hashcodes must have the same bit length.");
            for (int i2 = 0; i2 < bArrAsBytes.length; i2++) {
                bArr[i2] = (byte) (bArr[i2] + bArrAsBytes[i2]);
            }
        }
        return HashCode.c(bArr);
    }

    public static HashFunction concatenating(HashFunction hashFunction, HashFunction hashFunction2, HashFunction... hashFunctionArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hashFunction);
        arrayList.add(hashFunction2);
        arrayList.addAll(Arrays.asList(hashFunctionArr));
        return new c((HashFunction[]) arrayList.toArray(new HashFunction[0]));
    }

    public static int consistentHash(HashCode hashCode, int i2) {
        return consistentHash(hashCode.padToLong(), i2);
    }

    public static HashFunction crc32() {
        return b.CRC_32.hashFunction;
    }

    public static HashFunction crc32c() {
        return com.google.common.hash.i.a;
    }

    public static HashFunction farmHashFingerprint64() {
        return j.a;
    }

    public static HashFunction goodFastHash(int i2) {
        int iA = a(i2);
        if (iA == 32) {
            return s.c;
        }
        if (iA <= 128) {
            return r.c;
        }
        int i3 = (iA + 127) / 128;
        HashFunction[] hashFunctionArr = new HashFunction[i3];
        hashFunctionArr[0] = r.c;
        int i4 = a;
        for (int i5 = 1; i5 < i3; i5++) {
            i4 += 1500450271;
            hashFunctionArr[i5] = murmur3_128(i4);
        }
        return new c(hashFunctionArr);
    }

    public static HashFunction hmacMd5(Key key) {
        return new p("HmacMD5", key, b("hmacMd5", key));
    }

    public static HashFunction hmacSha1(Key key) {
        return new p("HmacSHA1", key, b("hmacSha1", key));
    }

    public static HashFunction hmacSha256(Key key) {
        return new p("HmacSHA256", key, b("hmacSha256", key));
    }

    public static HashFunction hmacSha512(Key key) {
        return new p("HmacSHA512", key, b("hmacSha512", key));
    }

    @Deprecated
    public static HashFunction md5() {
        return e.a;
    }

    public static HashFunction murmur3_128(int i2) {
        return new r(i2);
    }

    public static HashFunction murmur3_32(int i2) {
        return new s(i2);
    }

    @Deprecated
    public static HashFunction sha1() {
        return f.a;
    }

    public static HashFunction sha256() {
        return g.a;
    }

    public static HashFunction sha384() {
        return h.a;
    }

    public static HashFunction sha512() {
        return i.a;
    }

    public static HashFunction sipHash24() {
        return t.e;
    }

    public static int consistentHash(long j, int i2) {
        int i3 = 0;
        Preconditions.checkArgument(i2 > 0, "buckets must be positive: %s", i2);
        d dVar = new d(j);
        while (true) {
            int iA = (int) (((double) (i3 + 1)) / dVar.a());
            if (iA < 0 || iA >= i2) {
                break;
            }
            i3 = iA;
        }
        return i3;
    }

    public static HashFunction hmacMd5(byte[] bArr) {
        return hmacMd5(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacMD5"));
    }

    public static HashFunction hmacSha1(byte[] bArr) {
        return hmacSha1(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacSHA1"));
    }

    public static HashFunction hmacSha256(byte[] bArr) {
        return hmacSha256(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacSHA256"));
    }

    public static HashFunction hmacSha512(byte[] bArr) {
        return hmacSha512(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacSHA512"));
    }

    public static HashFunction murmur3_128() {
        return r.b;
    }

    public static HashFunction murmur3_32() {
        return s.b;
    }

    public static HashFunction sipHash24(long j, long j2) {
        return new t(2, 4, j, j2);
    }

    public static HashFunction concatenating(Iterable<HashFunction> iterable) {
        Preconditions.checkNotNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator<HashFunction> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        Preconditions.checkArgument(arrayList.size() > 0, "number of hash functions (%s) must be > 0", arrayList.size());
        return new c((HashFunction[]) arrayList.toArray(new HashFunction[0]));
    }
}
