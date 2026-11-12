package com.xiaomi.hm.health.baseutil;

import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public class Language {
    public static String AR = "ar";
    public static final String CS = "cs";
    public static final String EL = "el";
    public static String ES = "es";
    public static String HE = "he";
    private static final String HK = "HK";
    public static String IN = "in";
    public static String NL = "nl";
    public static String PL = "pl";
    public static String PT = "pt";
    public static final String RO = "ro";
    public static String RU = "ru";
    public static String TH = "th";
    public static String TR = "tr";
    public static String UK = "uk";
    public static String VI = "vi";

    private static boolean compatibleHarmonyOS() {
        String str = Build.BRAND;
        return ("HUAWEI".equals(str) || "HONOR".equals(str)) && Locale.getDefault().toLanguageTag().startsWith("zh-Hans");
    }

    private static boolean compatibleHuawei() {
        if (Build.VERSION.SDK_INT >= 28 && "HUAWEI".equals(Build.BRAND.toUpperCase(Locale.getDefault()))) {
            return Locale.getDefault().getDisplayName().contains("简体中文");
        }
        return true;
    }

    public static String getDefault() {
        return Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry();
    }

    public static boolean isArabic() {
        return Locale.getDefault().getLanguage().equals(AR);
    }

    public static boolean isChinese() {
        return Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage());
    }

    public static boolean isChineseOrEng() {
        return isChinese() || isEnglish();
    }

    public static boolean isEnglish() {
        return Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    public static boolean isFrench() {
        return Locale.getDefault().getLanguage().equals(Locale.FRENCH.getLanguage());
    }

    public static boolean isGerman() {
        return Locale.getDefault().getLanguage().equals(Locale.GERMAN.getLanguage());
    }

    public static boolean isGreek() {
        return EL.equals(Locale.getDefault().getLanguage());
    }

    public static boolean isHarmonyOs() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Object objInvoke = cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return "harmony".equalsIgnoreCase(objInvoke.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isHebrew() {
        return Locale.getDefault().getLanguage().equals(HE);
    }

    public static boolean isIndonesian() {
        return Locale.getDefault().getLanguage().equals(IN);
    }

    public static boolean isItalian() {
        return Locale.getDefault().getLanguage().equals(Locale.ITALIAN.getLanguage());
    }

    public static boolean isJapanese() {
        return Locale.getDefault().getLanguage().equals(Locale.JAPANESE.getLanguage());
    }

    public static boolean isKorean() {
        return Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage());
    }

    public static boolean isNederlandse() {
        return Locale.getDefault().getLanguage().equals(NL);
    }

    public static boolean isPolish() {
        return Locale.getDefault().getLanguage().equals(PL);
    }

    public static boolean isPortuguese() {
        return Locale.getDefault().getLanguage().equals(PT);
    }

    @Deprecated
    public static boolean isRomanian() {
        return Locale.getDefault().getLanguage().equals(RO);
    }

    public static boolean isRussia() {
        return Locale.getDefault().getLanguage().equals(RU);
    }

    public static boolean isSimplifiedChinese() {
        if (isHarmonyOs()) {
            return "zh_CN_#Hans".equals(Locale.getDefault().toString());
        }
        return (Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage()) && (Locale.getDefault().getCountry().equals(Locale.SIMPLIFIED_CHINESE.getCountry()) || TextUtils.isEmpty(Locale.getDefault().getCountry()))) || ((Locale.getDefault() == Locale.SIMPLIFIED_CHINESE || "zh_CN_#Hans".equals(Locale.getDefault().toString()) || compatibleHarmonyOS()) && compatibleHuawei());
    }

    public static boolean isSpainish() {
        return Locale.getDefault().getLanguage().equals(ES);
    }

    public static boolean isThai() {
        return Locale.getDefault().getLanguage().equals(TH);
    }

    public static boolean isTraditionalChinese() {
        return Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage()) && (Locale.getDefault().getCountry().equals(Locale.TRADITIONAL_CHINESE.getCountry()) || Locale.getDefault().getCountry().equals("HK"));
    }

    public static boolean isTurkish() {
        return Locale.getDefault().getLanguage().equals(TR);
    }

    public static boolean isUSA() {
        String language = Locale.getDefault().getLanguage();
        Locale locale = Locale.US;
        return language.equals(locale.getLanguage()) && Locale.getDefault().getCountry().equals(locale.getCountry());
    }

    public static boolean isUkrainian() {
        return Locale.getDefault().getLanguage().equals(UK);
    }

    public static boolean isVietnamese() {
        return Locale.getDefault().getLanguage().equals(VI);
    }
}
