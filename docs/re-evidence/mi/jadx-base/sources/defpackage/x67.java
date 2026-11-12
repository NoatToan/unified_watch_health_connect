package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x67 implements u68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i2q.a> f38744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final snp[] f38745b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public x67(List<i2q.a> list) {
        this.f38744a = list;
        this.f38745b = new snp[list.size()];
    }

    @Override // defpackage.u68
    public void a(okh okhVar) {
        if (this.c) {
            if (this.d != 2 || b(okhVar, 32)) {
                if (this.d != 1 || b(okhVar, 0)) {
                    int iE = okhVar.e();
                    int iA = okhVar.a();
                    for (snp snpVar : this.f38745b) {
                        okhVar.P(iE);
                        snpVar.d(okhVar, iA);
                    }
                    this.e += iA;
                }
            }
        }
    }

    public final boolean b(okh okhVar, int i) {
        if (okhVar.a() == 0) {
            return false;
        }
        if (okhVar.D() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // defpackage.u68
    public void c() {
        this.c = false;
    }

    @Override // defpackage.u68
    public void d() {
        if (this.c) {
            for (snp snpVar : this.f38745b) {
                snpVar.e(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        for (int i = 0; i < this.f38745b.length; i++) {
            i2q.a aVar = this.f38744a.get(i);
            dVar.a();
            snp snpVarD = kl8Var.d(dVar.c(), 3);
            snpVarD.b(new Format.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.c)).V(aVar.f20713a).E());
            this.f38745b[i] = snpVarD;
        }
    }
}
