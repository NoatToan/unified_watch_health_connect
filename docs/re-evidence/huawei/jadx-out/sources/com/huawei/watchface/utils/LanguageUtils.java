package com.huawei.watchface.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.watchface.environment.Environment;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public final class LanguageUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30603a = "LanguageUtils";

    public static String a() {
        return Locale.getDefault().getLanguage();
    }

    public static String b() {
        return Environment.getApplicationContext().getResources().getConfiguration().locale.getScript();
    }

    public static boolean c() {
        return "ar".equals(a());
    }

    public static boolean d() {
        return MLAsrConstants.LAN_ZH.equals(a());
    }

    public static boolean isNeedMirror() {
        String strA = a();
        return "ar".equals(strA) || "fa".equals(strA) || "iw".equals(strA) || "ug".equals(strA) || Constants.URDU_LANG.equals(strA);
    }

    public static String a(boolean z) {
        String str;
        Configuration configuration = Environment.getApplicationContext().getResources().getConfiguration();
        String language = configuration.locale.getLanguage();
        String country = configuration.locale.getCountry();
        if ("my".equals(language) && "Qaag".equals(Locale.getDefault().getScript())) {
            country = "ZG";
        }
        if ("en".equals(language) && "Qaag".equals(Locale.getDefault().getScript())) {
            country = "GB";
        }
        if (z) {
            StringBuffer stringBuffer = new StringBuffer(language);
            stringBuffer.append("_");
            stringBuffer.append(country);
            return stringBuffer.toString();
        }
        String script = configuration.locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            if ("Hans".equalsIgnoreCase(script)) {
                str = "CN";
            } else if ("Hant".equalsIgnoreCase(script)) {
                str = "TW";
            } else {
                HwLog.w(f30603a, "script default");
            }
            country = str;
            language = MLAsrConstants.LAN_ZH;
        }
        StringBuffer stringBuffer2 = new StringBuffer(language);
        stringBuffer2.append("_");
        stringBuffer2.append(country);
        return stringBuffer2.toString();
    }

    public static boolean a(Context context) {
        if (context != null) {
            return "ar".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage()) || "iw".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage()) || "fa".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage()) || Constants.URDU_LANG.equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage()) || "ug".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
        }
        HwLog.w(f30603a, "isRTLLanguage() context is null");
        return false;
    }
}
