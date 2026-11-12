package com.huami.watch.wifi;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 (2\u00020\u0001:\u0002\u0003)B\u0019\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00060\u0015R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001d\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lcom/huami/watch/wifi/WifiConnectionObserver;", "Landroid/content/BroadcastReceiver;", "", "a", "startObserve", "stopObserve", "Landroid/net/Network;", "network", "bindToNetwork", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "onReceive", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/wifi/WifiManager;", "b", "Landroid/net/wifi/WifiManager;", "wifiManager", "Lcom/huami/watch/wifi/WifiConnectionObserver$InnerCallback;", "c", "Lcom/huami/watch/wifi/WifiConnectionObserver$InnerCallback;", "innerCallback", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", "getApp", "()Landroid/content/Context;", "app", "Lcom/huami/watch/wifi/IWifiConnectListener;", "e", "Lcom/huami/watch/wifi/IWifiConnectListener;", "getListener", "()Lcom/huami/watch/wifi/IWifiConnectListener;", "setListener", "(Lcom/huami/watch/wifi/IWifiConnectListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Lcom/huami/watch/wifi/IWifiConnectListener;)V", "g", "InnerCallback", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class WifiConnectionObserver extends BroadcastReceiver {
    private static final String f = "WifiConnectionObserver";

    @NotNull
    private static final a g = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WifiManager wifiManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InnerCallback innerCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Context app;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private IWifiConnectListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/watch/wifi/WifiConnectionObserver$InnerCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "onUnavailable", "onLost", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "", "a", "J", "lastPrintCapability", "", "b", "Ljava/lang/String;", "getCurrentSSID", "()Ljava/lang/String;", "setCurrentSSID", "(Ljava/lang/String;)V", "currentSSID", "c", "Landroid/net/Network;", "currentNetwork", "<init>", "(Lcom/huami/watch/wifi/WifiConnectionObserver;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class InnerCallback extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long lastPrintCapability;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String currentSSID;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private Network currentNetwork;

        public InnerCallback() {
        }

        @Nullable
        public final String getCurrentSSID() {
            return this.currentSSID;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        @SuppressLint({"MissingPermission"})
        public void onAvailable(@NotNull Network network) {
            super.onAvailable(network);
            WifiManager wifiManager = WifiConnectionObserver.this.wifiManager;
            android.net.wifi.WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiConnectionObserver.g;
            logUtils.log(WifiConnectionObserver.f, "onAvailable " + network + " and wifi connection info: " + connectionInfo);
            String ssid = connectionInfo != null ? connectionInfo.getSSID() : null;
            this.currentSSID = ssid;
            this.currentNetwork = network;
            WifiConnectionObserver.this.bindToNetwork(network);
            IWifiConnectListener listener = WifiConnectionObserver.this.getListener();
            if (listener != null) {
                listener.onConnectedTo(ssid, network);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.lastPrintCapability > 3000) {
                this.lastPrintCapability = jCurrentTimeMillis;
                LogUtils logUtils = LogUtils.INSTANCE;
                a unused = WifiConnectionObserver.g;
                logUtils.log(WifiConnectionObserver.f, "onCapabilitiesChanged; network: " + network + "; networkCapabilities: " + networkCapabilities);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            super.onLost(network);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiConnectionObserver.g;
            logUtils.log(WifiConnectionObserver.f, "onLost " + network);
            IWifiConnectListener listener = WifiConnectionObserver.this.getListener();
            if (listener != null) {
                listener.onDisconnected(this.currentSSID, network);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiConnectionObserver.g;
            logUtils.log(WifiConnectionObserver.f, "onUnavailable");
            IWifiConnectListener listener = WifiConnectionObserver.this.getListener();
            if (listener != null) {
                listener.onDisconnected(this.currentSSID, this.currentNetwork);
            }
        }

        public final void setCurrentSSID(@Nullable String str) {
            this.currentSSID = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SupplicantState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[SupplicantState.COMPLETED.ordinal()] = 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/wifi/WifiConnectionObserver$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WifiConnectionObserver(@NotNull Context context, @Nullable IWifiConnectListener iWifiConnectListener) {
        this.app = context;
        this.listener = iWifiConnectListener;
        Object systemService = context.getSystemService("connectivity");
        this.connectivityManager = (ConnectivityManager) (systemService instanceof ConnectivityManager ? systemService : null);
        Object systemService2 = context.getSystemService("wifi");
        this.wifiManager = (WifiManager) (systemService2 instanceof WifiManager ? systemService2 : null);
        this.innerCallback = new InnerCallback();
    }

    @SuppressLint({"MissingPermission"})
    private final void a() {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(1);
        NetworkRequest networkRequestBuild = builder.build();
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(networkRequestBuild, this.innerCallback);
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
            this.app.registerReceiver(this, intentFilter);
        } catch (Exception e) {
            LogUtils.INSTANCE.log(f, "register state change action failed: " + e.getMessage());
        }
    }

    public final void bindToNetwork(@Nullable Network network) {
        if (Build.VERSION.SDK_INT < 23) {
            ConnectivityManager.setProcessDefaultNetwork(network);
            return;
        }
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            connectivityManager.bindProcessToNetwork(network);
        }
    }

    @NotNull
    public final Context getApp() {
        return this.app;
    }

    @Nullable
    public final IWifiConnectListener getListener() {
        return this.listener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (!Intrinsics.areEqual("android.net.wifi.supplicant.STATE_CHANGE", intent != null ? intent.getAction() : null)) {
            return;
        }
        SupplicantState supplicantState = (SupplicantState) intent.getParcelableExtra("newState");
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.log(f, "connection state: " + supplicantState);
        if (supplicantState != null && WhenMappings.$EnumSwitchMapping$0[supplicantState.ordinal()] == 1) {
            WifiManager wifiManager = this.wifiManager;
            android.net.wifi.WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
            logUtils.log(f, "connection info: " + connectionInfo + "; and innerCallback ssid: " + this.innerCallback.getCurrentSSID());
            if (connectionInfo == null || connectionInfo.getBSSID() == null) {
                return;
            }
            String ssid = connectionInfo.getSSID();
            if (!(!Intrinsics.areEqual(this.innerCallback.getCurrentSSID(), ssid)) || StringsKt__StringsKt.contains((CharSequence) ssid, (CharSequence) Utils.INVALID_SSID, true)) {
                return;
            }
            this.innerCallback.setCurrentSSID(ssid);
            IWifiConnectListener iWifiConnectListener = this.listener;
            if (iWifiConnectListener != null) {
                iWifiConnectListener.onConnectedTo(ssid, null);
            }
        }
    }

    public final void setListener(@Nullable IWifiConnectListener iWifiConnectListener) {
        this.listener = iWifiConnectListener;
    }

    public final void startObserve() {
        stopObserve();
        a();
    }

    public final void stopObserve() {
        try {
            ConnectivityManager connectivityManager = this.connectivityManager;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(this.innerCallback);
            }
        } catch (Exception e) {
            LogUtils.INSTANCE.log(f, e.getMessage());
        }
        try {
            this.app.unregisterReceiver(this);
        } catch (Exception e2) {
            LogUtils.INSTANCE.log(f, "un register receiver failed: " + e2.getMessage());
        }
    }
}
