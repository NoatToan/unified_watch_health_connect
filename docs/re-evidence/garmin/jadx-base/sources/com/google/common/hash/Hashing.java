package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.codec.digest.MurmurHash3;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
public final class Hashing {
    static final int GOOD_FAST_HASH_SEED = (int) System.currentTimeMillis();

    @Immutable
    public enum ChecksumType implements ImmutableSupplier<Checksum> {
        CRC_32("Hashing.crc32()") { // from class: com.google.common.hash.Hashing.ChecksumType.1
            @Override // com.google.common.base.Supplier
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") { // from class: com.google.common.hash.Hashing.ChecksumType.2
            @Override // com.google.common.base.Supplier
            public Checksum get() {
                return new Adler32();
            }
        };

        public final HashFunction hashFunction;

        ChecksumType(String str) {
            this.hashFunction = new ChecksumHashFunction(this, 32, str);
        }
    }

    public static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction {
        private ConcatenatedHashFunction(HashFunction... hashFunctionArr) {
            super(hashFunctionArr);
            for (HashFunction hashFunction : hashFunctionArr) {
                Preconditions.checkArgument(hashFunction.bits() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", hashFunction.bits(), (Object) hashFunction);
            }
        }

        @Override // com.google.common.hash.HashFunction
        public int bits() {
            int iBits = 0;
            for (HashFunction hashFunction : this.functions) {
                iBits += hashFunction.bits();
            }
            return iBits;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ConcatenatedHashFunction) {
                return Arrays.equals(this.functions, ((ConcatenatedHashFunction) obj).functions);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.functions);
        }

        @Override // com.google.common.hash.AbstractCompositeHashFunction
        public HashCode makeHash(Hasher[] hasherArr) {
            byte[] bArr = new byte[bits() / 8];
            int iWriteBytesTo = 0;
            for (Hasher hasher : hasherArr) {
                HashCode hashCodeHash = hasher.hash();
                iWriteBytesTo += hashCodeHash.writeBytesTo(bArr, iWriteBytesTo, hashCodeHash.bits() / 8);
            }
            return HashCode.fromBytesNoCopy(bArr);
        }
    }

    public static final class LinearCongruentialGenerator {
        private long state;

        public LinearCongruentialGenerator(long j8) {
            this.state = j8;
        }

        public double nextDouble() {
            long j8 = (this.state * MurmurHash3.NULL_HASHCODE) + 1;
            this.state = j8;
            return ((double) (((int) (j8 >>> 33)) + 1)) / 2.147483648E9d;
        }
    }

    public static class Md5Holder {
        static final HashFunction MD5 = new MessageDigestHashFunction(MessageDigestAlgorithms.MD5, "Hashing.md5()");

        private Md5Holder() {
        }
    }

    public static class Sha1Holder {
        static final HashFunction SHA_1 = new MessageDigestHashFunction(MessageDigestAlgorithms.SHA_1, "Hashing.sha1()");

        private Sha1Holder() {
        }
    }

    public static class Sha256Holder {
        static final HashFunction SHA_256 = new MessageDigestHashFunction(MessageDigestAlgorithms.SHA_256, "Hashing.sha256()");

        private Sha256Holder() {
        }
    }

    public static class Sha384Holder {
        static final HashFunction SHA_384 = new MessageDigestHashFunction(MessageDigestAlgorithms.SHA_384, "Hashing.sha384()");

        private Sha384Holder() {
        }
    }

    public static class Sha512Holder {
        static final HashFunction SHA_512 = new MessageDigestHashFunction(MessageDigestAlgorithms.SHA_512, "Hashing.sha512()");

        private Sha512Holder() {
        }
    }

    private Hashing() {
    }

    public static HashFunction adler32() {
        return ChecksumType.ADLER_32.hashFunction;
    }

    public static int checkPositiveAndMakeMultipleOf32(int i14) {
        Preconditions.checkArgument(i14 > 0, "Number of bits must be positive");
        return (i14 + 31) & (-32);
    }

    public static HashCode combineOrdered(Iterable<HashCode> iterable) {
        Iterator<HashCode> it = iterable.iterator();
        Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iBits = it.next().bits() / 8;
        byte[] bArr = new byte[iBits];
        Iterator<HashCode> it3 = iterable.iterator();
        while (it3.hasNext()) {
            byte[] bArrAsBytes = it3.next().asBytes();
            Preconditions.checkArgument(bArrAsBytes.length == iBits, "All hashcodes must have the same bit length.");
            for (int i14 = 0; i14 < bArrAsBytes.length; i14++) {
                bArr[i14] = (byte) ((bArr[i14] * 37) ^ bArrAsBytes[i14]);
            }
        }
        return HashCode.fromBytesNoCopy(bArr);
    }

    public static HashCode combineUnordered(Iterable<HashCode> iterable) {
        Iterator<HashCode> it = iterable.iterator();
        Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iBits = it.next().bits() / 8;
        byte[] bArr = new byte[iBits];
        Iterator<HashCode> it3 = iterable.iterator();
        while (it3.hasNext()) {
            byte[] bArrAsBytes = it3.next().asBytes();
            Preconditions.checkArgument(bArrAsBytes.length == iBits, "All hashcodes must have the same bit length.");
            for (int i14 = 0; i14 < bArrAsBytes.length; i14++) {
                bArr[i14] = (byte) (bArr[i14] + bArrAsBytes[i14]);
            }
        }
        return HashCode.fromBytesNoCopy(bArr);
    }

    public static HashFunction concatenating(Iterable<HashFunction> iterable) {
        Preconditions.checkNotNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator<HashFunction> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Preconditions.checkArgument(!arrayList.isEmpty(), "number of hash functions (%s) must be > 0", arrayList.size());
        return new ConcatenatedHashFunction((HashFunction[]) arrayList.toArray(new HashFunction[0]));
    }

    public static int consistentHash(long j8, int i14) {
        int i15 = 0;
        Preconditions.checkArgument(i14 > 0, "buckets must be positive: %s", i14);
        LinearCongruentialGenerator linearCongruentialGenerator = new LinearCongruentialGenerator(j8);
        while (true) {
            int iNextDouble = (int) (((double) (i15 + 1)) / linearCongruentialGenerator.nextDouble());
            if (iNextDouble < 0 || iNextDouble >= i14) {
                break;
            }
            i15 = iNextDouble;
        }
        return i15;
    }

    public static HashFunction crc32() {
        return ChecksumType.CRC_32.hashFunction;
    }

    public static HashFunction crc32c() {
        return Crc32cHashFunction.CRC_32_C;
    }

    public static HashFunction farmHashFingerprint64() {
        return FarmHashFingerprint64.FARMHASH_FINGERPRINT_64;
    }

    public static HashFunction fingerprint2011() {
        return Fingerprint2011.FINGERPRINT_2011;
    }

    public static HashFunction goodFastHash(int i14) {
        int iCheckPositiveAndMakeMultipleOf32 = checkPositiveAndMakeMultipleOf32(i14);
        if (iCheckPositiveAndMakeMultipleOf32 == 32) {
            return Murmur3_32HashFunction.GOOD_FAST_HASH_32;
        }
        if (iCheckPositiveAndMakeMultipleOf32 <= 128) {
            return Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        }
        int i15 = (iCheckPositiveAndMakeMultipleOf32 + 127) / 128;
        HashFunction[] hashFunctionArr = new HashFunction[i15];
        hashFunctionArr[0] = Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        int i16 = GOOD_FAST_HASH_SEED;
        for (int i17 = 1; i17 < i15; i17++) {
            i16 += 1500450271;
            hashFunctionArr[i17] = murmur3_128(i16);
        }
        return new ConcatenatedHashFunction(hashFunctionArr);
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

    private static String hmacToString(String str, Key key) {
        StringBuilder sbL = hb.a.l("Hashing.", str, "(Key[algorithm=");
        sbL.append(key.getAlgorithm());
        sbL.append(", format=");
        sbL.append(key.getFormat());
        sbL.append("])");
        return sbL.toString();
    }

    @Deprecated
    public static HashFunction md5() {
        return Md5Holder.MD5;
    }

    public static HashFunction murmur3_128(int i14) {
        return new Murmur3_128HashFunction(i14);
    }

    @Deprecated
    public static HashFunction murmur3_32(int i14) {
        return new Murmur3_32HashFunction(i14, false);
    }

    public static HashFunction murmur3_32_fixed(int i14) {
        return new Murmur3_32HashFunction(i14, true);
    }

    @Deprecated
    public static HashFunction sha1() {
        return Sha1Holder.SHA_1;
    }

    public static HashFunction sha256() {
        return Sha256Holder.SHA_256;
    }

    public static HashFunction sha384() {
        return Sha384Holder.SHA_384;
    }

    public static HashFunction sha512() {
        return Sha512Holder.SHA_512;
    }

    public static HashFunction sipHash24(long j8, long j14) {
        return new SipHashFunction(2, 4, j8, j14);
    }

    public static HashFunction murmur3_128() {
        return Murmur3_128HashFunction.MURMUR3_128;
    }

    @Deprecated
    public static HashFunction murmur3_32() {
        return Murmur3_32HashFunction.MURMUR3_32;
    }

    public static HashFunction murmur3_32_fixed() {
        return Murmur3_32HashFunction.MURMUR3_32_FIXED;
    }

    public static HashFunction sipHash24() {
        return SipHashFunction.SIP_HASH_24;
    }

    public static HashFunction hmacMd5(Key key) {
        return new MacHashFunction("HmacMD5", key, hmacToString("hmacMd5", key));
    }

    public static HashFunction hmacSha1(Key key) {
        return new MacHashFunction("HmacSHA1", key, hmacToString("hmacSha1", key));
    }

    public static HashFunction hmacSha256(Key key) {
        return new MacHashFunction("HmacSHA256", key, hmacToString("hmacSha256", key));
    }

    public static HashFunction hmacSha512(Key key) {
        return new MacHashFunction("HmacSHA512", key, hmacToString("hmacSha512", key));
    }

    public static int consistentHash(HashCode hashCode, int i14) {
        return consistentHash(hashCode.padToLong(), i14);
    }

    public static HashFunction concatenating(HashFunction hashFunction, HashFunction hashFunction2, HashFunction... hashFunctionArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hashFunction);
        arrayList.add(hashFunction2);
        Collections.addAll(arrayList, hashFunctionArr);
        return new ConcatenatedHashFunction((HashFunction[]) arrayList.toArray(new HashFunction[0]));
    }
}
