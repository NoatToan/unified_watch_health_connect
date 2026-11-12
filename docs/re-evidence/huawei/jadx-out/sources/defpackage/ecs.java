package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class ecs {
    public static int d(WifiManager wifiManager, String str) {
        dyg.e(false, "WiFiUtil", "getOpenNetworkId() ssid ", dyg.b(str));
        if (wifiManager == null || TextUtils.isEmpty(str)) {
            dyg.c(false, "WiFiUtil", "getOpenNetworkId() parameter error");
            return -1;
        }
        int iA = a(wifiManager, str, -1);
        dyg.e(false, "WiFiUtil", "getOpenNetworkId() for over newnetid = ", Integer.valueOf(iA));
        if (iA == -1) {
            iA = wifiManager.addNetwork(d(str));
            dyg.e(false, "WiFiUtil", "getOpenNetworkId newnetid = ", Integer.valueOf(iA), " bSaved:", Boolean.valueOf(wifiManager.saveConfiguration()));
        }
        if (iA == -1) {
            List<WifiConfiguration> listB = b(wifiManager);
            if (njy.e(listB)) {
                LogUtil.e("WiFiUtil", "getOpenNetworkId newConfigs is null");
                return iA;
            }
            for (WifiConfiguration wifiConfiguration : listB) {
                if (!TextUtils.isEmpty(wifiConfiguration.SSID) && TextUtils.equals(str, e(wifiConfiguration.SSID))) {
                    iA = wifiConfiguration.networkId;
                }
            }
        }
        dyg.a(false, "WiFiUtil", "getOpenNetworkId newNetId = ", Integer.valueOf(iA));
        return iA;
    }

    private static int a(WifiManager wifiManager, String str, int i) {
        List<WifiConfiguration> listB = b(wifiManager);
        if (njy.b(listB)) {
            for (WifiConfiguration wifiConfiguration : listB) {
                if (TextUtils.isEmpty(wifiConfiguration.SSID)) {
                    dyg.e(false, "WiFiUtil", "getOpenNetworkId ssid NULL");
                } else {
                    String strE = e(wifiConfiguration.SSID);
                    dyg.e(false, "WiFiUtil", "getOpenNetworkId open oldSsid:", strE, " ssid:", str);
                    if (!TextUtils.equals(str, strE)) {
                        continue;
                    } else {
                        if (wifiConfiguration.allowedKeyManagement.get(0)) {
                            dyg.e(false, "WiFiUtil", "getOpenNetworkId SoftAP is no password, direct useid");
                            return wifiConfiguration.networkId;
                        }
                        boolean zRemoveNetwork = wifiManager.removeNetwork(wifiConfiguration.networkId);
                        dyg.e(false, "WiFiUtil", "getOpenNetworkId removeNetwork target = ", Integer.valueOf(wifiConfiguration.networkId), " isRemoveSucceeded = ", Boolean.valueOf(zRemoveNetwork));
                        if (zRemoveNetwork) {
                            wifiManager.saveConfiguration();
                        } else {
                            i = wifiConfiguration.networkId;
                        }
                    }
                }
            }
            return i;
        }
        dyg.c(false, "WiFiUtil", "getOpenNetworkId()  configs is null");
        return i;
    }

    public static String e(String str) {
        int length;
        if (str == null || (length = str.length()) <= 1 || str.charAt(0) != '\"') {
            return str;
        }
        int i = length - 1;
        return str.charAt(i) == '\"' ? str.substring(1, i) : str;
    }

    public static WifiConfiguration d(String str) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.SSID = "\"" + str + "\"";
        wifiConfiguration.status = 1;
        wifiConfiguration.BSSID = null;
        wifiConfiguration.allowedProtocols.set(0);
        wifiConfiguration.allowedProtocols.set(1);
        wifiConfiguration.allowedKeyManagement.set(0);
        wifiConfiguration.allowedPairwiseCiphers.set(1);
        wifiConfiguration.allowedPairwiseCiphers.set(2);
        wifiConfiguration.allowedGroupCiphers.set(2);
        wifiConfiguration.allowedGroupCiphers.set(3);
        return wifiConfiguration;
    }

    public static boolean a(WifiManager wifiManager, int i) {
        dyg.a(false, "WiFiUtil", "connectWifiByNetworkId() enter newnetid ", Integer.valueOf(i));
        if (wifiManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 27) {
            wifiManager.disconnect();
            boolean zEnableNetwork = wifiManager.enableNetwork(i, true);
            dyg.e(false, "WiFiUtil", "SDK >= Android API(27) only enableNetwork flag  ", Boolean.valueOf(zEnableNetwork));
            wifiManager.reconnect();
            return zEnableNetwork;
        }
        boolean zEnableNetwork2 = wifiManager.enableNetwork(i, true);
        dyg.e(false, "WiFiUtil", "only enableNetwork flag  ", Boolean.valueOf(zEnableNetwork2));
        return zEnableNetwork2;
    }

    public static boolean c(WifiManager wifiManager, int i) {
        dyg.a(false, "WiFiUtil", " reconnectWifiByNetworkId() enter newnetid ", Integer.valueOf(i));
        if (wifiManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 27) {
            boolean zEnableNetwork = wifiManager.enableNetwork(i, true);
            dyg.e(false, "WiFiUtil", "SDK >= Android API(27) reconnect enableNetwork flag ", Boolean.valueOf(zEnableNetwork));
            wifiManager.reconnect();
            return zEnableNetwork;
        }
        boolean zEnableNetwork2 = wifiManager.enableNetwork(i, true);
        dyg.e(false, "WiFiUtil", "reconnect only enableNetwork flag  ", Boolean.valueOf(zEnableNetwork2));
        return zEnableNetwork2;
    }

    public static int e(WifiManager wifiManager, String str, String str2, String str3) {
        dyg.a(false, "WiFiUtil", " getNetworkId() ssid ", dyg.b(str));
        int i = -1;
        if (wifiManager == null || TextUtils.isEmpty(str)) {
            dyg.e(false, "WiFiUtil", " getNetworkId() parameter error");
            return -1;
        }
        List<WifiConfiguration> listB = b(wifiManager);
        if (njy.e(listB)) {
            return b(-1, str2, str, wifiManager);
        }
        for (WifiConfiguration wifiConfiguration : listB) {
            if (!TextUtils.isEmpty(wifiConfiguration.SSID)) {
                String strE = e(wifiConfiguration.SSID);
                dyg.e(true, "WiFiUtil", "getNetworkId router oldSsid:", strE, " ssid:", str, " rm ssid:", str3);
                boolean zRemoveNetwork = wifiManager.removeNetwork(wifiConfiguration.networkId);
                dyg.a(false, "WiFiUtil", " getNetworkId() removeNetwork remove = ", Integer.valueOf(wifiConfiguration.networkId), " isRemoveSucceeded = ", Boolean.valueOf(zRemoveNetwork));
                if (TextUtils.equals(str3, strE) && zRemoveNetwork) {
                    wifiManager.saveConfiguration();
                }
                if (TextUtils.equals(str, strE)) {
                    if (zRemoveNetwork) {
                        wifiManager.saveConfiguration();
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            dyg.e(false, "WiFiUtil", " getNetworkId() pazzword is empty ");
                        }
                        if (TextUtils.isEmpty(str2) && wifiConfiguration.allowedKeyManagement.get(0)) {
                            dyg.e(false, "WiFiUtil", " getNetworkId() reuse open mode id: ", Integer.valueOf(wifiConfiguration.networkId));
                            i = wifiConfiguration.networkId;
                        } else if (!TextUtils.isEmpty(str2) && !wifiConfiguration.allowedKeyManagement.get(0)) {
                            dyg.e(false, "WiFiUtil", " getNetworkId() reuse id: ", Integer.valueOf(wifiConfiguration.networkId));
                            i = wifiConfiguration.networkId;
                        } else {
                            dyg.e(false, "WiFiUtil", " getNetworkId() mode id: ", Integer.valueOf(wifiConfiguration.networkId));
                        }
                    }
                }
            }
        }
        return b(i, str2, str, wifiManager);
    }

    private static int b(int i, String str, String str2, WifiManager wifiManager) {
        int iAddNetwork;
        dyg.e(false, "WiFiUtil", " getNetworkId() for over newnetid = ", Integer.valueOf(i));
        if (i == -1) {
            if (TextUtils.isEmpty(str)) {
                iAddNetwork = wifiManager.addNetwork(d(str2));
            } else {
                iAddNetwork = wifiManager.addNetwork(c(str2, str));
            }
            dyg.e(false, "WiFiUtil", "getNetworkId bSaved:", Boolean.valueOf(wifiManager.saveConfiguration()));
        } else {
            iAddNetwork = i;
        }
        if (iAddNetwork == -1) {
            List<WifiConfiguration> listB = b(wifiManager);
            if (njy.e(listB)) {
                LogUtil.e("WiFiUtil", "getNewNetworkId newConfigs is null");
                return iAddNetwork;
            }
            for (WifiConfiguration wifiConfiguration : listB) {
                if (!TextUtils.isEmpty(wifiConfiguration.SSID) && TextUtils.equals(str2, e(wifiConfiguration.SSID))) {
                    iAddNetwork = wifiConfiguration.networkId;
                }
            }
        }
        dyg.a(false, "WiFiUtil", "getNetworkId newnetid = ", Integer.valueOf(i));
        return iAddNetwork;
    }

    public static WifiConfiguration c(String str, String str2) {
        dyg.e(false, "WiFiUtil", " setWifiParamsByWpa()");
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.SSID = "\"" + str + "\"";
        wifiConfiguration.preSharedKey = "\"" + str2 + "\"";
        wifiConfiguration.status = 2;
        wifiConfiguration.BSSID = null;
        wifiConfiguration.allowedAuthAlgorithms.set(0);
        wifiConfiguration.allowedKeyManagement.set(1);
        wifiConfiguration.allowedPairwiseCiphers.set(1);
        wifiConfiguration.allowedPairwiseCiphers.set(2);
        wifiConfiguration.allowedGroupCiphers.set(2);
        wifiConfiguration.allowedGroupCiphers.set(3);
        return wifiConfiguration;
    }

    public static int d(Context context) {
        if (context == null) {
            return -1;
        }
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo == null) {
            dyg.c(false, "WiFiUtil", "getConnectionInfo is null!");
            return 0;
        }
        return connectionInfo.getIpAddress();
    }

    public static boolean h(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager)) {
            LogUtil.j("WiFiUtil", "isWifiConnected obj is not instanceof ConnectivityManager");
            return false;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    public static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        try {
            List<ScanResult> scanResults = ((WifiManager) context.getSystemService("wifi")).getScanResults();
            String strC = c(a(context));
            dyg.a(false, "WiFiUtil", "is24GHzWiFi currentSsid: ", strC);
            if (njy.e(scanResults)) {
                dyg.a(false, "WiFiUtil", "scanResults.size() <= 0 ");
                return true;
            }
            for (ScanResult scanResult : scanResults) {
                String str = scanResult.SSID;
                if (TextUtils.isEmpty(str)) {
                    dyg.a(false, "WiFiUtil", "is24GHzWiFi scanResult scanResult.SSID is null");
                } else if (str.equals(strC)) {
                    int i = scanResult.frequency;
                    dyg.a(true, "WiFiUtil", "currentSsid = ", strC, " |wifiFrequency = ", Integer.valueOf(i));
                    if (i >= 2400 && i <= 3000) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            return true;
        }
    }

    public static boolean d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            dyg.d(false, "WiFiUtil", "isScanResultsHaveCurrentSsid context or ssid is null");
            return false;
        }
        dyg.a(false, "WiFiUtil", "isScanResultsHaveCurrentSsid compareSsid: ", str);
        try {
            List<ScanResult> scanResults = ((WifiManager) context.getSystemService("wifi")).getScanResults();
            if (njy.e(scanResults)) {
                dyg.a(false, "WiFiUtil", "scanResults.size() <= 0 ");
                return true;
            }
            Iterator<ScanResult> it = scanResults.iterator();
            while (it.hasNext()) {
                String str2 = it.next().SSID;
                if (TextUtils.isEmpty(str2)) {
                    dyg.a(false, "WiFiUtil", "isScanResultsHaveCurrentSsid scanResult scanResult.SSID is null");
                } else if (str2.equals(str)) {
                    dyg.a(false, "WiFiUtil", "isScanResultsHaveCurrentSsid compare consistent");
                    return true;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            dyg.c(false, "WiFiUtil", "isScanResultsHaveCurrentSsid RuntimeException");
            return true;
        }
    }

    public static String a(Context context) {
        WifiInfo connectionInfo;
        if (context != null && (connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo()) != null) {
            if (NetworkUtil.k()) {
                return connectionInfo.getSSID();
            }
            dyg.d(false, "WiFiUtil", "getConnectionWiFiInfo(): No WiFi Device");
        }
        return "";
    }

    public static int e(String str, Context context) {
        if (context == null || TextUtils.isEmpty(str)) {
            dyg.d(false, "WiFiUtil", "getWiFiMode() context is error");
            return 0;
        }
        dyg.a(false, "WiFiUtil", "getWiFiMode() SSID ", str);
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        try {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (njy.e(scanResults)) {
                LogUtil.e("WiFiUtil", "getScanResults isEmpty");
                return 0;
            }
            for (ScanResult scanResult : scanResults) {
                dyg.a(false, "WiFiUtil", "getWiFiMode() scanResult SSID ", scanResult.SSID);
                if (scanResult.SSID.equals(str)) {
                    return eck.e(scanResult);
                }
            }
            List<WifiConfiguration> listB = b(wifiManager);
            if (njy.b(listB)) {
                for (WifiConfiguration wifiConfiguration : listB) {
                    dyg.a(false, "WiFiUtil", "getWiFiMode() configuration SSID ", wifiConfiguration.SSID);
                    if (wifiConfiguration.SSID.equals("\"" + str + "\"")) {
                        return eck.d(wifiConfiguration);
                    }
                }
            }
            return 0;
        } catch (RuntimeException unused) {
            LogUtil.e("WiFiUtil", "getScanResults RuntimeException");
            return 0;
        }
    }

    public static List<WifiConfiguration> b(WifiManager wifiManager) {
        try {
            return wifiManager.getConfiguredNetworks();
        } catch (Exception unused) {
            LogUtil.e("WiFiUtil", "getConfiguredNetworksUtil Exception");
            return null;
        }
    }

    public static String c(String str) {
        int length;
        return (TextUtils.isEmpty(str) || !str.startsWith("\"") || !str.endsWith("\"") || (length = str.length()) <= 1) ? str : str.substring(1, length - 1);
    }

    public static void f(Context context) {
        if (context != null) {
            ecj.e(context, new Intent("android.settings.SETTINGS"));
        } else {
            dyg.c(false, "WiFiUtil", "goToNetWorkSetting context is null");
        }
    }

    public static boolean e(Context context) {
        if (context == null) {
            dyg.c(false, "WiFiUtil", "checkWifiStatus context is null");
            return false;
        }
        boolean zIsWifiEnabled = ((WifiManager) context.getSystemService("wifi")).isWifiEnabled();
        dyg.e(false, "WiFiUtil", "checkWifiStatus ", Boolean.valueOf(zIsWifiEnabled));
        return zIsWifiEnabled;
    }

    public static void l(Context context) {
        if (context != null) {
            ecj.e(context, new Intent("android.settings.SETTINGS"));
        } else {
            dyg.c(false, "WiFiUtil", "startPhoneSetting context is null");
        }
    }

    public static void k(Context context) {
        if (ecj.d()) {
            n(context);
        } else {
            m(context);
        }
    }

    private static void n(Context context) {
        Intent intent = new Intent("android.settings.PRIVACY_SETTINGS");
        intent.addFlags(268435456);
        ecj.e(context, intent);
    }

    private static void m(Context context) {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        intent.addFlags(268435456);
        ecj.e(context, intent);
    }

    public static boolean o(Context context) {
        if (context == null) {
            dyg.a(false, "WiFiUtil", "startWifiScan context is null");
            return false;
        }
        boolean zStartScan = ((WifiManager) context.getSystemService("wifi")).startScan();
        dyg.a(false, "WiFiUtil", "isScan = ", Boolean.valueOf(zStartScan));
        return zStartScan;
    }

    public static List<ScanResult> e(Context context, boolean z) {
        List<ScanResult> scanResults;
        ArrayList arrayList = new ArrayList(16);
        if (context == null) {
            LogUtil.j("WiFiUtil", "getWifiList() context is null");
            return arrayList;
        }
        try {
            scanResults = ((WifiManager) context.getSystemService("wifi")).getScanResults();
        } catch (Exception unused) {
            LogUtil.e("WiFiUtil", "getWifiList() WifiManager getScanResults exception");
            scanResults = null;
        }
        if (njy.e(scanResults)) {
            LogUtil.j("WiFiUtil", "getWifiList() scanResults is null");
            return arrayList;
        }
        for (ScanResult scanResult : scanResults) {
            if (scanResult.SSID != null && !"".equals(scanResult.SSID) && (z || a(scanResult))) {
                int iB = b(arrayList, scanResult);
                if (iB == -1) {
                    arrayList.add(scanResult);
                } else {
                    ScanResult scanResult2 = (ScanResult) arrayList.get(iB);
                    boolean z2 = scanResult.level - scanResult2.level > 0;
                    if (!a(scanResult2) && a(scanResult)) {
                        arrayList.set(iB, scanResult);
                    } else if (!a(scanResult) || !z2) {
                        LogUtil.a("WiFiUtil", "getWifiList() keep old scanResult");
                    } else {
                        arrayList.set(iB, scanResult);
                    }
                }
            }
        }
        LogUtil.a("WiFiUtil", "getWifiList() wifi list size = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static List<WifiConfiguration> c(Context context) {
        List<WifiConfiguration> arrayList = new ArrayList<>(16);
        if (context == null) {
            LogUtil.j("WiFiUtil", "getConfiguredNetworksList() context is null");
            return arrayList;
        }
        try {
            arrayList = ((WifiManager) context.getSystemService("wifi")).getConfiguredNetworks();
        } catch (Exception unused) {
            LogUtil.e("WiFiUtil", "getConfiguredNetworksUtil Exception");
        }
        if (njy.e(arrayList)) {
            LogUtil.j("WiFiUtil", "getConfiguredNetworksList() scanResults is null");
            return arrayList;
        }
        LogUtil.a("WiFiUtil", "getConfiguredNetworksList() wifi list size = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static List<ScanResult> b(Context context) {
        List<ScanResult> scanResults;
        ArrayList arrayList = new ArrayList(16);
        if (context == null) {
            LogUtil.j("WiFiUtil", "get5GhzWifiList() context is null");
            return arrayList;
        }
        try {
            scanResults = ((WifiManager) context.getSystemService("wifi")).getScanResults();
        } catch (Exception unused) {
            LogUtil.e("WiFiUtil", "get5GhzWifiList() WifiManager getScanResults exception");
            scanResults = null;
        }
        if (njy.e(scanResults)) {
            LogUtil.j("WiFiUtil", "get5GhzWifiList() scanResults is null");
            return arrayList;
        }
        for (ScanResult scanResult : scanResults) {
            if (scanResult.SSID != null && !"".equals(scanResult.SSID) && !a(scanResult)) {
                int iB = b(arrayList, scanResult);
                if (iB == -1) {
                    arrayList.add(scanResult);
                } else {
                    boolean z = scanResult.level - ((ScanResult) arrayList.get(iB)).level > 0;
                    if (a(scanResult) || !z) {
                        LogUtil.a("WiFiUtil", "get5GhzWifiList() keep old scanResult");
                    } else {
                        arrayList.set(iB, scanResult);
                    }
                }
            }
        }
        LogUtil.a("WiFiUtil", "get5GhzWifiList() wifi list size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private static int b(List<ScanResult> list, ScanResult scanResult) {
        for (int i = 0; i < list.size(); i++) {
            if (scanResult.SSID.equals(list.get(i).SSID)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean c(Context context, String str) {
        if (context == null) {
            dyg.a(false, "WiFiUtil", "isWifiConsistency context is null");
            return false;
        }
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null && c(connectionInfo.getSSID()).equals(str);
    }

    public static boolean a(ScanResult scanResult) {
        if (scanResult == null) {
            return false;
        }
        dyg.e(true, "WiFiUtil", "ssid = ", scanResult.SSID, " |frequency = ", Integer.valueOf(scanResult.frequency));
        int i = scanResult.frequency;
        return i >= 2400 && i <= 3000;
    }

    public static boolean i(Context context) {
        if (context == null) {
            return false;
        }
        try {
            List<ScanResult> scanResults = ((WifiManager) context.getSystemService("wifi")).getScanResults();
            String strC = c(a(context));
            if (njy.e(scanResults)) {
                LogUtil.j("WiFiUtil", "scanResults isNotEmpty");
                return false;
            }
            ScanResult scanResult = null;
            for (ScanResult scanResult2 : scanResults) {
                String str = scanResult2.SSID;
                if (str != null && str.equals(strC)) {
                    scanResult = scanResult2;
                }
            }
            return d(scanResult);
        } catch (RuntimeException unused) {
            LogUtil.j("WiFiUtil", "scanResults RuntimeException");
            return false;
        }
    }

    public static boolean d(ScanResult scanResult) {
        if (scanResult == null) {
            return false;
        }
        String upperCase = scanResult.capabilities.toUpperCase(Locale.ENGLISH);
        return (upperCase.contains("WEP") || upperCase.contains("PSK") || upperCase.contains("EAP")) ? false : true;
    }

    public static boolean a(Context context, boolean z) {
        dyg.a(false, "WiFiUtil", "setWifiEnabled...");
        return ((WifiManager) context.getSystemService("wifi")).setWifiEnabled(z);
    }

    public static boolean g(Context context) {
        dyg.a(false, "WiFiUtil", "isWifiOpen...");
        return ((WifiManager) context.getSystemService("wifi")).getWifiState() == 3;
    }

    public static ScanResult b(Context context, String str) {
        for (ScanResult scanResult : e(context, true)) {
            if (scanResult.SSID.equals(str)) {
                return scanResult;
            }
        }
        return null;
    }
}
