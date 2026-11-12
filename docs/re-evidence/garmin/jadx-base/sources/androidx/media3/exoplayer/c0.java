package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface c0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ja.q f8804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f8806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f8807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f8808e;

        public a(ja.q qVar, androidx.media3.common.d0 d0Var, androidx.media3.exoplayer.source.j.b bVar, long j8, long j14, float f14, boolean z14, boolean z15, long j15) {
            this.f8804a = qVar;
            this.f8805b = j14;
            this.f8806c = f14;
            this.f8807d = z15;
            this.f8808e = j15;
        }
    }

    static {
        new androidx.media3.exoplayer.source.j.b(new Object());
    }

    default boolean a(a aVar) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean b() {
        fa.k.g("shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default void c(ja.q qVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default void d(a aVar, wa.g[] gVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void e(ja.q qVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default boolean f(a aVar) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default void g(ja.q qVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    xa.f getAllocator();

    default long getBackBufferDurationUs() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean retainBackBufferFromKeyframe() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }
}
