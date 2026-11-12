package com.ximalaya.ting.android.opensdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;

/* JADX INFO: loaded from: classes22.dex */
public class NetworkType {
    public static final int OPERATOR_CMCC = 0;
    public static final int OPERATOR_OTHER = 3;
    public static final int OPERATOR_TELECOM = 2;
    public static final int OPERATOR_UNICOME = 1;

    public static NetWorkType getNetWorkType(Context context) {
        NetWorkType netWorkType;
        if (context == null) {
            return NetWorkType.NETWORKTYPE_INVALID;
        }
        NetworkInfo activeNetworkInfo = null;
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
        }
        NetWorkType netWorkType2 = NetWorkType.NETWORKTYPE_INVALID;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return netWorkType2;
        }
        String typeName = activeNetworkInfo.getTypeName();
        if (typeName.equalsIgnoreCase("WIFI")) {
            return NetWorkType.NETWORKTYPE_WIFI;
        }
        if (!typeName.equalsIgnoreCase("MOBILE")) {
            return netWorkType2;
        }
        if (TextUtils.isEmpty(Proxy.getDefaultHost())) {
            netWorkType = isFastMobileNetwork(context) ? NetWorkType.NETWORKTYPE_3G : NetWorkType.NETWORKTYPE_2G;
        } else {
            netWorkType = NetWorkType.NETWORKTYPE_WAP;
        }
        return netWorkType;
    }

    public static int getOperator(Context context) {
        if (context == null) {
            return 3;
        }
        String simOperator = null;
        try {
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        } catch (Exception unused) {
        }
        if (simOperator == null) {
            return 3;
        }
        if (simOperator.equals("46000") || simOperator.equals("46002") || simOperator.equals("46007") || simOperator.equals("46020")) {
            return 0;
        }
        if (simOperator.equals("46001") || simOperator.equals("46006") || simOperator.equals("46009")) {
            return 1;
        }
        return (simOperator.equals("46003") || simOperator.equals("46005") || simOperator.equals("46011")) ? 2 : 3;
    }

    public static boolean isConnectMOBILE(Context context) {
        NetWorkType netWorkType = getNetWorkType(context);
        return netWorkType == NetWorkType.NETWORKTYPE_WAP || netWorkType == NetWorkType.NETWORKTYPE_2G || netWorkType == NetWorkType.NETWORKTYPE_3G;
    }

    public static boolean isConnectTONetWork(Context context) {
        return getNetWorkType(context) != NetWorkType.NETWORKTYPE_INVALID;
    }

    public static boolean isConnectToWifi(Context context) {
        return getNetWorkType(context) == NetWorkType.NETWORKTYPE_WIFI;
    }

    private static boolean isFastMobileNetwork(Context context) {
        int networkType;
        try {
            networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
        } catch (Exception unused) {
            networkType = 0;
        }
        switch (networkType) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            default:
                return false;
        }
    }

    public enum NetWorkType {
        NETWORKTYPE_INVALID(ConstantKt.UPLOAD_BIND_FAIL_NO_NETWORK, 1),
        NETWORKTYPE_WAP("wap", 2),
        NETWORKTYPE_2G("2g", 3),
        NETWORKTYPE_3G("3g", 4),
        NETWORKTYPE_WIFI("wifi", 5);

        private int index;
        private String name;

        NetWorkType(String str, int i) {
            this.name = str;
            this.index = i;
        }

        public static String getName(int i) {
            for (NetWorkType netWorkType : values()) {
                if (netWorkType.getIndex() == i) {
                    return netWorkType.name;
                }
            }
            return null;
        }

        public int getIndex() {
            return this.index;
        }

        public void setIndex(int i) {
            this.index = i;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }
}
