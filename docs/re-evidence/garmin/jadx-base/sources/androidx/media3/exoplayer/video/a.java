package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.k0;
import androidx.media3.common.q;
import com.google.android.exoplayer2.C;
import fa.m;
import fa.s;
import fa.v;
import java.util.List;
import java.util.concurrent.Executor;
import za.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements VideoSink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f9777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f9778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f9779c = new q.b().a();

    public a(d dVar, e eVar) {
        this.f9777a = dVar;
        this.f9778b = eVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void c() {
        d dVar = this.f9777a;
        if (dVar.f9849e == 0) {
            dVar.f9849e = 1;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final Surface d() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void e(Surface surface, s sVar) {
        this.f9777a.h(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void f(long j8, long j14, long j15, long j16) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void g() {
        this.f9777a.f();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void h(q qVar) {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void i(boolean z14) {
        this.f9777a.f9849e = z14 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean isEnded() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void j(za.f fVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void l(q qVar) {
        int i14 = qVar.f8393u;
        int i15 = qVar.f8394v;
        q qVar2 = this.f9779c;
        if (i14 != qVar2.f8393u || i15 != qVar2.f8394v) {
            e eVar = this.f9778b;
            eVar.getClass();
            eVar.f9865g = new k0(i14, i15);
        }
        this.f9779c = qVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void m(int i14) {
        g gVar = this.f9777a.f9846b;
        if (gVar.f203202j == i14) {
            return;
        }
        gVar.f203202j = i14;
        gVar.d(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void n(boolean z14) {
        this.f9777a.c(z14);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean o(long j8, boolean z14, long j14, long j15, b.C0131b c0131b) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void p(b.a aVar, Executor executor) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void q(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean r(boolean z14) {
        return this.f9777a.b(z14);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void render(long j8, long j14) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void s() {
        this.f9777a.e();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void setPlaybackSpeed(float f14) {
        this.f9777a.i(f14);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void t() {
        this.f9777a.d(0);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void u() {
        this.f9777a.h(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void v(boolean z14) {
        if (z14) {
            d dVar = this.f9777a;
            g gVar = dVar.f9846b;
            gVar.f203205m = 0L;
            gVar.f203208p = -1L;
            gVar.f203206n = -1L;
            dVar.f9852h = C.TIME_UNSET;
            dVar.f9850f = C.TIME_UNSET;
            dVar.d(1);
            dVar.f9853i = C.TIME_UNSET;
        }
        e eVar = this.f9778b;
        v<k0> vVar = eVar.f9862d;
        m mVar = eVar.f9864f;
        mVar.f70036a = 0;
        mVar.f70037b = 0;
        eVar.f9868j = C.TIME_UNSET;
        v<Long> vVar2 = eVar.f9863e;
        if (vVar2.h() > 0) {
            fa.a.a(vVar2.h() > 0);
            while (vVar2.h() > 1) {
                vVar2.e();
            }
            Long lE = vVar2.e();
            lE.getClass();
            vVar2.a(0L, lE);
        }
        if (eVar.f9865g != null) {
            vVar.b();
            return;
        }
        if (vVar.h() > 0) {
            fa.a.a(vVar.h() > 0);
            while (vVar.h() > 1) {
                vVar.e();
            }
            k0 k0VarE = vVar.e();
            k0VarE.getClass();
            eVar.f9865g = k0VarE;
        }
    }
}
