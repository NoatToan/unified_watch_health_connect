package ty1;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.l f167193b;

    public /* synthetic */ n0(com.garmin.android.apps.connectmobile.traininginitiative.ui.l lVar, int i14) {
        this.f167192a = i14;
        this.f167193b = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f167192a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.l lVar = this.f167193b;
        switch (i15) {
            case 0:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                j22.b bVar = j22.b.f96736a;
                androidx.fragment.app.m mVarRequireActivity = lVar.requireActivity();
                mVarRequireActivity.getClass();
                bVar.getClass();
                j22.b.r(mVarRequireActivity);
                break;
            default:
                lVar.f46125d.f(false);
                dialogInterface.dismiss();
                lVar.requireActivity().onBackPressed();
                break;
        }
    }
}
