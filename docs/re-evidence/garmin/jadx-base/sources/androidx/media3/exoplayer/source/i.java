package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.x0;

/* JADX INFO: loaded from: classes.dex */
public interface i extends s {

    public interface a extends s.a<i> {
        void a(i iVar);
    }

    void c(a aVar, long j8);

    long d(wa.g[] gVarArr, boolean[] zArr, sa.n[] nVarArr, boolean[] zArr2, long j8);

    void discardBuffer(long j8, boolean z14);

    long e(long j8, x0 x0Var);

    sa.r getTrackGroups();

    void maybeThrowPrepareError();

    long readDiscontinuity();

    long seekToUs(long j8);
}
