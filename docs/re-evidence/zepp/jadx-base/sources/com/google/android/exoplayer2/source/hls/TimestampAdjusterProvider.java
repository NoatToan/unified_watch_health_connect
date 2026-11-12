package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

/* JADX INFO: loaded from: classes3.dex */
public final class TimestampAdjusterProvider {
    private final SparseArray<TimestampAdjuster> a = new SparseArray<>();

    public TimestampAdjuster getAdjuster(int discontinuitySequence) {
        TimestampAdjuster timestampAdjuster = this.a.get(discontinuitySequence);
        if (timestampAdjuster != null) {
            return timestampAdjuster;
        }
        TimestampAdjuster timestampAdjuster2 = new TimestampAdjuster(TimestampAdjuster.MODE_SHARED);
        this.a.put(discontinuitySequence, timestampAdjuster2);
        return timestampAdjuster2;
    }

    public void reset() {
        this.a.clear();
    }
}
