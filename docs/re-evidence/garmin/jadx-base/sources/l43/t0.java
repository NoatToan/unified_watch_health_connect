package l43;

import t23.c1;

/* JADX INFO: loaded from: classes3.dex */
public class t0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f110106a;

    public t0(x0 x0Var) {
        this.f110106a = x0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        p pVar = this.f110106a.f110120a;
        x33.b bVarA = m0.a(pVar.f110086b, iIntValue);
        if (bVarA.f188593c) {
            return null;
        }
        t23.c0 c0Var = pVar.f110085a.f110052b;
        c0Var.getClass();
        t23.h hVarB = t23.u.b(c0Var, bVarA);
        if (hVarB instanceof c1) {
            return (c1) hVarB;
        }
        return null;
    }
}
