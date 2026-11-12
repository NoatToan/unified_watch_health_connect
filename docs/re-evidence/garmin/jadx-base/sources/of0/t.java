package of0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.TwoStepVerificationFragment;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TwoStepVerificationFragment f131706b;

    public /* synthetic */ t(TwoStepVerificationFragment twoStepVerificationFragment, int i14) {
        this.f131705a = i14;
        this.f131706b = twoStepVerificationFragment;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f131705a;
        TwoStepVerificationFragment twoStepVerificationFragment = this.f131706b;
        switch (i14) {
            case 0:
                int i15 = TwoStepVerificationFragment.f34825e;
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "TwoStepVerificationFragment", "[mfaFlowLauncher] retry");
                twoStepVerificationFragment.z6();
                break;
            case 1:
                int i16 = TwoStepVerificationFragment.f34825e;
                a2 a2Var2 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "TwoStepVerificationFragment", "[mfaFlowLauncher] exit onboarding");
                twoStepVerificationFragment.y6().K4();
                break;
            case 2:
                int i17 = TwoStepVerificationFragment.f34825e;
                a2 a2Var3 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "TwoStepVerificationFragment", "[createGHSAccount] retry");
                twoStepVerificationFragment.w6();
                break;
            default:
                int i18 = TwoStepVerificationFragment.f34825e;
                a2 a2Var4 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "TwoStepVerificationFragment", "[createGHSAccount] exit onboarding");
                twoStepVerificationFragment.y6().K4();
                break;
        }
        return Unit.INSTANCE;
    }
}
