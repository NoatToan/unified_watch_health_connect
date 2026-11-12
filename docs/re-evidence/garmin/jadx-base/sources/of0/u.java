package of0;

import android.content.Intent;
import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.TwoStepVerificationFragment;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import lc.h0;
import lc.u0;
import lc.y;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TwoStepVerificationFragment f131708b;

    public /* synthetic */ u(TwoStepVerificationFragment twoStepVerificationFragment, int i14) {
        this.f131707a = i14;
        this.f131708b = twoStepVerificationFragment;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f131707a;
        TwoStepVerificationFragment twoStepVerificationFragment = this.f131708b;
        switch (i14) {
            case 0:
                Intent intent = (Intent) obj;
                if (intent != null) {
                    twoStepVerificationFragment.f34828d.a(intent, null);
                    a2 a2Var = a2.USER;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "TwoStepVerificationFragment", "[navigateToMultiFactorAuthenticationFlow] MFA flow started");
                } else {
                    int i15 = TwoStepVerificationFragment.f34825e;
                    a2 a2Var2 = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "TwoStepVerificationFragment", "[navigateToMultiFactorAuthenticationFlow] MFA flow couldn't be started");
                }
                return Unit.INSTANCE;
            default:
                g3 g3Var = (g3) obj;
                int i16 = TwoStepVerificationFragment.f34825e;
                int i17 = TwoStepVerificationFragment.b.f34829a[g3Var.f35300a.ordinal()];
                if (i17 != 1) {
                    int i18 = 3;
                    int i19 = 2;
                    if (i17 == 2) {
                        View view2 = twoStepVerificationFragment.getView();
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        twoStepVerificationFragment.f34827c = true;
                        androidx.fragment.app.m mVarRequireActivity = twoStepVerificationFragment.requireActivity();
                        mVarRequireActivity.getClass();
                        mVarRequireActivity.invalidateMenu();
                        g22.e.f(twoStepVerificationFragment);
                        if (g3Var.f35303d instanceof NoNetworkException) {
                            a2 a2Var3 = a2.ONBOARDING;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var3, "TwoStepVerificationFragment", "[createGHSAccount] no internet");
                            nf0.b.a(twoStepVerificationFragment, new t(twoStepVerificationFragment, i19), new t(twoStepVerificationFragment, i18));
                        } else {
                            a2 a2Var4 = a2.ONBOARDING;
                            String strN = fb1.c.n("[createGHSAccount] error: ", g3Var.f35302c);
                            i2.f36769a.getClass();
                            i2.a.f(a2Var4, "TwoStepVerificationFragment", strN);
                            g22.e.a(twoStepVerificationFragment, new fw.r());
                        }
                    } else {
                        if (i17 != 3) {
                            u0.r();
                            return null;
                        }
                        g22.e.f(twoStepVerificationFragment);
                        if (p005kotlin.jvm.internal.s.g(g3Var.f35301b, Boolean.TRUE)) {
                            a2 a2Var5 = a2.ONBOARDING;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var5, "TwoStepVerificationFragment", "[createGHSAccount] GHS account created");
                            NavHostFragment.f10124e.getClass();
                            y yVarA = NavHostFragment.a.a(twoStepVerificationFragment);
                            h0 h0VarJ = yVarA.f111904b.j();
                            if (h0VarJ != null && h0VarJ.f111773b.f144346e == R.id.twoStepVerificationFragment) {
                                yVarA.g(R.id.action_education, null);
                            }
                        } else {
                            a2 a2Var6 = a2.ONBOARDING;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var6, "TwoStepVerificationFragment", "[createGHSAccount] GHS account couldn't be created");
                            View view3 = twoStepVerificationFragment.getView();
                            if (view3 != null) {
                                view3.setVisibility(0);
                            }
                            twoStepVerificationFragment.f34827c = true;
                            androidx.fragment.app.m mVarRequireActivity2 = twoStepVerificationFragment.requireActivity();
                            mVarRequireActivity2.getClass();
                            mVarRequireActivity2.invalidateMenu();
                            g22.e.a(twoStepVerificationFragment, new fw.r());
                        }
                    }
                } else {
                    g22.e.l(twoStepVerificationFragment);
                }
                return Unit.INSTANCE;
        }
    }
}
