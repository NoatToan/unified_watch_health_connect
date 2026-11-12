package bb;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f17200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f17201g;

    public i0(int i14, int i15, String str) {
        this.f17195a = i14;
        this.f17196b = i15;
        this.f17197c = str;
    }

    @Override // bb.n
    public final int b(o oVar, f0 f0Var) {
        int i14 = this.f17199e;
        if (i14 != 1) {
            if (i14 == 2) {
                return -1;
            }
            j20.x.h();
            return 0;
        }
        l0 l0Var = this.f17201g;
        l0Var.getClass();
        int iB = l0Var.b(oVar, 1024, true);
        if (iB != -1) {
            this.f17198d += iB;
            return 0;
        }
        this.f17199e = 2;
        this.f17201g.c(0L, 1, this.f17198d, 0, null);
        this.f17198d = 0;
        return 0;
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f17200f = pVar;
        l0 l0VarTrack = pVar.track(1024, 4);
        this.f17201g = l0VarTrack;
        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
        bVar.f8411m = androidx.media3.common.x.n(this.f17197c);
        l0VarTrack.d(bVar.a());
        this.f17200f.endTracks();
        this.f17200f.a(new j0(C.TIME_UNSET));
        this.f17199e = 1;
    }

    @Override // bb.n
    public final boolean d(o oVar) {
        int i14 = this.f17196b;
        int i15 = this.f17195a;
        fa.a.d((i15 == -1 || i14 == -1) ? false : true);
        fa.r rVar = new fa.r(i14);
        ((i) oVar).peekFully(rVar.f70054a, 0, i14, false);
        return rVar.A() == i15;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        if (j8 == 0 || this.f17199e == 1) {
            this.f17199e = 1;
            this.f17198d = 0;
        }
    }
}
