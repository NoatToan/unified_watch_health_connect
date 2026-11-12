package com.thanosfisherman.wifiutils;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.MacAddress;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.net.wifi.WpsInfo;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.thanosfisherman.elvis.Elvis;
import com.thanosfisherman.elvis.Objects;
import com.thanosfisherman.elvis.interfaces.Function;
import com.thanosfisherman.wifiutils.ConnectorUtils;
import com.thanosfisherman.wifiutils.utils.SSIDUtils;
import com.thanosfisherman.wifiutils.utils.VersionUtils;
import com.thanosfisherman.wifiutils.wifiConnect.ConnectionErrorCode;
import com.thanosfisherman.wifiutils.wifiConnect.DisconnectCallbackHolder;
import com.thanosfisherman.wifiutils.wifiConnect.WifiConnectionCallback;
import com.thanosfisherman.wifiutils.wifiWps.ConnectionWpsListener;
import defpackage.fc2;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"MissingPermission"})
public final class ConnectorUtils {
    private static final int a = 99999;

    public static class a extends ConnectivityManager.NetworkCallback {
        public final /* synthetic */ WeakHandler a;
        public final /* synthetic */ WifiManager b;
        public final /* synthetic */ ScanResult c;
        public final /* synthetic */ WifiConnectionCallback d;

        public a(WeakHandler weakHandler, WifiManager wifiManager, ScanResult scanResult, WifiConnectionCallback wifiConnectionCallback) {
            this.a = weakHandler;
            this.b = wifiManager;
            this.c = scanResult;
            this.d = wifiConnectionCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(WifiManager wifiManager, ScanResult scanResult, WifiConnectionCallback wifiConnectionCallback) {
            if (ConnectorUtils.isAlreadyConnected(wifiManager, (String) Elvis.of(scanResult).next(new Function() { // from class: com.thanosfisherman.wifiutils.b
                @Override // com.thanosfisherman.elvis.interfaces.Function
                public /* synthetic */ Function andThen(Function function) {
                    return fc2.a(this, function);
                }

                @Override // com.thanosfisherman.elvis.interfaces.Function
                public final Object apply(Object obj) {
                    return ((ScanResult) obj).BSSID;
                }

                @Override // com.thanosfisherman.elvis.interfaces.Function
                public /* synthetic */ Function compose(Function function) {
                    return fc2.b(this, function);
                }
            }).get())) {
                wifiConnectionCallback.successfulConnect();
            } else {
                wifiConnectionCallback.errorConnect(ConnectionErrorCode.ANDROID_10_IMMEDIATELY_DROPPED_CONNECTION);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            super.onAvailable(network);
            WifiUtils.wifiLog("AndroidQ+ connected to wifi ");
            DisconnectCallbackHolder.getInstance().bindProcessToNetwork(network);
            WeakHandler weakHandler = this.a;
            final WifiManager wifiManager = this.b;
            final ScanResult scanResult = this.c;
            final WifiConnectionCallback wifiConnectionCallback = this.d;
            weakHandler.postDelayed(new Runnable() { // from class: com.thanosfisherman.wifiutils.c
                @Override // java.lang.Runnable
                public final void run() {
                    ConnectorUtils.a.d(wifiManager, scanResult, wifiConnectionCallback);
                }
            }, 500L);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            super.onLost(network);
            WifiUtils.wifiLog("onLost");
            DisconnectCallbackHolder.getInstance().unbindProcessFromNetwork();
            DisconnectCallbackHolder.getInstance().disconnect();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            WifiUtils.wifiLog("AndroidQ+ could not connect to wifi");
            this.d.errorConnect(ConnectionErrorCode.USER_CANCELLED);
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ WifiManager a;
        public final /* synthetic */ ScanResult b;
        public final /* synthetic */ ConnectionWpsListener c;
        public final /* synthetic */ WeakHandler d;

        public b(WifiManager wifiManager, ScanResult scanResult, ConnectionWpsListener connectionWpsListener, WeakHandler weakHandler) {
            this.a = wifiManager;
            this.b = scanResult;
            this.c = connectionWpsListener;
            this.d = weakHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.cancelWps(null);
            WifiUtils.wifiLog("Connection with WPS has timed out");
            ConnectorUtils.e(this.a, this.b);
            this.c.isSuccessful(false);
            this.d.removeCallbacks(this);
        }
    }

    public static class c extends WifiManager.WpsCallback {
        public final /* synthetic */ WeakHandler a;
        public final /* synthetic */ Runnable b;
        public final /* synthetic */ ConnectionWpsListener c;
        public final /* synthetic */ WifiManager d;
        public final /* synthetic */ ScanResult e;

        public c(WeakHandler weakHandler, Runnable runnable, ConnectionWpsListener connectionWpsListener, WifiManager wifiManager, ScanResult scanResult) {
            this.a = weakHandler;
            this.b = runnable;
            this.c = connectionWpsListener;
            this.d = wifiManager;
            this.e = scanResult;
        }

        @Override // android.net.wifi.WifiManager.WpsCallback
        public void onFailed(int i) {
            String strValueOf;
            this.a.removeCallbacks(this.b);
            if (i == 3) {
                strValueOf = "WPS_OVERLAP_ERROR";
            } else if (i == 4) {
                strValueOf = "WPS_WEP_PROHIBITED";
            } else if (i == 5) {
                strValueOf = "WPS_TKIP_ONLY_PROHIBITED";
            } else if (i != 6) {
                strValueOf = i != 7 ? String.valueOf(i) : "WPS_TIMED_OUT";
            } else {
                strValueOf = "WPS_AUTH_FAILURE";
            }
            WifiUtils.wifiLog("FAILED to connect with WPS. Reason: " + strValueOf);
            ConnectorUtils.e(this.d, this.e);
            ConnectorUtils.w(this.d);
            this.c.isSuccessful(false);
        }

        @Override // android.net.wifi.WifiManager.WpsCallback
        public void onStarted(String str) {
        }

        @Override // android.net.wifi.WifiManager.WpsCallback
        public void onSucceeded() {
            this.a.removeCallbacks(this.b);
            WifiUtils.wifiLog("CONNECTED With WPS successfully");
            this.c.isSuccessful(true);
        }
    }

    private static void A(@NonNull List<WifiConfiguration> list) {
        Collections.sort(list, new Comparator() { // from class: kz0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ConnectorUtils.s((WifiConfiguration) obj, (WifiConfiguration) obj2);
            }
        });
    }

    @Nullable
    private static String B(@Nullable String str) {
        return (str == null || str.isEmpty()) ? str : str.replaceAll("^\"*", "").replaceAll("\"*$", "");
    }

    public static void C(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private static boolean d(@NonNull ContentResolver contentResolver, @NonNull WifiManager wifiManager) {
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        A(configuredNetworks);
        int i = VersionUtils.isJellyBeanOrLater() ? Settings.Secure.getInt(contentResolver, "wifi_num_open_networks_kept", 10) : Settings.Secure.getInt(contentResolver, "wifi_num_open_networks_kept", 10);
        boolean z = false;
        int i2 = 0;
        for (int size = configuredNetworks.size() - 1; size >= 0; size--) {
            WifiConfiguration wifiConfiguration = configuredNetworks.get(size);
            if (Objects.equals(com.thanosfisherman.wifiutils.a.a, com.thanosfisherman.wifiutils.a.b(wifiConfiguration)) && (i2 = i2 + 1) >= i) {
                wifiManager.removeNetwork(wifiConfiguration.networkId);
                z = true;
            }
        }
        return !z || wifiManager.saveConfiguration();
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    public static boolean e(@Nullable WifiManager wifiManager, @NonNull ScanResult scanResult) {
        if (wifiManager == null) {
            return false;
        }
        WifiConfiguration wifiConfigurationD = com.thanosfisherman.wifiutils.a.d(wifiManager, scanResult);
        WifiUtils.wifiLog("Attempting to remove previous network config...");
        if (wifiConfigurationD == null) {
            return true;
        }
        if (!wifiManager.removeNetwork(wifiConfigurationD.networkId)) {
            return false;
        }
        wifiManager.saveConfiguration();
        return true;
    }

    public static boolean f(@Nullable WifiManager wifiManager, @Nullable WifiConfiguration wifiConfiguration) {
        if (wifiManager == null) {
            return false;
        }
        WifiUtils.wifiLog("Attempting to remove previous network config...");
        if (wifiConfiguration == null) {
            return true;
        }
        if (!wifiManager.removeNetwork(wifiConfiguration.networkId)) {
            return false;
        }
        wifiManager.saveConfiguration();
        return true;
    }

    public static int frequencyToChannel(int i) {
        if (2412 <= i && i <= 2484) {
            return ((i - 2412) / 5) + 1;
        }
        if (5170 > i || i > 5825) {
            return -1;
        }
        return ((i - 5170) / 5) + 34;
    }

    @RequiresApi(29)
    private static boolean g(@Nullable WifiManager wifiManager, @Nullable ConnectivityManager connectivityManager, @NonNull WeakHandler weakHandler, @NonNull WifiConnectionCallback wifiConnectionCallback, @NonNull ScanResult scanResult, @NonNull String str) {
        if (connectivityManager == null) {
            return false;
        }
        WifiNetworkSpecifier.Builder bssid = new WifiNetworkSpecifier.Builder().setSsid(scanResult.SSID).setBssid(MacAddress.fromString(scanResult.BSSID));
        com.thanosfisherman.wifiutils.a.h(bssid, com.thanosfisherman.wifiutils.a.a(scanResult), str);
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).setNetworkSpecifier(bssid.build()).build();
        DisconnectCallbackHolder.getInstance().disconnect();
        DisconnectCallbackHolder.getInstance().addNetworkCallback(new a(weakHandler, wifiManager, scanResult, wifiConnectionCallback), connectivityManager);
        WifiUtils.wifiLog("connecting with Android 10");
        DisconnectCallbackHolder.getInstance().requestNetwork(networkRequestBuild);
        return true;
    }

    public static int getPowerPercentage(int i) {
        if (i <= -93) {
            return 0;
        }
        if (-25 > i || i > 0) {
            return i + 125;
        }
        return 100;
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    private static boolean h(@NonNull Context context, @Nullable WifiManager wifiManager, @NonNull ScanResult scanResult, @NonNull String str) {
        if (wifiManager == null) {
            return false;
        }
        WifiConfiguration wifiConfigurationD = com.thanosfisherman.wifiutils.a.d(wifiManager, scanResult);
        if (wifiConfigurationD != null && str.isEmpty()) {
            WifiUtils.wifiLog("PASSWORD WAS EMPTY. TRYING TO CONNECT TO EXISTING NETWORK CONFIGURATION");
            return i(wifiManager, wifiConfigurationD, true);
        }
        if (!f(wifiManager, wifiConfigurationD)) {
            WifiUtils.wifiLog("COULDN'T REMOVE PREVIOUS CONFIG, CONNECTING TO EXISTING ONE");
            return i(wifiManager, wifiConfigurationD, true);
        }
        String strA = com.thanosfisherman.wifiutils.a.a(scanResult);
        if (Objects.equals(com.thanosfisherman.wifiutils.a.a, strA)) {
            d(context.getContentResolver(), wifiManager);
        }
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = SSIDUtils.convertToQuotedString(scanResult.SSID);
        wifiConfiguration.BSSID = scanResult.BSSID;
        com.thanosfisherman.wifiutils.a.g(wifiConfiguration, strA, str);
        int iAddNetwork = wifiManager.addNetwork(wifiConfiguration);
        WifiUtils.wifiLog("Network ID: " + iAddNetwork);
        if (iAddNetwork == -1) {
            return false;
        }
        if (!wifiManager.saveConfiguration()) {
            WifiUtils.wifiLog("Couldn't save wifi config");
            return false;
        }
        WifiConfiguration wifiConfigurationE = com.thanosfisherman.wifiutils.a.e(wifiManager, wifiConfiguration);
        if (wifiConfigurationE != null) {
            return i(wifiManager, wifiConfigurationE, true);
        }
        WifiUtils.wifiLog("Error getting wifi config after save. (config == null)");
        return false;
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    private static boolean i(@Nullable WifiManager wifiManager, @Nullable WifiConfiguration wifiConfiguration, boolean z) {
        WifiConfiguration wifiConfigurationE;
        if (wifiConfiguration == null || wifiManager == null) {
            return false;
        }
        if (VersionUtils.isMarshmallowOrLater()) {
            if (!m(wifiManager, wifiConfiguration)) {
                return false;
            }
            if (z) {
                if (!wifiManager.reassociate()) {
                    return false;
                }
            } else if (!wifiManager.reconnect()) {
                return false;
            }
            return true;
        }
        int iO = o(wifiManager) + 1;
        if (iO > a) {
            iO = z(wifiManager);
            wifiConfiguration = com.thanosfisherman.wifiutils.a.e(wifiManager, wifiConfiguration);
            if (wifiConfiguration == null) {
                return false;
            }
        }
        wifiConfiguration.priority = iO;
        int iUpdateNetwork = wifiManager.updateNetwork(wifiConfiguration);
        if (iUpdateNetwork == -1 || !wifiManager.enableNetwork(iUpdateNetwork, false) || !wifiManager.saveConfiguration() || (wifiConfigurationE = com.thanosfisherman.wifiutils.a.e(wifiManager, wifiConfiguration)) == null || !m(wifiManager, wifiConfigurationE)) {
            return false;
        }
        if (z) {
            if (!wifiManager.reassociate()) {
                return false;
            }
        } else if (!wifiManager.reconnect()) {
            return false;
        }
        return true;
    }

    public static boolean isAlreadyConnected(@Nullable WifiManager wifiManager, @Nullable String str) {
        if (str == null || wifiManager == null || wifiManager.getConnectionInfo() == null || wifiManager.getConnectionInfo().getBSSID() == null || wifiManager.getConnectionInfo().getIpAddress() == 0 || !Objects.equals(str, wifiManager.getConnectionInfo().getBSSID())) {
            return false;
        }
        WifiUtils.wifiLog("Already connected to: " + wifiManager.getConnectionInfo().getSSID() + "  BSSID: " + wifiManager.getConnectionInfo().getBSSID());
        return true;
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    public static boolean j(@NonNull Context context, @Nullable WifiManager wifiManager, @Nullable ConnectivityManager connectivityManager, @NonNull WeakHandler weakHandler, @NonNull ScanResult scanResult, @NonNull String str, @NonNull WifiConnectionCallback wifiConnectionCallback) {
        if (wifiManager == null || connectivityManager == null) {
            return false;
        }
        return VersionUtils.isAndroidQOrLater() ? g(wifiManager, connectivityManager, weakHandler, wifiConnectionCallback, scanResult, str) : h(context, wifiManager, scanResult, str);
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    @RequiresApi(api = 21)
    public static void k(@Nullable WifiManager wifiManager, @NonNull WeakHandler weakHandler, @NonNull ScanResult scanResult, @NonNull String str, long j, @NonNull ConnectionWpsListener connectionWpsListener) {
        if (wifiManager == null) {
            connectionWpsListener.isSuccessful(false);
            return;
        }
        WpsInfo wpsInfo = new WpsInfo();
        b bVar = new b(wifiManager, scanResult, connectionWpsListener, weakHandler);
        c cVar = new c(weakHandler, bVar, connectionWpsListener, wifiManager, scanResult);
        WifiUtils.wifiLog("Connecting with WPS...");
        wpsInfo.setup = 2;
        wpsInfo.BSSID = scanResult.BSSID;
        wpsInfo.pin = str;
        wifiManager.cancelWps(null);
        if (!e(wifiManager, scanResult)) {
            l(wifiManager, scanResult);
        }
        weakHandler.postDelayed(bVar, j);
        wifiManager.startWps(wpsInfo, cVar);
    }

    private static boolean l(@Nullable WifiManager wifiManager, @Nullable ScanResult scanResult) {
        boolean zEnableNetwork = false;
        if (wifiManager == null) {
            return false;
        }
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null && scanResult != null && !configuredNetworks.isEmpty()) {
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                if (wifiConfiguration != null) {
                    if (Objects.equals(scanResult.BSSID, wifiConfiguration.BSSID) && Objects.equals(scanResult.SSID, B(wifiConfiguration.SSID))) {
                        zEnableNetwork = wifiManager.enableNetwork(wifiConfiguration.networkId, true);
                    } else {
                        wifiManager.disableNetwork(wifiConfiguration.networkId);
                    }
                }
            }
        }
        return zEnableNetwork;
    }

    private static boolean m(@Nullable WifiManager wifiManager, @Nullable WifiConfiguration wifiConfiguration) {
        boolean zEnableNetwork = false;
        if (wifiManager == null) {
            return false;
        }
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null && wifiConfiguration != null && !configuredNetworks.isEmpty()) {
            for (WifiConfiguration wifiConfiguration2 : configuredNetworks) {
                if (wifiConfiguration2 != null) {
                    int i = wifiConfiguration2.networkId;
                    if (i == wifiConfiguration.networkId) {
                        zEnableNetwork = wifiManager.enableNetwork(i, true);
                    } else {
                        wifiManager.disableNetwork(i);
                    }
                }
            }
            WifiUtils.wifiLog("disableAllButOne " + zEnableNetwork);
        }
        return zEnableNetwork;
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    public static boolean n(@NonNull WifiManager wifiManager) {
        return wifiManager.disconnect();
    }

    private static int o(@Nullable WifiManager wifiManager) {
        int i = 0;
        if (wifiManager == null) {
            return 0;
        }
        Iterator<WifiConfiguration> it2 = wifiManager.getConfiguredNetworks().iterator();
        while (it2.hasNext()) {
            int i2 = it2.next().priority;
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public static boolean p(@Nullable String str) {
        int length = str == null ? 0 : str.length();
        return (length == 10 || length == 26 || length == 58) && str.matches("[0-9A-Fa-f]*");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NetworkInfo q(ConnectivityManager connectivityManager) {
        return connectivityManager.getNetworkInfo(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean r(NetworkInfo.State state) {
        return Boolean.valueOf(state == NetworkInfo.State.CONNECTED);
    }

    public static boolean reEnableNetworkIfPossible(@Nullable WifiManager wifiManager, @Nullable ScanResult scanResult) {
        boolean zEnableNetwork = false;
        if (wifiManager == null) {
            return false;
        }
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null && scanResult != null && !configuredNetworks.isEmpty()) {
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                if (Objects.equals(scanResult.BSSID, wifiConfiguration.BSSID) && Objects.equals(scanResult.SSID, B(wifiConfiguration.SSID))) {
                    zEnableNetwork = wifiManager.enableNetwork(wifiConfiguration.networkId, true);
                    break;
                }
            }
            WifiUtils.wifiLog("reEnableNetworkIfPossible " + zEnableNetwork);
        }
        return zEnableNetwork;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int s(WifiConfiguration wifiConfiguration, WifiConfiguration wifiConfiguration2) {
        return wifiConfiguration.priority - wifiConfiguration2.priority;
    }

    @Nullable
    public static ScanResult t(@NonNull String str, @NonNull String str2, @NonNull Iterable<ScanResult> iterable) {
        for (ScanResult scanResult : iterable) {
            if (Objects.equals(scanResult.SSID, str) && Objects.equals(scanResult.BSSID, str2)) {
                return scanResult;
            }
        }
        return null;
    }

    @Nullable
    public static ScanResult u(@NonNull String str, @NonNull Iterable<ScanResult> iterable) {
        for (ScanResult scanResult : iterable) {
            if (Objects.equals(scanResult.BSSID, str)) {
                return scanResult;
            }
        }
        return null;
    }

    @Nullable
    public static ScanResult v(@NonNull String str, @NonNull Iterable<ScanResult> iterable) {
        for (ScanResult scanResult : iterable) {
            if (Objects.equals(scanResult.SSID, str)) {
                return scanResult;
            }
        }
        return null;
    }

    public static void w(@Nullable WifiManager wifiManager) {
        List<WifiConfiguration> configuredNetworks;
        if (wifiManager == null || (configuredNetworks = wifiManager.getConfiguredNetworks()) == null || configuredNetworks.isEmpty()) {
            return;
        }
        Iterator<WifiConfiguration> it2 = configuredNetworks.iterator();
        while (it2.hasNext()) {
            wifiManager.enableNetwork(it2.next().networkId, false);
        }
    }

    public static void x(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        if (broadcastReceiver != null) {
            try {
                context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    public static boolean y(@NonNull WifiManager wifiManager, @NonNull String str) {
        return f(wifiManager, com.thanosfisherman.wifiutils.a.f(wifiManager, str));
    }

    private static int z(@Nullable WifiManager wifiManager) {
        if (wifiManager == null) {
            return 0;
        }
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        A(configuredNetworks);
        int size = configuredNetworks.size();
        for (int i = 0; i < size; i++) {
            WifiConfiguration wifiConfiguration = configuredNetworks.get(i);
            wifiConfiguration.priority = i;
            wifiManager.updateNetwork(wifiConfiguration);
        }
        wifiManager.saveConfiguration();
        return size;
    }

    public static boolean isAlreadyConnected(@Nullable ConnectivityManager connectivityManager) {
        return Elvis.of(connectivityManager).next(new Function() { // from class: hz0
            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function andThen(Function function) {
                return fc2.a(this, function);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public final Object apply(Object obj) {
                return ConnectorUtils.q((ConnectivityManager) obj);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function compose(Function function) {
                return fc2.b(this, function);
            }
        }).next(new Function() { // from class: jz0
            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function andThen(Function function) {
                return fc2.a(this, function);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public final Object apply(Object obj) {
                return ((NetworkInfo) obj).getState();
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function compose(Function function) {
                return fc2.b(this, function);
            }
        }).next(new Function() { // from class: iz0
            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function andThen(Function function) {
                return fc2.a(this, function);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public final Object apply(Object obj) {
                return ConnectorUtils.r((NetworkInfo.State) obj);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function compose(Function function) {
                return fc2.b(this, function);
            }
        }).getBoolean();
    }

    public static boolean isAlreadyConnected(@Nullable WifiManager wifiManager, @Nullable ConnectivityManager connectivityManager, @Nullable String str) {
        boolean zIsAlreadyConnected = isAlreadyConnected(connectivityManager);
        if (!zIsAlreadyConnected || str == null || wifiManager == null) {
            return zIsAlreadyConnected;
        }
        if (VersionUtils.isJellyBeanOrLater()) {
            str = SSIDUtils.convertToQuotedString(str);
        }
        String ssid = wifiManager.getConnectionInfo().getSSID();
        return ssid != null && ssid.equals(str);
    }
}
