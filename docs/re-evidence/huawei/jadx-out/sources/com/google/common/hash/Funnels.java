package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.huawei.operation.utils.Constants;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class Funnels {

    enum ByteArrayFunnel implements Funnel<byte[]> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public void funnel(byte[] bArr, PrimitiveSink primitiveSink) {
            primitiveSink.putBytes(bArr);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    enum UnencodedCharsFunnel implements Funnel<CharSequence> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
            primitiveSink.putUnencodedChars(charSequence);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }

    enum IntegerFunnel implements Funnel<Integer> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public void funnel(Integer num, PrimitiveSink primitiveSink) {
            primitiveSink.putInt(num.intValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    enum LongFunnel implements Funnel<Long> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public void funnel(Long l, PrimitiveSink primitiveSink) {
            primitiveSink.putLong(l.longValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }
    }

    public static OutputStream e(PrimitiveSink primitiveSink) {
        return new e(primitiveSink);
    }

    static class e extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final PrimitiveSink f4572b;

        e(PrimitiveSink primitiveSink) {
            this.f4572b = (PrimitiveSink) Preconditions.checkNotNull(primitiveSink);
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.f4572b.putByte((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.f4572b.putBytes(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.f4572b.putBytes(bArr, i, i2);
        }

        public String toString() {
            return "Funnels.asOutputStream(" + this.f4572b + Constants.RIGHT_BRACKET_ONLY;
        }
    }
}
