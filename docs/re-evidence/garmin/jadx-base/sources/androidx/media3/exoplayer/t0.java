package androidx.media3.exoplayer;

import ch.qos.logback.core.spi.AbstractComponentTracker;

/* JADX INFO: loaded from: classes.dex */
public interface t0 extends r0.b {

    public interface a {
        void a();

        void onWakeup();
    }

    default void c() {
    }

    void d(int i14, ja.q qVar, fa.c cVar);

    void disable();

    void e(androidx.media3.common.q[] qVarArr, sa.n nVar, long j8, long j14, androidx.media3.exoplayer.source.j.b bVar);

    void f(androidx.media3.common.d0 d0Var);

    void g(v0 v0Var, androidx.media3.common.q[] qVarArr, sa.n nVar, boolean z14, boolean z15, long j8, long j14, androidx.media3.exoplayer.source.j.b bVar);

    f getCapabilities();

    e0 getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    sa.n getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    default long k(long j8, long j14) {
        return AbstractComponentTracker.LINGERING_TIMEOUT;
    }

    void maybeThrowStreamError();

    default void release() {
    }

    void render(long j8, long j14);

    void reset();

    void resetPosition(long j8);

    void setCurrentStreamFinal();

    default void setPlaybackSpeed(float f14, float f15) {
    }

    void start();

    void stop();
}
