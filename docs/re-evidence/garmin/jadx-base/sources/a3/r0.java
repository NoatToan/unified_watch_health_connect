package a3;

import f5.v1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La3/r0;", "Lh4/r$c;", "Lh5/h;", "Lh5/c0;", "<init>", "()V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0 extends h4.r.c implements h5.h, h5.c0 {
    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        boolean z14 = getIsAttached() && ((Boolean) h5.i.a(this, n0.f755a)).booleanValue();
        long j14 = n0.f756b;
        v1 v1VarQ = y0Var.Q(j8);
        int iMax = v1VarQ.f69144a;
        if (z14) {
            iMax = Math.max(iMax, b1Var.f0(g6.h.c(j14)));
        }
        int iMax2 = v1VarQ.f69145b;
        if (z14) {
            iMax2 = Math.max(iMax2, b1Var.f0(g6.h.b(j14)));
        }
        return f5.b1.h0(b1Var, iMax, iMax2, new q0(iMax, v1VarQ, iMax2, 0));
    }
}
