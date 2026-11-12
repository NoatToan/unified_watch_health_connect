package hc;

import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes.dex */
public final class o implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f83086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f83087c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83090f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.r f83085a = new fa.r(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f83088d = C.TIME_UNSET;

    @Override // hc.j
    public final void b(fa.r rVar) {
        fa.a.f(this.f83086b);
        if (this.f83087c) {
            int iA = rVar.a();
            int i14 = this.f83090f;
            if (i14 < 10) {
                int iMin = Math.min(iA, 10 - i14);
                byte[] bArr = rVar.f70054a;
                int i15 = rVar.f70055b;
                fa.r rVar2 = this.f83085a;
                System.arraycopy(bArr, i15, rVar2.f70054a, this.f83090f, iMin);
                if (this.f83090f + iMin == 10) {
                    rVar2.G(0);
                    if (73 != rVar2.u() || 68 != rVar2.u() || 51 != rVar2.u()) {
                        fa.k.g("Discarding invalid ID3 tag");
                        this.f83087c = false;
                        return;
                    } else {
                        rVar2.H(3);
                        this.f83089e = rVar2.t() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f83089e - this.f83090f);
            this.f83086b.f(iMin2, rVar);
            this.f83090f += iMin2;
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        l0 l0VarTrack = pVar.track(dVar.f82932d, 5);
        this.f83086b = l0VarTrack;
        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
        dVar.b();
        bVar.f8399a = dVar.f82933e;
        bVar.f8411m = androidx.media3.common.x.n(MimeTypes.APPLICATION_ID3);
        l0VarTrack.d(bVar.a());
    }

    @Override // hc.j
    public final void d(boolean z14) {
        int i14;
        fa.a.f(this.f83086b);
        if (this.f83087c && (i14 = this.f83089e) != 0 && this.f83090f == i14) {
            fa.a.d(this.f83088d != C.TIME_UNSET);
            this.f83086b.c(this.f83088d, 1, this.f83089e, 0, null);
            this.f83087c = false;
        }
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        if ((i14 & 4) == 0) {
            return;
        }
        this.f83087c = true;
        this.f83088d = j8;
        this.f83089e = 0;
        this.f83090f = 0;
    }

    @Override // hc.j
    public final void seek() {
        this.f83087c = false;
        this.f83088d = C.TIME_UNSET;
    }
}
