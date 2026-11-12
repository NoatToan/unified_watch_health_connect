package com.huami.watch.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.os.LocaleListCompat;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.module.homepage.cards.business.healthstate.HealthStateCardView;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class I18nUtil {
    private static final String a = "Util-I18N";
    private static String[] b = {"AT", "BG", "BE", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", SelectAreaManager.GB, "HR", "LU"};
    private static String[] c = {"zh", "es", HealthStateCardView.LANGUAGE_RU};
    private static String[] d = {"de"};

    private static String a(@NonNull Context context) {
        return getLocale(context).getLanguage();
    }

    public static Locale getLocale(@NonNull Context context) {
        Locale locale;
        try {
            locale = Build.VERSION.SDK_INT >= 24 ? context.getApplicationContext().getResources().getConfiguration().getLocales().get(0) : context.getApplicationContext().getResources().getConfiguration().locale;
        } catch (Exception e) {
            Log.w(a, "GetLocaleErr", e, new Object[0]);
            locale = null;
        }
        return locale == null ? LocaleListCompat.getDefault().get(0) : locale;
    }

    public static String getLocaleCountry(@NonNull Context context) {
        return getLocale(context).getCountry();
    }

    public static String getLocaleStr(@NonNull Context context) {
        String str = a(context) + "_" + getLocaleCountry(context);
        String string = Locale.getDefault().toString();
        if (!str.equals(string)) {
            Log.d(a, "Default Locale : " + string, new Object[0]);
        }
        Log.d(a, "Get LocaleStr : " + str, new Object[0]);
        return str;
    }

    public static boolean isCN(@NonNull Context context) {
        return isCN(getLocaleCountry(context));
    }

    public static boolean isEU(Context context) {
        return isEU(getLocaleCountry(context));
    }

    public static boolean isEn(@NonNull Context context) {
        return !isZh(context);
    }

    public static boolean isKR(String str) {
        return "KR".equalsIgnoreCase(str);
    }

    public static boolean isOversea(@NonNull Context context) {
        return !isCN(context);
    }

    public static boolean isRU(Context context) {
        return isRU(getLocaleCountry(context));
    }

    public static boolean isSupportDDMM(Context context) {
        return isSupportLang(context, d);
    }

    public static boolean isSupportEverestHelp(Context context) {
        return isSupportLang(context, c);
    }

    public static boolean isSupportLang(Context context, String[] strArr) {
        String strA = a(context);
        if (!TextUtils.isEmpty(strA)) {
            for (String str : strArr) {
                if (strA.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isUS(Context context) {
        return isUS(getLocaleCountry(context));
    }

    public static boolean isZh(@NonNull Context context) {
        return a(context).contains("zh");
    }

    public static boolean isCN(String str) {
        return "CN".equalsIgnoreCase(str);
    }

    public static boolean isEU(String str) {
        return str != null && Arrays.asList(b).indexOf(str.toUpperCase()) >= 0;
    }

    public static boolean isKR(Context context) {
        return isKR(getLocaleCountry(context));
    }

    public static boolean isOversea(String str) {
        return !isCN(str);
    }

    public static boolean isRU(String str) {
        return "RU".equalsIgnoreCase(str);
    }

    public static boolean isUS(String str) {
        return "US".equalsIgnoreCase(str);
    }
}
