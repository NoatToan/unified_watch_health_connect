package com.huawei.common.util;

import android.content.Context;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class VersionIsCloud {
    private static final String SELECT_COUNTRY = "select_country";
    private static final String STR_INVALIED_PARAM = "-1";
    private static final String TAG = "Login_VersionIsCloud";

    private VersionIsCloud() {
    }

    public static String checkCloudState(Context context) {
        if (context == null) {
            LogUtil.j(TAG, "checkCloudState invalied param");
            return "-1";
        }
        if (CommonUtil.cj()) {
            LogUtil.a(TAG, "checkCloudState:isTestThirdDeviceVersion");
            return "0";
        }
        String country = context.getResources().getConfiguration().locale.getCountry();
        String language = context.getResources().getConfiguration().locale.getLanguage();
        if (StorageIsCloud.getIf1Login(context)) {
            String str = StorageIsCloud.isChinaSite() ? "0" : "1";
            LogUtil.a(TAG, "Statelogied cloud state : ", str);
            return str;
        }
        if (!"cn".equalsIgnoreCase(country) || !MLAsrConstants.LAN_ZH.equalsIgnoreCase(language)) {
            LogUtil.a(TAG, "If it is not china, save ", "0");
            return "0";
        }
        LogUtil.a(TAG, "If it is china, save ", "1");
        return "1";
    }

    public static String checkLoginState(Context context) {
        LogUtil.a(TAG, "accountmigrate: isAllowedLogin() enter");
        if (StorageIsCloud.getIf1Login(context)) {
            LogUtil.a(TAG, "accountmigrate: isAllowedLogin() ifAllowLogin true");
            return "1";
        }
        return getIfAllowLoginByMcc(context);
    }

    public static String getIfAllowLoginByMcc(Context context) {
        LogUtil.a(TAG, "enter getIfAllowLoginByMcc.");
        return setIfAllowLoginByAreaAlert(context);
    }

    public static String setIfAllowLoginByAreaAlert(Context context) {
        LogUtil.a(TAG, "enter needShowAreaAlert.");
        setIfNeedShowAreaAlert(context, "1");
        if (CommonUtil.w(context) || LoginInit.getCloudapi().isOverseaJudgeByCountry("") || "CN".equalsIgnoreCase(Locale.getDefault().getCountry())) {
            LogUtil.a(TAG, "needShowAreaAlert: isAllowedLogin() true");
            return "1";
        }
        LogUtil.a(TAG, "needShowAreaAlert: isAllowedLogin() false");
        return "0";
    }

    public static void setIfNeedShowAreaAlert(Context context, String str) {
        SharedPreferenceManager.e(context, Integer.toString(10015), "key_ui_if_show_area_select_alert", str, new StorageParams(0));
    }

    public static String getIfNeedShowAreaAlert(Context context) {
        return SharedPreferenceManager.e(context, Integer.toString(10015), "key_ui_if_show_area_select_alert");
    }
}
