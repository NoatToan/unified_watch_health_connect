package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes4.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final v timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(v vVar, int i, long j) {
        this.timeline = vVar;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
