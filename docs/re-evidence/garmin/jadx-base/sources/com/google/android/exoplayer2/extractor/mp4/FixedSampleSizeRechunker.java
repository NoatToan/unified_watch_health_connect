package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes13.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        private Results(long[] jArr, int[] iArr, int i14, long[] jArr2, int[] iArr2, long j8) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i14;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j8;
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static Results rechunk(int i14, long[] jArr, int[] iArr, long j8) {
        int i15 = 8192 / i14;
        int iCeilDivide = 0;
        for (int i16 : iArr) {
            iCeilDivide += Util.ceilDivide(i16, i15);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr2 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        int i17 = 0;
        int i18 = 0;
        int iMax = 0;
        for (int i19 = 0; i19 < iArr.length; i19++) {
            int i24 = iArr[i19];
            long j14 = jArr[i19];
            while (i24 > 0) {
                int iMin = Math.min(i15, i24);
                jArr2[i18] = j14;
                int i25 = i14 * iMin;
                iArr2[i18] = i25;
                iMax = Math.max(iMax, i25);
                jArr3[i18] = ((long) i17) * j8;
                iArr3[i18] = 1;
                j14 += (long) iArr2[i18];
                i17 += iMin;
                i24 -= iMin;
                i18++;
            }
        }
        return new Results(jArr2, iArr2, iMax, jArr3, iArr3, j8 * ((long) i17));
    }
}
