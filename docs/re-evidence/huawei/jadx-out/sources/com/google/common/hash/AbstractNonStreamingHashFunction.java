package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
@Immutable
@ElementTypesAreNonnullByDefault
abstract class AbstractNonStreamingHashFunction extends AbstractHashFunction {
    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public abstract HashCode hashBytes(byte[] bArr, int i, int i2);

    AbstractNonStreamingHashFunction() {
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return newHasher(32);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public Hasher newHasher(int i) {
        Preconditions.checkArgument(i >= 0);
        return new d(i);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashInt(int i) {
        return hashBytes(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashLong(long j) {
        return hashBytes(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            byteBufferOrder.putChar(charSequence.charAt(i));
        }
        return hashBytes(byteBufferOrder.array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return hashBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).putBytes(byteBuffer).hash();
    }

    final class d extends AbstractHasher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f4566b;

        d(int i) {
            this.f4566b = new c(i);
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b2) {
            this.f4566b.write(b2);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr, int i, int i2) {
            this.f4566b.write(bArr, i, i2);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(ByteBuffer byteBuffer) {
            this.f4566b.b(byteBuffer);
            return this;
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            return AbstractNonStreamingHashFunction.this.hashBytes(this.f4566b.a(), 0, this.f4566b.d());
        }
    }

    static final class c extends ByteArrayOutputStream {
        c(int i) {
            super(i);
        }

        void b(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (this.count + iRemaining > this.buf.length) {
                this.buf = Arrays.copyOf(this.buf, this.count + iRemaining);
            }
            byteBuffer.get(this.buf, this.count, iRemaining);
            this.count += iRemaining;
        }

        byte[] a() {
            return this.buf;
        }

        int d() {
            return this.count;
        }
    }
}
