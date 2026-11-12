package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes14.dex */
public final class MediaLoadData {
    public final int dataType;
    public final long mediaEndTimeMs;
    public final long mediaStartTimeMs;
    public final Format trackFormat;
    public final Object trackSelectionData;
    public final int trackSelectionReason;
    public final int trackType;

    public MediaLoadData(int i14) {
        this(i14, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public MediaLoadData(int i14, int i15, Format format, int i16, Object obj, long j8, long j14) {
        this.dataType = i14;
        this.trackType = i15;
        this.trackFormat = format;
        this.trackSelectionReason = i16;
        this.trackSelectionData = obj;
        this.mediaStartTimeMs = j8;
        this.mediaEndTimeMs = j14;
    }
}
