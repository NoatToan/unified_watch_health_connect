package defpackage;

import com.google.android.exoplayer2.Format;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class h20 implements u68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nkh f19595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f19596b;
    public final String c;
    public String d;
    public snp e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Format f19597k;
    public int l;
    public long m;

    public h20() {
        this(null);
    }

    private boolean b(okh okhVar, byte[] bArr, int i) {
        int iMin = Math.min(okhVar.a(), i - this.g);
        okhVar.j(bArr, this.g, iMin);
        int i2 = this.g + iMin;
        this.g = i2;
        return i2 == i;
    }

    private void g() {
        this.f19595a.p(0);
        i20.b bVarD = i20.d(this.f19595a);
        Format format = this.f19597k;
        if (format == null || bVarD.c != format.y || bVarD.f20682b != format.z || !"audio/ac4".equals(format.l)) {
            Format formatE = new Format.b().S(this.d).e0("audio/ac4").H(bVarD.c).f0(bVarD.f20682b).V(this.c).E();
            this.f19597k = formatE;
            this.e.b(formatE);
        }
        this.l = bVarD.d;
        this.j = (((long) bVarD.e) * FolmeCore.NANOS_TO_MS) / ((long) this.f19597k.z);
    }

    private boolean h(okh okhVar) {
        while (true) {
            if (okhVar.a() <= 0) {
                return false;
            }
            if (this.h) {
                int iD = okhVar.D();
                this.h = iD == 172;
                if (iD == 64 || iD == 65) {
                    this.i = iD == 65;
                    return true;
                }
            } else {
                this.h = okhVar.D() == 172;
            }
        }
    }

    @Override // defpackage.u68
    public void a(okh okhVar) {
        rk1.i(this.e);
        while (okhVar.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(okhVar.a(), this.l - this.g);
                        this.e.d(okhVar, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.l;
                        if (i2 == i3) {
                            this.e.e(this.m, 1, i3, 0, null);
                            this.m += this.j;
                            this.f = 0;
                        }
                    }
                } else if (b(okhVar, this.f19596b.d(), 16)) {
                    g();
                    this.f19596b.P(0);
                    this.e.d(this.f19596b, 16);
                    this.f = 2;
                }
            } else if (h(okhVar)) {
                this.f = 1;
                this.f19596b.d()[0] = -84;
                this.f19596b.d()[1] = (byte) (this.i ? 65 : 64);
                this.g = 2;
            }
        }
    }

    @Override // defpackage.u68
    public void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
    }

    @Override // defpackage.u68
    public void d() {
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = kl8Var.d(dVar.c(), 1);
    }

    public h20(String str) {
        nkh nkhVar = new nkh(new byte[16]);
        this.f19595a = nkhVar;
        this.f19596b = new okh(nkhVar.f28014a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.c = str;
    }
}
