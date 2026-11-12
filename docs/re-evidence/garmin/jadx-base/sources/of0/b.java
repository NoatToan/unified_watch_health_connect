package of0;

import android.view.View;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.BirthDateFragment;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BirthDateFragment f131668b;

    public /* synthetic */ b(BirthDateFragment birthDateFragment, int i14) {
        this.f131667a = i14;
        this.f131668b = birthDateFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f131667a;
        BirthDateFragment birthDateFragment = this.f131668b;
        switch (i14) {
            case 0:
                int i15 = BirthDateFragment.f34780k;
                birthDateFragment.I6();
                break;
            case 1:
                int i16 = BirthDateFragment.f34780k;
                birthDateFragment.I6();
                break;
            default:
                int i17 = BirthDateFragment.f34780k;
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "BirthDateFragment", "[displayAgeRestrictionDialog] exit onboarding -> less than 22 years old");
                birthDateFragment.z6().K4();
                break;
        }
    }
}
