package com.xiaomi.smarthome.core.server.internal.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.smarthome.core.server.internal.util.LocaleUtil;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class LocaleUtil {
    public static final String PRE_KEY_DEFAULT_COUNTRY = "default_country";
    public static final String PRE_KEY_DEFAULT_LANGUAGE = "default_language";
    private static final String TAG = "LocaleUtil";
    public static final Locale LOCALE_HK = new Locale("zh", ServerConstants.NEW_HK_COUNTRY_CODE);
    public static final Locale LOCALE_KO = new Locale("ko", ServerConstants.NEW_KR_COUNTRY_CODE);
    public static final Locale LOCALE_ES = new Locale("es", ServerConstants.ES_COUNTRY_CODE);
    public static final Locale LOCALE_RU = new Locale("ru", ServerConstants.NEW_RU_COUNTRY_CODE);
    public static final Locale LOCALE_POLAND = new Locale("pl", "PL");
    public static final Locale LOCALE_VIETNAM = new Locale("vi", "VN");
    public static final Locale LOCALE_THAILAND = new Locale("th", "TH");
    public static final Locale LOCALE_AR = new Locale("ar", "AE");
    public static final Locale LOCALE_INDONESIA = new Locale("in", ServerConstants.ID_COUNTRY_CODE);
    public static final Locale LOCALE_EN_GB = new Locale("en", ServerConstants.GB_COUNTRY_CODE);
    public static final Locale LOCALE_BRAZIL = new Locale("pt", Country.BR);
    public static final Locale LOCALE_TURKEY = new Locale("tr", "TR");
    public static final Locale LOCALE_NETHERLANDS = new Locale("nl", "NL");
    public static final Locale LOCALE_IW = new Locale("iw", "IL");
    public static final Locale LOCALE_EL = new Locale(Language.EL, "GR");
    public static final Locale LOCALE_CS = new Locale(Language.CS, "CZ");
    public static final Locale LOCALE_UK = new Locale("uk", "UA");
    public static final Locale LOCALE_HU = new Locale("hu", "HU");
    public static final Locale LOCALE_RO = new Locale(Language.RO, "RO");
    public static final Locale LOCALE_SV = new Locale(m.e, "SE");
    public static final Locale LOCALE_ES_US = new Locale("es", ServerConstants.NEW_US_TRUE_COUNTRY_CODE);
    public static final Locale LOCALE_PT_PT = new Locale("pt", "PT");
    public static final Locale LOCALE_SK = new Locale("sk", "SK");
    public static final Locale LOCALE_NB = new Locale("nb", "NO");
    public static final Locale LOCALE_FI = new Locale("fi", "FI");

    @NotNull
    public static Locale getCurrentLocale(Context context) {
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        return locale == null ? Locale.getDefault() : locale;
    }

    public static String getI18nString(JSONObject jSONObject, Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder();
        sb.append(language);
        sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        Locale locale2 = Locale.ENGLISH;
        sb.append(country.toUpperCase(locale2));
        String strOptString = jSONObject.optString(sb.toString());
        if (!TextUtils.isEmpty(strOptString)) {
            return strOptString;
        }
        String strOptString2 = jSONObject.optString(language + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + country.toLowerCase(locale2));
        if (!TextUtils.isEmpty(strOptString2)) {
            return strOptString2;
        }
        String strOptString3 = jSONObject.optString(language);
        if (!TextUtils.isEmpty(strOptString3)) {
            return strOptString3;
        }
        String strOptString4 = jSONObject.optString(locale.getISO3Language());
        if (!TextUtils.isEmpty(strOptString4)) {
            return strOptString4;
        }
        String strOptString5 = jSONObject.optString(country);
        return TextUtils.isEmpty(strOptString5) ? jSONObject.optString("en") : strOptString5;
    }

    public static String getLanguageName(Locale locale, JSONObject jSONObject) {
        return (String) getLanguageName(locale, jSONObject, new Callback() { // from class: zne
            @Override // com.xiaomi.smarthome.core.server.internal.util.Callback
            public final Object getItem(Object obj, String str) {
                return LocaleUtil.lambda$getLanguageName$0((JSONObject) obj, str);
            }
        });
    }

    public static String getNewCodeLocaleString(Locale locale) {
        return getString(locale);
    }

    public static String getString(Locale locale) {
        if (locale == null) {
            return "";
        }
        String language = locale.getLanguage();
        if (TextUtils.equals("iw", language)) {
            language = "he";
        } else if (TextUtils.equals("ji", language)) {
            language = "yi";
        } else if (TextUtils.equals("in", language)) {
            language = "id";
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country)) {
            return language;
        }
        return language + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + country;
    }

    public static String getStringShit(Locale locale) {
        String lowerCase = locale.getLanguage() == null ? "" : locale.getLanguage().toLowerCase();
        String lowerCase2 = locale.getCountry() != null ? locale.getCountry().toLowerCase() : "";
        if (TextUtils.equals("en", lowerCase) || TextUtils.equals("ko", lowerCase) || TextUtils.equals("ru", lowerCase) || TextUtils.equals("es", lowerCase) || TextUtils.equals("it", lowerCase) || TextUtils.equals("fr", lowerCase) || TextUtils.equals("id", lowerCase) || TextUtils.equals("de", lowerCase) || TextUtils.equals("pl", lowerCase) || TextUtils.equals("vi", lowerCase) || TextUtils.equals("ja", lowerCase) || TextUtils.equals("th", lowerCase) || TextUtils.equals("ar", lowerCase) || TextUtils.equals("he", lowerCase)) {
            return lowerCase;
        }
        if (TextUtils.equals("iw", lowerCase) && TextUtils.equals("il", lowerCase2)) {
            return "he";
        }
        if (TextUtils.equals("in", lowerCase) && TextUtils.equals("id", lowerCase2)) {
            return "id";
        }
        return lowerCase + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + locale.getCountry();
    }

    private static <T, E> T getZh(E e, Callback<T, E> callback, Locale locale, boolean z) {
        T item;
        if (localeEqual(locale, Locale.CHINA)) {
            return callback.getItem(e, z ? "zh_cn" : "zh_CN");
        }
        if (localeEqual(locale, Locale.TRADITIONAL_CHINESE)) {
            item = callback.getItem(e, z ? "zh_tw" : "zh_TW");
            if (item == null) {
                return callback.getItem(e, z ? "zh_cn" : "zh_CN");
            }
        } else {
            if (!localeEqual(locale, LOCALE_HK)) {
                String lowerCase = locale.getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + locale.getCountry();
                if (z) {
                    lowerCase = lowerCase.toLowerCase();
                }
                return callback.getItem(e, lowerCase);
            }
            item = callback.getItem(e, z ? "zh_hk" : "zh_HK");
            if (item == null) {
                return callback.getItem(e, z ? "zh_cn" : "zh_CN");
            }
        }
        return item;
    }

    public static boolean isChineseLocale(Context context) {
        return Locale.CHINA.toString().equalsIgnoreCase(Locale.getDefault().toString()) || Locale.CHINESE.toString().equalsIgnoreCase(Locale.getDefault().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getLanguageName$0(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString(str, null);
        if (strOptString == null && str != null) {
            jSONObject.optString(str.toLowerCase(), null);
        }
        if (strOptString == null && str != null) {
            jSONObject.optString(str.toUpperCase(), null);
        }
        return strOptString;
    }

    public static boolean localeEqual(Locale locale, Locale locale2) {
        if (locale == locale2) {
            return true;
        }
        if (locale == null || locale2 == null) {
            return false;
        }
        return locale.getLanguage().equalsIgnoreCase(locale2.getLanguage()) && locale.getCountry().equalsIgnoreCase(locale2.getCountry());
    }

    public static <E> E getLanguageName(Locale locale, Map<String, E> map) {
        return (E) getLanguageName(locale, map, new Callback() { // from class: yne
            @Override // com.xiaomi.smarthome.core.server.internal.util.Callback
            public final Object getItem(Object obj, String str) {
                return ((Map) obj).get(str);
            }
        });
    }

    public static <T, E> T getLanguageName(Locale locale, E e, Callback<T, E> callback) {
        T item = null;
        if (e == null) {
            return null;
        }
        try {
            item = (T) getZh(e, callback, locale, false);
            if (item == null && (item = (T) getZh(e, callback, locale, true)) == null) {
                String language = locale.getLanguage();
                StringBuilder sb = new StringBuilder();
                sb.append("CardItem.getLanguageName loading getLanguage:");
                sb.append(language);
                item = callback.getItem(e, language);
                if (item == null) {
                    String iSO3Language = locale.getISO3Language();
                    if (iSO3Language != null && !iSO3Language.equals(language)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CardItem.getLanguageName loading iso3Language:");
                        sb2.append(iSO3Language);
                        item = callback.getItem(e, iSO3Language);
                        if (item == null && iSO3Language.length() > 2) {
                            String strSubstring = iSO3Language.substring(0, 2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("CardItem.getLanguageName loading iso2Language:");
                            sb3.append(strSubstring);
                            item = callback.getItem(e, strSubstring);
                        }
                    }
                    if (item == null) {
                        String lowerCase = locale.getCountry().toLowerCase(Locale.ENGLISH);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("CardItem.getLanguageName loading country:");
                        sb4.append(lowerCase);
                        item = callback.getItem(e, lowerCase);
                        if (item == null) {
                            item = callback.getItem(e, "en");
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("CardItem.getLanguageName not match return default en:");
                            sb5.append(item);
                            return item;
                        }
                    }
                }
            }
        } catch (Exception e2) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("CardItem.getLanguageName error:");
            sb6.append(Log.getStackTraceString(e2));
        }
        return item;
    }
}
