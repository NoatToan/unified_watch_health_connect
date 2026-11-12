package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lc2/r1;", "Lh5/c0;", "Lh4/r$c;", "<init>", "()V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class r1 extends h4.r.c implements h5.c0 {
    public abstract long U1(f5.y0 y0Var, long j8);

    public abstract boolean V1();

    public int maxIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        return wVar.a0(i14);
    }

    @Override // h5.c0
    public int maxIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        return wVar.l0(i14);
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        long jU1 = U1(y0Var, j8);
        if (V1()) {
            jU1 = g6.b.e(j8, jU1);
        }
        f5.v1 v1VarQ = y0Var.Q(jU1);
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 5));
    }

    public int minIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        return wVar.e0(i14);
    }

    @Override // h5.c0
    public int minIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        return wVar.O(i14);
    }
}
