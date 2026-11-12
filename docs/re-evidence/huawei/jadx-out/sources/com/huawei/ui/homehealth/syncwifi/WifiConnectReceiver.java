package com.huawei.ui.homehealth.syncwifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.dxx;
import defpackage.nan;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.util.LogUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes17.dex */
public class WifiConnectReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static WifiConnectReceiver f26105c;
    private ConnectivityManager.NetworkCallback e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f26104b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f26103a = new AtomicInteger(0);

    private WifiConnectReceiver() {
    }

    public static WifiConnectReceiver e() {
        WifiConnectReceiver wifiConnectReceiver;
        synchronized (f26104b) {
            if (f26105c == null) {
                f26105c = new WifiConnectReceiver();
            }
            wifiConnectReceiver = f26105c;
        }
        return wifiConnectReceiver;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null) {
            LogUtil.d("WifiConnectReceiver_Main", "intent is null");
            return;
        }
        List<DeviceInfo> listG = dxx.d().g();
        if (listG == null || listG.isEmpty()) {
            LogUtil.d("WifiConnectReceiver_Main", "enter registerWifiConnectedReceiver deviceInfoList is null");
            KeyValDbManager.d(BaseApplication.getContext()).b("saved_support_sync_wifi", "0");
            return;
        }
        LogUtil.a("WifiConnectReceiver_Main", "current action: ", intent.getAction());
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) || "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo == null || networkInfo.getState() == null) {
                LogUtil.d("WifiConnectReceiver_Main", "info.getState is null");
            } else if (!networkInfo.getState().equals(NetworkInfo.State.CONNECTED)) {
                LogUtil.d("WifiConnectReceiver_Main", "wifi is not connected");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.syncwifi.WifiConnectReceiver.2
                    @Override // java.lang.Runnable
                    public void run() {
                        nan.b();
                    }
                });
            }
        }
    }

    public void b() {
        synchronized (f26104b) {
            if (f26105c != null && f26103a.get() == 0) {
                LogUtil.a("WifiConnectReceiver_Main", "enter registerWifiConnectReceiver");
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
                    if (EnvironmentInfo.l()) {
                        a();
                        try {
                            NetworkUtil.d(this.e);
                            a(NetworkUtil.h());
                        } catch (RuntimeException unused) {
                            LogUtil.c("WifiConnectReceiver_Main", "registerWifiConnectReceiver registerNetworkCallback exception");
                        }
                        LogUtil.a("WifiConnectReceiver_Main", "registerWifiConnectReceiver registerNetworkCallback is success");
                    } else {
                        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                    }
                    BroadcastManagerUtil.c(BaseApplication.getContext(), f26105c, intentFilter, LocalBroadcast.f36595c, null);
                    f26103a.incrementAndGet();
                } catch (IllegalArgumentException unused2) {
                    LogUtil.c("WifiConnectReceiver_Main", "registerWifiConnectReceiver is failed");
                }
            }
        }
    }

    public void d() {
        i();
        c();
    }

    private void i() {
        synchronized (f26104b) {
            if (f26105c != null && f26103a.get() == 1) {
                try {
                    BaseApplication.getContext().unregisterReceiver(f26105c);
                    f26103a.decrementAndGet();
                    if (this.e != null && EnvironmentInfo.l()) {
                        NetworkUtil.e(this.e);
                        this.e = null;
                    }
                } catch (IllegalArgumentException unused) {
                    LogUtil.c("WifiConnectReceiver_Main", "unRegisterWifiConnectReceiver is failed");
                }
            }
        }
    }

    private static void c() {
        synchronized (f26104b) {
            f26105c = null;
        }
    }

    private void a() {
        if (EnvironmentInfo.l()) {
            ConnectivityManager.NetworkCallback networkCallback = this.e;
            if (networkCallback != null) {
                NetworkUtil.e(networkCallback);
                this.e = null;
            }
            this.e = new ConnectivityManager.NetworkCallback() { // from class: com.huawei.ui.homehealth.syncwifi.WifiConnectReceiver.4
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    WifiConnectReceiver.this.a(true);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    super.onCapabilitiesChanged(network, networkCapabilities);
                    LogUtil.a("WifiConnectReceiver_Main", "enter onCapabilitiesChanged");
                    if (networkCapabilities.hasCapability(16)) {
                        LogUtil.a("WifiConnectReceiver_Main", "currentNetwork is available");
                        WifiConnectReceiver.this.a(true);
                    } else {
                        LogUtil.a("WifiConnectReceiver_Main", "currentNetwork is unavailable");
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (!z) {
            LogUtil.d("WifiConnectReceiver_Main", "updateWifiMessageDeal isNetworkConnected is false");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.syncwifi.WifiConnectReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    nan.b();
                }
            });
        }
    }
}
