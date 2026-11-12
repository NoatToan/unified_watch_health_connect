package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
abstract class b extends c {
    private static final long b = 0;
    public final HashFunction[] a;

    public class a implements Hasher {
        public final /* synthetic */ Hasher[] a;

        public a(Hasher[] hasherArr) {
            this.a = hasherArr;
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            return b.this.b(this.a);
        }

        @Override // com.google.common.hash.Hasher
        public <T> Hasher putObject(T t, Funnel<? super T> funnel) {
            for (Hasher hasher : this.a) {
                hasher.putObject(t, funnel);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putBoolean(boolean z) {
            for (Hasher hasher : this.a) {
                hasher.putBoolean(z);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b) {
            for (Hasher hasher : this.a) {
                hasher.putByte(b);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putChar(char c) {
            for (Hasher hasher : this.a) {
                hasher.putChar(c);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putDouble(double d) {
            for (Hasher hasher : this.a) {
                hasher.putDouble(d);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putFloat(float f) {
            for (Hasher hasher : this.a) {
                hasher.putFloat(f);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putInt(int i) {
            for (Hasher hasher : this.a) {
                hasher.putInt(i);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putLong(long j) {
            for (Hasher hasher : this.a) {
                hasher.putLong(j);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putShort(short s) {
            for (Hasher hasher : this.a) {
                hasher.putShort(s);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putString(CharSequence charSequence, Charset charset) {
            for (Hasher hasher : this.a) {
                hasher.putString(charSequence, charset);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putUnencodedChars(CharSequence charSequence) {
            for (Hasher hasher : this.a) {
                hasher.putUnencodedChars(charSequence);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr) {
            for (Hasher hasher : this.a) {
                hasher.putBytes(bArr);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr, int i, int i2) {
            for (Hasher hasher : this.a) {
                hasher.putBytes(bArr, i, i2);
            }
            return this;
        }

        @Override // com.google.common.hash.PrimitiveSink
        public Hasher putBytes(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            for (Hasher hasher : this.a) {
                byteBuffer.position(iPosition);
                hasher.putBytes(byteBuffer);
            }
            return this;
        }
    }

    public b(HashFunction... hashFunctionArr) {
        for (HashFunction hashFunction : hashFunctionArr) {
            Preconditions.checkNotNull(hashFunction);
        }
        this.a = hashFunctionArr;
    }

    private Hasher a(Hasher[] hasherArr) {
        return new a(hasherArr);
    }

    public abstract HashCode b(Hasher[] hasherArr);

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        int length = this.a.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i = 0; i < length; i++) {
            hasherArr[i] = this.a[i].newHasher();
        }
        return a(hasherArr);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.HashFunction
    public Hasher newHasher(int i) {
        Preconditions.checkArgument(i >= 0);
        int length = this.a.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i2 = 0; i2 < length; i2++) {
            hasherArr[i2] = this.a[i2].newHasher(i);
        }
        return a(hasherArr);
    }
}
