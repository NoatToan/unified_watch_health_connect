package com.bumptech.glide.load.data;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f28545c = {-1, -31, 0, Ascii.FS, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28546d = 31;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f28547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28548b;

    public g(InputStream inputStream, int i14) {
        super(inputStream);
        if (i14 < -1 || i14 > 8) {
            vb.h.s(am.j.h(i14, "Cannot add invalid orientation: "));
            throw null;
        }
        this.f28547a = (byte) i14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i14) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i14, int i15) throws IOException {
        int i16;
        int i17 = this.f28548b;
        int i18 = f28546d;
        if (i17 > i18) {
            i16 = super.read(bArr, i14, i15);
        } else if (i17 == i18) {
            bArr[i14] = this.f28547a;
            i16 = 1;
        } else if (i17 < 2) {
            i16 = super.read(bArr, i14, 2 - i17);
        } else {
            int iMin = Math.min(i18 - i17, i15);
            System.arraycopy(f28545c, this.f28548b - 2, bArr, i14, iMin);
            i16 = iMin;
        }
        if (i16 > 0) {
            this.f28548b += i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jSkip = super.skip(j8);
        if (jSkip > 0) {
            this.f28548b = (int) (((long) this.f28548b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i14;
        int i15;
        int i16 = this.f28548b;
        if (i16 < 2 || i16 > (i15 = f28546d)) {
            i14 = super.read();
        } else if (i16 == i15) {
            i14 = this.f28547a;
        } else {
            i14 = f28545c[i16 - 2] & UnsignedBytes.MAX_VALUE;
        }
        if (i14 != -1) {
            this.f28548b++;
        }
        return i14;
    }
}
