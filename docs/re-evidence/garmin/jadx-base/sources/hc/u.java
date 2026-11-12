package hc;

import bb.l0;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class u implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.media3.common.q f83159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fa.w f83160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f83161c;

    public u(String str) {
        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
        bVar.f8411m = androidx.media3.common.x.n(str);
        this.f83159a = bVar.a();
    }

    @Override // hc.z
    public final void a(fa.w wVar, bb.p pVar, f0.d dVar) {
        this.f83160b = wVar;
        dVar.a();
        dVar.b();
        l0 l0VarTrack = pVar.track(dVar.f82932d, 5);
        this.f83161c = l0VarTrack;
        l0VarTrack.d(this.f83159a);
    }

    @Override // hc.z
    public final void b(fa.r rVar) {
        long jD;
        long j8;
        fa.a.f(this.f83160b);
        int i14 = fa.z.f70071a;
        fa.w wVar = this.f83160b;
        synchronized (wVar) {
            try {
                long j14 = wVar.f70069c;
                jD = j14 != C.TIME_UNSET ? j14 + wVar.f70068b : wVar.d();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        fa.w wVar2 = this.f83160b;
        synchronized (wVar2) {
            j8 = wVar2.f70068b;
        }
        if (jD == C.TIME_UNSET || j8 == C.TIME_UNSET) {
            return;
        }
        androidx.media3.common.q qVar = this.f83159a;
        if (j8 != qVar.f8391s) {
            androidx.media3.common.q.b bVarA = qVar.a();
            bVarA.f8416r = j8;
            androidx.media3.common.q qVarA = bVarA.a();
            this.f83159a = qVarA;
            this.f83161c.d(qVarA);
        }
        int iA = rVar.a();
        this.f83161c.f(iA, rVar);
        this.f83161c.c(jD, 1, iA, 0, null);
    }
}
