package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ifq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Format> f21099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final snp[] f21100b;

    public ifq(List<Format> list) {
        this.f21099a = list;
        this.f21100b = new snp[list.size()];
    }

    public void a(long j, okh okhVar) {
        if (okhVar.a() < 9) {
            return;
        }
        int iN = okhVar.n();
        int iN2 = okhVar.n();
        int iD = okhVar.D();
        if (iN == 434 && iN2 == 1195456820 && iD == 3) {
            hs3.b(j, okhVar, this.f21100b);
        }
    }

    public void b(kl8 kl8Var, i2q.d dVar) {
        for (int i = 0; i < this.f21100b.length; i++) {
            dVar.a();
            snp snpVarD = kl8Var.d(dVar.c(), 3);
            Format format = this.f21099a.get(i);
            String str = format.l;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            rk1.b(z, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            snpVarD.b(new Format.b().S(dVar.b()).e0(str).g0(format.d).V(format.c).F(format.D).T(format.n).E());
            this.f21100b[i] = snpVarD;
        }
    }
}
