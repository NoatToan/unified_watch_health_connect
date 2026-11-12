package zb0;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppManagementListActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.settings.IndexSmartScaleUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.activityoptions.ActivityOptionsSettingsSetup;
import com.garmin.android.apps.connectmobile.settings.activityoptions.GCMBaseRunOptionsSettingsSetup;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmSettingActivity;
import java.util.Map;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f203571b;

    public /* synthetic */ m(o oVar, ng1.b0 b0Var) {
        this.f203570a = 2;
        this.f203571b = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        Context applicationContext;
        Intent intentD;
        int i14 = this.f203570a;
        o oVar = this.f203571b;
        switch (i14) {
            case 0:
                if (!n0.i(u0.H0, oVar.f203588j.getProductNumber())) {
                    DeviceUserSettingsActivity.fa(oVar.getActivity(), oVar.f203588j.getUnitID(), oVar.f203588j.getProductNumber());
                } else {
                    Context contextRequireContext = oVar.requireContext();
                    long unitID = oVar.f203588j.getUnitID();
                    String productNumber = oVar.f203588j.getProductNumber();
                    IndexSmartScaleUserSettingsActivity.f41569a.getClass();
                    contextRequireContext.getClass();
                    if (!z10.d1.f()) {
                        Intent intentD2 = l2.d(contextRequireContext, IndexSmartScaleUserSettingsActivity.class, "GCM_deviceUnitID", unitID);
                        intentD2.putExtra("GCM_deviceProductNbr", productNumber);
                        contextRequireContext.startActivity(intentD2);
                    } else {
                        z10.d1.o(contextRequireContext, new xk1.v(12));
                    }
                }
                break;
            case 1:
                if (oVar.getActivity() != null && (intentD = ar.a.d((applicationContext = oVar.getContext().getApplicationContext()), oVar.f203586h)) != null) {
                    applicationContext.startActivity(intentD);
                    break;
                }
                break;
            case 2:
                String strB = ng1.b0.b(oVar.f203588j.getProductNumber());
                if (strB != null) {
                    Intent intent = new Intent();
                    intent.putExtra("GCM_deviceUnitID", oVar.f203588j.getUnitID());
                    intent.putExtra("GCM_deviceProductNbr", oVar.f203588j.getProductNumber());
                    intent.putExtra("GCM_deviceName", oVar.f203588j.getProductDisplayName());
                    intent.putExtra("GCM_macAddress", oVar.f203588j.d0());
                    intent.putExtra("GCM_currentFirmwareVersion", oVar.f203588j.getSoftwareVersion());
                    intent.setClassName(oVar.requireContext(), strB);
                    oVar.startActivity(intent);
                }
                break;
            case 3:
                g22.e.i(oVar, n0.e(oVar.f203588j.getUnitID()));
                break;
            case 4:
                oVar.getClass();
                Intent intent2 = new Intent(oVar.getActivity(), (Class<?>) BikeAlarmSettingActivity.class);
                intent2.putExtra("GCM_deviceUnitID", oVar.f203588j.getUnitID());
                oVar.startActivity(intent2);
                break;
            case 5:
                if (hb2.i.a(oVar.getActivity())) {
                    if (!hk0.p.m(oVar.f203588j)) {
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(oVar.getActivity());
                        aVar.setTitle(R.string.connect_iq_device_not_connected_title);
                        aVar.setMessage(R.string.connect_iq_device_not_connected_msg);
                        aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                        aVar.create().show();
                    } else {
                        Intent intent3 = new Intent(oVar.getActivity(), (Class<?>) ConnectIQAppManagementListActivity.class);
                        intent3.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", oVar.f203588j.getUnitID());
                        oVar.startActivity(intent3);
                    }
                }
                break;
            case 6:
                if (hb2.i.a(oVar.getActivity())) {
                    u0 u0Var = oVar.f203589k;
                    Map<u0, vg1.t> map = n0.f203577a;
                    Intent intent4 = (u0Var == u0.f203837x1 || u0Var == u0.A5) ? new Intent(oVar.getActivity(), (Class<?>) GCMBaseRunOptionsSettingsSetup.class) : new Intent(oVar.getActivity(), (Class<?>) ActivityOptionsSettingsSetup.class);
                    intent4.putExtra("GCM_deviceUnitID", oVar.f203588j.getUnitID());
                    intent4.putExtra("GCM_deviceEnumValue", oVar.f203589k);
                    intent4.putExtra("GCM_deviceProductNbr", oVar.f203588j.getProductNumber());
                    intent4.putExtra("GCM_deviceName", oVar.f203588j.getProductDisplayName());
                    oVar.startActivity(intent4);
                }
                break;
            case 7:
                oVar.getClass();
                GarminPayLaunchScreenActivity.a aVar2 = GarminPayLaunchScreenActivity.f35305d;
                Context contextRequireContext2 = oVar.requireContext();
                kj0.a.c cVar = new kj0.a.c(Long.valueOf(oVar.f203588j.getUnitID()), oVar.f203588j.getImageURL(), oVar.f203588j.getProductDisplayName());
                aVar2.getClass();
                oVar.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(contextRequireContext2, cVar)));
                break;
            case 8:
                if (hb2.i.a(oVar.getActivity())) {
                    androidx.fragment.app.m activity = oVar.getActivity();
                    long unitID2 = oVar.f203588j.getUnitID();
                    AlarmsSettingsActivity.f41854n.getClass();
                    activity.getClass();
                    activity.startActivity(AlarmsSettingsActivity.a.a(activity, unitID2, null, null));
                }
                break;
            default:
                if (!hk0.p.m(oVar.f203588j)) {
                    androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(oVar.requireContext());
                    aVar3.setTitle(R.string.find_my_watch_device_not_connected_title);
                    aVar3.setMessage(R.string.find_my_watch_device_not_connected_msg);
                    aVar3.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                    aVar3.create().show();
                } else {
                    xt2.a aVarK6 = o.K6(oVar.f203588j);
                    if (aVarK6 == null) {
                        Handler handler = oVar.f203590l;
                        if (handler != null) {
                            handler.post(new z0.g0(oVar, 4));
                        }
                    } else {
                        aVarK6.d(new r(oVar));
                    }
                    oVar.f203595q.g(true);
                }
                break;
        }
    }

    public /* synthetic */ m(o oVar, int i14) {
        this.f203570a = i14;
        this.f203571b = oVar;
    }
}
