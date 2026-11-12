package hc;

import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.r f83113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb.c0.a f83114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l0 f83117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f83118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f83120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f83121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f83122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f83123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f83124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f83125m;

    public q(String str, int i14) {
        this.f83119g = 0;
        fa.r rVar = new fa.r(4);
        this.f83113a = rVar;
        rVar.f70054a[0] = -1;
        this.f83114b = new bb.c0.a();
        this.f83125m = C.TIME_UNSET;
        this.f83115c = str;
        this.f83116d = i14;
    }

    @Override // hc.j
    public final void b(fa.r rVar) {
        fa.a.f(this.f83117e);
        while (rVar.a() > 0) {
            int i14 = this.f83119g;
            fa.r rVar2 = this.f83113a;
            if (i14 == 0) {
                byte[] bArr = rVar.f70054a;
                int i15 = rVar.f70055b;
                int i16 = rVar.f70056c;
                while (true) {
                    if (i15 >= i16) {
                        rVar.G(i16);
                        break;
                    }
                    byte b14 = bArr[i15];
                    boolean z14 = (b14 & UnsignedBytes.MAX_VALUE) == 255;
                    boolean z15 = this.f83122j && (b14 & 224) == 224;
                    this.f83122j = z14;
                    if (z15) {
                        rVar.G(i15 + 1);
                        this.f83122j = false;
                        rVar2.f70054a[1] = bArr[i15];
                        this.f83120h = 2;
                        this.f83119g = 1;
                        break;
                    }
                    i15++;
                }
            } else if (i14 == 1) {
                int iMin = Math.min(rVar.a(), 4 - this.f83120h);
                rVar.e(rVar2.f70054a, this.f83120h, iMin);
                int i17 = this.f83120h + iMin;
                this.f83120h = i17;
                if (i17 >= 4) {
                    rVar2.G(0);
                    int iG = rVar2.g();
                    bb.c0.a aVar = this.f83114b;
                    if (aVar.a(iG)) {
                        this.f83124l = aVar.f17127c;
                        if (!this.f83121i) {
                            this.f83123k = (((long) aVar.f17131g) * 1000000) / ((long) aVar.f17128d);
                            androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
                            bVar.f8399a = this.f83118f;
                            bVar.f8411m = androidx.media3.common.x.n(aVar.f17126b);
                            bVar.f8412n = 4096;
                            bVar.B = aVar.f17129e;
                            bVar.C = aVar.f17128d;
                            bVar.f8402d = this.f83115c;
                            bVar.f8404f = this.f83116d;
                            this.f83117e.d(bVar.a());
                            this.f83121i = true;
                        }
                        rVar2.G(0);
                        this.f83117e.f(4, rVar2);
                        this.f83119g = 2;
                    } else {
                        this.f83120h = 0;
                        this.f83119g = 1;
                    }
                }
            } else {
                if (i14 != 2) {
                    j20.x.h();
                    return;
                }
                int iMin2 = Math.min(rVar.a(), this.f83124l - this.f83120h);
                this.f83117e.f(iMin2, rVar);
                int i18 = this.f83120h + iMin2;
                this.f83120h = i18;
                if (i18 >= this.f83124l) {
                    fa.a.d(this.f83125m != C.TIME_UNSET);
                    this.f83117e.c(this.f83125m, 1, this.f83124l, 0, null);
                    this.f83125m += this.f83123k;
                    this.f83120h = 0;
                    this.f83119g = 0;
                }
            }
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        this.f83118f = dVar.f82933e;
        dVar.b();
        this.f83117e = pVar.track(dVar.f82932d, 1);
    }

    @Override // hc.j
    public final void d(boolean z14) {
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        this.f83125m = j8;
    }

    @Override // hc.j
    public final void seek() {
        this.f83119g = 0;
        this.f83120h = 0;
        this.f83122j = false;
        this.f83125m = C.TIME_UNSET;
    }

    public q() {
        this(null, 0);
    }
}
