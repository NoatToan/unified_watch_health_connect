package xa1;

import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditPowerGuideStrategyActivity f189735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f189736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f189737c;

    public /* synthetic */ d(EditPowerGuideStrategyActivity editPowerGuideStrategyActivity, float f14, int i14) {
        this.f189735a = editPowerGuideStrategyActivity;
        this.f189736b = f14;
        this.f189737c = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        ab1.a alertUserSettingsChanges;
        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = this.f189735a;
        ab1.f fVar = editPowerGuideStrategyActivity.f40390f;
        if (fVar == null) {
            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
            throw null;
        }
        ab1.d dVar = fVar.f2563a;
        if (dVar != null && (alertUserSettingsChanges = dVar.getAlertUserSettingsChanges()) != null) {
            alertUserSettingsChanges.f2533b = ab1.a.AbstractC0027a.C0028a.f2534a;
        }
        editPowerGuideStrategyActivity.na(this.f189736b, this.f189737c);
        return Unit.INSTANCE;
    }
}
