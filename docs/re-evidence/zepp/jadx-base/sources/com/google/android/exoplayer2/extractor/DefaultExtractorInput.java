package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int h = 65536;
    private static final int i = 524288;
    private static final int j = 4096;
    private final DataReader b;
    private final long c;
    private long d;
    private int f;
    private int g;
    private byte[] e = new byte[65536];
    private final byte[] a = new byte[4096];

    public DefaultExtractorInput(DataReader dataReader, long position, long length) {
        this.b = dataReader;
        this.d = position;
        this.c = length;
    }

    private void c(int bytesRead) {
        if (bytesRead != -1) {
            this.d += (long) bytesRead;
        }
    }

    private void d(int length) {
        int i2 = this.f + length;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, Util.constrainValue(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int e(byte[] target, int offset, int length) {
        int i2 = this.g;
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, length);
        System.arraycopy(this.e, 0, target, offset, iMin);
        h(iMin);
        return iMin;
    }

    private int f(byte[] target, int offset, int length, int bytesAlreadyRead, boolean allowEndOfInput) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i2 = this.b.read(target, offset + bytesAlreadyRead, length - bytesAlreadyRead);
        if (i2 != -1) {
            return bytesAlreadyRead + i2;
        }
        if (bytesAlreadyRead == 0 && allowEndOfInput) {
            return -1;
        }
        throw new EOFException();
    }

    private int g(int length) {
        int iMin = Math.min(this.g, length);
        h(iMin);
        return iMin;
    }

    private void h(int bytesConsumed) {
        int i2 = this.g - bytesConsumed;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, bytesConsumed, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int length, boolean allowEndOfInput) throws IOException {
        d(length);
        int iF = this.g - this.f;
        while (iF < length) {
            iF = f(this.e, this.f, length, iF, allowEndOfInput);
            if (iF == -1) {
                return false;
            }
            this.g = this.f + iF;
        }
        this.f += length;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.c;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.d + ((long) this.f);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.d;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] target, int offset, int length) throws IOException {
        int iMin;
        d(length);
        int i2 = this.g;
        int i3 = this.f;
        int i4 = i2 - i3;
        if (i4 == 0) {
            iMin = f(this.e, i3, length, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.g += iMin;
        } else {
            iMin = Math.min(length, i4);
        }
        System.arraycopy(this.e, this.f, target, offset, iMin);
        this.f += iMin;
        return iMin;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] target, int offset, int length, boolean allowEndOfInput) throws IOException {
        if (!advancePeekPosition(length, allowEndOfInput)) {
            return false;
        }
        System.arraycopy(this.e, this.f - length, target, offset, length);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
        int iE = e(buffer, offset, length);
        if (iE == 0) {
            iE = f(buffer, offset, length, 0, true);
        }
        c(iE);
        return iE;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] target, int offset, int length, boolean allowEndOfInput) throws IOException {
        int iE = e(target, offset, length);
        while (iE < length && iE != -1) {
            iE = f(target, offset, length, iE, allowEndOfInput);
        }
        c(iE);
        return iE != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.f = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long position, E e) throws Throwable {
        Assertions.checkArgument(position >= 0);
        this.d = position;
        throw e;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int length) throws IOException {
        int iG = g(length);
        if (iG == 0) {
            byte[] bArr = this.a;
            iG = f(bArr, 0, Math.min(length, bArr.length), 0, true);
        }
        c(iG);
        return iG;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int length, boolean allowEndOfInput) throws IOException {
        int iG = g(length);
        while (iG < length && iG != -1) {
            iG = f(this.a, -iG, Math.min(length, this.a.length + iG), iG, allowEndOfInput);
        }
        c(iG);
        return iG != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] target, int offset, int length) throws IOException {
        peekFully(target, offset, length, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] target, int offset, int length) throws IOException {
        readFully(target, offset, length, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int length) throws IOException {
        skipFully(length, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int length) throws IOException {
        advancePeekPosition(length, false);
    }
}
