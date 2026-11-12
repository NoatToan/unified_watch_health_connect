package com.amazon.alexa.avs;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.avs.util.I18nUtil;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepoImpl;
import com.xiaomi.hm.health.smalltool.model.ToolKey;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes2.dex */
public class AlexaSupportUtils {
    private static String[] ASIA_COUNTRY = {"JP", "AU", ToolKey.ALARM};
    private static String[] EU_COUNTRY = {SelectAreaManager.GB, "AT", "FR", "DE", "IN", "IT", "ES", "IE"};
    private static String[] NA_COUNTRY = {"US", "CA", HTTP.MX};
    private static String[] SUPPORT_LANGUAGE = {"de-DE", "en-AU", "en-CA", "en-GB", "en-IN", AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE, "es-ES", "es-MX", "fr-CA", "fr-FR", "it-IT", "ja-JP", "pt-BR"};
    public static final String TAG = "AlexaSupportUtils";

    public static String getEndpoint(String str) {
        if (!isSupportAlexa(str)) {
            return "";
        }
        for (String str2 : ASIA_COUNTRY) {
            if (str.equalsIgnoreCase(str2)) {
                return "https://alexa.fe.gateway.devices.a2z.com";
            }
        }
        for (String str3 : EU_COUNTRY) {
            if (str.equalsIgnoreCase(str3)) {
                return "https://alexa.eu.gateway.devices.a2z.com";
            }
        }
        for (String str4 : NA_COUNTRY) {
            if (str.equalsIgnoreCase(str4)) {
                return "https://alexa.na.gateway.devices.a2z.com";
            }
        }
        return "";
    }

    public static String getSupportLocalLanguage(Context context) {
        Locale locale = I18nUtil.getLocale(context);
        String str = locale.getLanguage() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + locale.getCountry();
        if (TextUtils.isEmpty(str)) {
            Log.d(TAG, " languageLocal is null return en-US");
            return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
        }
        for (String str2 : SUPPORT_LANGUAGE) {
            if (str.equalsIgnoreCase(str2)) {
                Log.d(TAG, " languageLocal : " + str);
                return str;
            }
        }
        return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
    }

    public static boolean isSupportAlexa(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : ASIA_COUNTRY) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        for (String str3 : EU_COUNTRY) {
            if (str.equalsIgnoreCase(str3)) {
                return true;
            }
        }
        for (String str4 : NA_COUNTRY) {
            if (str.equalsIgnoreCase(str4)) {
                return true;
            }
        }
        return false;
    }
}
