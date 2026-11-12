package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface PrimitiveSink {
    @CanIgnoreReturnValue
    PrimitiveSink putBoolean(boolean z14);

    @CanIgnoreReturnValue
    PrimitiveSink putByte(byte b14);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(ByteBuffer byteBuffer);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(byte[] bArr);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(byte[] bArr, int i14, int i15);

    @CanIgnoreReturnValue
    PrimitiveSink putChar(char c14);

    @CanIgnoreReturnValue
    PrimitiveSink putDouble(double d14);

    @CanIgnoreReturnValue
    PrimitiveSink putFloat(float f14);

    @CanIgnoreReturnValue
    PrimitiveSink putInt(int i14);

    @CanIgnoreReturnValue
    PrimitiveSink putLong(long j8);

    @CanIgnoreReturnValue
    PrimitiveSink putShort(short s8);

    @CanIgnoreReturnValue
    PrimitiveSink putString(CharSequence charSequence, Charset charset);

    @CanIgnoreReturnValue
    PrimitiveSink putUnencodedChars(CharSequence charSequence);
}
