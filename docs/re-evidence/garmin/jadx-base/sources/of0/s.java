package of0;

import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.TwoStepVerificationFragment;
import com.garmin.android.apps.connectmobile.i2;
import lc.h0;
import lc.y;
import o53.f0;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TwoStepVerificationFragment f131704b;

    public /* synthetic */ s(TwoStepVerificationFragment twoStepVerificationFragment, int i14) {
        this.f131703a = i14;
        this.f131704b = twoStepVerificationFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f131703a;
        TwoStepVerificationFragment twoStepVerificationFragment = this.f131704b;
        switch (i14) {
            case 0:
                int i15 = TwoStepVerificationFragment.f34825e;
                twoStepVerificationFragment.z6();
                break;
            case 1:
                int i16 = TwoStepVerificationFragment.f34825e;
                o0.a aVar = o0.f149771c;
                String string = twoStepVerificationFragment.getString(R.string.lbl_skip_two_step_verification);
                String string2 = twoStepVerificationFragment.getString(R.string.msg_skip_two_step_verification);
                s sVar = new s(twoStepVerificationFragment, 2);
                aVar.getClass();
                f0.w(twoStepVerificationFragment).b(new v(o0.a.a(string, string2, R.string.lbl_skip_button, sVar, R.string.lbl_cancel, null), twoStepVerificationFragment, null));
                break;
            default:
                int i17 = TwoStepVerificationFragment.f34825e;
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "TwoStepVerificationFragment", "[showSkipTwoStepVerificationDialog] skip MFA");
                NavHostFragment.f10124e.getClass();
                y yVarA = NavHostFragment.a.a(twoStepVerificationFragment);
                h0 h0VarJ = yVarA.f111904b.j();
                if (h0VarJ != null && h0VarJ.f111773b.f144346e == R.id.twoStepVerificationFragment) {
                    yVarA.g(R.id.action_skip_to_education, null);
                    break;
                }
                break;
        }
    }
}
