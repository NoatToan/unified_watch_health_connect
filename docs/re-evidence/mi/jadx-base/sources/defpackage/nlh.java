package defpackage;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes4.dex */
public final class nlh implements cql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Format f28043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rfp f28044b;
    public snp c;

    public nlh(String str) {
        this.f28043a = new Format.b().e0(str).E();
    }

    @Override // defpackage.cql
    public void a(okh okhVar) {
        c();
        long jE = this.f28044b.e();
        if (jE == -9223372036854775807L) {
            return;
        }
        Format format = this.f28043a;
        if (jE != format.p) {
            Format formatE = format.a().i0(jE).E();
            this.f28043a = formatE;
            this.c.b(formatE);
        }
        int iA = okhVar.a();
        this.c.d(okhVar, iA);
        this.c.e(this.f28044b.d(), 1, iA, 0, null);
    }

    @Override // defpackage.cql
    public void b(rfp rfpVar, kl8 kl8Var, i2q.d dVar) {
        this.f28044b = rfpVar;
        dVar.a();
        snp snpVarD = kl8Var.d(dVar.c(), 5);
        this.c = snpVarD;
        snpVarD.b(this.f28043a);
    }

    public final void c() {
        rk1.i(this.f28044b);
        wlq.j(this.c);
    }
}
