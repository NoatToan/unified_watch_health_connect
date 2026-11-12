package com.huawei.maps.offlinedata.service.cloud.utils;

import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class CountryCodeUtil {
    private static final String TAG = "CountryCodeUtil";
    private static String countryCode;

    private CountryCodeUtil() {
    }

    public static boolean checkCountryCodeIsCN(String str) {
        return str != null && str.equalsIgnoreCase("CN");
    }

    public static boolean checkCountryCodeValid(String str) {
        return (str == null || str.length() > 5 || str.length() == 0) ? false : true;
    }

    private static String checkedCountryCode(String str) {
        return (TextUtils.isEmpty(str) || str.length() != 2) ? "" : str;
    }

    public static String getLocaleCountryCode() {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            return locale.getCountry();
        }
        return null;
    }

    public static String getLocationCountryCode() {
        String str = countryCode;
        if (str != null) {
            return str;
        }
        if (isAirplaneModeOn()) {
            g.c(TAG, "airplane Mode is on");
            return "UNKNOWN";
        }
        String networkCountryCode = getNetworkCountryCode();
        countryCode = networkCountryCode;
        if (TextUtils.isEmpty(networkCountryCode) && !isSimNetworkRoaming()) {
            countryCode = getSimCardCountryCode();
        }
        if (TextUtils.isEmpty(countryCode)) {
            countryCode = "UNKNOWN";
            g.c(TAG, "get countryCode is UNKNOWN");
        }
        g.a(TAG, "getLocatorCountryCode：" + countryCode);
        return countryCode;
    }

    public static String getNetworkCountryCode() {
        Object systemService;
        try {
            if (hasNoSimCard() || (systemService = com.huawei.maps.offlinedata.utils.a.b().getSystemService("phone")) == null || !(systemService instanceof TelephonyManager)) {
                return "";
            }
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            return telephonyManager.getPhoneType() != 2 ? checkedCountryCode(telephonyManager.getNetworkCountryIso()) : "";
        } catch (Exception unused) {
            g.b(TAG, "getNetworkCountryCode exception");
            return "";
        }
    }

    public static String getSimCardCountryCode() {
        try {
            Object systemService = com.huawei.maps.offlinedata.utils.a.b().getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                return "";
            }
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            return checkedCountryCode(telephonyManager.getSimState() == 5 ? telephonyManager.getSimCountryIso() : null);
        } catch (Exception e) {
            g.b(TAG, e.getMessage());
            return "";
        }
    }

    public static String getVendorCountryCode() {
        String property = SystemPropUtils.getProperty("get", CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP, "android.os.SystemProperties", "UNKNOWN");
        return (TextUtils.isEmpty(property) || "UNKNOWN".equals(property)) ? SystemPropUtils.getProperty("get", CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP_HN, "android.os.SystemProperties", "UNKNOWN") : property;
    }

    public static boolean hasNoSimCard() {
        Object systemService = com.huawei.maps.offlinedata.utils.a.b().getSystemService("phone");
        boolean z = false;
        if (systemService instanceof TelephonyManager) {
            int simState = ((TelephonyManager) systemService).getSimState();
            z = simState == 0 || simState == 1 || simState == 2 || simState == 3 || simState == 6 || simState == 7 || simState == 8;
            g.a(TAG, "simState:" + simState);
        }
        return z;
    }

    public static boolean isAirplaneModeOn() {
        return Settings.Global.getInt(com.huawei.maps.offlinedata.utils.a.b().getApplicationContext().getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static boolean isSimNetworkRoaming() {
        try {
            Object systemService = com.huawei.maps.offlinedata.utils.a.b().getApplicationContext().getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                return ((TelephonyManager) systemService).isNetworkRoaming();
            }
            return false;
        } catch (Exception e) {
            g.b(TAG, e.getMessage());
            return false;
        }
    }

    public static void setCountryCode(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        countryCode = str;
    }
}
