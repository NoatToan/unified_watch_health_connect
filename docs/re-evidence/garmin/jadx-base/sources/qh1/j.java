package qh1;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.bikesensors.DeviceSettingsFirmwareUpdate;
import com.garmin.android.apps.connectmobile.bikesensors.VectorDeviceSettingsEditActivity;
import com.garmin.android.apps.connectmobile.bikesensors.VectorGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.AddBloodPressureActivity;
import com.garmin.android.apps.connectmobile.navigation.EditBottomNavBarActivity;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionActivity;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144739a;

    public /* synthetic */ j(int i14) {
        this.f144739a = i14;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f144739a) {
            case 0:
                String str = IndexScale2AdjustBodyCompositionActivity.f43108h;
                dialogInterface.dismiss();
                break;
            case 1:
                String str2 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                dialogInterface.dismiss();
                break;
            case 2:
                com.garmin.android.apps.connectmobile.settings.lte.c.a aVar = com.garmin.android.apps.connectmobile.settings.lte.c.f43491d;
                dialogInterface.dismiss();
                break;
            case 3:
                Logger logger = com.garmin.feature.garminpay.providers.rabbit.ui.b.f51786e;
                dialogInterface.dismiss();
                break;
            case 4:
                dialogInterface.dismiss();
                break;
            case 5:
                com.garmin.android.apps.connectmobile.social.share.d.a aVar2 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                dialogInterface.dismiss();
                break;
            case 6:
                com.garmin.android.apps.connectmobile.social.share.d.a aVar3 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                dialogInterface.dismiss();
                break;
            case 7:
                com.garmin.android.apps.connectmobile.social.share.f.a aVar4 = com.garmin.android.apps.connectmobile.social.share.f.f44683j;
                dialogInterface.dismiss();
                break;
            case 8:
                UCropImageActivity.a aVar5 = UCropImageActivity.f44623o;
                dialogInterface.dismiss();
                break;
            case 9:
                AddBloodPressureActivity.a aVar6 = AddBloodPressureActivity.f30909d;
                dialogInterface.dismiss();
                break;
            case 10:
                dialogInterface.dismiss();
                break;
            case 11:
                dialogInterface.dismiss();
                break;
            case 12:
                dialogInterface.dismiss();
                break;
            case 13:
                dialogInterface.dismiss();
                break;
            case 14:
                int i15 = sz0.l.f161444a;
                dialogInterface.dismiss();
                break;
            case 15:
                int i16 = sz0.u.E;
                dialogInterface.dismiss();
                break;
            case 16:
                int i17 = tm0.c.f165349i;
                dialogInterface.dismiss();
                break;
            case 17:
                int i18 = tm0.c.f165349i;
                dialogInterface.dismiss();
                break;
            case 18:
                int i19 = tm0.c.f165349i;
                dialogInterface.dismiss();
                break;
            case 19:
                dialogInterface.dismiss();
                break;
            case 20:
                tm0.i.a aVar7 = tm0.i.f165371j;
                dialogInterface.dismiss();
                break;
            case 21:
                int i24 = DeviceSettingsFirmwareUpdate.B;
                dialogInterface.dismiss();
                break;
            case 22:
                VectorDeviceSettingsEditActivity.a aVar8 = VectorDeviceSettingsEditActivity.f30808d;
                dialogInterface.dismiss();
                break;
            case 23:
                int i25 = VectorGeneralSettingsActivity.f30812w;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 24:
                int i26 = VectorGeneralSettingsActivity.f30812w;
                dialogInterface.dismiss();
                break;
            case 25:
                int i27 = EditBottomNavBarActivity.f39331c;
                dialogInterface.dismiss();
                break;
            case 26:
                int i28 = EditBottomNavBarActivity.f39331c;
                dialogInterface.dismiss();
                break;
            case 27:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                dialogInterface.dismiss();
                break;
            case 28:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                dialogInterface.dismiss();
                break;
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                dialogInterface.dismiss();
                break;
        }
    }
}
