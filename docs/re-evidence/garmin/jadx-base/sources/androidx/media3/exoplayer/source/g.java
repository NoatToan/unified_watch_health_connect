package androidx.media3.exoplayer.source;

import android.os.SystemClock;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.x0;
import com.google.android.exoplayer2.C;
import fa.z;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j.b f9498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xa.b f9500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f9501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f9502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i.a f9503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdsMediaSource.b f9504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9506i = C.TIME_UNSET;

    public g(j.b bVar, xa.b bVar2, long j8) {
        this.f9498a = bVar;
        this.f9500c = bVar2;
        this.f9499b = j8;
    }

    @Override // androidx.media3.exoplayer.source.i.a
    public final void a(i iVar) {
        i.a aVar = this.f9503f;
        int i14 = z.f70071a;
        aVar.a(this);
        AdsMediaSource.b bVar = this.f9504g;
        if (bVar != null) {
            AdsMediaSource.this.f9410o.post(new ta.b(bVar, this.f9498a));
        }
    }

    @Override // androidx.media3.exoplayer.source.s.a
    public final void b(s sVar) {
        i.a aVar = this.f9503f;
        int i14 = z.f70071a;
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void c(i.a aVar, long j8) {
        this.f9503f = aVar;
        i iVar = this.f9502e;
        if (iVar != null) {
            long j14 = this.f9506i;
            if (j14 == C.TIME_UNSET) {
                j14 = this.f9499b;
            }
            iVar.c(this, j14);
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long d(wa.g[] gVarArr, boolean[] zArr, sa.n[] nVarArr, boolean[] zArr2, long j8) {
        long j14 = this.f9506i;
        long j15 = (j14 == C.TIME_UNSET || j8 != this.f9499b) ? j8 : j14;
        this.f9506i = C.TIME_UNSET;
        i iVar = this.f9502e;
        int i14 = z.f70071a;
        return iVar.d(gVarArr, zArr, nVarArr, zArr2, j15);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void discardBuffer(long j8, boolean z14) {
        i iVar = this.f9502e;
        int i14 = z.f70071a;
        iVar.discardBuffer(j8, z14);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long e(long j8, x0 x0Var) {
        i iVar = this.f9502e;
        int i14 = z.f70071a;
        return iVar.e(j8, x0Var);
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean f(d0 d0Var) {
        i iVar = this.f9502e;
        return iVar != null && iVar.f(d0Var);
    }

    public final void g(j.b bVar) {
        long j8 = this.f9506i;
        if (j8 == C.TIME_UNSET) {
            j8 = this.f9499b;
        }
        j jVar = this.f9501d;
        jVar.getClass();
        i iVarC = jVar.c(bVar, this.f9500c, j8);
        this.f9502e = iVarC;
        if (this.f9503f != null) {
            iVarC.c(this, j8);
        }
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getBufferedPositionUs() {
        i iVar = this.f9502e;
        int i14 = z.f70071a;
        return iVar.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getNextLoadPositionUs() {
        i iVar = this.f9502e;
        int i14 = z.f70071a;
        return iVar.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final sa.r getTrackGroups() {
        i iVar = this.f9502e;
        int i14 = z.f70071a;
        return iVar.getTrackGroups();
    }

    public final void h() {
        if (this.f9502e != null) {
            j jVar = this.f9501d;
            jVar.getClass();
            jVar.h(this.f9502e);
        }
    }

    public final void i(j jVar) {
        fa.a.d(this.f9501d == null);
        this.f9501d = jVar;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean isLoading() {
        i iVar = this.f9502e;
        return iVar != null && iVar.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void maybeThrowPrepareError() throws IOException {
        try {
            i iVar = this.f9502e;
            if (iVar != null) {
                iVar.maybeThrowPrepareError();
                return;
            }
            j jVar = this.f9501d;
            if (jVar != null) {
                jVar.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e4) {
            AdsMediaSource.b bVar = this.f9504g;
            if (bVar == null) {
                throw e4;
            }
            if (this.f9505h) {
                return;
            }
            this.f9505h = true;
            AdsMediaSource adsMediaSource = AdsMediaSource.this;
            j.b bVar2 = AdsMediaSource.f9405u;
            j.b bVar3 = this.f9498a;
            k.a aVarL = adsMediaSource.l(bVar3);
            long andIncrement = sa.i.f158115c.getAndIncrement();
            androidx.media3.common.t.h hVar = bVar.f9422a.f8439b;
            hVar.getClass();
            aVarL.e(new sa.i(andIncrement, new ha.g(hVar.f8482a), SystemClock.elapsedRealtime()), 6, AdsMediaSource.AdLoadException.createForAd(e4), true);
            adsMediaSource.f9410o.post(new ta.b(bVar, bVar3, e4));
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long readDiscontinuity() {
        i iVar = this.f9502e;
        int i14 = z.f70071a;
        return iVar.readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void reevaluateBuffer(long j8) {
        i iVar = this.f9502e;
        int i14 = z.f70071a;
        iVar.reevaluateBuffer(j8);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long seekToUs(long j8) {
        i iVar = this.f9502e;
        int i14 = z.f70071a;
        return iVar.seekToUs(j8);
    }
}
