package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.huawei.hihealth.dictionary.model.HealthDataMergePolicy;
import ohos.ace.plugin.wifimanager.WifiDeviceUtils;

/* JADX INFO: loaded from: classes3.dex */
public class nov {
    public static String b(Context context) {
        NetworkInfo.State state;
        nox.b("NetUtils", "getNetType begin", true);
        if (context == null) {
            nox.a("NetUtils", "context is null", true);
            return HealthDataMergePolicy.NONE;
        }
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        if (connectivityManager == null) {
            return HealthDataMergePolicy.NONE;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            nox.a("NetUtils", "activeNetInfo is null or activeNetInfo is not available", true);
            return HealthDataMergePolicy.NONE;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return WifiDeviceUtils.NETWORKINFO_TYPE_NAME;
        }
        if (applicationContext.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            nox.b("NetUtils", "no Permission READ_PHONE_STATE", true);
            return HealthDataMergePolicy.NONE;
        }
        return e(applicationContext);
    }

    private static String e(Context context) {
        if (context == null) {
            nox.a("NetUtils", "activity is null", true);
            return HealthDataMergePolicy.NONE;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            nox.a("NetUtils", "telephonyManager is null", true);
            return HealthDataMergePolicy.NONE;
        }
        try {
            int networkType = telephonyManager.getNetworkType();
            nox.b("NetUtils", "networkType is " + networkType, false);
            switch (networkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3G";
                case 13:
                    return "4G";
                default:
                    return HealthDataMergePolicy.NONE;
            }
        } catch (Throwable th) {
            nox.a("NetUtils", "no permission " + th.getClass().getSimpleName(), true);
            return HealthDataMergePolicy.NONE;
        }
    }
}
