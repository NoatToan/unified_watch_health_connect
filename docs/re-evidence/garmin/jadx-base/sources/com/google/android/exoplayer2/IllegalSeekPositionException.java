package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes13.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(Timeline timeline, int i14, long j8) {
        this.timeline = timeline;
        this.windowIndex = i14;
        this.positionMs = j8;
    }
}
