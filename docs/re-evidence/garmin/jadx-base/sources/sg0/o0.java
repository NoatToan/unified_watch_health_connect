package sg0;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageFamilyActivity f159134b;

    public /* synthetic */ o0(ManageFamilyActivity manageFamilyActivity, int i14) {
        this.f159133a = i14;
        this.f159134b = manageFamilyActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f159133a;
        ManageFamilyActivity manageFamilyActivity = this.f159134b;
        switch (i14) {
            case 0:
                ti2.c cVar = (ti2.c) obj;
                ManageFamilyActivity.a aVar = ManageFamilyActivity.f35178j;
                cVar.getClass();
                if (cVar instanceof ti2.c.a) {
                    lc.m0 m0Var = manageFamilyActivity.f35182d;
                    if (m0Var == null) {
                        p005kotlin.jvm.internal.s.m("navController");
                        throw null;
                    }
                    lc.y.l(m0Var, a0.INSTANCE);
                } else if (cVar instanceof ti2.c.d) {
                    lc.m0 m0Var2 = manageFamilyActivity.f35182d;
                    if (m0Var2 == null) {
                        p005kotlin.jvm.internal.s.m("navController");
                        throw null;
                    }
                    lc.y.l(m0Var2, b0.INSTANCE);
                } else {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "ManageFamilyActivity", "CMCPortalError: " + cVar);
                }
                return Unit.INSTANCE;
            case 1:
                ManageFamilyActivity.a aVar3 = ManageFamilyActivity.f35178j;
                f0 f0VarDa = manageFamilyActivity.da();
                f0VarDa.getClass();
                ge1.b.T(v1.a(f0VarDa), null, null, new l0(f0VarDa, (ue0.l) obj, null), 3);
                lc.m0 m0Var3 = manageFamilyActivity.f35182d;
                if (m0Var3 != null) {
                    lc.y.l(m0Var3, c0.INSTANCE);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("navController");
                throw null;
            case 2:
                ManageFamilyActivity.a aVar4 = ManageFamilyActivity.f35178j;
                f0 f0VarDa2 = manageFamilyActivity.da();
                f0VarDa2.getClass();
                ge1.b.T(v1.a(f0VarDa2), null, null, new l0(f0VarDa2, (ue0.l) obj, null), 3);
                lc.m0 m0Var4 = manageFamilyActivity.f35182d;
                if (m0Var4 != null) {
                    lc.y.l(m0Var4, z.INSTANCE);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("navController");
                throw null;
            case 3:
                ue0.l lVar = (ue0.l) obj;
                ManageFamilyActivity.a aVar5 = ManageFamilyActivity.f35178j;
                lVar.getClass();
                manageFamilyActivity.startActivity(manageFamilyActivity.f35181c.i(manageFamilyActivity, lVar));
                return Unit.INSTANCE;
            case 4:
                ue0.l lVar2 = (ue0.l) obj;
                ManageFamilyActivity.a aVar6 = ManageFamilyActivity.f35178j;
                lVar2.getClass();
                manageFamilyActivity.f35181c.c(manageFamilyActivity, lVar2);
                return Unit.INSTANCE;
            default:
                ue0.l lVar3 = (ue0.l) obj;
                ManageFamilyActivity.a aVar7 = ManageFamilyActivity.f35178j;
                lVar3.getClass();
                manageFamilyActivity.f35187i.a(manageFamilyActivity.f35181c.g(manageFamilyActivity, lVar3), null);
                return Unit.INSTANCE;
        }
    }
}
