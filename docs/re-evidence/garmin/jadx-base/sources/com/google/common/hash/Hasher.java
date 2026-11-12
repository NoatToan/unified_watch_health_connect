package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface Hasher extends PrimitiveSink {
    HashCode hash();

    @Deprecated
    int hashCode();

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBoolean(boolean z14);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putByte(byte b14);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(byte[] bArr);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(byte[] bArr, int i14, int i15);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putChar(char c14);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putDouble(double d14);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putFloat(float f14);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putInt(int i14);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putLong(long j8);

    @CanIgnoreReturnValue
    <T> Hasher putObject(@ParametricNullness T t7, Funnel<? super T> funnel);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putShort(short s8);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putString(CharSequence charSequence, Charset charset);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putUnencodedChars(CharSequence charSequence);
}
