package androidx.media3.exoplayer;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements t0, u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8922b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v0 f8924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ja.q f8926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fa.c f8927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sa.n f8929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.media3.common.q[] f8930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8932l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8935o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u0.a f8937q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8921a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f8923c = new a0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8933m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.media3.common.d0 f8936p = androidx.media3.common.d0.f8186a;

    public f(int i14) {
        this.f8922b = i14;
    }

    @Override // androidx.media3.exoplayer.t0
    public final void d(int i14, ja.q qVar, fa.c cVar) {
        this.f8925e = i14;
        this.f8926f = qVar;
        this.f8927g = cVar;
    }

    @Override // androidx.media3.exoplayer.t0
    public final void disable() {
        fa.a.d(this.f8928h == 1);
        this.f8923c.a();
        this.f8928h = 0;
        this.f8929i = null;
        this.f8930j = null;
        this.f8934n = false;
        m();
    }

    @Override // androidx.media3.exoplayer.t0
    public final void e(androidx.media3.common.q[] qVarArr, sa.n nVar, long j8, long j14, androidx.media3.exoplayer.source.j.b bVar) {
        fa.a.d(!this.f8934n);
        this.f8929i = nVar;
        if (this.f8933m == Long.MIN_VALUE) {
            this.f8933m = j8;
        }
        this.f8930j = qVarArr;
        this.f8931k = j14;
        t(qVarArr, j8, j14, bVar);
    }

    @Override // androidx.media3.exoplayer.t0
    public final void f(androidx.media3.common.d0 d0Var) {
        androidx.media3.common.d0 d0Var2 = this.f8936p;
        int i14 = fa.z.f70071a;
        if (Objects.equals(d0Var2, d0Var)) {
            return;
        }
        this.f8936p = d0Var;
    }

    @Override // androidx.media3.exoplayer.t0
    public final void g(v0 v0Var, androidx.media3.common.q[] qVarArr, sa.n nVar, boolean z14, boolean z15, long j8, long j14, androidx.media3.exoplayer.source.j.b bVar) {
        fa.a.d(this.f8928h == 0);
        this.f8924d = v0Var;
        this.f8928h = 1;
        n(z14, z15);
        e(qVarArr, nVar, j8, j14, bVar);
        this.f8934n = false;
        this.f8932l = j8;
        this.f8933m = j8;
        o(j8, z14);
    }

    @Override // androidx.media3.exoplayer.t0
    public final f getCapabilities() {
        return this;
    }

    @Override // androidx.media3.exoplayer.t0
    public e0 getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.t0
    public final long getReadingPositionUs() {
        return this.f8933m;
    }

    @Override // androidx.media3.exoplayer.t0
    public final int getState() {
        return this.f8928h;
    }

    @Override // androidx.media3.exoplayer.t0
    public final sa.n getStream() {
        return this.f8929i;
    }

    @Override // androidx.media3.exoplayer.t0
    public final int getTrackType() {
        return this.f8922b;
    }

    @Override // androidx.media3.exoplayer.r0.b
    public void handleMessage(int i14, Object obj) {
    }

    @Override // androidx.media3.exoplayer.t0
    public final boolean hasReadStreamToEnd() {
        return this.f8933m == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.t0
    public final boolean isCurrentStreamFinal() {
        return this.f8934n;
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    public final ExoPlaybackException l(Exception exc, androidx.media3.common.q qVar, boolean z14, int i14) {
        int iA;
        if (qVar == null || this.f8935o) {
            iA = 4;
        } else {
            this.f8935o = true;
            try {
                iA = a(qVar) & 7;
                this.f8935o = false;
            } catch (ExoPlaybackException unused) {
                this.f8935o = false;
                iA = 4;
            } catch (Throwable th3) {
                this.f8935o = false;
                throw th3;
            }
        }
        return ExoPlaybackException.createForRenderer(exc, getName(), this.f8925e, qVar, iA, z14, i14);
    }

    public void m() {
    }

    @Override // androidx.media3.exoplayer.t0
    public final void maybeThrowStreamError() {
        sa.n nVar = this.f8929i;
        nVar.getClass();
        nVar.maybeThrowError();
    }

    public void n(boolean z14, boolean z15) {
    }

    public void o(long j8, boolean z14) {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    @Override // androidx.media3.exoplayer.t0
    public final void release() {
        fa.a.d(this.f8928h == 0);
        p();
    }

    @Override // androidx.media3.exoplayer.t0
    public final void reset() {
        fa.a.d(this.f8928h == 0);
        this.f8923c.a();
        q();
    }

    @Override // androidx.media3.exoplayer.t0
    public final void resetPosition(long j8) {
        this.f8934n = false;
        this.f8932l = j8;
        this.f8933m = j8;
        o(j8, false);
    }

    public void s() {
    }

    @Override // androidx.media3.exoplayer.t0
    public final void setCurrentStreamFinal() {
        this.f8934n = true;
    }

    @Override // androidx.media3.exoplayer.t0
    public final void start() {
        fa.a.d(this.f8928h == 1);
        this.f8928h = 2;
        r();
    }

    @Override // androidx.media3.exoplayer.t0
    public final void stop() {
        fa.a.d(this.f8928h == 2);
        this.f8928h = 1;
        s();
    }

    @Override // androidx.media3.exoplayer.u0
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    public void t(androidx.media3.common.q[] qVarArr, long j8, long j14, androidx.media3.exoplayer.source.j.b bVar) {
    }

    public final int u(a0 a0Var, DecoderInputBuffer decoderInputBuffer, int i14) {
        sa.n nVar = this.f8929i;
        nVar.getClass();
        int iA = nVar.a(a0Var, decoderInputBuffer, i14);
        if (iA == -4) {
            if (decoderInputBuffer.b(4)) {
                this.f8933m = Long.MIN_VALUE;
                return this.f8934n ? -4 : -3;
            }
            long j8 = decoderInputBuffer.f8633f + this.f8931k;
            decoderInputBuffer.f8633f = j8;
            this.f8933m = Math.max(this.f8933m, j8);
            return iA;
        }
        if (iA == -5) {
            androidx.media3.common.q qVar = a0Var.f8667b;
            qVar.getClass();
            long j14 = qVar.f8391s;
            if (j14 != Long.MAX_VALUE) {
                androidx.media3.common.q.b bVarA = qVar.a();
                bVarA.f8416r = j14 + this.f8931k;
                a0Var.f8667b = bVarA.a();
            }
        }
        return iA;
    }
}
