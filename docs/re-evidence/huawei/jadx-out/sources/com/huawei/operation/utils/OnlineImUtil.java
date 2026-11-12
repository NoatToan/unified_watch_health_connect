package com.huawei.operation.utils;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.DeviceManagerCommonConfigApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.R;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.beans.OnlineLink;
import defpackage.iov;
import defpackage.lua;
import defpackage.peh;
import defpackage.qhu;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class OnlineImUtil {
    private static final String CHINESE_HANS = "Hans";
    private static final String KEY_DEVICE_MANAGER_COMMON_CONFIG = "key_device_manager_common_config";
    private static final int MAX_RETRY_COUNT = 1;
    private static final String MODULE_ID = "device_manager_common_config_imp";
    private static final String ONLINE_CONFIG_MODULE_ID = "online_config_module_id";
    private static final String ONLINE_IM_ID = "onlineServiceLink";
    private static final String OPEN_MODE_KEY_SUFFIX = "_web";
    private static final String R_TAG = "R_OnlineImUtil";
    private static final String TAG = "OnlineImUtil";
    public static int retryCount;

    public static void downloadOnlineConfig() {
        boolean isLogined = LoginInit.getInstance(BaseApplication.b()).getIsLogined();
        LogUtil.a(TAG, "isLogin:", Boolean.valueOf(isLogined));
        if (isLogined) {
            ((DeviceManagerCommonConfigApi) Services.b("Module_Device_Feature", DeviceManagerCommonConfigApi.class)).downLoadCommonConfig();
        }
    }

    public static void parseOnlineConfig() {
        try {
            Object objOpt = new JSONObject(SharedPreferenceManager.b(MODULE_ID, KEY_DEVICE_MANAGER_COMMON_CONFIG, "")).opt(ONLINE_IM_ID);
            if (objOpt == null) {
                LogUtil.a(TAG, "jsonObject is null");
                return;
            }
            for (OnlineLink onlineLink : peh.c(objOpt.toString(), OnlineLink[].class)) {
                String str = onlineLink.getLang() + "_" + onlineLink.getCountryCode();
                lua.h(ONLINE_CONFIG_MODULE_ID, str, onlineLink.getUrl());
                lua.b(ONLINE_CONFIG_MODULE_ID, str + OPEN_MODE_KEY_SUFFIX, onlineLink.isOpenSystemWeb());
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a(R_TAG, "parseJsonContent exception", ExceptionUtils.c(e));
        }
    }

    private static String getOnlineUrl() {
        return lua.d(ONLINE_CONFIG_MODULE_ID, getLocale(), "");
    }

    public static boolean isShowOnlineEntry() {
        LogUtil.a(TAG, "langKey: ", getLocale());
        boolean zIsEmpty = getOnlineUrl().isEmpty();
        if (zIsEmpty && retryCount < 1) {
            downloadOnlineConfig();
            retryCount++;
        }
        return !zIsEmpty || qhu.a(BaseApplication.b()) || Utils.isShowJapanCustomer(BaseApplication.b());
    }

    public static void gotoOnlineService() {
        String onlineUrl = getOnlineUrl();
        LogUtil.a(TAG, "url = ", onlineUrl);
        if (onlineUrl.isEmpty()) {
            onlineUrl = onlineChinaOrJapan();
            ReleaseLogUtil.d(R_TAG, "gotoOnlineService url is Empty = ", Boolean.valueOf(onlineUrl.isEmpty()));
        }
        if (getLocale().contains(CHINESE_HANS) && !CommonUtil.cl()) {
            onlineUrl = onlineUrl + System.currentTimeMillis();
        }
        if (lua.e(ONLINE_CONFIG_MODULE_ID, getLocale() + OPEN_MODE_KEY_SUFFIX, false)) {
            openSystemWeb(onlineUrl);
        } else {
            openInnerWebView(onlineUrl);
        }
    }

    private static void openSystemWeb(String str) {
        ResolveInfo resolveInfoResolveActivity;
        LogUtil.d(TAG, "openSystemWeb..");
        try {
            final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            PackageManager packageManager = BaseApplication.b().getPackageManager();
            if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
                return;
            }
            intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
            intent.addFlags(268435456);
            qrs.e(resolveInfoResolveActivity.activityInfo.packageName, BaseApplication.b(), BaseApplication.b().getString(R.string.IDS_browser_app_name), new View.OnClickListener() { // from class: com.huawei.operation.utils.OnlineImUtil$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseApplication.b().startActivity(intent);
                }
            }, null);
        } catch (Exception e) {
            ReleaseLogUtil.a(R_TAG, "openSystemWeb failed：", e.getMessage());
        }
    }

    private static void openInnerWebView(String str) {
        LogUtil.d(TAG, "openInnerWebView..");
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str);
        iov.d(BaseApplication.b(), intent);
    }

    private static String getLocale() {
        Configuration configuration = BaseApplication.b().getResources().getConfiguration();
        if (configuration.getLocales().isEmpty()) {
            LogUtil.j(TAG, "configuration locales is empty");
            return "";
        }
        Locale locale = configuration.getLocales().get(0);
        if (locale == null) {
            LogUtil.j(TAG, "locale is null");
            return "";
        }
        String language = locale.getLanguage();
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010);
        if (LanguageUtil.l(BaseApplication.b())) {
            language = language + "-Hans";
        }
        return language + "_" + accountInfo;
    }

    private static String onlineChinaOrJapan() {
        ReleaseLogUtil.d(R_TAG, "onlineChinaAndJapan get url");
        if (qhu.a(BaseApplication.b())) {
            if (CommonUtil.cl()) {
                return BaseApplication.b().getResources().getString(R.string.china_online_test_url);
            }
            return BaseApplication.b().getResources().getString(R.string.china_online_url);
        }
        if (Utils.isShowJapanCustomer(BaseApplication.b())) {
            return BaseApplication.b().getResources().getString(R.string.japan_online_url);
        }
        return "";
    }
}
