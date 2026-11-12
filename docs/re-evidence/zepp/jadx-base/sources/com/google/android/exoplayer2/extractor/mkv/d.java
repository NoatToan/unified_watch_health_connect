package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class d {
    private static final int d = 0;
    private static final int e = 1;
    private static final long[] f = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] a = new byte[8];
    private int b;
    private int c;

    public static long a(byte[] varintBytes, int varintLength, boolean removeLengthMask) {
        long j = ((long) varintBytes[0]) & 255;
        if (removeLengthMask) {
            j &= ~f[varintLength - 1];
        }
        for (int i = 1; i < varintLength; i++) {
            j = (j << 8) | (((long) varintBytes[i]) & 255);
        }
        return j;
    }

    public static int c(int firstByte) {
        int i = 0;
        while (true) {
            long[] jArr = f;
            if (i >= jArr.length) {
                return -1;
            }
            if ((jArr[i] & ((long) firstByte)) != 0) {
                return i + 1;
            }
            i++;
        }
    }

    public int b() {
        return this.c;
    }

    public long d(ExtractorInput input, boolean allowEndOfInput, boolean removeLengthMask, int maximumAllowedLength) throws IOException {
        if (this.b == 0) {
            if (!input.readFully(this.a, 0, 1, allowEndOfInput)) {
                return -1L;
            }
            int iC = c(this.a[0] & 255);
            this.c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i = this.c;
        if (i > maximumAllowedLength) {
            this.b = 0;
            return -2L;
        }
        if (i != 1) {
            input.readFully(this.a, 1, i - 1);
        }
        this.b = 0;
        return a(this.a, this.c, removeLengthMask);
    }

    public void e() {
        this.b = 0;
        this.c = 0;
    }
}
