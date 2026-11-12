package x01;

import b21.fb;
import b21.l4;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import lc.m0;
import lc.y;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NutritionActivity f188241b;

    public /* synthetic */ b(NutritionActivity nutritionActivity, int i14) {
        this.f188240a = i14;
        this.f188241b = nutritionActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f188240a;
        NutritionActivity nutritionActivity = this.f188241b;
        switch (i14) {
            case 0:
                m0 m0Var = nutritionActivity.f39582e;
                if (m0Var == null) {
                    s.m("navHostController");
                    throw null;
                }
                if (NutritionActivity.na(m0Var)) {
                    m0 m0Var2 = nutritionActivity.f39582e;
                    if (m0Var2 == null) {
                        s.m("navHostController");
                        throw null;
                    }
                    k23.d dVarB = s0.f105811a.b(l4.y0.class);
                    boolean z14 = y.f111902i;
                    m0Var2.o(dVarB, false);
                } else {
                    nutritionActivity.finish();
                }
                return Unit.INSTANCE;
            case 1:
                m0 m0Var3 = nutritionActivity.f39582e;
                if (m0Var3 == null) {
                    s.m("navHostController");
                    throw null;
                }
                m0Var3.h(new c(nutritionActivity, 1), fb.c.INSTANCE);
                return Unit.INSTANCE;
            default:
                m0 m0Var4 = nutritionActivity.f39582e;
                if (m0Var4 == null) {
                    s.m("navHostController");
                    throw null;
                }
                if (m0Var4.f() != null) {
                    nutritionActivity.getOnBackPressedDispatcher().d();
                } else {
                    nutritionActivity.finish();
                }
                return Unit.INSTANCE;
        }
    }
}
