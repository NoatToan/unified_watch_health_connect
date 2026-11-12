package x01;

import b21.fb;
import b21.l4;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import lc.j0;
import lc.m0;
import lc.p0;
import lc.y0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NutritionActivity f188243b;

    public /* synthetic */ c(NutritionActivity nutritionActivity, int i14) {
        this.f188242a = i14;
        this.f188243b = nutritionActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f188242a;
        NutritionActivity nutritionActivity = this.f188243b;
        switch (i14) {
            case 0:
                l01.k kVar = (l01.k) obj;
                NutritionActivity.a aVar = NutritionActivity.f39581f;
                kVar.getClass();
                m0 m0Var = nutritionActivity.f39582e;
                if (m0Var != null) {
                    m0Var.h(new wy2.c(22), new l4.j0(kVar));
                    return Unit.INSTANCE;
                }
                s.m("navHostController");
                throw null;
            case 1:
                p0 p0Var = (p0) obj;
                NutritionActivity.a aVar2 = NutritionActivity.f39581f;
                p0Var.getClass();
                m0 m0Var2 = nutritionActivity.f39582e;
                if (m0Var2 == null) {
                    s.m("navHostController");
                    throw null;
                }
                p0Var.f111835h = s0.f105811a.b(NutritionActivity.na(m0Var2) ? fb.c.class : fb.e.class);
                p0Var.f111833f = false;
                y0 y0VarI = kg.f.i(p0Var, -1);
                y0VarI.f111914a = true;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = true;
                p0Var.f111834g = y0VarI.f111915b;
                return Unit.INSTANCE;
            case 2:
                p0 p0Var2 = (p0) obj;
                j0.a aVar3 = j0.f111790h;
                m0 m0Var3 = nutritionActivity.f39582e;
                if (m0Var3 == null) {
                    s.m("navHostController");
                    throw null;
                }
                j0 j0VarK = m0Var3.f111904b.k();
                aVar3.getClass();
                int i15 = j0.a.a(j0VarK).f111773b.f144346e;
                p0Var2.getClass();
                p0Var2.b(i15);
                y0 y0Var = new y0();
                y0Var.f111914a = true;
                Unit unit2 = Unit.INSTANCE;
                p0Var2.f111833f = true;
                p0Var2.f111834g = y0Var.f111915b;
                return Unit.INSTANCE;
            default:
                p0 p0Var3 = (p0) obj;
                j0.a aVar4 = j0.f111790h;
                m0 m0Var4 = nutritionActivity.f39582e;
                if (m0Var4 == null) {
                    s.m("navHostController");
                    throw null;
                }
                j0 j0VarK2 = m0Var4.f111904b.k();
                aVar4.getClass();
                int i16 = j0.a.a(j0VarK2).f111773b.f144346e;
                p0Var3.getClass();
                p0Var3.b(i16);
                y0 y0Var2 = new y0();
                y0Var2.f111914a = true;
                Unit unit3 = Unit.INSTANCE;
                p0Var3.f111833f = true;
                p0Var3.f111834g = y0Var2.f111915b;
                return Unit.INSTANCE;
        }
    }
}
