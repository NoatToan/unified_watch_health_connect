package l4;

import o4.e0;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static h4.r a(h4.r rVar, t4.d dVar, h4.d dVar2, f5.k kVar, float f14, e0 e0Var, int i14) {
        if ((i14 & 4) != 0) {
            h4.d.f81522a.getClass();
            dVar2 = h4.d.a.f81528f;
        }
        h4.d dVar3 = dVar2;
        if ((i14 & 8) != 0) {
            f5.k.f68985a.getClass();
            kVar = f5.k.a.f68991f;
        }
        f5.k kVar2 = kVar;
        if ((i14 & 16) != 0) {
            f14 = 1.0f;
        }
        float f15 = f14;
        if ((i14 & 32) != 0) {
            e0Var = null;
        }
        return rVar.then(new q(dVar, true, dVar3, kVar2, f15, e0Var));
    }
}
