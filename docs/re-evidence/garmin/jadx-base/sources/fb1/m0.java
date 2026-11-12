package fb1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupGenesisActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingActivity;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q f70275b;

    public /* synthetic */ m0(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q qVar, int i14) {
        this.f70274a = i14;
        this.f70275b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f70274a;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q qVar = this.f70275b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.f40794v;
                Context contextRequireContext = qVar.requireContext();
                contextRequireContext.getClass();
                ((Logger) qVar.f40795h.getValue()).debug("navigateToStopTrackingActivity: ");
                PregnancyStopTrackingActivity.f41001d.getClass();
                PregnancyStopTrackingActivity.a.a(contextRequireContext, null);
                break;
            default:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.f40794v;
                if (qVar.getContext() != null) {
                    PregnancySetupGenesisActivity.a aVar3 = PregnancySetupGenesisActivity.f40944a;
                    androidx.fragment.app.m mVarRequireActivity = qVar.requireActivity();
                    aVar3.getClass();
                    Intent intent = new Intent(mVarRequireActivity, (Class<?>) PregnancySetupGenesisActivity.class);
                    if (mVarRequireActivity != null) {
                        mVarRequireActivity.startActivity(intent);
                    }
                }
                break;
        }
    }
}
