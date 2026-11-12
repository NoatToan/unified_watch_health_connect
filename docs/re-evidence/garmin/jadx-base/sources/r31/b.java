package r31;

import com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingActivity;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceOnboardingActivity f149989b;

    public /* synthetic */ b(DeviceOnboardingActivity deviceOnboardingActivity, int i14) {
        this.f149988a = i14;
        this.f149989b = deviceOnboardingActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f149988a;
        DeviceOnboardingActivity deviceOnboardingActivity = this.f149989b;
        switch (i14) {
            case 0:
                DeviceOnboardingActivity.a aVar = DeviceOnboardingActivity.f39726b;
                return ParametersHolderKt.parametersOf(Long.valueOf(deviceOnboardingActivity.getIntent().getLongExtra("GCM_deviceUnitID", -1L)));
            case 1:
                DeviceOnboardingActivity.a aVar2 = DeviceOnboardingActivity.f39726b;
                deviceOnboardingActivity.getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            default:
                DeviceOnboardingActivity.a aVar3 = DeviceOnboardingActivity.f39726b;
                bv.b.f21239a.getClass();
                ((kd0.m) bv.b.a()).a(deviceOnboardingActivity, null, 268468224);
                return Unit.INSTANCE;
        }
    }
}
