package hb1;

import android.content.DialogInterface;
import android.widget.Button;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f82761b;

    public /* synthetic */ d(m mVar, int i14) {
        this.f82760a = i14;
        this.f82761b = mVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i14 = this.f82760a;
        m mVar = this.f82761b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                dialogInterface.getClass();
                Button buttonE = ((androidx.appcompat.app.e) dialogInterface).e(-1);
                buttonE.setTextColor(a7.b.getColor(mVar, R.color.gcm_text_danger_action));
                buttonE.setTypeface(buttonE.getTypeface(), 1);
                break;
            case 1:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                dialogInterface.getClass();
                Button buttonE2 = ((androidx.appcompat.app.e) dialogInterface).e(-1);
                buttonE2.setTextColor(a7.b.getColor(mVar, R.color.gcm_text_danger_action));
                buttonE2.setTypeface(buttonE2.getTypeface(), 1);
                break;
            default:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                dialogInterface.getClass();
                Button buttonE3 = ((androidx.appcompat.app.e) dialogInterface).e(-1);
                buttonE3.setTextColor(a7.b.getColor(mVar, R.color.gcm_text_danger_action));
                buttonE3.setTypeface(buttonE3.getTypeface(), 1);
                break;
        }
    }
}
