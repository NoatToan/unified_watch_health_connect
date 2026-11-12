package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.common.primitives.UnsignedBytes;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
final class VarintReader {
    private static final int STATE_BEGIN_READING = 0;
    private static final int STATE_READ_CONTENTS = 1;
    private static final long[] VARINT_LENGTH_MASKS = {128, 64, 32, 16, 8, 4, 2, 1};
    private int length;
    private final byte[] scratch = new byte[8];
    private int state;

    public static long assembleVarint(byte[] bArr, int i14, boolean z14) {
        long j8 = ((long) bArr[0]) & 255;
        if (z14) {
            j8 &= ~VARINT_LENGTH_MASKS[i14 - 1];
        }
        for (int i15 = 1; i15 < i14; i15++) {
            j8 = (j8 << 8) | (((long) bArr[i15]) & 255);
        }
        return j8;
    }

    public static int parseUnsignedVarintLength(int i14) {
        int i15 = 0;
        while (true) {
            long[] jArr = VARINT_LENGTH_MASKS;
            if (i15 >= jArr.length) {
                return -1;
            }
            if ((jArr[i15] & ((long) i14)) != 0) {
                return i15 + 1;
            }
            i15++;
        }
    }

    public int getLastLength() {
        return this.length;
    }

    public long readUnsignedVarint(ExtractorInput extractorInput, boolean z14, boolean z15, int i14) {
        if (this.state == 0) {
            if (!extractorInput.readFully(this.scratch, 0, 1, z14)) {
                return -1L;
            }
            int unsignedVarintLength = parseUnsignedVarintLength(this.scratch[0] & UnsignedBytes.MAX_VALUE);
            this.length = unsignedVarintLength;
            if (unsignedVarintLength == -1) {
                h.z("No valid varint length mask found");
                return 0L;
            }
            this.state = 1;
        }
        int i15 = this.length;
        if (i15 > i14) {
            this.state = 0;
            return -2L;
        }
        if (i15 != 1) {
            extractorInput.readFully(this.scratch, 1, i15 - 1);
        }
        this.state = 0;
        return assembleVarint(this.scratch, this.length, z15);
    }

    public void reset() {
        this.state = 0;
        this.length = 0;
    }
}
