package com.huawei.hwdevice.phoneprocess.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import androidx.media3.common.C;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.mio;
import defpackage.mjh;
import defpackage.muv;
import defpackage.mux;
import defpackage.nfj;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkConnectReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f17543b = new Object();
    private static Handler e;

    public static void d(Handler handler) {
        e = handler;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            LogUtil.a("NetworkConnectReceiver", "receive action: ", action);
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || "android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
                ConnectivityManager connectivityManager = context.getSystemService("connectivity") instanceof ConnectivityManager ? (ConnectivityManager) context.getSystemService("connectivity") : null;
                if (connectivityManager == null) {
                    LogUtil.j("NetworkConnectReceiver", "connectivityManager is null");
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    LogUtil.j("NetworkConnectReceiver", "network info is null");
                    return;
                }
                try {
                    c(context, activeNetworkInfo);
                    a(context, activeNetworkInfo, action);
                } catch (Exception e2) {
                    LogUtil.e("NetworkConnectReceiver", "onReceive Exception: ", ExceptionUtils.c(e2));
                }
            }
            if ("com.huawei.health.action.ACTION_SPORT_INTENSITY_INDEX".equals(action)) {
                LogUtil.a("NetworkConnectReceiver", "onReceive sendMediumToHighStrength");
                List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NetworkConnectReceiver");
                nfj.b(deviceList.size() > 0 ? deviceList.get(0) : null);
            }
        }
    }

    private void c(final Context context, NetworkInfo networkInfo) {
        boolean z = networkInfo.getType() == 1;
        if (networkInfo.isConnected() && z) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.receiver.NetworkConnectReceiver.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    NetworkConnectReceiver.this.e(context);
                }
            });
        }
    }

    private void a(final Context context, final NetworkInfo networkInfo, final String str) {
        synchronized (f17543b) {
            boolean z = true;
            if (networkInfo.getType() != 1) {
                z = false;
            }
            final boolean z2 = z;
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.receiver.NetworkConnectReceiver.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean zB = PowerKitManager.a().b();
                    LogUtil.a("NetworkConnectReceiver", "connected: ", Boolean.valueOf(networkInfo.isConnected()), ";sleep:", Boolean.valueOf(zB), ";isWifi:", Boolean.valueOf(z2));
                    if (!networkInfo.isConnected() || zB) {
                        return;
                    }
                    NetworkConnectReceiver.this.a();
                    if (z2 || "android.net.conn.CONNECTIVITY_CHANGE".equals(str)) {
                        NetworkConnectReceiver.this.b(context);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        LogUtil.a("NetworkConnectReceiver", "checkWifiConnected start");
        e.postDelayed(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.receiver.NetworkConnectReceiver.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("NetworkConnectReceiver", "checkWifiConnected end");
                List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "NetworkConnectReceiver");
                DeviceInfo deviceInfoA = deviceList.size() > 0 ? NetworkConnectReceiver.this.a(deviceList) : null;
                if (deviceInfoA == null) {
                    LogUtil.j("NetworkConnectReceiver", "otherConnectedDevice == null");
                    return;
                }
                boolean zA = mio.a();
                LogUtil.a("NetworkConnectReceiver", "checkWifiConnected isMobileTraffic ", Boolean.valueOf(zA));
                NetworkConnectReceiver.this.e(deviceInfoA, !zA);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) throws Throwable {
        ReleaseLogUtil.d("R_NetworkConnectReceiver", "handleUploadLog enter, isRelease = ", Boolean.valueOf(CommonUtil.bu()));
        if (CommonUtil.bu()) {
            mjh.e(context, "");
            mux.b().c(context);
        } else {
            LogUtil.a("NetworkConnectReceiver", "betaUpload enter");
            muv.e().b(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DeviceInfo a(List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo : list) {
            if (mio.e(deviceInfo.getDeviceIdentify())) {
                return deviceInfo;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final DeviceInfo deviceInfo, boolean z) {
        LogUtil.a("NetworkConnectReceiver", "Enter sendConnectStateBroadcast().");
        if (qrs.r()) {
            LogUtil.j("NetworkConnectReceiver", "startMainService Utils.isFastClick(): ", Boolean.valueOf(qrs.r()));
            return;
        }
        e.removeMessages(101);
        if (z) {
            LogUtil.a("NetworkConnectReceiver", "send MESSAGE_NETWORK_WIFI_CONNECTED");
            e.postDelayed(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.receiver.NetworkConnectReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    boolean zA = mio.a();
                    LogUtil.j("NetworkConnectReceiver", "startMainService MESSAGE_NETWORK_WIFI_CONNECTED isMobileTraffic ", Boolean.valueOf(zA));
                    if (zA) {
                        return;
                    }
                    Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HwUpdateService.class);
                    intent.putExtra("extra_band_imei", deviceInfo.getDeviceIdentify());
                    intent.setAction("action_band_auto_download");
                    try {
                        BaseApplication.getContext().startService(intent);
                    } catch (IllegalStateException | SecurityException e2) {
                        LogUtil.e("startMainService MESSAGE_NETWORK_WIFI_CONNECTED Exception", ExceptionUtils.c(e2));
                    }
                }
            }, 60000L);
            return;
        }
        LogUtil.a("NetworkConnectReceiver", "remove EphemerisConstants.MESSAGE_NETWORK_WIFI_CONNECTED");
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HwUpdateService.class);
        intent.setAction("action_cancel_download_all_ota");
        try {
            BaseApplication.getContext().startService(intent);
        } catch (IllegalStateException | SecurityException e2) {
            LogUtil.e("startMainService MESSAGE_NETWORK_WIFI_CONNECTED Exception", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Handler handler = e;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(100, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } else {
            LogUtil.j("NetworkConnectReceiver", "mHandler is null");
        }
    }
}
