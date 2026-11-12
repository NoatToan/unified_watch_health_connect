package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jrl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Format> f23070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final snp[] f23071b;

    public jrl(List<Format> list) {
        this.f23070a = list;
        this.f23071b = new snp[list.size()];
    }

    public void a(long j, okh okhVar) {
        hs3.a(j, okhVar, this.f23071b);
    }

    public void b(kl8 kl8Var, i2q.d dVar) {
        for (int i = 0; i < this.f23071b.length; i++) {
            dVar.a();
            snp snpVarD = kl8Var.d(dVar.c(), 3);
            Format format = this.f23070a.get(i);
            String str = format.l;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            rk1.b(z, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            String strB = format.f7815a;
            if (strB == null) {
                strB = dVar.b();
            }
            snpVarD.b(new Format.b().S(strB).e0(str).g0(format.d).V(format.c).F(format.D).T(format.n).E());
            this.f23071b[i] = snpVarD;
        }
    }
}
