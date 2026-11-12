package c22;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23031b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f23030a = i14;
        this.f23031b = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i14 = this.f23030a;
        Object obj = this.f23031b;
        switch (i14) {
            case 0:
                f fVar = f.f23050a;
                dialogInterface.getClass();
                androidx.appcompat.app.e eVar = (androidx.appcompat.app.e) dialogInterface;
                Button buttonE = eVar.e(-1);
                eVar.e(-2);
                eVar.e(-3);
                buttonE.setTextColor(a7.b.getColor((Context) obj, R.color.gcm_text_primary_action));
                break;
            case 1:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                dialogInterface.getClass();
                Button buttonE2 = ((androidx.appcompat.app.e) dialogInterface).e(-1);
                buttonE2.setTextColor(a7.b.getColor(((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b) obj).requireContext(), R.color.gcm_text_danger_action));
                buttonE2.setTypeface(buttonE2.getTypeface(), 1);
                break;
            case 2:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface.getClass();
                Button buttonE3 = ((androidx.appcompat.app.e) dialogInterface).e(-1);
                buttonE3.setTextColor(a7.b.getColor(((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h) obj).requireContext(), R.color.gcm_text_danger_action));
                buttonE3.setTypeface(buttonE3.getTypeface(), 1);
                break;
            case 3:
                PregnancyDetailsActivity.a aVar3 = PregnancyDetailsActivity.f40489x;
                dialogInterface.getClass();
                Button buttonE4 = ((androidx.appcompat.app.e) dialogInterface).e(-1);
                buttonE4.setTextColor(a7.b.getColor((PregnancyDetailsActivity) obj, R.color.gcm_text_danger_action));
                buttonE4.setTypeface(buttonE4.getTypeface(), 1);
                break;
            case 4:
                pb1.l lVar = (pb1.l) obj;
                pb1.l.a aVar4 = pb1.l.f136861l;
                dialogInterface.getClass();
                androidx.appcompat.app.e eVar2 = (androidx.appcompat.app.e) dialogInterface;
                eVar2.e(-1).setTextColor(a7.b.getColor(lVar.requireContext(), R.color.gcm_text_danger_action));
                eVar2.e(-2).setTextColor(a7.b.getColor(lVar.requireContext(), R.color.gcm_text_primary_action));
                break;
            case 5:
                PregnancyStopTrackingActivity.a aVar5 = PregnancyStopTrackingActivity.f41001d;
                dialogInterface.getClass();
                ((androidx.appcompat.app.e) dialogInterface).e(-1).setTextColor(a7.b.getColor((PregnancyStopTrackingActivity) obj, R.color.gcm_text_danger_action));
                break;
            case 6:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.x) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                dialogInterface.getClass();
                androidx.appcompat.app.e eVar3 = (androidx.appcompat.app.e) dialogInterface;
                eVar3.e(-1).setTextColor(a7.b.getColor(xVar.requireContext(), R.color.gcm_button_primary));
                eVar3.e(-2).setTextColor(a7.b.getColor(xVar.requireContext(), R.color.gcm_button_primary));
                break;
            default:
                ur0.a aVar7 = (ur0.a) obj;
                ur0.a.C3218a c3218a = ur0.a.f172319e;
                aVar7.v6(aVar7.u6() >= 150);
                break;
        }
    }
}
