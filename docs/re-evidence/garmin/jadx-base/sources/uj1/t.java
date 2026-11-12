package uj1;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171564b;

    public /* synthetic */ t(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar, int i14) {
        this.f171563a = i14;
        this.f171564b = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f171563a;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171564b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                a2 a2Var = a2.SAFETY_FEATURES;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "MyInformationFragment", "[navigateToLocationSettings] navigate to location settings");
                dVar.T.a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), null);
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.getClass();
                a2 a2Var2 = a2.SAFETY_FEATURES;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "MyInformationFragment", "[navigateToApplicationDetails] navigate to application details to grant location permissions");
                dVar.P.a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + dVar.requireContext().getPackageName())), null);
                dialogInterface.dismiss();
                break;
        }
        return Unit.INSTANCE;
    }
}
