package com.huawei.hwdevice.phoneprocess.mgr.hwwifisyncmgr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.ecu;
import defpackage.nan;
import defpackage.nio;
import health.compact.a.KeyValDbManager;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class WifiConnectReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17519c = new Object();
    private static WifiConnectReceiver d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f17520a = Collections.synchronizedList(new ArrayList(16));

    private WifiConnectReceiver() {
    }

    public static WifiConnectReceiver a() {
        WifiConnectReceiver wifiConnectReceiver;
        synchronized (f17519c) {
            if (d == null) {
                d = new WifiConnectReceiver();
            }
            wifiConnectReceiver = d;
        }
        return wifiConnectReceiver;
    }

    public List<String> c() {
        return this.f17520a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (r5.getState().equals(android.net.NetworkInfo.State.CONNECTED) != false) goto L36;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null) {
            LogUtil.d("WifiConnectReceiver_PhoneService", "intent is null");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WifiConnectReceiver_PhoneService");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.d("WifiConnectReceiver_PhoneService", "current deviceList is empty");
            KeyValDbManager.d(BaseApplication.getContext()).b("saved_support_sync_wifi", "0");
            return;
        }
        LogUtil.a("WifiConnectReceiver_PhoneService", "current action: ", intent.getAction());
        if (!"android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) && !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            return;
        }
        if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
            if (deviceInfo == null) {
                LogUtil.d("WifiConnectReceiver_PhoneService", "ConnectStateChangedReceiver(), deviceInfo is null");
                return;
            }
            if (deviceInfo.getDeviceConnectState() == 2) {
                d(deviceInfo);
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwwifisyncmgr.WifiConnectReceiver.3
                    @Override // java.lang.Runnable
                    public void run() {
                        nan.b();
                    }
                });
                return;
            }
            LogUtil.d("WifiConnectReceiver_PhoneService", "wifi is not connected");
            return;
        }
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo == null || networkInfo.getState() == null) {
            LogUtil.d("WifiConnectReceiver_PhoneService", "info.getState is null");
        }
    }

    private void d(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceFactoryReset() == 1) {
            this.f17520a.add(nio.c(deviceInfo.getDeviceIdentify()));
        }
    }
}
