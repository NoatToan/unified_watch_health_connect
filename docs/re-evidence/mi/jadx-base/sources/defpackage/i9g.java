package defpackage;

import com.google.android.exoplayer2.Format;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class i9g implements u68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okh f20907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9g.a f20908b;
    public final String c;
    public snp d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20909k;
    public long l;

    public i9g() {
        this(null);
    }

    @Override // defpackage.u68
    public void a(okh okhVar) {
        rk1.i(this.d);
        while (okhVar.a() > 0) {
            int i = this.f;
            if (i == 0) {
                b(okhVar);
            } else if (i == 1) {
                h(okhVar);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                g(okhVar);
            }
        }
    }

    public final void b(okh okhVar) {
        byte[] bArrD = okhVar.d();
        int iF = okhVar.f();
        for (int iE = okhVar.e(); iE < iF; iE++) {
            byte b2 = bArrD[iE];
            boolean z = (b2 & 255) == 255;
            boolean z2 = this.i && (b2 & 224) == 224;
            this.i = z;
            if (z2) {
                okhVar.P(iE + 1);
                this.i = false;
                this.f20907a.d()[1] = bArrD[iE];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        okhVar.P(iF);
    }

    @Override // defpackage.u68
    public void c() {
        this.f = 0;
        this.g = 0;
        this.i = false;
    }

    @Override // defpackage.u68
    public void d() {
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.d = kl8Var.d(dVar.c(), 1);
    }

    public final void g(okh okhVar) {
        int iMin = Math.min(okhVar.a(), this.f20909k - this.g);
        this.d.d(okhVar, iMin);
        int i = this.g + iMin;
        this.g = i;
        int i2 = this.f20909k;
        if (i < i2) {
            return;
        }
        this.d.e(this.l, 1, i2, 0, null);
        this.l += this.j;
        this.g = 0;
        this.f = 0;
    }

    public final void h(okh okhVar) {
        int iMin = Math.min(okhVar.a(), 4 - this.g);
        okhVar.j(this.f20907a.d(), this.g, iMin);
        int i = this.g + iMin;
        this.g = i;
        if (i < 4) {
            return;
        }
        this.f20907a.P(0);
        if (!this.f20908b.a(this.f20907a.n())) {
            this.g = 0;
            this.f = 1;
            return;
        }
        j9g.a aVar = this.f20908b;
        this.f20909k = aVar.c;
        if (!this.h) {
            this.j = (((long) aVar.g) * FolmeCore.NANOS_TO_MS) / ((long) aVar.d);
            this.d.b(new Format.b().S(this.e).e0(this.f20908b.f22564b).W(4096).H(this.f20908b.e).f0(this.f20908b.d).V(this.c).E());
            this.h = true;
        }
        this.f20907a.P(0);
        this.d.d(this.f20907a, 4);
        this.f = 2;
    }

    public i9g(String str) {
        this.f = 0;
        okh okhVar = new okh(4);
        this.f20907a = okhVar;
        okhVar.d()[0] = -1;
        this.f20908b = new j9g.a();
        this.c = str;
    }
}
