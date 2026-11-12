package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractHasher implements Hasher {
    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            putBytes(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            Java8Compatibility.position(byteBuffer, byteBuffer.limit());
            return this;
        }
        for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
            putByte(byteBuffer.get());
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putChar(char c14) {
        putByte((byte) c14);
        putByte((byte) (c14 >>> '\b'));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putDouble(double d14) {
        return putLong(Double.doubleToRawLongBits(d14));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putFloat(float f14) {
        return putInt(Float.floatToRawIntBits(f14));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putInt(int i14) {
        putByte((byte) i14);
        putByte((byte) (i14 >>> 8));
        putByte((byte) (i14 >>> 16));
        putByte((byte) (i14 >>> 24));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putLong(long j8) {
        for (int i14 = 0; i14 < 64; i14 += 8) {
            putByte((byte) (j8 >>> i14));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher
    @CanIgnoreReturnValue
    public <T> Hasher putObject(@ParametricNullness T t7, Funnel<? super T> funnel) {
        funnel.funnel(t7, this);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putShort(short s8) {
        putByte((byte) s8);
        putByte((byte) (s8 >>> 8));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putString(CharSequence charSequence, Charset charset) {
        return putBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            putChar(charSequence.charAt(i14));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putBoolean(boolean z14) {
        return putByte(z14 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(byte[] bArr) {
        return putBytes(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(byte[] bArr, int i14, int i15) {
        Preconditions.checkPositionIndexes(i14, i14 + i15, bArr.length);
        for (int i16 = 0; i16 < i15; i16++) {
            putByte(bArr[i14 + i16]);
        }
        return this;
    }
}
