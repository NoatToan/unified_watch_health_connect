package com.huami.watch.companion.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.huami.watch.util.DeviceCompatibility;
import com.sensetime.senseid.sdk.liveness.silent.common.util.NetworkUtil;

/* JADX INFO: loaded from: classes16.dex */
public class MobileUtil {
    private static MobileUtil b = null;
    private static final String c = "稳定版";
    private static final String d = "体验版";
    private static final String e = "开发版";
    private Context a;

    private MobileUtil(Context context) {
        this.a = context;
    }

    private String a() {
        if (DeviceCompatibility.MIUI.isMiuiStableVersion()) {
            return c;
        }
        if (DeviceCompatibility.MIUI.isMiuiDevelopmentVersion()) {
            return e;
        }
        return DeviceCompatibility.MIUI.isMiuiAlphaVersion(this.a) ? d : "";
    }

    public static MobileUtil getInstance(Context context) {
        if (b == null) {
            b = new MobileUtil(context.getApplicationContext());
        }
        return b;
    }

    public String getAndroidVersion() {
        return Build.VERSION.RELEASE;
    }

    public String getBrand() {
        return Build.BRAND;
    }

    public String getModel() {
        return Build.MODEL;
    }

    public String getNetworkType() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() == 0) {
                String subtypeName = activeNetworkInfo.getSubtypeName();
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
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
                        return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? NetworkUtil.NETWORK_CLASS_3_G : subtypeName;
                }
            }
        }
        return "";
    }

    public String getResolution() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        return displayMetrics.heightPixels + "x" + i;
    }

    public String getRomName() {
        if (!DeviceCompatibility.MIUI.isMIUI(this.a)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MIUI ");
        String mIUIVersionName = DeviceCompatibility.MIUI.getMIUIVersionName(this.a);
        if ("V".equalsIgnoreCase(String.valueOf(mIUIVersionName.charAt(0))) && mIUIVersionName.length() > 1) {
            mIUIVersionName = mIUIVersionName.substring(1);
        }
        stringBuffer.append(mIUIVersionName);
        stringBuffer.append(" ");
        stringBuffer.append(Build.VERSION.INCREMENTAL);
        stringBuffer.append(" | ");
        stringBuffer.append(a());
        return stringBuffer.toString();
    }

    public String getSystemType() {
        return Build.PRODUCT;
    }
}
