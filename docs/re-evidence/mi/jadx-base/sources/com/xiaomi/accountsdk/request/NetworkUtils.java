package com.xiaomi.accountsdk.request;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.account.privacy_data.master.PrivacyDataMaster;
import com.xiaomi.account.privacy_data.master.PrivacyDataType;
import com.xiaomi.accountsdk.utils.CloudCoder;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkUtils {
    public static String deleteUrlUnsafeChar(String str) {
        if (str != null) {
            return str.replaceAll("[^a-zA-Z0-9-_.]", "");
        }
        return null;
    }

    public static String getActiveConnPoint(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "";
            }
            if (activeNetworkInfo.getType() != 1) {
                return String.format("%s-%s-%s", activeNetworkInfo.getTypeName(), replacePlusToPChar(activeNetworkInfo.getSubtypeName()), activeNetworkInfo.getExtraInfo()).toLowerCase();
            }
            String strForceGet = PrivacyDataMaster.forceGet(context, PrivacyDataType.SSID, new String[0]);
            if (TextUtils.isEmpty(strForceGet)) {
                return "wifi";
            }
            return "wifi-" + CloudCoder.hashDeviceInfo(strForceGet).substring(0, 3).toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getNetworkNameForMiUrlStat(Context context) {
        return deleteUrlUnsafeChar(getActiveConnPoint(context));
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static String replacePlusToPChar(String str) {
        if (str != null) {
            return str.replaceAll("\\+", FitnessFilePathUtils.TimeZoneConstant.POSITIVE);
        }
        return null;
    }
}
