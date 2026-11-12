package m72;

import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import e2.i0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f117122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f117123c;

    public /* synthetic */ m(Object obj, float f14, int i14) {
        this.f117121a = i14;
        this.f117123c = obj;
        this.f117122b = f14;
    }

    @Override // e23.a
    public final Object invoke() {
        ab1.a alertUserSettingsChanges;
        int i14 = this.f117121a;
        float f14 = this.f117122b;
        Object obj = this.f117123c;
        switch (i14) {
            case 0:
                i0 i0Var = (i0) obj;
                int i15 = PreviewCatalogActivity.f49781a;
                return Boolean.valueOf(i0Var.h() != 0 || ((float) i0Var.i()) > f14);
            default:
                EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = (EditPowerGuideStrategyActivity) obj;
                ab1.f fVar = editPowerGuideStrategyActivity.f40390f;
                if (fVar == null) {
                    s.m("powerGuideStrategyDetails");
                    throw null;
                }
                ab1.d dVar = fVar.f2563a;
                if (dVar != null && (alertUserSettingsChanges = dVar.getAlertUserSettingsChanges()) != null) {
                    alertUserSettingsChanges.f2533b = ab1.a.AbstractC0027a.C0028a.f2534a;
                }
                editPowerGuideStrategyActivity.oa(f14);
                return Unit.INSTANCE;
        }
    }
}
