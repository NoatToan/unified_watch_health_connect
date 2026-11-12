package com.google.firebase.perf.metrics;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public class FrameMetricsCalculator {

    public static class PerfFrameMetrics {
        int frozenFrames;
        int slowFrames;
        int totalFrames;

        public PerfFrameMetrics(int i14, int i15, int i16) {
            this.totalFrames = i14;
            this.slowFrames = i15;
            this.frozenFrames = i16;
        }

        public PerfFrameMetrics deltaFrameMetricsFromSnapshot(PerfFrameMetrics perfFrameMetrics) {
            return new PerfFrameMetrics(this.totalFrames - perfFrameMetrics.getTotalFrames(), this.slowFrames - perfFrameMetrics.getSlowFrames(), this.frozenFrames - perfFrameMetrics.getFrozenFrames());
        }

        public int getFrozenFrames() {
            return this.frozenFrames;
        }

        public int getSlowFrames() {
            return this.slowFrames;
        }

        public int getTotalFrames() {
            return this.totalFrames;
        }
    }

    public static PerfFrameMetrics calculateFrameMetrics(SparseIntArray[] sparseIntArrayArr) {
        int i14;
        int i15;
        SparseIntArray sparseIntArray;
        int i16 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i14 = 0;
            i15 = 0;
        } else {
            int i17 = 0;
            i14 = 0;
            i15 = 0;
            while (i16 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i16);
                int iValueAt = sparseIntArray.valueAt(i16);
                i17 += iValueAt;
                if (iKeyAt > 700) {
                    i15 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i14 += iValueAt;
                }
                i16++;
            }
            i16 = i17;
        }
        return new PerfFrameMetrics(i16, i14, i15);
    }
}
