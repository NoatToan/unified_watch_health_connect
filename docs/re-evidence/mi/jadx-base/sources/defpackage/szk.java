package defpackage;

import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class szk implements a0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzk f34134a;
    public snp c;
    public int d;
    public long f;
    public long g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nkh f34135b = new nkh();
    public long e = -9223372036854775807L;

    public szk(zzk zzkVar) {
        this.f34134a = zzkVar;
    }

    private static long j(long j, long j2, long j3, int i) {
        return j + wlq.H0(j2 - j3, FolmeCore.NANOS_TO_MS, i);
    }

    @Override // defpackage.a0l
    public void a(long j, long j2) {
        this.e = j;
        this.g = j2;
    }

    @Override // defpackage.a0l
    public void b(long j, int i) {
        rk1.g(this.e == -9223372036854775807L);
        this.e = j;
    }

    @Override // defpackage.a0l
    public void c(okh okhVar, long j, int i, boolean z) {
        int iD = okhVar.D() & 3;
        int iD2 = okhVar.D() & 255;
        long j2 = j(this.g, j, this.e, this.f34134a.f41835b);
        if (iD == 0) {
            e();
            if (iD2 == 1) {
                i(okhVar, j2);
                return;
            } else {
                h(okhVar, iD2, j2);
                return;
            }
        }
        if (iD == 1 || iD == 2) {
            e();
        } else if (iD != 3) {
            throw new IllegalArgumentException(String.valueOf(iD));
        }
        g(okhVar, z, iD, j2);
    }

    @Override // defpackage.a0l
    public void d(kl8 kl8Var, int i) {
        snp snpVarD = kl8Var.d(i, 1);
        this.c = snpVarD;
        snpVarD.b(this.f34134a.c);
    }

    public final void e() {
        if (this.d > 0) {
            f();
        }
    }

    public final void f() {
        ((snp) wlq.j(this.c)).e(this.f, 1, this.d, 0, null);
        this.d = 0;
    }

    public final void g(okh okhVar, boolean z, int i, long j) {
        int iA = okhVar.a();
        ((snp) rk1.e(this.c)).d(okhVar, iA);
        this.d += iA;
        this.f = j;
        if (z && i == 3) {
            f();
        }
    }

    public final void h(okh okhVar, int i, long j) {
        this.f34135b.n(okhVar.d());
        this.f34135b.s(2);
        for (int i2 = 0; i2 < i; i2++) {
            e20.b bVarE = e20.e(this.f34135b);
            ((snp) rk1.e(this.c)).d(okhVar, bVarE.e);
            ((snp) wlq.j(this.c)).e(j, 1, bVarE.e, 0, null);
            j += ((long) (bVarE.f / bVarE.c)) * FolmeCore.NANOS_TO_MS;
            this.f34135b.s(bVarE.e);
        }
    }

    public final void i(okh okhVar, long j) {
        int iA = okhVar.a();
        ((snp) rk1.e(this.c)).d(okhVar, iA);
        ((snp) wlq.j(this.c)).e(j, 1, iA, 0, null);
    }
}
