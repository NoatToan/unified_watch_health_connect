package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final d0 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(d0 d0Var, int i14, long j8) {
        this.timeline = d0Var;
        this.windowIndex = i14;
        this.positionMs = j8;
    }
}
