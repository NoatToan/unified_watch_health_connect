package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class HashCode {
    private static final char[] hexDigits = "0123456789abcdef".toCharArray();

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    abstract boolean equalsSameBits(HashCode hashCode);

    public abstract long padToLong();

    abstract void writeBytesToImpl(byte[] bArr, int i, int i2);

    HashCode() {
    }

    public int writeBytesTo(byte[] bArr, int i, int i2) {
        int iE = Ints.e(i2, bits() / 8);
        Preconditions.checkPositionIndexes(i, i + iE, bArr.length);
        writeBytesToImpl(bArr, i, iE);
        return iE;
    }

    byte[] getBytesInternal() {
        return asBytes();
    }

    public static HashCode fromInt(int i) {
        return new d(i);
    }

    static final class d extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4574a;

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 32;
        }

        d(int i) {
            this.f4574a = i;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            int i = this.f4574a;
            return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return this.f4574a;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return UnsignedInts.e(this.f4574a);
        }

        @Override // com.google.common.hash.HashCode
        void writeBytesToImpl(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) (this.f4574a >> (i3 * 8));
            }
        }

        @Override // com.google.common.hash.HashCode
        boolean equalsSameBits(HashCode hashCode) {
            return this.f4574a == hashCode.asInt();
        }
    }

    public static HashCode fromLong(long j) {
        return new e(j);
    }

    static final class e extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final long d;

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 64;
        }

        e(long j) {
            this.d = j;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            long j = this.d;
            return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return (int) this.d;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            return this.d;
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return this.d;
        }

        @Override // com.google.common.hash.HashCode
        void writeBytesToImpl(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) (this.d >> (i3 * 8));
            }
        }

        @Override // com.google.common.hash.HashCode
        boolean equalsSameBits(HashCode hashCode) {
            return this.d == hashCode.asLong();
        }
    }

    public static HashCode fromBytes(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 1, "A HashCode must contain at least 1 byte.");
        return fromBytesNoCopy((byte[]) bArr.clone());
    }

    public static HashCode fromBytesNoCopy(byte[] bArr) {
        return new c(bArr);
    }

    static final class c extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f4573c;

        c(byte[] bArr) {
            this.f4573c = (byte[]) Preconditions.checkNotNull(bArr);
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return this.f4573c.length * 8;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            return (byte[]) this.f4573c.clone();
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            byte[] bArr = this.f4573c;
            Preconditions.checkState(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f4573c;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            byte[] bArr = this.f4573c;
            Preconditions.checkState(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return padToLong();
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            long j = this.f4573c[0] & 255;
            for (int i = 1; i < Math.min(this.f4573c.length, 8); i++) {
                j |= (((long) this.f4573c[i]) & 255) << (i * 8);
            }
            return j;
        }

        @Override // com.google.common.hash.HashCode
        void writeBytesToImpl(byte[] bArr, int i, int i2) {
            System.arraycopy(this.f4573c, 0, bArr, i, i2);
        }

        @Override // com.google.common.hash.HashCode
        byte[] getBytesInternal() {
            return this.f4573c;
        }

        @Override // com.google.common.hash.HashCode
        boolean equalsSameBits(HashCode hashCode) {
            if (this.f4573c.length != hashCode.getBytesInternal().length) {
                return false;
            }
            boolean z = true;
            int i = 0;
            while (true) {
                byte[] bArr = this.f4573c;
                if (i >= bArr.length) {
                    return z;
                }
                z &= bArr[i] == hashCode.getBytesInternal()[i];
                i++;
            }
        }
    }

    public static HashCode fromString(String str) {
        Preconditions.checkArgument(str.length() >= 2, "input string (%s) must have at least 2 characters", str);
        Preconditions.checkArgument(str.length() % 2 == 0, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((decode(str.charAt(i)) << 4) + decode(str.charAt(i + 1)));
        }
        return fromBytesNoCopy(bArr);
    }

    private static int decode(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + c2);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) obj;
        return bits() == hashCode.bits() && equalsSameBits(hashCode);
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bytesInternal = getBytesInternal();
        int i = bytesInternal[0] & 255;
        for (int i2 = 1; i2 < bytesInternal.length; i2++) {
            i |= (bytesInternal[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bytesInternal = getBytesInternal();
        StringBuilder sb = new StringBuilder(bytesInternal.length * 2);
        for (byte b2 : bytesInternal) {
            char[] cArr = hexDigits;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
