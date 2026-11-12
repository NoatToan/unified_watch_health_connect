package sg0;

import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageFamilyActivity f159138b;

    public /* synthetic */ p0(ManageFamilyActivity manageFamilyActivity, int i14) {
        this.f159137a = i14;
        this.f159138b = manageFamilyActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f159137a;
        ManageFamilyActivity manageFamilyActivity = this.f159138b;
        switch (i14) {
            case 0:
                ManageFamilyActivity.a aVar = ManageFamilyActivity.f35178j;
                manageFamilyActivity.onNavigateUp();
                return Unit.INSTANCE;
            case 1:
                ManageFamilyActivity.a aVar2 = ManageFamilyActivity.f35178j;
                manageFamilyActivity.onNavigateUp();
                return Unit.INSTANCE;
            case 2:
                manageFamilyActivity.f35181c.l(manageFamilyActivity);
                return Unit.INSTANCE;
            case 3:
                manageFamilyActivity.f35181c.b(manageFamilyActivity);
                return Unit.INSTANCE;
            default:
                lc.m0 m0Var = manageFamilyActivity.f35182d;
                if (m0Var == null) {
                    p005kotlin.jvm.internal.s.m("navController");
                    throw null;
                }
                if (!m0Var.m()) {
                    manageFamilyActivity.onNavigateUp();
                }
                return Unit.INSTANCE;
        }
    }
}
