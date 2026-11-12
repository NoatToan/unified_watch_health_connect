package ty;

import i53.f;
import ny.c;
import p13.w;
import p3.m;
import p3.n;
import p3.x1;
import z72.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final f a(c.b bVar, m mVar) {
        x1 x1Var = n.f135158a;
        mVar.C(303645677);
        q13.b bVarB = w.b();
        if ((bVar != null ? bVar.getTotalCalories() : null) != null) {
            mVar.C(607205086);
            Integer restingCalories = bVar.getRestingCalories();
            float fJ = dh.b.J(restingCalories != null ? restingCalories.intValue() : 0, bVar.getTotalCalories().intValue());
            ny.a.C2460a c2460a = ny.a.f128281b;
            ny.a aVar = ny.a.RESTING_CALORIES;
            c2460a.getClass();
            bVarB.add(new l(fJ, ny.a.C2460a.a(aVar, mVar), null));
            Integer activeCalories = bVar.getActiveCalories();
            bVarB.add(new l(dh.b.J(activeCalories != null ? activeCalories.intValue() : 0, bVar.getTotalCalories().intValue()), ny.a.C2460a.a(ny.a.ACTIVE_CALORIES, mVar), null));
            mVar.f();
        } else {
            mVar.C(607708743);
            d92.b.f58623a.getClass();
            bVarB.add(new l(1.0f, d92.b.a(mVar).e().g(), null));
            mVar.f();
        }
        q13.b bVarA = w.a(bVarB);
        mVar.f();
        return i53.a.j(bVarA);
    }
}
