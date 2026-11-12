package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/l0;", "Lh5/c0;", "Lh4/r$c;", "Lc2/i0;", "direction", "", "fraction", "<init>", "(Lc2/i0;F)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0 extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f22732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22733b;

    public l0(i0 i0Var, float f14) {
        this.f22732a = i0Var;
        this.f22733b = f14;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        int iL;
        int iJ;
        int i14;
        int i15;
        if (!g6.a.f(j8) || this.f22732a == i0.Vertical) {
            iL = g6.a.l(j8);
            iJ = g6.a.j(j8);
        } else {
            int iRound = Math.round(g6.a.j(j8) * this.f22733b);
            int iL2 = g6.a.l(j8);
            iL = g6.a.j(j8);
            if (iRound < iL2) {
                iRound = iL2;
            }
            if (iRound <= iL) {
                iL = iRound;
            }
            iJ = iL;
        }
        if (!g6.a.e(j8) || this.f22732a == i0.Horizontal) {
            int iK = g6.a.k(j8);
            i14 = g6.a.i(j8);
            i15 = iK;
        } else {
            int iRound2 = Math.round(g6.a.i(j8) * this.f22733b);
            int iK2 = g6.a.k(j8);
            i15 = g6.a.i(j8);
            if (iRound2 < iK2) {
                iRound2 = iK2;
            }
            if (iRound2 <= i15) {
                i15 = iRound2;
            }
            i14 = i15;
        }
        f5.v1 v1VarQ = y0Var.Q(g6.b.a(iL, iJ, i15, i14));
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 4));
    }
}
