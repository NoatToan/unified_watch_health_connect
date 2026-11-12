package com.thanosfisherman.wifiutils;

import android.annotation.TargetApi;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.thanosfisherman.elvis.Objects;
import com.thanosfisherman.wifiutils.utils.SSIDUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
final class a {
    public static final String a = "OPEN";
    public static final String b = "WEP";
    public static final String c = "PSK";
    public static final String d = "EAP";

    public static String a(@NonNull ScanResult scanResult) {
        String str = scanResult.capabilities;
        String str2 = b;
        if (!str.contains(b)) {
            str2 = a;
        }
        if (scanResult.capabilities.contains(c)) {
            str2 = c;
        }
        if (scanResult.capabilities.contains(d)) {
            str2 = d;
        }
        WifiUtils.wifiLog("ScanResult capabilities " + scanResult.capabilities);
        WifiUtils.wifiLog("Got security via ScanResult " + str2);
        return str2;
    }

    public static String b(@NonNull WifiConfiguration wifiConfiguration) {
        ArrayList arrayList = new ArrayList();
        boolean z = wifiConfiguration.allowedKeyManagement.get(0);
        String str = a;
        if (z) {
            if (wifiConfiguration.wepKeys[0] != null) {
                str = b;
            }
            arrayList.add(str);
        }
        if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
            str = d;
            arrayList.add(d);
        }
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            str = c;
            arrayList.add(c);
        }
        WifiUtils.wifiLog("Got Security Via WifiConfiguration " + arrayList);
        return str;
    }

    public static String c(@Nullable ScanResult scanResult) {
        if (scanResult == null) {
            return "";
        }
        String strA = a(scanResult);
        if (!scanResult.capabilities.contains("WPS")) {
            return strA;
        }
        return strA + ", WPS";
    }

    @Nullable
    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    public static WifiConfiguration d(@NonNull WifiManager wifiManager, @NonNull ScanResult scanResult) {
        String str;
        if (scanResult.BSSID != null && (str = scanResult.SSID) != null && !str.isEmpty() && !scanResult.BSSID.isEmpty()) {
            String strConvertToQuotedString = SSIDUtils.convertToQuotedString(scanResult.SSID);
            String str2 = scanResult.BSSID;
            String strA = a(scanResult);
            List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
            if (configuredNetworks == null) {
                return null;
            }
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                if (str2.equals(wifiConfiguration.BSSID) || strConvertToQuotedString.equals(wifiConfiguration.SSID)) {
                    if (Objects.equals(strA, b(wifiConfiguration))) {
                        return wifiConfiguration;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    public static WifiConfiguration e(@NonNull WifiManager wifiManager, @NonNull WifiConfiguration wifiConfiguration) {
        String str = wifiConfiguration.SSID;
        if (str != null && !str.isEmpty()) {
            String str2 = wifiConfiguration.BSSID;
            if (str2 == null) {
                str2 = "";
            }
            String strB = b(wifiConfiguration);
            List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
            if (configuredNetworks == null) {
                WifiUtils.wifiLog("NULL configs");
                return null;
            }
            for (WifiConfiguration wifiConfiguration2 : configuredNetworks) {
                if (str2.equals(wifiConfiguration2.BSSID) || str.equals(wifiConfiguration2.SSID)) {
                    if (Objects.equals(strB, b(wifiConfiguration2))) {
                        return wifiConfiguration2;
                    }
                }
            }
            WifiUtils.wifiLog("Couldn't find " + str);
        }
        return null;
    }

    @Nullable
    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    public static WifiConfiguration f(@NonNull WifiManager wifiManager, @NonNull String str) {
        String str2 = '\"' + str + '\"';
        for (WifiConfiguration wifiConfiguration : wifiManager.getConfiguredNetworks()) {
            if (wifiConfiguration.SSID.equals(str2)) {
                return wifiConfiguration;
            }
        }
        return null;
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    public static void g(@NonNull WifiConfiguration wifiConfiguration, String str, @NonNull String str2) {
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        WifiUtils.wifiLog("Setting up security " + str);
        str.hashCode();
        switch (str) {
            case "EAP":
                wifiConfiguration.allowedProtocols.set(1);
                wifiConfiguration.allowedProtocols.set(0);
                wifiConfiguration.allowedGroupCiphers.set(0);
                wifiConfiguration.allowedGroupCiphers.set(1);
                wifiConfiguration.allowedGroupCiphers.set(2);
                wifiConfiguration.allowedGroupCiphers.set(3);
                wifiConfiguration.allowedPairwiseCiphers.set(1);
                wifiConfiguration.allowedPairwiseCiphers.set(2);
                wifiConfiguration.allowedKeyManagement.set(2);
                wifiConfiguration.allowedKeyManagement.set(3);
                wifiConfiguration.preSharedKey = SSIDUtils.convertToQuotedString(str2);
                break;
            case "PSK":
                wifiConfiguration.allowedProtocols.set(1);
                wifiConfiguration.allowedProtocols.set(0);
                wifiConfiguration.allowedKeyManagement.set(1);
                wifiConfiguration.allowedPairwiseCiphers.set(2);
                wifiConfiguration.allowedPairwiseCiphers.set(1);
                wifiConfiguration.allowedGroupCiphers.set(0);
                wifiConfiguration.allowedGroupCiphers.set(1);
                wifiConfiguration.allowedGroupCiphers.set(3);
                wifiConfiguration.allowedGroupCiphers.set(2);
                if (!str2.matches("[0-9A-Fa-f]{64}")) {
                    wifiConfiguration.preSharedKey = SSIDUtils.convertToQuotedString(str2);
                    break;
                } else {
                    wifiConfiguration.preSharedKey = str2;
                    break;
                }
                break;
            case "WEP":
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.allowedProtocols.set(1);
                wifiConfiguration.allowedProtocols.set(0);
                wifiConfiguration.allowedAuthAlgorithms.set(0);
                wifiConfiguration.allowedAuthAlgorithms.set(1);
                wifiConfiguration.allowedPairwiseCiphers.set(2);
                wifiConfiguration.allowedPairwiseCiphers.set(1);
                wifiConfiguration.allowedGroupCiphers.set(0);
                wifiConfiguration.allowedGroupCiphers.set(1);
                if (!ConnectorUtils.p(str2)) {
                    wifiConfiguration.wepKeys[0] = SSIDUtils.convertToQuotedString(str2);
                    break;
                } else {
                    wifiConfiguration.wepKeys[0] = str2;
                    break;
                }
                break;
            case "OPEN":
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.allowedProtocols.set(1);
                wifiConfiguration.allowedProtocols.set(0);
                wifiConfiguration.allowedPairwiseCiphers.set(2);
                wifiConfiguration.allowedPairwiseCiphers.set(1);
                wifiConfiguration.allowedGroupCiphers.set(0);
                wifiConfiguration.allowedGroupCiphers.set(1);
                wifiConfiguration.allowedGroupCiphers.set(3);
                wifiConfiguration.allowedGroupCiphers.set(2);
                break;
            default:
                WifiUtils.wifiLog("Invalid security type: " + str);
                break;
        }
    }

    @TargetApi(29)
    public static void h(@NonNull WifiNetworkSpecifier.Builder builder, String str, @NonNull String str2) {
        WifiUtils.wifiLog("Setting up WifiNetworkSpecifier.Builder " + str);
        str.hashCode();
        switch (str) {
            case "EAP":
            case "PSK":
                builder.setWpa2Passphrase(str2);
                break;
            case "WEP":
            case "OPEN":
                break;
            default:
                WifiUtils.wifiLog("Invalid security type: " + str);
                break;
        }
    }
}
