package com.huawei.operation.utils;

import android.content.res.Configuration;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.util.LogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class HelpCustomerOperate {
    private static final String DOMESTIC_HELP_URL_FORMAT = "/hwtips/help/health_help_all/%s/index.html%s";
    private static final String EUROPE_HELP_URL_FORMAT = "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=health_help_all";
    private static final String TAG = "HelpCustomerOperate";

    private HelpCustomerOperate() {
    }

    public static String getHelpCustomerUrl(String str, String str2) {
        String str3;
        LogUtil.a(TAG, "getHelpCustomerUrl");
        if (CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)) == 1) {
            Locale locale = Locale.ENGLISH;
            String domesticLanguageTag = getDomesticLanguageTag();
            if (str2 == null) {
                str2 = "";
            }
            str3 = String.format(locale, DOMESTIC_HELP_URL_FORMAT, domesticLanguageTag, str2);
        } else {
            str3 = String.format(Locale.ENGLISH, EUROPE_HELP_URL_FORMAT, getCurrentLanguageTag());
        }
        String str4 = str + str3;
        LogUtil.e(TAG, "getHelpCustomerUrl: url -> ", str4);
        return str4;
    }

    private static String getDomesticLanguageTag() {
        String str;
        String language = BaseApplication.getContext().getResources().getConfiguration().locale.getLanguage();
        if ("ZH".equalsIgnoreCase(language) || "BO".equalsIgnoreCase(language) || "UG".equalsIgnoreCase(language)) {
            str = "zh-CN";
        } else {
            str = "en-US";
        }
        LogUtil.e(TAG, "getDomesticLanguageTag: languageTag -> ", str);
        return str;
    }

    private static String getCurrentLanguageTag() {
        Configuration configuration = BaseApplication.getContext().getResources().getConfiguration();
        String str = configuration.locale.getLanguage() + com.huawei.openalliance.ad.constant.Constants.LINK + configuration.locale.getCountry();
        LogUtil.e(TAG, "getLanguageTag: currentLanguageTag -> ", str);
        return str;
    }
}
