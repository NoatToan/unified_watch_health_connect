package com.xiaomi.ai.android.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.sensetime.senseid.sdk.liveness.silent.common.util.NetworkUtil;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.log.Logger;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class NetworkUtils {

    public static class a extends BroadcastReceiver {
        private com.xiaomi.ai.android.core.d a;
        private boolean b = true;

        public a(com.xiaomi.ai.android.core.d dVar) {
            this.a = dVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(intent.getAction())) {
                Logger.a("NetworkUtils", "onReceive: CONNECTIVITY_ACTION, type=" + intent.getIntExtra("networkType", -1), false);
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    Logger.c("NetworkUtils", "onReceive: ConnectivityManager is null", false);
                    return;
                }
                NetworkInfo activeNetworkInfo = null;
                try {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (Exception e) {
                    Logger.c("NetworkUtils", Logger.throwableToString(e), false);
                }
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                    if (!this.b) {
                        this.a.h().b();
                    }
                    this.b = true;
                } else {
                    Logger.c("NetworkUtils", "onReceive: activeInfo=" + activeNetworkInfo, false);
                    this.b = false;
                }
            }
        }
    }

    public static String a(String str) {
        return (str == null || "".equals(str)) ? "unknown" : str;
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = null;
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            Logger.c("NetworkUtils", Logger.throwableToString(e), false);
        }
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
    }

    public static Network.NetworkType b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return Network.NetworkType.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = null;
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            Logger.c("NetworkUtils", Logger.throwableToString(e), false);
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return Network.NetworkType.WIFI;
            }
            if (activeNetworkInfo.getType() == 0) {
                return Network.NetworkType.DATA;
            }
        }
        return Network.NetworkType.UNKNOWN;
    }

    public static String c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager == null) {
            return null;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            Logger.c("NetworkUtils", Logger.throwableToString(e), false);
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected()) {
            return "none";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() != 0) {
            return activeNetworkInfo.getTypeName();
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype == 20) {
            return "5G";
        }
        switch (subtype) {
            case 1:
                return "GPRS";
            case 2:
            case 4:
            case 7:
            case 11:
                return NetworkUtil.NETWORK_CLASS_2_G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return NetworkUtil.NETWORK_CLASS_3_G;
            case 13:
                return NetworkUtil.NETWORK_CLASS_4_G;
            default:
                String subtypeName = activeNetworkInfo.getSubtypeName();
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? NetworkUtil.NETWORK_CLASS_3_G : subtypeName;
        }
    }

    public static int d(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        int dbm = Integer.MAX_VALUE;
        if (telephonyManager != null) {
            try {
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    for (CellInfo cellInfo : allCellInfo) {
                        if (cellInfo.isRegistered()) {
                            if (cellInfo instanceof CellInfoWcdma) {
                                dbm = ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm();
                            } else if (cellInfo instanceof CellInfoGsm) {
                                dbm = ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
                            } else if (cellInfo instanceof CellInfoCdma) {
                                dbm = ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
                            } else if (cellInfo instanceof CellInfoLte) {
                                dbm = ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Logger.c("NetworkUtils", Log.getStackTraceString(e), false);
            }
        }
        return dbm;
    }

    public static int e(Context context) {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null || connectionInfo.getBSSID() == null) {
            return 0;
        }
        return WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 5);
    }

    public static String f(Context context) {
        TelephonyManager telephonyManager;
        return (Build.VERSION.SDK_INT < 22 || context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "unknown" : a(telephonyManager.getSimOperator());
    }

    public static native synchronized boolean ipv6Available();
}
