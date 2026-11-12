package hc;

import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f0.a> f82954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0[] f82955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f82959f = C.TIME_UNSET;

    public i(List<f0.a> list) {
        this.f82954a = list;
        this.f82955b = new l0[list.size()];
    }

    @Override // hc.j
    public final void b(fa.r rVar) {
        boolean z14;
        boolean z15;
        if (this.f82956c) {
            if (this.f82957d == 2) {
                if (rVar.a() == 0) {
                    z15 = false;
                } else {
                    if (rVar.u() != 32) {
                        this.f82956c = false;
                    }
                    this.f82957d--;
                    z15 = this.f82956c;
                }
                if (!z15) {
                    return;
                }
            }
            if (this.f82957d == 1) {
                if (rVar.a() == 0) {
                    z14 = false;
                } else {
                    if (rVar.u() != 0) {
                        this.f82956c = false;
                    }
                    this.f82957d--;
                    z14 = this.f82956c;
                }
                if (!z14) {
                    return;
                }
            }
            int i14 = rVar.f70055b;
            int iA = rVar.a();
            for (l0 l0Var : this.f82955b) {
                rVar.G(i14);
                l0Var.f(iA, rVar);
            }
            this.f82958e += iA;
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        int i14 = 0;
        while (true) {
            l0[] l0VarArr = this.f82955b;
            if (i14 >= l0VarArr.length) {
                return;
            }
            f0.a aVar = this.f82954a.get(i14);
            dVar.a();
            dVar.b();
            l0 l0VarTrack = pVar.track(dVar.f82932d, 3);
            androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
            dVar.b();
            bVar.f8399a = dVar.f82933e;
            bVar.f8411m = androidx.media3.common.x.n(MimeTypes.APPLICATION_DVBSUBS);
            bVar.f8414p = Collections.singletonList(aVar.f82923b);
            bVar.f8402d = aVar.f82922a;
            l0VarTrack.d(bVar.a());
            l0VarArr[i14] = l0VarTrack;
            i14++;
        }
    }

    @Override // hc.j
    public final void d(boolean z14) {
        if (this.f82956c) {
            fa.a.d(this.f82959f != C.TIME_UNSET);
            for (l0 l0Var : this.f82955b) {
                l0Var.c(this.f82959f, 1, this.f82958e, 0, null);
            }
            this.f82956c = false;
        }
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        if ((i14 & 4) == 0) {
            return;
        }
        this.f82956c = true;
        this.f82959f = j8;
        this.f82958e = 0;
        this.f82957d = 2;
    }

    @Override // hc.j
    public final void seek() {
        this.f82956c = false;
        this.f82959f = C.TIME_UNSET;
    }
}
