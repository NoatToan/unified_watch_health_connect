package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
@Immutable
@ElementTypesAreNonnullByDefault
abstract class AbstractHashFunction implements HashFunction {
    @Override // com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i14, int i15) {
        Preconditions.checkPositionIndexes(i14, i14 + i15, bArr.length);
        return newHasher(i15).putBytes(bArr, i14, i15).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashInt(int i14) {
        return newHasher(4).putInt(i14).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashLong(long j8) {
        return newHasher(8).putLong(j8).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public <T> HashCode hashObject(@ParametricNullness T t7, Funnel<? super T> funnel) {
        return newHasher().putObject(t7, funnel).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return newHasher().putString(charSequence, charset).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        return newHasher(charSequence.length() * 2).putUnencodedChars(charSequence).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher(int i14) {
        Preconditions.checkArgument(i14 >= 0, "expectedInputSize must be >= 0 but was %s", i14);
        return newHasher();
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr) {
        return hashBytes(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).putBytes(byteBuffer).hash();
    }
}
