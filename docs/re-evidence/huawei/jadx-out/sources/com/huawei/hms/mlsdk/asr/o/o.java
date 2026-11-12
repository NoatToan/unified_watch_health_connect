package com.huawei.hms.mlsdk.asr.o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import com.huawei.hms.mlsdk.common.MLApplication;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[RETURN] */
    public static int a() {
        WifiInfo wifiInfo;
        TransportInfo transportInfo;
        Context appContext = MLApplication.getInstance().getAppContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) appContext.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) appContext.getSystemService("phone");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 1) {
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                return 2;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                if (!telephonyManager.isNetworkRoaming()) {
                                    return 3;
                                }
                                return 2;
                            case 13:
                            default:
                                String subtypeName = activeNetworkInfo.getSubtypeName();
                                if ("WCDMA".equalsIgnoreCase(subtypeName) || "CDMA2000".equalsIgnoreCase(subtypeName) || "TD-SCDMA".equalsIgnoreCase(subtypeName)) {
                                    if (telephonyManager.isNetworkRoaming()) {
                                        return 2;
                                    }
                                    return 3;
                                }
                                break;
                        }
                    }
                    return type;
                }
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    return 4;
                }
                if (i < 31) {
                    wifiInfo = null;
                    break;
                }
                ConnectivityManager connectivityManager2 = (ConnectivityManager) appContext.getApplicationContext().getSystemService("connectivity");
                Network[] allNetworks = connectivityManager2.getAllNetworks();
                int length = allNetworks.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(allNetworks[i2]);
                        if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (transportInfo = networkCapabilities.getTransportInfo()) != null && (transportInfo instanceof WifiInfo)) {
                            wifiInfo = (WifiInfo) transportInfo;
                            break;
                        }
                        i2++;
                    } else {
                        wifiInfo = null;
                        break;
                    }
                }
                if (wifiInfo == null) {
                    return 1;
                }
                int rssi = wifiInfo.getRssi();
                SmartLogger.i("NetworkHelper", "wifi rssi ===" + rssi);
                if (rssi >= -75 || rssi < -89) {
                    return rssi < -89 ? 2 : 4;
                }
                return 3;
            }
            return 1;
        } catch (Exception e) {
            SmartLogger.e("NetworkHelper", e.getMessage());
            return 4;
        }
    }
}
