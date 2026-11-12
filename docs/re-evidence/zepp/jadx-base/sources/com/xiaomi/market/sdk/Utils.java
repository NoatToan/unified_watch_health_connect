package com.xiaomi.market.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class Utils {
    public static final int BYTES_IN_KILO = 1000;
    public static final int BYTES_IN_MEGA = 1000000;
    public static final String TAG = "MarketSdkUtils";
    public static boolean DEBUG = new File("/sdcard/com.xiaomi.market.sdk/sdk_debug").exists();
    public static boolean STAGING = new File("/sdcard/com.xiaomi.market.sdk/sdk_staging").exists();
    private static Singleton<String> marketPkgName = new Singleton<String>() { // from class: com.xiaomi.market.sdk.Utils.1
        @Override // com.xiaomi.market.sdk.Singleton
        public String create() {
            return (!Client.isMiui() || Client.isInternationalMiui()) ? "" : "com.xiaomi.market";
        }
    };
    private static volatile Singleton<Boolean> isMiMarketExists = new Singleton<Boolean>() { // from class: com.xiaomi.market.sdk.Utils.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xiaomi.market.sdk.Singleton
        public Boolean create() {
            String str = (String) Utils.marketPkgName.get();
            if (TextUtils.isEmpty(str)) {
                return Boolean.FALSE;
            }
            try {
                int applicationEnabledSetting = AppGlobal.getContext().getPackageManager().getApplicationEnabledSetting(str);
                boolean z = true;
                if (applicationEnabledSetting != 0 && applicationEnabledSetting != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    };

    public static String getByteString(long j, Context context) {
        String strValueOf;
        int i;
        if (context == null || j < 0) {
            return "";
        }
        if (j > 1000000) {
            strValueOf = String.format("%.1f", Double.valueOf((j * 1.0d) / 1000000.0d));
            i = R.string.xiaomi_update_sdk_megabytes_unit;
        } else if (j > 1000) {
            strValueOf = String.format("%.1f", Double.valueOf((j * 1.0d) / 1000.0d));
            i = R.string.xiaomi_update_sdk_kilobytes_unit;
        } else {
            strValueOf = String.valueOf(j);
            i = R.string.xiaomi_update_sdk_bytes_unit;
        }
        return context.getString(i, strValueOf);
    }

    public static String getMarketPackageName() {
        return marketPkgName.get();
    }

    public static boolean hasExternalStorage(boolean z) {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            return true;
        }
        return "mounted_ro".equals(externalStorageState) && !z;
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }

    public static boolean isMiuiMarketExisted(Context context) {
        return isMiMarketExists.get().booleanValue();
    }

    public static boolean isMiuiPad() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.build.characteristics")).contains("tablet");
        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
            return false;
        }
    }

    public static boolean isMobileConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 0) ? false : true;
    }

    public static boolean isWifiConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }
}
