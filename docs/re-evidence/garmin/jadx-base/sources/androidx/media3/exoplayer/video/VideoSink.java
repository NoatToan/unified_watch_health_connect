package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.q;
import fa.s;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface VideoSink {

    public static final class VideoSinkException extends Exception {
        public final q format;

        public VideoSinkException(Throwable th3, q qVar) {
            super(th3);
            this.format = qVar;
        }
    }

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0130a f9776a = new C0130a();

        /* JADX INFO: renamed from: androidx.media3.exoplayer.video.VideoSink$a$a, reason: collision with other inner class name */
        public class C0130a implements a {
            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public final void a() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public final void b() {
            }
        }

        void a();

        void b();
    }

    void c();

    Surface d();

    void e(Surface surface, s sVar);

    void f(long j8, long j14, long j15, long j16);

    void g();

    void h(q qVar);

    void i(boolean z14);

    boolean isEnded();

    boolean isInitialized();

    void j(za.f fVar);

    void l(q qVar);

    void m(int i14);

    void n(boolean z14);

    boolean o(long j8, boolean z14, long j14, long j15, b.C0131b c0131b);

    void p(b.a aVar, Executor executor);

    void q(List<Object> list);

    boolean r(boolean z14);

    void release();

    void render(long j8, long j14);

    void s();

    void setPlaybackSpeed(float f14);

    void t();

    void u();

    void v(boolean z14);
}
