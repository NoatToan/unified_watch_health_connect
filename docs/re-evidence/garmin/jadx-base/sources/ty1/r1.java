package ty1;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r1 implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167224b;

    public /* synthetic */ r1(com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar, int i14) {
        this.f167223a = i14;
        this.f167224b = yVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i14 = this.f167223a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167224b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                dialogInterface.getClass();
                androidx.appcompat.app.e eVar = (androidx.appcompat.app.e) dialogInterface;
                eVar.e(-1).setTextColor(a7.b.getColor(yVar.requireContext(), R.color.gcm_button_primary));
                eVar.e(-2).setTextColor(a7.b.getColor(yVar.requireContext(), R.color.gcm_button_primary));
                break;
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                dialogInterface.getClass();
                androidx.appcompat.app.e eVar2 = (androidx.appcompat.app.e) dialogInterface;
                eVar2.e(-1).setTextColor(a7.b.getColor(yVar.requireContext(), R.color.gcm_button_primary));
                eVar2.e(-2).setTextColor(a7.b.getColor(yVar.requireContext(), R.color.gcm_button_primary));
                break;
        }
    }
}
