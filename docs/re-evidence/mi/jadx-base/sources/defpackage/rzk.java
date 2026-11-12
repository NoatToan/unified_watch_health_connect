package defpackage;

import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class rzk implements a0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzk f33102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nkh f33103b = new nkh();
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public long g;
    public snp h;
    public long i;

    public rzk(zzk zzkVar) {
        this.f33102a = zzkVar;
        this.c = zzkVar.f41835b;
        String str = (String) rk1.e(zzkVar.d.get("mode"));
        if (fk1.a(str, "AAC-hbr")) {
            this.d = 13;
            this.e = 3;
        } else {
            if (!fk1.a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.d = 6;
            this.e = 2;
        }
        this.f = this.e + this.d;
    }

    public static void e(snp snpVar, long j, int i) {
        snpVar.e(j, 1, i, 0, null);
    }

    public static long f(long j, long j2, long j3, int i) {
        return j + wlq.H0(j2 - j3, FolmeCore.NANOS_TO_MS, i);
    }

    @Override // defpackage.a0l
    public void a(long j, long j2) {
        this.g = j;
        this.i = j2;
    }

    @Override // defpackage.a0l
    public void b(long j, int i) {
        this.g = j;
    }

    @Override // defpackage.a0l
    public void c(okh okhVar, long j, int i, boolean z) {
        rk1.e(this.h);
        short sZ = okhVar.z();
        int i2 = sZ / this.f;
        long jF = f(this.i, j, this.g, this.c);
        this.f33103b.m(okhVar);
        if (i2 == 1) {
            int iH = this.f33103b.h(this.d);
            this.f33103b.r(this.e);
            this.h.d(okhVar, okhVar.a());
            if (z) {
                e(this.h, jF, iH);
                return;
            }
            return;
        }
        okhVar.Q((sZ + 7) / 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int iH2 = this.f33103b.h(this.d);
            this.f33103b.r(this.e);
            this.h.d(okhVar, iH2);
            e(this.h, jF, iH2);
            jF += wlq.H0(i2, FolmeCore.NANOS_TO_MS, this.c);
        }
    }

    @Override // defpackage.a0l
    public void d(kl8 kl8Var, int i) {
        snp snpVarD = kl8Var.d(i, 1);
        this.h = snpVarD;
        snpVarD.b(this.f33102a.c);
    }
}
