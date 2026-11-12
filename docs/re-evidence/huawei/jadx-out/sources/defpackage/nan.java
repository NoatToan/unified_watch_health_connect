package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hwdevice.phoneprocess.mgr.hwwifisyncmgr.WifiConnectReceiver;
import health.compact.a.Base64;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.HwEncryptUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public class nan {
    private static final Lock e = new ReentrantLock();

    private nan() {
    }

    public static void b() {
        synchronized (nan.class) {
            try {
                LogUtil.a("SyncWifiUtils", "enter updateWifiMessage");
                if (!CommonUtil.at()) {
                    ReleaseLogUtil.d("R_SyncWifiUtils", "The phone emui version is error");
                    return;
                }
                nao naoVarA = a();
                if (TextUtils.isEmpty(naoVarA.e()) || TextUtils.isEmpty(naoVarA.b())) {
                    LogUtil.a("SyncWifiUtils", "wifi or password is invalid");
                } else {
                    b(naoVarA);
                }
                d(d(), "cached_wifi_message");
                if (i()) {
                    try {
                        try {
                            h();
                        } catch (NumberFormatException unused) {
                            LogUtil.c("SyncWifiUtils", "saveMessage NumberFormatException");
                        }
                    } catch (JsonSyntaxException unused2) {
                        LogUtil.c("SyncWifiUtils", "jsonSyntaxException when setUserPreference");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static nao a() {
        LogUtil.a("SyncWifiUtils", "getCurrentWifMessageEntity enter");
        nao naoVar = new nao();
        try {
            if (e.tryLock(2000L, TimeUnit.MILLISECONDS)) {
                try {
                    LogUtil.a("SyncWifiUtils", "getCurrentWifMessageEntity getWifiInfo");
                    naoVar = c();
                    return naoVar;
                } finally {
                    e.unlock();
                }
            }
            LogUtil.a("SyncWifiUtils", "getCurrentWifMessageEntity tryLock is false");
            return c();
        } catch (InterruptedException unused) {
            LogUtil.d("SyncWifiUtils", "getCurrentWifMessageEntity InterruptedException");
            return naoVar;
        }
    }

    private static nao c() {
        String strE;
        LogUtil.a("SyncWifiUtils", "getCurrentWifMessageEntityDeal enter");
        String strD = d(BaseApplication.b());
        LogUtil.a("SyncWifiUtils", "currentSsid:", CommonUtil.n(strD));
        if (!e(strD)) {
            LogUtil.d("SyncWifiUtils", "The wifi name is invalid");
            return new nao();
        }
        String strSubstring = (strD.charAt(0) == '\"' && strD.charAt(strD.length() - 1) == '\"') ? strD.substring(1, strD.length() - 1) : strD;
        int iD = d(strSubstring, BaseApplication.b());
        nao naoVar = new nao();
        naoVar.e(iD);
        String strC = c(strSubstring, BaseApplication.b());
        LogUtil.a("SyncWifiUtils", "wifiModeCapabilities = ", strC);
        naoVar.b(strC);
        try {
            strE = nam.e(strSubstring);
        } catch (SecurityException unused) {
            LogUtil.c("SyncWifiUtils", "getPassword SecurityException");
            strE = "";
        } catch (Exception unused2) {
            LogUtil.c("SyncWifiUtils", "getPassword Exception");
            strE = "";
        } catch (NoClassDefFoundError unused3) {
            LogUtil.c("SyncWifiUtils", "getPassword NoClassDefFoundError");
            strE = "";
        }
        if (TextUtils.isEmpty(strE)) {
            LogUtil.d("SyncWifiUtils", "password is empty");
            return new nao();
        }
        naoVar.e(strD);
        try {
            naoVar.d(HwEncryptUtil.b(BaseApplication.b()).e(1, Base64.b(strE.getBytes(StandardCharsets.UTF_8))));
            LogUtil.a("SyncWifiUtils", "getP******d m******y.p******d.len = " + naoVar.b().length());
            return naoVar;
        } catch (GeneralSecurityException unused4) {
            LogUtil.c("SyncWifiUtils", "encryptData is not right");
            return new nao();
        }
    }

    private static boolean e(String str) {
        return (TextUtils.isEmpty(str) || str.startsWith(HiDataFilter.DataFilterExpression.LESS_THAN) || str.endsWith(HiDataFilter.DataFilterExpression.BIGGER_THAN)) ? false : true;
    }

    private static String c(String str, Context context) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.d("SyncWifiUtils", "getWiFiModeCapabilities() context is error");
            return "";
        }
        LogUtil.a("SyncWifiUtils", "getWiFiModeCapabilities() SSID ", str);
        try {
            List<ScanResult> scanResults = ((WifiManager) context.getSystemService("wifi")).getScanResults();
            if (njy.e(scanResults)) {
                LogUtil.c("SyncWifiUtils", "getWiFiModeCapabilities getScanResults isEmpty");
                return "";
            }
            for (ScanResult scanResult : scanResults) {
                if (scanResult.SSID.equals(str)) {
                    return scanResult.capabilities;
                }
            }
            LogUtil.c("SyncWifiUtils", "getWiFiModeCapabilities capabilities isEmpty");
            return "";
        } catch (RuntimeException unused) {
            LogUtil.c("SyncWifiUtils", "getWiFiModeCapabilities getScanResults RuntimeException");
            return "";
        }
    }

    private static int d(String str, Context context) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.d("SyncWifiUtils", "getWiFiMode() context is error");
            return 0;
        }
        LogUtil.a("SyncWifiUtils", "getWiFiMode() SSID ", str);
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        try {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (njy.e(scanResults)) {
                LogUtil.c("SyncWifiUtils", "getScanResults isEmpty");
                return 0;
            }
            for (ScanResult scanResult : scanResults) {
                if (scanResult.SSID.equals(str)) {
                    return b(scanResult);
                }
            }
            List<WifiConfiguration> listA = a(wifiManager);
            if (njy.e(listA)) {
                return 0;
            }
            for (WifiConfiguration wifiConfiguration : listA) {
                if (wifiConfiguration.SSID.equals("\"" + str + "\"")) {
                    return d(wifiConfiguration);
                }
            }
            return 0;
        } catch (RuntimeException unused) {
            LogUtil.c("SyncWifiUtils", "getScanResults RuntimeException");
            return 0;
        }
    }

    private static int b(ScanResult scanResult) {
        if (scanResult == null) {
            LogUtil.c("SyncWifiUtils", "scanResult == null");
            return 0;
        }
        if (scanResult.capabilities.contains("WEP") || scanResult.capabilities.contains("wep")) {
            return 1;
        }
        if (scanResult.capabilities.contains("PSK")) {
            return 2;
        }
        if (scanResult.capabilities.contains("SAE")) {
            return 7;
        }
        return scanResult.capabilities.contains("EAP") ? 3 : 0;
    }

    private static int d(WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration == null) {
            LogUtil.c("SyncWifiUtils", "config == null");
            return 0;
        }
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return 2;
        }
        if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
            return 3;
        }
        return wifiConfiguration.wepKeys[0] != null ? 1 : 0;
    }

    private static List<WifiConfiguration> a(WifiManager wifiManager) {
        try {
            return wifiManager.getConfiguredNetworks();
        } catch (Exception unused) {
            LogUtil.c("SyncWifiUtils", "getConfiguredNetworksUtil Exception");
            return null;
        }
    }

    private static String d(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        String ssid = connectionInfo != null ? connectionInfo.getSSID() : null;
        String strTrim = ssid != null ? ssid.trim() : null;
        if (!TextUtils.isEmpty(strTrim) && strTrim.charAt(0) == '\"' && strTrim.charAt(strTrim.length() - 1) == '\"') {
            strTrim = strTrim.substring(1, strTrim.length() - 1);
        }
        if (!e(strTrim)) {
            strTrim = e(context);
        }
        return !e(strTrim) ? a(context) : strTrim;
    }

    private static String e(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            Object systemService = context.getSystemService("connectivity");
            activeNetworkInfo = systemService instanceof ConnectivityManager ? ((ConnectivityManager) systemService).getActiveNetworkInfo() : null;
        } catch (ClassCastException unused) {
            LogUtil.d("SyncWifiUtils", "getNetworkInfo error. ");
        }
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getExtraInfo() == null) ? "" : activeNetworkInfo.getExtraInfo().replace("\"", "");
    }

    private static String a(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager != null) {
            int networkId = wifiManager.getConnectionInfo().getNetworkId();
            try {
                List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
                if (configuredNetworks != null) {
                    for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                        if (wifiConfiguration.networkId == networkId) {
                            return wifiConfiguration.SSID;
                        }
                    }
                }
            } catch (Exception e2) {
                LogUtil.c("SyncWifiUtils", "getSSIDByNetworkId Exception: ", ExceptionUtils.c(e2));
                return "";
            }
        }
        return "";
    }

    private static void h() {
        if (EnvironmentUtils.d()) {
            LogUtil.a("SyncWifiUtils", "sendWifiMessage current is Health Main Process():");
            lvb.e().i();
        } else {
            LogUtil.a("SyncWifiUtils", "sendWifiMessage current is Health PhoneService Process():");
            naf.e().a();
        }
    }

    private static void b(nao naoVar) {
        List<nao> listD = d();
        Iterator<nao> it = listD.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (naoVar == null) {
                    break;
                }
                LogUtil.a("SyncWifiUtils", "add wifiSSID:", naoVar.e());
                listD.add(naoVar);
                break;
            }
            nao next = it.next();
            if (next != null && naoVar != null) {
                if (TextUtils.isEmpty(next.e()) || TextUtils.isEmpty(naoVar.e())) {
                    LogUtil.d("SyncWifiUtils", "entity content is empty");
                } else if (!next.e().equals(naoVar.e())) {
                    continue;
                } else if (next.toString().equals(naoVar.toString())) {
                    break;
                } else {
                    it.remove();
                }
            }
        }
        if (listD.size() > 2) {
            LogUtil.a("SyncWifiUtils", "enter remove");
            listD.remove(0);
        }
        KeyValDbManager.d(BaseApplication.b()).b("cached_wifi_message", new Gson().toJson(listD));
    }

    private static boolean i() {
        List<DeviceInfo> listE = e();
        boolean z = false;
        if (njy.e(listE)) {
            LogUtil.a("SyncWifiUtils", "no connected device. ");
            return false;
        }
        HashMap<String, List<nao>> mapG = g();
        for (DeviceInfo deviceInfo : listE) {
            if (mapG == null) {
                mapG = new HashMap<>();
            }
            List<nao> listD = d();
            if (listD.isEmpty()) {
                LogUtil.d("SyncWifiUtils", "needSynchronizeWifi cachedList: isEmpty");
                break;
            }
            if (mapG.isEmpty() || !mapG.containsKey(deviceInfo.getDeviceIdentify())) {
                LogUtil.a("SyncWifiUtils", "synchronizedWifiMap is null. update: ", deviceInfo.toString());
                mapG.put(deviceInfo.getDeviceIdentify(), listD);
                z = true;
                break;
            }
            List<nao> list = mapG.get(deviceInfo.getDeviceIdentify());
            d(mapG.get(deviceInfo.getDeviceIdentify()), "deviceSyncBefore");
            for (nao naoVar : listD) {
                if (naoVar != null && list != null && !list.contains(naoVar)) {
                    if (mapG.containsKey(deviceInfo.getDeviceIdentify())) {
                        LogUtil.a("SyncWifiUtils", "synchronizedWifiMap update: ", deviceInfo.toString());
                        mapG.put(deviceInfo.getDeviceIdentify(), listD);
                    }
                    z = true;
                    break;
                }
            }
            d(mapG.get(deviceInfo.getDeviceIdentify()), "deviceSyncFinish");
            int deviceFactoryReset = deviceInfo.getDeviceFactoryReset();
            LogUtil.a("SyncWifiUtils", "getDeviceFactoryReset value: ", Integer.valueOf(deviceFactoryReset));
            if (deviceFactoryReset != 1) {
                LogUtil.a("SyncWifiUtils", "getDeviceFactoryReset value not 1");
            } else if (z) {
                c(deviceInfo);
            } else if (WifiConnectReceiver.a().c().contains(nio.c(deviceInfo.getDeviceIdentify()))) {
                WifiConnectReceiver.a().c().remove(nio.c(deviceInfo.getDeviceIdentify()));
                z = true;
            } else {
                LogUtil.a("SyncWifiUtils", "getDeviceFactoryReset list not contains current device");
            }
        }
        KeyValDbManager.d(BaseApplication.b()).b("synchronized_wifi_message", new Gson().toJson(mapG));
        return z;
    }

    private static void d(List<nao> list, String str) {
        if (njy.e(list)) {
            LogUtil.a("SyncWifiUtils", "printSyncWifiSendMessageEntities == null or empty, tag = ", str);
            return;
        }
        for (nao naoVar : list) {
            String strN = CommonUtil.n(naoVar.e());
            int iC = naoVar.c();
            LogUtil.a("SyncWifiUtils", "ssid = ", strN, ", encodeType = ", Integer.valueOf(iC), ", capability = ", naoVar.a(), ", tag = ", str);
        }
    }

    private static HashMap<String, List<nao>> g() {
        try {
            return (HashMap) new Gson().fromJson(KeyValDbManager.d(BaseApplication.b()).c("synchronized_wifi_message"), new TypeToken<HashMap<String, List<nao>>>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwwifisyncmgr.SyncWifiUtils$1
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.c("SyncWifiUtils", "synchronizedWifiMap jsonSyntaxException ");
            return null;
        } catch (NumberFormatException unused2) {
            LogUtil.c("SyncWifiUtils", "synchronizedWifiMap NumberFormatException");
            return null;
        }
    }

    private static List<nao> d() {
        List<nao> list;
        try {
            list = (List) new Gson().fromJson(KeyValDbManager.d(BaseApplication.b()).c("cached_wifi_message"), new TypeToken<ArrayList<nao>>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwwifisyncmgr.SyncWifiUtils$2
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.c("SyncWifiUtils", "savedMessage jsonSyntaxException ");
            list = null;
        } catch (NumberFormatException unused2) {
            LogUtil.c("SyncWifiUtils", "savedMessage NumberFormatException");
            list = null;
        }
        return list == null ? new ArrayList(2) : list;
    }

    private static List<DeviceInfo> e() {
        if (EnvironmentUtils.d()) {
            LogUtil.a("SyncWifiUtils", "getConnectedDeviceList current is Health Main Process():");
            return ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "SyncWifiUtils");
        }
        LogUtil.a("SyncWifiUtils", "getConnectedDeviceList current is Health PhoneService Process():");
        return ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "SyncWifiUtils");
    }

    public static boolean b(Context context) {
        if (context == null) {
            LogUtil.c("SyncWifiUtils", "checkWifiStatus context is null");
            return false;
        }
        boolean zIsWifiEnabled = ((WifiManager) context.getSystemService("wifi")).isWifiEnabled();
        LogUtil.e("SyncWifiUtils", "checkWifiStatus ", Boolean.valueOf(zIsWifiEnabled));
        return zIsWifiEnabled;
    }

    private static void c(DeviceInfo deviceInfo) {
        LogUtil.a("SyncWifiUtils", "updateResetFactoryDevice");
        final String strC = nio.c(deviceInfo.getDeviceIdentify());
        if (TextUtils.isEmpty(strC)) {
            LogUtil.d("SyncWifiUtils", "updateResetFactoryDevice deviceId");
        } else {
            LogUtil.a("SyncWifiUtils", "updateResetFactoryDevice isRemoved = ", Boolean.valueOf(WifiConnectReceiver.a().c().removeIf(new Predicate() { // from class: nal
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((String) obj).equals(strC);
                }
            })));
        }
    }
}
