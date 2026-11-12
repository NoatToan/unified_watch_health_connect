package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
@Immutable
@ElementTypesAreNonnullByDefault
abstract class AbstractCompositeHashFunction extends AbstractHashFunction {
    private static final long serialVersionUID = 0;
    final HashFunction[] functions;

    public AbstractCompositeHashFunction(HashFunction... hashFunctionArr) {
        for (HashFunction hashFunction : hashFunctionArr) {
            Preconditions.checkNotNull(hashFunction);
        }
        this.functions = hashFunctionArr;
    }

    private Hasher fromHashers(final Hasher[] hasherArr) {
        return new Hasher(this) { // from class: com.google.common.hash.AbstractCompositeHashFunction.1
            final /* synthetic */ AbstractCompositeHashFunction this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.hash.Hasher
            public HashCode hash() {
                return this.this$0.makeHash(hasherArr);
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBoolean(boolean z14) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBoolean(z14);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putByte(byte b14) {
                for (Hasher hasher : hasherArr) {
                    hasher.putByte(b14);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(ByteBuffer byteBuffer) {
                int iPosition = byteBuffer.position();
                for (Hasher hasher : hasherArr) {
                    Java8Compatibility.position(byteBuffer, iPosition);
                    hasher.putBytes(byteBuffer);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putChar(char c14) {
                for (Hasher hasher : hasherArr) {
                    hasher.putChar(c14);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putDouble(double d14) {
                for (Hasher hasher : hasherArr) {
                    hasher.putDouble(d14);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putFloat(float f14) {
                for (Hasher hasher : hasherArr) {
                    hasher.putFloat(f14);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putInt(int i14) {
                for (Hasher hasher : hasherArr) {
                    hasher.putInt(i14);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putLong(long j8) {
                for (Hasher hasher : hasherArr) {
                    hasher.putLong(j8);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher
            public <T> Hasher putObject(@ParametricNullness T t7, Funnel<? super T> funnel) {
                for (Hasher hasher : hasherArr) {
                    hasher.putObject(t7, funnel);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putShort(short s8) {
                for (Hasher hasher : hasherArr) {
                    hasher.putShort(s8);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putString(CharSequence charSequence, Charset charset) {
                for (Hasher hasher : hasherArr) {
                    hasher.putString(charSequence, charset);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putUnencodedChars(CharSequence charSequence) {
                for (Hasher hasher : hasherArr) {
                    hasher.putUnencodedChars(charSequence);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(byte[] bArr) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBytes(bArr);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(byte[] bArr, int i14, int i15) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBytes(bArr, i14, i15);
                }
                return this;
            }
        };
    }

    public abstract HashCode makeHash(Hasher[] hasherArr);

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public Hasher newHasher(int i14) {
        Preconditions.checkArgument(i14 >= 0);
        int length = this.functions.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i15 = 0; i15 < length; i15++) {
            hasherArr[i15] = this.functions[i15].newHasher(i14);
        }
        return fromHashers(hasherArr);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        int length = this.functions.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i14 = 0; i14 < length; i14++) {
            hasherArr[i14] = this.functions[i14].newHasher();
        }
        return fromHashers(hasherArr);
    }
}
