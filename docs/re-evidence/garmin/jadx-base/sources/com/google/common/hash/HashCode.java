package com.google.common.hash;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.primitives.UnsignedInts;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
public abstract class HashCode {
    private static final char[] hexDigits = "0123456789abcdef".toCharArray();

    public static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final byte[] bytes;

        public BytesHashCode(byte[] bArr) {
            this.bytes = (byte[]) Preconditions.checkNotNull(bArr);
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            return (byte[]) this.bytes.clone();
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            byte[] bArr = this.bytes;
            Preconditions.checkState(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.bytes;
            return ((bArr2[3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr2[0] & UnsignedBytes.MAX_VALUE) | ((bArr2[1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr2[2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            byte[] bArr = this.bytes;
            Preconditions.checkState(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return padToLong();
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return this.bytes.length * 8;
        }

        @Override // com.google.common.hash.HashCode
        public boolean equalsSameBits(HashCode hashCode) {
            if (this.bytes.length != hashCode.getBytesInternal().length) {
                return false;
            }
            boolean z14 = true;
            int i14 = 0;
            while (true) {
                byte[] bArr = this.bytes;
                if (i14 >= bArr.length) {
                    return z14;
                }
                z14 &= bArr[i14] == hashCode.getBytesInternal()[i14];
                i14++;
            }
        }

        @Override // com.google.common.hash.HashCode
        public byte[] getBytesInternal() {
            return this.bytes;
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            long j8 = this.bytes[0] & UnsignedBytes.MAX_VALUE;
            for (int i14 = 1; i14 < Math.min(this.bytes.length, 8); i14++) {
                j8 |= (((long) this.bytes[i14]) & 255) << (i14 * 8);
            }
            return j8;
        }

        @Override // com.google.common.hash.HashCode
        public void writeBytesToImpl(byte[] bArr, int i14, int i15) {
            System.arraycopy(this.bytes, 0, bArr, i14, i15);
        }
    }

    public static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final int hash;

        public IntHashCode(int i14) {
            this.hash = i14;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            int i14 = this.hash;
            return new byte[]{(byte) i14, (byte) (i14 >> 8), (byte) (i14 >> 16), (byte) (i14 >> 24)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 32;
        }

        @Override // com.google.common.hash.HashCode
        public boolean equalsSameBits(HashCode hashCode) {
            return this.hash == hashCode.asInt();
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return UnsignedInts.toLong(this.hash);
        }

        @Override // com.google.common.hash.HashCode
        public void writeBytesToImpl(byte[] bArr, int i14, int i15) {
            for (int i16 = 0; i16 < i15; i16++) {
                bArr[i14 + i16] = (byte) (this.hash >> (i16 * 8));
            }
        }
    }

    public static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final long hash;

        public LongHashCode(long j8) {
            this.hash = j8;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            long j8 = this.hash;
            return new byte[]{(byte) j8, (byte) (j8 >> 8), (byte) (j8 >> 16), (byte) (j8 >> 24), (byte) (j8 >> 32), (byte) (j8 >> 40), (byte) (j8 >> 48), (byte) (j8 >> 56)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return (int) this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            return this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 64;
        }

        @Override // com.google.common.hash.HashCode
        public boolean equalsSameBits(HashCode hashCode) {
            return this.hash == hashCode.asLong();
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public void writeBytesToImpl(byte[] bArr, int i14, int i15) {
            for (int i16 = 0; i16 < i15; i16++) {
                bArr[i14 + i16] = (byte) (this.hash >> (i16 * 8));
            }
        }
    }

    private static int decode(char c14) {
        if (c14 >= '0' && c14 <= '9') {
            return c14 - '0';
        }
        if (c14 >= 'a' && c14 <= 'f') {
            return c14 - 'W';
        }
        h.s(k.f("Illegal hexadecimal character: ", c14));
        return 0;
    }

    public static HashCode fromBytes(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 1, "A HashCode must contain at least 1 byte.");
        return fromBytesNoCopy((byte[]) bArr.clone());
    }

    public static HashCode fromBytesNoCopy(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    public static HashCode fromInt(int i14) {
        return new IntHashCode(i14);
    }

    public static HashCode fromLong(long j8) {
        return new LongHashCode(j8);
    }

    public static HashCode fromString(String str) {
        Preconditions.checkArgument(str.length() >= 2, "input string (%s) must have at least 2 characters", str);
        Preconditions.checkArgument(str.length() % 2 == 0, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i14 = 0; i14 < str.length(); i14 += 2) {
            bArr[i14 / 2] = (byte) ((decode(str.charAt(i14)) << 4) + decode(str.charAt(i14 + 1)));
        }
        return fromBytesNoCopy(bArr);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    public final boolean equals(Object obj) {
        if (obj instanceof HashCode) {
            HashCode hashCode = (HashCode) obj;
            if (bits() == hashCode.bits() && equalsSameBits(hashCode)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean equalsSameBits(HashCode hashCode);

    public byte[] getBytesInternal() {
        return asBytes();
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bytesInternal = getBytesInternal();
        int i14 = bytesInternal[0] & UnsignedBytes.MAX_VALUE;
        for (int i15 = 1; i15 < bytesInternal.length; i15++) {
            i14 |= (bytesInternal[i15] & UnsignedBytes.MAX_VALUE) << (i15 * 8);
        }
        return i14;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] bytesInternal = getBytesInternal();
        StringBuilder sb3 = new StringBuilder(bytesInternal.length * 2);
        for (byte b14 : bytesInternal) {
            char[] cArr = hexDigits;
            sb3.append(cArr[(b14 >> 4) & 15]);
            sb3.append(cArr[b14 & Ascii.SI]);
        }
        return sb3.toString();
    }

    @CanIgnoreReturnValue
    public int writeBytesTo(byte[] bArr, int i14, int i15) {
        int iMin = Ints.min(i15, bits() / 8);
        Preconditions.checkPositionIndexes(i14, i14 + iMin, bArr.length);
        writeBytesToImpl(bArr, i14, iMin);
        return iMin;
    }

    public abstract void writeBytesToImpl(byte[] bArr, int i14, int i15);
}
