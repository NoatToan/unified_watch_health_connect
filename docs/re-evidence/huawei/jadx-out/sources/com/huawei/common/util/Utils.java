package com.huawei.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.hms.framework.network.grs.GrsApi;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    public static final String HEALTH_OVER_SEA = "health.oversea";
    public static final String HEALTH_OVER_SEA_BETA = "health.oversea.beta";
    private static final int HWID_KEY_VERSION_CODE_254302 = 20504302;
    public static final String KOREA_SUFFIX = ".202506";
    public static final String SERVICE_HEALTH = "com.huawei.health";
    public static final String SERVICE_HEALTH_CLOUD = "healthcloud";
    private static final String SERVICE_SUFFIX;
    private static final String TAG = "PLGLOGIN_Utils";

    static {
        SERVICE_SUFFIX = CommonUtil.cl() ? BleConstants.WEIGHT_KEY : "";
    }

    private Utils() {
    }

    public static String getUrl(String str, String str2) {
        String countryCode = getCountryCode();
        GrsClient grsClientInitGrs = initGrs(countryCode, BaseApplication.getContext());
        if (grsClientInitGrs == null) {
            LogUtil.j(TAG, "get SyncUrl mContext is null");
            return "";
        }
        return getGrsUrl(grsClientInitGrs, countryCode, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0066 A[PHI: r10
      0x0066: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v2 java.lang.String) binds: [B:3:0x0023, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    public static String getGrsUrl(GrsClient grsClient, String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        String str5 = SERVICE_SUFFIX;
        sb.append(str5);
        String string = sb.toString();
        String strSynGetGrsUrl = grsClient.synGetGrsUrl(string, str3);
        if (isKRService(str2, str)) {
            String str6 = str2 + KOREA_SUFFIX + str5;
            String strSynGetGrsUrl2 = grsClient.synGetGrsUrl(str6, str3);
            LogUtil.a(TAG, "HealthGrsManager getKRGrsUrl [", str, "][", str6, "][", str3, "][", strSynGetGrsUrl2, "]");
            if (!TextUtils.isEmpty(strSynGetGrsUrl2)) {
                string = str6;
            }
            if (TextUtils.isEmpty(strSynGetGrsUrl2)) {
                str4 = string;
            } else {
                str4 = string;
                strSynGetGrsUrl = strSynGetGrsUrl2;
            }
        } else {
            str4 = string;
        }
        LogUtil.a(TAG, "HealthGrsManager getGrsUrl [", str, "][", str4, "][", str3, "][", strSynGetGrsUrl, "]");
        return strSynGetGrsUrl;
    }

    public static boolean isKRService(String str, String str2) {
        if (LoginInit.KOREA.equals(str2)) {
            return SERVICE_HEALTH_CLOUD.equals(str) || "com.huawei.health".equals(str) || HEALTH_OVER_SEA_BETA.equals(str) || HEALTH_OVER_SEA.equals(str);
        }
        return false;
    }

    public static GrsClient initGrs(String str, Context context) {
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setAppName(SERVICE_HEALTH_CLOUD + SERVICE_SUFFIX);
        grsBaseInfo.setCountrySource(str);
        grsBaseInfo.setSerCountry(str);
        grsBaseInfo.setRegCountry(str);
        grsBaseInfo.setVersionName(Build.VERSION.RELEASE);
        try {
            return new GrsClient(context, grsBaseInfo);
        } catch (NullPointerException unused) {
            LogUtil.e(TAG, "context or grsBaseInfo is null");
            return null;
        }
    }

    public static void initGrsOld(String str, Context context) {
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setAppName(SERVICE_HEALTH_CLOUD + SERVICE_SUFFIX);
        grsBaseInfo.setCountrySource(str);
        grsBaseInfo.setSerCountry(str);
        grsBaseInfo.setRegCountry(str);
        grsBaseInfo.setVersionName(Build.VERSION.RELEASE);
        GrsApi.grsSdkInit(context, grsBaseInfo);
    }

    public static String getCountryCode() {
        Context context = BaseApplication.getContext();
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1010);
        if (!TextUtils.isEmpty(accountInfo)) {
            LogUtil.a(TAG, "getCommonCountryCode from account");
            return accountInfo;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
        LogUtil.a(TAG, "getCommonCountryCode from service area");
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        String strJ = CommonUtil.j(context);
        if (!TextUtils.isEmpty(strJ)) {
            LogUtil.a(TAG, "getCommonCountryCode from MCC");
            return strJ;
        }
        return Locale.getDefault().getCountry();
    }

    public static String getCountryBeforeLogin() {
        Context context = BaseApplication.getContext();
        String strE = SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
        if (TextUtils.isEmpty(strE)) {
            strE = CommonUtil.j(context);
        }
        return TextUtils.isEmpty(strE) ? Locale.getDefault().getCountry() : strE;
    }

    public static String getHmsVersionName() {
        String hMSPackageName = HMSPackageManager.getInstance(BaseApplication.getContext()).getHMSPackageName();
        String str = "";
        if (TextUtils.isEmpty(hMSPackageName)) {
            LogUtil.a(TAG, "not install hms");
            return "";
        }
        try {
            str = BaseApplication.getContext().getPackageManager().getPackageInfo(hMSPackageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e(TAG, "getHmsVersionName NameNotFoundException error :", e.getMessage());
        }
        LogUtil.a(TAG, "getHmsVersionName versionName= ", str);
        return str;
    }

    public static int getHwidVersionCode(Context context) {
        String hMSPackageName = HMSPackageManager.getInstance(context).getHMSPackageName();
        if (TextUtils.isEmpty(hMSPackageName)) {
            return 0;
        }
        try {
            int i = context.getPackageManager().getPackageInfo(hMSPackageName, 0).versionCode;
            LogUtil.a(TAG, "getHwIDVersionCode versionCode ", Integer.valueOf(i));
            return i;
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e(TAG, "getHwIDVersionCode NameNotFoundException error :", e.getMessage());
            return 0;
        }
    }

    public static boolean isSupportAuthAppList() {
        return HWID_KEY_VERSION_CODE_254302 <= getHwidVersionCode(BaseApplication.getContext());
    }
}
