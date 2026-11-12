package defpackage;

import com.google.android.exoplayer2.Format;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class d20 implements u68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nkh f14979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f14980b;
    public final String c;
    public String d;
    public snp e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public Format j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14981k;
    public long l;

    public d20() {
        this(null);
    }

    @Override // defpackage.u68
    public void a(okh okhVar) {
        rk1.i(this.e);
        while (okhVar.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(okhVar.a(), this.f14981k - this.g);
                        this.e.d(okhVar, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.f14981k;
                        if (i2 == i3) {
                            this.e.e(this.l, 1, i3, 0, null);
                            this.l += this.i;
                            this.f = 0;
                        }
                    }
                } else if (b(okhVar, this.f14980b.d(), 128)) {
                    g();
                    this.f14980b.P(0);
                    this.e.d(this.f14980b, 128);
                    this.f = 2;
                }
            } else if (h(okhVar)) {
                this.f = 1;
                this.f14980b.d()[0] = 11;
                this.f14980b.d()[1] = 119;
                this.g = 2;
            }
        }
    }

    public final boolean b(okh okhVar, byte[] bArr, int i) {
        int iMin = Math.min(okhVar.a(), i - this.g);
        okhVar.j(bArr, this.g, iMin);
        int i2 = this.g + iMin;
        this.g = i2;
        return i2 == i;
    }

    @Override // defpackage.u68
    public void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
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
        this.d = dVar.b();
        this.e = kl8Var.d(dVar.c(), 1);
    }

    public final void g() {
        this.f14979a.p(0);
        e20.b bVarE = e20.e(this.f14979a);
        Format format = this.j;
        if (format == null || bVarE.d != format.y || bVarE.c != format.z || !wlq.c(bVarE.f16180a, format.l)) {
            Format formatE = new Format.b().S(this.d).e0(bVarE.f16180a).H(bVarE.d).f0(bVarE.c).V(this.c).E();
            this.j = formatE;
            this.e.b(formatE);
        }
        this.f14981k = bVarE.e;
        this.i = (((long) bVarE.f) * FolmeCore.NANOS_TO_MS) / ((long) this.j.z);
    }

    public final boolean h(okh okhVar) {
        while (true) {
            if (okhVar.a() <= 0) {
                return false;
            }
            if (this.h) {
                int iD = okhVar.D();
                if (iD == 119) {
                    this.h = false;
                    return true;
                }
                this.h = iD == 11;
            } else {
                this.h = okhVar.D() == 11;
            }
        }
    }

    public d20(String str) {
        nkh nkhVar = new nkh(new byte[128]);
        this.f14979a = nkhVar;
        this.f14980b = new okh(nkhVar.f28014a);
        this.f = 0;
        this.c = str;
    }
}
