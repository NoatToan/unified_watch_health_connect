package z2;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final h a(h hVar, h hVar2, z0 z0Var, long j8, b0.a aVar) {
        h hVar3;
        if (aVar != null) {
            int iCompare = z0Var.f201859f.compare(Long.valueOf(aVar.f201528c), Long.valueOf(j8));
            if (iCompare < 0) {
                hVar3 = h.BEFORE;
            } else {
                hVar3 = iCompare > 0 ? h.AFTER : h.ON;
            }
            if (hVar3 != null) {
                return hVar3;
            }
        }
        return a1.b(hVar, hVar2);
    }

    public static final int b(long j8, s5.q0 q0Var) {
        int i14 = (int) (4294967295L & j8);
        if (Float.intBitsToFloat(i14) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i14);
        s5.o oVar = q0Var.f157281b;
        return fIntBitsToFloat >= oVar.f157256e ? q0Var.f157280a.f157265a.f157138b.length() : oVar.g(j8);
    }
}
