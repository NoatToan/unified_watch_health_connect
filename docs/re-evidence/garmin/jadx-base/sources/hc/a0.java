package hc;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f82808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.r f82809b = new fa.r(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f82813f;

    public a0(z zVar) {
        this.f82808a = zVar;
    }

    @Override // hc.f0
    public final void a(fa.w wVar, bb.p pVar, f0.d dVar) {
        this.f82808a.a(wVar, pVar, dVar);
        this.f82813f = true;
    }

    @Override // hc.f0
    public final void b(int i14, fa.r rVar) {
        int iU;
        boolean z14 = (i14 & 1) != 0;
        if (z14) {
            iU = rVar.f70055b + rVar.u();
        } else {
            iU = -1;
        }
        if (this.f82813f) {
            if (!z14) {
                return;
            }
            this.f82813f = false;
            rVar.G(iU);
            this.f82811d = 0;
        }
        while (rVar.a() > 0) {
            int i15 = this.f82811d;
            fa.r rVar2 = this.f82809b;
            if (i15 < 3) {
                if (i15 == 0) {
                    int iU2 = rVar.u();
                    rVar.G(rVar.f70055b - 1);
                    if (iU2 == 255) {
                        this.f82813f = true;
                        return;
                    }
                }
                int iMin = Math.min(rVar.a(), 3 - this.f82811d);
                rVar.e(rVar2.f70054a, this.f82811d, iMin);
                int i16 = this.f82811d + iMin;
                this.f82811d = i16;
                if (i16 == 3) {
                    rVar2.G(0);
                    rVar2.F(3);
                    rVar2.H(1);
                    int iU3 = rVar2.u();
                    int iU4 = rVar2.u();
                    this.f82812e = (iU3 & 128) != 0;
                    int i17 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.f82810c = i17;
                    byte[] bArr = rVar2.f70054a;
                    if (bArr.length < i17) {
                        rVar2.b(Math.min(4098, Math.max(i17, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(rVar.a(), this.f82810c - this.f82811d);
                rVar.e(rVar2.f70054a, this.f82811d, iMin2);
                int i18 = this.f82811d + iMin2;
                this.f82811d = i18;
                int i19 = this.f82810c;
                if (i18 != i19) {
                    continue;
                } else {
                    if (!this.f82812e) {
                        rVar2.F(i19);
                    } else {
                        if (fa.z.l(rVar2.f70054a, 0, i19, -1) != 0) {
                            this.f82813f = true;
                            return;
                        }
                        rVar2.F(this.f82810c - 4);
                    }
                    rVar2.G(0);
                    this.f82808a.b(rVar2);
                    this.f82811d = 0;
                }
            }
        }
    }

    @Override // hc.f0
    public final void seek() {
        this.f82813f = true;
    }
}
