package com.huawei.operation.utils;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.operation.beans.NetworkStatusObj;
import health.compact.a.CommonUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class NetworkStatusUtils {
    private static final int METERED_TYPE_METERED = 1;
    private static final int METERED_TYPE_UNKNOWN = 0;
    private static final int METERED_TYPE_UN_METERED = 2;
    private static final String TAG = "NetworkStatusUtils";
    private static volatile NetworkStatusUtils sInstance;

    private NetworkStatusUtils() {
    }

    public static NetworkStatusUtils getsInstance() {
        if (sInstance == null) {
            synchronized (NetworkStatusUtils.class) {
                if (sInstance == null) {
                    sInstance = new NetworkStatusUtils();
                }
            }
        }
        return sInstance;
    }

    public NetworkStatusObj getNetworkStatus(Context context) {
        LogUtil.i(TAG, "getNetworkStatus start");
        Context applicationContext = context.getApplicationContext();
        NetworkStatusObj networkStatusObj = new NetworkStatusObj();
        networkStatusObj.setType(getNetworkType());
        networkStatusObj.setAirplaneMode(Settings.System.getInt(applicationContext.getContentResolver(), "airplane_mode_on", 0) != 0);
        setNetworkAndSimInfo(applicationContext, networkStatusObj);
        LogUtil.i(TAG, "getNetworkStatus end");
        return networkStatusObj;
    }

    private void setNetworkAndSimInfo(Context context, NetworkStatusObj networkStatusObj) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
        if (telephonyManager == null) {
            Object systemService = context.getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                telephonyManager = (TelephonyManager) systemService;
            }
        }
        if (telephonyManager == null) {
            LogUtil.w(TAG, "setNetworkAndSimInfo: telephonyManager is null");
            return;
        }
        networkStatusObj.setOperator(telephonyManager.getNetworkOperator());
        networkStatusObj.setRoaming(telephonyManager.isNetworkRoaming());
        networkStatusObj.setNetworkCountryIso(getNetworkCountryIso(telephonyManager));
    }

    private String getNetworkCountryIso(TelephonyManager telephonyManager) {
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (Build.VERSION.SDK_INT < 30) {
            return networkCountryIso;
        }
        for (int i = 0; i <= 1; i++) {
            try {
                String networkCountryIso2 = telephonyManager.getNetworkCountryIso(i);
                if (!TextUtils.isEmpty(networkCountryIso2) && !networkCountryIso.contains(networkCountryIso2)) {
                    networkCountryIso = String.format(Locale.ENGLISH, "%s,%s", networkCountryIso, networkCountryIso2);
                }
            } catch (IllegalArgumentException e) {
                LogUtil.w(TAG, "getNetworkCountryIso: exception -> " + e.getMessage());
            }
        }
        return networkCountryIso;
    }

    private NetworkStatusObj.NetworkType getNetworkType() {
        if (!NetworkUtil.i()) {
            LogUtil.i(TAG, "getNetworkType unConnected");
            return NetworkStatusObj.NetworkType.UNCONNECTED;
        }
        if (NetworkUtil.f()) {
            return NetworkStatusObj.NetworkType.MOBILE;
        }
        if (NetworkUtil.k()) {
            return NetworkStatusObj.NetworkType.WIFI;
        }
        if (NetworkUtil.j()) {
            return NetworkStatusObj.NetworkType.VPN;
        }
        LogUtil.i(TAG, "getNetworkType other");
        return NetworkStatusObj.NetworkType.OTHER;
    }

    public int getWifiMeteredType(Context context) {
        try {
            Class<?> cls = Class.forName(CommonUtil.bd() ? "com.hihonor.android.net.wifi.WifiManagerCommonEx" : "com.huawei.android.net.wifi.WifiManagerCommonEx");
            Object objInvoke = cls.getMethod("getHwMeteredHint", Context.class).invoke(cls.newInstance(), context);
            return (!(objInvoke instanceof Boolean) || ((Boolean) objInvoke).booleanValue()) ? 1 : 2;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }
}
