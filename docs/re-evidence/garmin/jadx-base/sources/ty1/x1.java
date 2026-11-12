package ty1;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexButton;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167266b;

    public /* synthetic */ x1(com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar, int i14) {
        this.f167265a = i14;
        this.f167266b = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f167265a) {
            case 0:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167266b;
                zVar.f46370d.f(false);
                GCMComplexButton gCMComplexButton = zVar.f46379m;
                if (gCMComplexButton == null) {
                    p005kotlin.jvm.internal.s.m("multiSportButton");
                    throw null;
                }
                gCMComplexButton.setEnabled(false);
                zVar.E6();
                dialogInterface.dismiss();
                return;
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar2 = this.f167266b;
                zVar2.f46370d.f(false);
                dialogInterface.dismiss();
                zVar2.requireActivity().onBackPressed();
                return;
        }
    }
}
