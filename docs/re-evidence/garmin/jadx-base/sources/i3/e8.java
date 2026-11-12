package i3;

import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li3/e8;", "Lh4/r$c;", "Lh5/h;", "Lh5/c0;", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e8 extends h4.r.c implements h5.h, h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashMap f87963a;

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        float f14 = ((g6.f) h5.i.a(this, p7.f89282d)).f75997a;
        float f15 = 0;
        if (f14 < f15) {
            f14 = f15;
        }
        f5.v1 v1VarQ = y0Var.Q(j8);
        boolean z14 = getIsAttached() && !Float.isNaN(f14) && g6.f.b(f14, f15) > 0;
        int iF0 = !Float.isNaN(f14) ? b1Var.f0(f14) : 0;
        int iMax = v1VarQ.f69144a;
        if (z14) {
            iMax = Math.max(iMax, iF0);
        }
        int iMax2 = v1VarQ.f69145b;
        if (z14) {
            iMax2 = Math.max(iMax2, iF0);
        }
        if (z14) {
            LinkedHashMap linkedHashMap = this.f87963a;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f87963a = linkedHashMap;
            }
            f5.n2 n2Var = p7.f89280b;
            int iRound = Math.round((iF0 - v1VarQ.f69144a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(n2Var, Integer.valueOf(iRound));
            f5.p pVar = p7.f89279a;
            int iRound2 = Math.round((iF0 - v1VarQ.f69145b) / 2.0f);
            linkedHashMap.put(pVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map<f5.a, Integer> map = this.f87963a;
        if (map == null) {
            map = p13.k0.f134949a;
            map.getClass();
        }
        return b1Var.H1(iMax, iMax2, map, new a3.q0(iMax, v1VarQ, iMax2, 4));
    }
}
