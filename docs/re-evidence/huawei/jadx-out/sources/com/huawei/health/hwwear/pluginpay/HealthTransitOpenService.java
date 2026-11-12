package com.huawei.health.hwwear.pluginpay;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcelable;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ddy;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.DeviceConfigInit;
import health.compact.a.LocalBroadcast;

/* JADX INFO: loaded from: classes29.dex */
public class HealthTransitOpenService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BroadcastReceiver f7149c = new BroadcastReceiver() { // from class: com.huawei.health.hwwear.pluginpay.HealthTransitOpenService.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("HealthTransitOpenService", "HwPayManager connectedChanged mNonLocalBroadcastReceiver, intent : ", intent.getAction());
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                if (parcelableExtra == null || !(parcelableExtra instanceof DeviceInfo)) {
                    LogUtil.j("HealthTransitOpenService", "deviceInfo is null!");
                    return;
                }
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                if (deviceInfo.getRelationship() != null && "followed_relationship".equals(deviceInfo.getRelationship())) {
                    LogUtil.j("HealthTransitOpenService", "This device does not have the correspond capability.");
                    return;
                }
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                LogUtil.a("HealthTransitOpenService", "connectedChanged: ", deviceInfo.getDeviceName(), ",state : ", Integer.valueOf(deviceConnectState));
                if (deviceConnectState == 3) {
                    HealthTransitOpenService.this.stopSelf();
                    return;
                }
                return;
            }
            LogUtil.j("HealthTransitOpenService", "deviceInfo is null!");
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (!ddy.e().isPluginAvaiable()) {
            LogUtil.a("R_HealthTransitOpenService", "onBind not PluginAvailable");
            return null;
        }
        return ddy.e().getServiceBinder(getApplicationContext(), "HealthTransitOpenService", intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        DeviceConfigInit.create();
        if (!ddy.e().isPluginAvaiable()) {
            LogUtil.a("HealthTransitOpenService", "onCreate not PluginAvailable");
            return;
        }
        ddy.e().serviceOnCreate(getApplicationContext(), "HealthTransitOpenService");
        e();
        LogUtil.a("HealthTransitOpenService", "HwTransitOpenService onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (!ddy.e().isPluginAvaiable()) {
            LogUtil.a("HealthTransitOpenService", "onDestroy not PluginAvailable");
            return;
        }
        ddy.e().serviceOnDestroy(getApplicationContext(), "HealthTransitOpenService");
        LogUtil.a("HealthTransitOpenService", "HwTransitOpenService onDestory");
        a();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        stopSelf(i2);
        return 2;
    }

    private void e() {
        BroadcastManagerUtil.c(getApplication(), this.f7149c, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    private void a() {
        try {
            LogUtil.a("HealthTransitOpenService", "Enter unregisterNonLocalBroadcast!");
            getApplication().unregisterReceiver(this.f7149c);
        } catch (IllegalArgumentException e) {
            LogUtil.e("HealthTransitOpenService", e.getMessage());
        }
    }
}
