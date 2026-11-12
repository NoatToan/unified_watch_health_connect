package e2;

import f5.a1;
import f5.b1;
import f5.v1;
import f5.y0;
import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le2/m0;", "Lh5/c0;", "Lh4/r$c;", "", "fraction", "Lp3/x3;", "", "widthState", "heightState", "<init>", "(FLp3/x3;Lp3/x3;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m0 extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f62489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x3<Integer> f62490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x3<Integer> f62491c;

    public /* synthetic */ m0(float f14, x3 x3Var, x3 x3Var2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(f14, (i14 & 2) != 0 ? null : x3Var, (i14 & 4) != 0 ? null : x3Var2);
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final a1 mo5measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        x3<Integer> x3Var = this.f62490b;
        int iRound = (x3Var == null || x3Var.getF182175a().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(x3Var.getF182175a().floatValue() * this.f62489a);
        x3<Integer> x3Var2 = this.f62491c;
        int iRound2 = (x3Var2 == null || x3Var2.getF182175a().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(x3Var2.getF182175a().floatValue() * this.f62489a);
        int iL = iRound != Integer.MAX_VALUE ? iRound : g6.a.l(j8);
        int iK = iRound2 != Integer.MAX_VALUE ? iRound2 : g6.a.k(j8);
        if (iRound == Integer.MAX_VALUE) {
            iRound = g6.a.j(j8);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = g6.a.i(j8);
        }
        v1 v1VarQ = y0Var.Q(g6.b.a(iL, iRound, iK, iRound2));
        return b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 8));
    }

    public m0(float f14, x3<Integer> x3Var, x3<Integer> x3Var2) {
        this.f62489a = f14;
        this.f62490b = x3Var;
        this.f62491c = x3Var2;
    }
}
