package p006l2;

import java.util.ArrayList;
import oe2.f;
import s5.o;
import s5.p0;
import s5.q0;
import s5.s;

/* JADX INFO: loaded from: classes.dex */
public final class h3 {
    public static final float a(q0 q0Var, int i14) {
        if (i14 < 0) {
            return 0.0f;
        }
        p0 p0Var = q0Var.f157280a;
        o oVar = q0Var.f157281b;
        if (p0Var.f157265a.f157138b.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(oVar.d(i14), Math.min(oVar.f157253b - 1, oVar.f157257f - 1));
        if (i14 > oVar.c(iMin, false)) {
            return 0.0f;
        }
        oVar.o(iMin);
        ArrayList arrayList = oVar.f157259h;
        s sVar = (s) arrayList.get(f.q(iMin, arrayList));
        return sVar.f157290a.b(iMin - sVar.f157293d);
    }
}
