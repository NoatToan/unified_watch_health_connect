package com.huami.watch.wififtp;

import android.app.FragmentManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.net.wifi.WifiNetworkSuggestion;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.PatternMatcher;
import android.view.View;
import androidx.annotation.NonNull;
import com.huami.android.tools.pay.ali.AliPayResponseKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.wififtp.WifiController;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class WifiController {
    private static final int A = 1;
    private static final int B = 4;
    private static final int C = 30000;
    private static final int D = 130;
    private static final int E = 131;
    private static WifiController F = null;
    public static final int WPA2_PSK = 4;
    private static final String y = "WifiController";
    private static final int z = 0;
    private Context a;
    private WifiManager b;
    private ConnectivityManager c;
    private String h;
    private String i;
    private String j;
    private int k;
    private APConnectCallback n;
    private UIContext o;
    public boolean p;
    public boolean q;
    private f w;
    private NetworkRequest x;
    private List<WifiNetworkSuggestion> d = new ArrayList();
    private boolean e = false;
    private WifiInfo f = null;
    private int g = -1;
    private Handler l = new a(Looper.getMainLooper());
    private boolean m = false;
    private final int r = 30;
    private final int s = 2000;
    private int t = 0;
    private BroadcastReceiver u = new b();
    private boolean v = false;

    public interface APConnectCallback {
        void onConnected();

        void onDisconnected();
    }

    public interface UIContext {
        FragmentManager getFragmentManager();

        void startActivity(Intent intent);
    }

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 130) {
                WifiController.this.y("openWifi fial.");
                WifiController.this.v = false;
            } else {
                if (i != 131) {
                    return;
                }
                WifiController.this.v();
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            if (WifiController.this.h == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("previous_wifi_state", 4);
                int intExtra2 = intent.getIntExtra("wifi_state", 4);
                WifiController.this.y("Wifi state: " + intExtra + "->" + intExtra2);
                if (3 == intExtra2) {
                    if (WifiController.this.v) {
                        WifiController.this.l.removeMessages(130);
                        WifiController wifiController = WifiController.this;
                        if (wifiController.D(wifiController.h)) {
                            return;
                        }
                        WifiController.this.b.startScan();
                        return;
                    }
                    return;
                }
                if (1 == intExtra2 && WifiController.this.e) {
                    WifiController.this.e = false;
                    if (WifiController.this.n != null) {
                        WifiController.this.n.onDisconnected();
                        return;
                    }
                    return;
                }
                return;
            }
            if ("android.net.wifi.SCAN_RESULTS".equals(action)) {
                if (!WifiController.this.v || WifiController.this.e) {
                    return;
                }
                WifiController.this.y("SCAN_RESULTS_AVAILABLE_ACTION");
                WifiController.this.v = false;
                WifiController wifiController2 = WifiController.this;
                wifiController2.connectAP(wifiController2.i, WifiController.this.k, WifiController.this.j);
                return;
            }
            if (!"android.net.wifi.STATE_CHANGE".equals(action) || (parcelableExtra = intent.getParcelableExtra("networkInfo")) == null) {
                return;
            }
            NetworkInfo networkInfo = (NetworkInfo) parcelableExtra;
            WifiController.this.y("NETWORK_STATE_CHANGED_ACTION Type:" + networkInfo.getType() + " State:" + networkInfo.getState());
            if (networkInfo.getType() == 1) {
                int i = e.a[networkInfo.getState().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    WifiController wifiController3 = WifiController.this;
                    if (wifiController3.D(wifiController3.h) || !WifiController.this.e) {
                        return;
                    }
                    WifiController.this.y("  disconnect from NETWORK_STATE_CHANGED_ACTION.");
                    WifiController.this.e = false;
                    if (WifiController.this.n != null) {
                        WifiController.this.n.onDisconnected();
                        return;
                    }
                    return;
                }
                WifiController wifiController4 = WifiController.this;
                if (wifiController4.D(wifiController4.h)) {
                    if (WifiController.this.e) {
                        return;
                    }
                    WifiController.this.y("  connect ap success from NETWORK_STATE_CHANGED_ACTION.");
                    WifiController.this.e = true;
                    if (WifiController.this.n != null) {
                        WifiController.this.n.onConnected();
                        return;
                    }
                    return;
                }
                if (!WifiController.this.e) {
                    if (WifiController.this.v) {
                        WifiController.this.y("not current AP, startScan.");
                        WifiController.this.b.startScan();
                        return;
                    }
                    return;
                }
                WifiController.this.y("  connect other ap from NETWORK_STATE_CHANGED_ACTION.");
                WifiController.this.e = false;
                if (WifiController.this.n != null) {
                    WifiController.this.n.onDisconnected();
                }
            }
        }
    }

    public class c implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public c(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WifiController.this.l.sendEmptyMessageDelayed(130, 30000L);
            WifiController.this.O();
            this.a.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public d(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WifiController.this.v = false;
            WifiController.this.l.sendEmptyMessage(130);
            this.a.dismiss();
        }
    }

    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NetworkInfo.State.values().length];
            a = iArr;
            try {
                iArr[NetworkInfo.State.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[NetworkInfo.State.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class f extends ConnectivityManager.NetworkCallback {
        private String a;

        public f(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String c(Network network) {
            return "ConnectAP, OnAvailable: " + network + "required ssid: " + this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d() {
            return "ConnectAP, OnUnavailable...";
        }

        public void e(@NonNull String str) {
            this.a = str;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull final Network network) {
            HMLog.info(WifiController.y, new Function0() { // from class: com.huami.watch.wififtp.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.c(network);
                }
            });
            try {
                if (WifiController.this.D(this.a)) {
                    WifiController.this.y("bind process to AP Network " + network);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23) {
                        WifiController.this.c.bindProcessToNetwork(network);
                    } else if (i >= 21) {
                        ConnectivityManager.setProcessDefaultNetwork(network);
                    }
                } else {
                    WifiController.this.y("current not AP. release bind process to AP Network.");
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23) {
                        WifiController.this.c.bindProcessToNetwork(null);
                    } else if (i2 >= 21) {
                        ConnectivityManager.setProcessDefaultNetwork(null);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            HMLog.info(WifiController.y, new Function0() { // from class: com.huami.watch.wififtp.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WifiController.f.d();
                }
            });
        }
    }

    private WifiController(Context context) {
        this.a = context.getApplicationContext();
        B();
    }

    private void A() {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                f fVar = this.w;
                if (fVar != null) {
                    this.c.unregisterNetworkCallback(fVar);
                }
            } catch (Exception unused) {
            }
            try {
                this.w.e(this.h);
                this.c.requestNetwork(this.x, this.w);
            } catch (Exception unused2) {
            }
        }
    }

    private void B() {
        this.b = (WifiManager) this.a.getSystemService("wifi");
        this.c = (ConnectivityManager) this.a.getSystemService("connectivity");
        C();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        this.a.registerReceiver(this.u, intentFilter);
        System.setProperty(it.sauronsoftware.ftp4j.c.c, AliPayResponseKt.CODE_ALI_REPEAT);
        HMLog.info(y, new Function0() { // from class: lv8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WifiController.H();
            }
        });
    }

    private void C() {
        if (Build.VERSION.SDK_INT >= 21) {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addTransportType(1);
            this.x = builder.build();
            this.w = new f(this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D(String str) {
        WifiInfo connectionInfo = this.b.getConnectionInfo();
        NetworkInfo networkInfo = this.c.getNetworkInfo(1);
        StringBuilder sb = new StringBuilder();
        sb.append("isCurrentAP WifiInfo:");
        sb.append(connectionInfo != null ? connectionInfo.getSSID() : null);
        sb.append(" NetworkInfo:");
        sb.append(networkInfo != null ? networkInfo.getExtraInfo() : null);
        sb.append(" AP_SSID: ");
        sb.append(str);
        y(sb.toString());
        return (networkInfo != null && str != null && str.equals(networkInfo.getExtraInfo())) || (connectionInfo != null && str != null && str.equals(connectionInfo.getSSID()));
    }

    private WifiConfiguration E(String str) {
        List<WifiConfiguration> configuredNetworks = this.b.getConfiguredNetworks();
        if (configuredNetworks == null || configuredNetworks.size() <= 0) {
            return null;
        }
        for (WifiConfiguration wifiConfiguration : configuredNetworks) {
            String str2 = wifiConfiguration.SSID;
            if (str2 != null && str2.equals(str)) {
                return wifiConfiguration;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F(String str) {
        return "ConnectAP, RequestNetwork: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G(String str, Throwable th) {
        return str + th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H() {
        return "AutoNoop: 20s, Timeout Close: 15s, Connection: 15s, Read: 15s";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String I(String str, int i) {
        return "restore user wifi: " + str + "; add suggestion status: " + i;
    }

    private void J() {
        this.m = true;
        setAPConnectCallback(null);
        try {
            this.a.unregisterReceiver(this.u);
        } catch (Exception unused) {
        }
        this.l.removeCallbacksAndMessages(null);
        x();
    }

    private void K() {
        y("openWifi");
        this.l.removeMessages(130);
        int wifiState = this.b.getWifiState();
        if (wifiState != 1) {
            y("  wifi state not WIFI_STATE_DISABLED. state:" + wifiState);
            this.v = false;
            this.l.sendEmptyMessage(130);
            return;
        }
        boolean wifiEnabled = this.b.setWifiEnabled(true);
        y("  open result " + wifiEnabled);
        if (!wifiEnabled) {
            N();
        } else {
            this.v = true;
            this.l.sendEmptyMessageDelayed(130, 30000L);
        }
    }

    private void L() {
        WifiInfo wifiInfo = this.f;
        if (wifiInfo == null) {
            y("restoreWifi failed as saved wifi info is null");
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            final String ssid = wifiInfo.getSSID();
            WifiNetworkSuggestion wifiNetworkSuggestionBuild = new WifiNetworkSuggestion.Builder().setSsid(ssid).build();
            this.b.removeNetworkSuggestions(this.d);
            this.d.clear();
            this.d.add(wifiNetworkSuggestionBuild);
            final int iAddNetworkSuggestions = this.b.addNetworkSuggestions(this.d);
            HMLog.info(y, new Function0() { // from class: jv8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WifiController.I(ssid, iAddNetworkSuggestions);
                }
            });
        }
        this.c.unregisterNetworkCallback(this.w);
    }

    private void M() {
        WifiInfo connectionInfo = this.b.getConnectionInfo();
        if (connectionInfo != null) {
            this.f = connectionInfo;
            y("  savedNetId: " + connectionInfo.getNetworkId());
        }
    }

    private void N() {
        this.v = true;
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(3);
        alertDialogFragmentNewInstance.setTitle(this.a.getResources().getString(R.string.file_manager_dialog_open_wifi_error_title));
        alertDialogFragmentNewInstance.setMessage(this.a.getResources().getString(R.string.file_manager_dialog_open_wifi_error_content));
        alertDialogFragmentNewInstance.setConfirm(this.a.getString(R.string.file_manager_dialog_open_wifi_btn), new c(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setCancel(this.a.getString(R.string.btn_cancel), new d(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setCancelable(false);
        try {
            alertDialogFragmentNewInstance.show(this.o.getFragmentManager(), "Connect Wi-Fi");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        intent.addFlags(268435456);
        try {
            this.o.startActivity(intent);
        } catch (Exception unused) {
            y("showWifiSetting Fail.");
        }
    }

    public static WifiController get(Context context) {
        if (F == null) {
            F = new WifiController(context);
        }
        return F;
    }

    public static void release() {
        WifiController wifiController = F;
        if (wifiController != null) {
            wifiController.J();
        }
        F = null;
    }

    private void u() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress()) {
                        y("check ip " + inetAddressNextElement.getHostAddress().toString());
                    }
                }
            }
        } catch (Exception e2) {
            z("check local ip fail.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        y("CheckNetWorkState...ConnectFTPRetry:" + this.q + "ConnectFTPRetry:" + this.p);
        if (this.p) {
            return;
        }
        if (!this.b.isWifiEnabled()) {
            y("  Wifi disabled. cancel check.");
            this.t = 0;
            disconnectAP();
            return;
        }
        NetworkInfo activeNetworkInfo = this.c.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED && activeNetworkInfo.getType() == 1 && D(this.h)) {
            y("  ap connect success from CheckNetWorkState");
            if (!this.e) {
                this.e = true;
                APConnectCallback aPConnectCallback = this.n;
                if (aPConnectCallback != null) {
                    aPConnectCallback.onConnected();
                }
            }
        }
        int i = this.t;
        if (i <= 30) {
            if (this.e) {
                return;
            }
            this.t = i + 1;
            this.l.sendEmptyMessageDelayed(131, 2000L);
            return;
        }
        y("CheckNetWorkState failed, disconnectAP and startScan.");
        this.t = 0;
        disconnectAP();
        this.v = true;
        this.b.startScan();
    }

    private WifiConfiguration w(String str, String str2, int i) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = "\"" + str + "\"";
        if (i == 0) {
            wifiConfiguration.allowedKeyManagement.set(0);
        } else if (i == 4) {
            wifiConfiguration.allowedKeyManagement.set(1);
            wifiConfiguration.preSharedKey = "\"" + str2 + "\"";
        }
        return wifiConfiguration;
    }

    private void x() {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                f fVar = this.w;
                if (fVar != null) {
                    this.c.unregisterNetworkCallback(fVar);
                }
            } catch (Exception unused) {
            }
            try {
                y("release bind process to AP Network.");
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.c.bindProcessToNetwork(null);
                } else if (i >= 21) {
                    ConnectivityManager.setProcessDefaultNetwork(null);
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(String str) {
        HMLog.i(y, str, new Object[0]);
    }

    private void z(final String str, final Throwable th) {
        HMLog.info(y, new Function0() { // from class: kv8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WifiController.G(str, th);
            }
        });
    }

    public void cancelRetryConnect() {
        this.p = true;
        this.q = true;
    }

    public void connectAP(final String str, int i, String str2) {
        boolean zEnableNetwork;
        y("connectAP");
        this.i = str;
        this.h = "\"" + str + "\"";
        this.j = str2;
        this.k = i;
        this.p = false;
        this.q = false;
        if (!this.b.isWifiEnabled()) {
            K();
            return;
        }
        if (this.l.hasMessages(131)) {
            return;
        }
        M();
        this.e = false;
        WifiConfiguration wifiConfigurationE = E(this.h);
        if (wifiConfigurationE != null) {
            boolean zRemoveNetwork = this.b.removeNetwork(wifiConfigurationE.networkId);
            y("  removeNetwork exist NetId:" + wifiConfigurationE.networkId + " " + zRemoveNetwork);
            if (zRemoveNetwork) {
                this.g = this.b.addNetwork(w(str, str2, i));
                y("  addNetwork netId " + this.g);
            } else {
                this.g = wifiConfigurationE.networkId;
            }
        } else {
            this.g = this.b.addNetwork(w(str, str2, i));
            y("  addNetwork netId " + this.g);
        }
        if (this.g > -1) {
            A();
            zEnableNetwork = this.b.enableNetwork(this.g, true);
            if (zEnableNetwork) {
                this.b.saveConfiguration();
            } else {
                this.b.removeNetwork(this.g);
            }
            y("  connecting ap " + this.g + " " + zEnableNetwork);
        } else {
            zEnableNetwork = false;
        }
        if (!zEnableNetwork && Build.VERSION.SDK_INT >= 29) {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).removeCapability(12).setNetworkSpecifier(new WifiNetworkSpecifier.Builder().setSsidPattern(new PatternMatcher(str, 0)).setWpa2Passphrase(str2).build()).build();
            HMLog.info(y, new Function0() { // from class: iv8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WifiController.F(str);
                }
            });
            this.w.e(this.h);
            this.c.requestNetwork(networkRequestBuild, this.w);
        }
        this.t = 0;
        this.l.sendEmptyMessageDelayed(131, 2000L);
    }

    public void disconnectAP() {
        y("disconnectAP");
        if (this.b.isWifiEnabled()) {
            WifiInfo wifiInfo = this.f;
            int networkId = wifiInfo != null ? wifiInfo.getNetworkId() : -1;
            if (networkId > -1 && networkId != this.g) {
                y("  connect saved " + networkId + " " + this.b.enableNetwork(networkId, true));
                L();
            }
        } else {
            y("  Wifi disabled. Do not connect to the saved network.");
        }
        this.i = null;
        this.h = null;
        this.j = null;
        this.k = -1;
        this.e = false;
        APConnectCallback aPConnectCallback = this.n;
        if (aPConnectCallback != null) {
            aPConnectCallback.onDisconnected();
        }
    }

    public void setAPConnectCallback(APConnectCallback aPConnectCallback) {
        this.n = aPConnectCallback;
    }

    public void setmUIContext(UIContext uIContext) {
        this.o = uIContext;
    }
}
