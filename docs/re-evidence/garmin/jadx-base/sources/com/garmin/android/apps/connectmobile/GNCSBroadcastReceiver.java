package com.garmin.android.apps.connectmobile;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.SmartNotificationsUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class GNCSBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static androidx.appcompat.app.e f28682a;

    public class a implements DialogInterface.OnClickListener {
        public a(GNCSBroadcastReceiver gNCSBroadcastReceiver) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            GNCSBroadcastReceiver.f28682a = null;
            dialogInterface.dismiss();
            Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            intent.addFlags(268435456);
            GarminConnectMobileApp.f28688j.startActivity(intent);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b(GNCSBroadcastReceiver gNCSBroadcastReceiver) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            GNCSBroadcastReceiver.f28682a = null;
            dialogInterface.dismiss();
        }
    }

    public class c implements DialogInterface.OnCancelListener {
        public c(GNCSBroadcastReceiver gNCSBroadcastReceiver) {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            GNCSBroadcastReceiver.f28682a = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (GarminDeviceWakefulService.f33825e || (runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) == null || !Settings.canDrawOverlays(GarminConnectMobileApp.f28688j)) {
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals("com.garmin.android.apps.connectmobile")) {
                try {
                    androidx.appcompat.app.e eVar = f28682a;
                    if (eVar == null || !eVar.isShowing()) {
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(GarminConnectMobileApp.f28688j);
                        aVar.setPositiveButton(R.string.lbl_settings, new a(this));
                        aVar.setNegativeButton(android.R.string.cancel, new b(this));
                        aVar.setOnCancelListener(new c(this));
                        aVar.setTitle(R.string.notification_access_required);
                        if (SmartNotificationsUtil.isNotificationAccessEnabled(context) && GNCSListenerService.isServiceConnected()) {
                            return;
                        }
                        aVar.setMessage(R.string.notification_access_required_popup_message);
                        androidx.appcompat.app.e eVarCreate = aVar.create();
                        f28682a = eVarCreate;
                        eVarCreate.getWindow().setType(2003);
                        f28682a.show();
                    }
                    int i14 = ih2.d.f93519a;
                    z6.a0.a(context).f202582b.cancel(null, 98);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }
}
