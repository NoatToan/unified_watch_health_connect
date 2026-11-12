package com.huami.watch.wifi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00072\u00020\u0001:\u0002\u0004!B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0005H\u0003J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001a\u0010\u001e\u001a\u00060\u001cR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/watch/wifi/WifiControllerBelowQ;", "Lcom/huami/watch/wifi/IWifiController;", "", GoogleApiAvailabilityLight.a, "a", "", "str", "e", "ssid", "Landroid/net/wifi/WifiConfiguration;", "c", "password", "b", "Landroid/net/ConnectivityManager$NetworkCallback;", "connectTo", "networkCallback", "", ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "enable", "enableWifi", "Landroid/net/wifi/WifiManager;", "Landroid/net/wifi/WifiManager;", "wifiManager", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "connectiveManager", "Lcom/huami/watch/wifi/WifiControllerBelowQ$InnerNetworkCallback;", "Lcom/huami/watch/wifi/WifiControllerBelowQ$InnerNetworkCallback;", "innerNetCallback", "<init>", "(Landroid/content/Context;)V", "InnerNetworkCallback", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class WifiControllerBelowQ implements IWifiController {
    private static final String d = "WifiControllerBelowQ";

    @NotNull
    private static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SuppressLint({"WifiManagerPotentialLeak"})
    private final WifiManager wifiManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ConnectivityManager connectiveManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InnerNetworkCallback innerNetCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/watch/wifi/WifiControllerBelowQ$InnerNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "onUnavailable", "", "blocked", "onBlockedStatusChanged", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "Landroid/net/LinkProperties;", "linkProperties", "onLinkPropertiesChanged", "", "maxMsToLive", "onLosing", "onLost", "Landroid/net/wifi/WifiInfo;", "a", "Landroid/net/wifi/WifiInfo;", "getSavedWifiInfo", "()Landroid/net/wifi/WifiInfo;", "setSavedWifiInfo", "(Landroid/net/wifi/WifiInfo;)V", "savedWifiInfo", "<init>", "(Lcom/huami/watch/wifi/WifiControllerBelowQ;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class InnerNetworkCallback extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private android.net.wifi.WifiInfo savedWifiInfo;

        public InnerNetworkCallback() {
        }

        @Nullable
        public final android.net.wifi.WifiInfo getSavedWifiInfo() {
            return this.savedWifiInfo;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            super.onAvailable(network);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerBelowQ.e;
            logUtils.log(WifiControllerBelowQ.d, "onAvailable: " + network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(@NotNull Network network, boolean blocked) {
            super.onBlockedStatusChanged(network, blocked);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerBelowQ.e;
            logUtils.log(WifiControllerBelowQ.d, "onBlockedStatusChanged; network: " + network + "; blocked: " + blocked);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerBelowQ.e;
            logUtils.log(WifiControllerBelowQ.d, "onCapabilitiesChanged; network: " + network + "; networkCapabilities: " + networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(@NotNull Network network, @NotNull LinkProperties linkProperties) {
            super.onLinkPropertiesChanged(network, linkProperties);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerBelowQ.e;
            logUtils.log(WifiControllerBelowQ.d, "onLinkPropertiesChanged; network: " + network + "; linkProperties: " + linkProperties);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(@NotNull Network network, int maxMsToLive) {
            super.onLosing(network, maxMsToLive);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerBelowQ.e;
            logUtils.log(WifiControllerBelowQ.d, "onLosing; network: " + network + "; maxMsToLive: " + maxMsToLive);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            super.onLost(network);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerBelowQ.e;
            logUtils.log(WifiControllerBelowQ.d, "onLost; network: " + network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerBelowQ.e;
            logUtils.log(WifiControllerBelowQ.d, "onUnavailable");
        }

        public final void setSavedWifiInfo(@Nullable android.net.wifi.WifiInfo wifiInfo) {
            this.savedWifiInfo = wifiInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/wifi/WifiControllerBelowQ$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WifiControllerBelowQ(@NotNull Context context) {
        Object systemService = context.getSystemService("wifi");
        this.wifiManager = (WifiManager) (systemService instanceof WifiManager ? systemService : null);
        Object systemService2 = context.getSystemService("connectivity");
        this.connectiveManager = (ConnectivityManager) (systemService2 instanceof ConnectivityManager ? systemService2 : null);
        this.innerNetCallback = new InnerNetworkCallback();
    }

    private final void a() {
    }

    private final WifiConfiguration b(String ssid, String password) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = ssid;
        wifiConfiguration.allowedKeyManagement.set(1);
        wifiConfiguration.preSharedKey = password;
        return wifiConfiguration;
    }

    @SuppressLint({"MissingPermission"})
    private final WifiConfiguration c(String ssid) {
        List<WifiConfiguration> listEmptyList;
        Object next;
        WifiManager wifiManager = this.wifiManager;
        if (wifiManager == null || (listEmptyList = wifiManager.getConfiguredNetworks()) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator<T> it2 = listEmptyList.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (Intrinsics.areEqual(((WifiConfiguration) next).SSID, ssid)) {
                return (WifiConfiguration) next;
            }
        }
        next = null;
        return (WifiConfiguration) next;
    }

    private final void d() {
        try {
            ConnectivityManager connectivityManager = this.connectiveManager;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(this.innerNetCallback);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(1);
        ConnectivityManager connectivityManager2 = this.connectiveManager;
        if (connectivityManager2 != null) {
            connectivityManager2.requestNetwork(builder.build(), this.innerNetCallback);
        }
    }

    private final String e(String str) {
        return '\"' + str + '\"';
    }

    @Override // com.huami.watch.wifi.IWifiController
    @Nullable
    public ConnectivityManager.NetworkCallback connectTo(@NotNull String ssid, @NotNull String password) {
        int iAddNetwork;
        WifiManager wifiManager = this.wifiManager;
        if (wifiManager == null) {
            return null;
        }
        String strE = e(ssid);
        String strE2 = e(password);
        WifiConfiguration wifiConfigurationC = c(strE);
        android.net.wifi.WifiInfo connectionInfo = this.wifiManager.getConnectionInfo();
        if (wifiConfigurationC == null) {
            iAddNetwork = this.wifiManager.addNetwork(b(strE, strE2));
        } else if (wifiManager.removeNetwork(wifiConfigurationC.networkId)) {
            iAddNetwork = this.wifiManager.addNetwork(b(strE, strE2));
        } else {
            iAddNetwork = wifiConfigurationC.networkId;
        }
        if (iAddNetwork > -1) {
            d();
            if (!this.wifiManager.enableNetwork(iAddNetwork, true)) {
                this.innerNetCallback.setSavedWifiInfo(null);
                this.wifiManager.removeNetwork(iAddNetwork);
                this.wifiManager.enableNetwork(connectionInfo.getNetworkId(), true);
                return null;
            }
            this.innerNetCallback.setSavedWifiInfo(connectionInfo);
            this.wifiManager.saveConfiguration();
        }
        return this.innerNetCallback;
    }

    @Override // com.huami.watch.wifi.IWifiController
    public boolean disconnect(@NotNull ConnectivityManager.NetworkCallback networkCallback) {
        WifiManager wifiManager;
        if (!(networkCallback instanceof InnerNetworkCallback)) {
            return false;
        }
        InnerNetworkCallback innerNetworkCallback = (InnerNetworkCallback) networkCallback;
        android.net.wifi.WifiInfo savedWifiInfo = innerNetworkCallback.getSavedWifiInfo();
        if (savedWifiInfo != null) {
            innerNetworkCallback.setSavedWifiInfo(null);
            int networkId = savedWifiInfo.getNetworkId();
            if (networkId > -1 && (wifiManager = this.wifiManager) != null) {
                wifiManager.enableNetwork(networkId, true);
            }
            try {
                ConnectivityManager connectivityManager = this.connectiveManager;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    @Override // com.huami.watch.wifi.IWifiController
    public boolean enableWifi(@NotNull Context context, boolean enable) {
        WifiManager wifiManager = this.wifiManager;
        if (wifiManager != null) {
            return wifiManager.setWifiEnabled(enable);
        }
        return false;
    }
}
