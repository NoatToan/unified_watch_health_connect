package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/i2;", "Lf5/o0;", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i2 implements f5.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f88391a = 0;

    @Override // f5.o0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo0measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        float f14;
        float fC1 = b1Var.c1(g6.a.i(j8));
        if (g6.f.b(fC1, bi.f87644n) >= 0) {
            n3.f1.f122826a.getClass();
            f14 = n3.f1.f122828c;
        } else {
            f14 = g6.f.b(fC1, bi.f87645o) >= 0 ? bi.f87646p : bi.f87647q;
        }
        int iF0 = b1Var.f0(f14);
        g6.a.f75987b.getClass();
        f5.v1 v1VarQ = y0Var.Q(g6.a.C1525a.c(iF0, iF0));
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 11));
    }
}
