package com.garmin.android.apps.connectmobile.connectiq;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.DisplayWiFiNetworksActivity;
import ew1.b3;
import ew1.i1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31880a;

    public /* synthetic */ i(int i14) {
        this.f31880a = i14;
    }

    private final void a(DialogInterface dialogInterface, int i14) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f31880a) {
            case 0:
                break;
            case 1:
                int i15 = k.f31884b;
                break;
            case 2:
                ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
                com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_connect_iq_datafield_alert, GCMSettingManager.f41536b.edit(), true);
                break;
            case 3:
                ConnectIQDownloadListActivity.a aVar2 = ConnectIQDownloadListActivity.f31779o;
                dialogInterface.dismiss();
                break;
            case 4:
                dialogInterface.dismiss();
                break;
            case 5:
                com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar3 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                dialogInterface.dismiss();
                break;
            case 6:
                int i16 = cv.m.f55821d;
                dialogInterface.dismiss();
                break;
            case 7:
                int i17 = cv.n.f55825d;
                dialogInterface.dismiss();
                break;
            case 8:
                int i18 = cv.o.f55830c;
                dialogInterface.dismiss();
                break;
            case 9:
                DisplayWiFiNetworksActivity.a aVar4 = DisplayWiFiNetworksActivity.f43230m;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 10:
                dialogInterface.dismiss();
                break;
            case 11:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar5 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                dialogInterface.dismiss();
                break;
            case 12:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar6 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                dialogInterface.dismiss();
                break;
            case 13:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar7 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                dialogInterface.dismiss();
                break;
            case 14:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar8 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                dialogInterface.dismiss();
                break;
            case 15:
                dialogInterface.dismiss();
                break;
            case 16:
                eg1.j jVar = eg1.j.f64004a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 17:
                dialogInterface.dismiss();
                break;
            case 18:
                dialogInterface.dismiss();
                break;
            case 19:
                dialogInterface.dismiss();
                break;
            case 20:
                dialogInterface.dismiss();
                break;
            case 21:
                dialogInterface.dismiss();
                break;
            case 22:
                dialogInterface.dismiss();
                break;
            case 23:
                dialogInterface.dismiss();
                break;
            case 24:
                dialogInterface.dismiss();
                break;
            case 25:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 26:
                i1.a aVar9 = i1.f66514e;
                dialogInterface.dismiss();
                break;
            case 27:
                b3.a aVar10 = b3.f66335d;
                dialogInterface.dismiss();
                break;
            case 28:
                b3.a aVar11 = b3.f66335d;
                dialogInterface.dismiss();
                break;
            default:
                GCMCalendarActivity.a aVar12 = GCMCalendarActivity.F;
                break;
        }
    }
}
