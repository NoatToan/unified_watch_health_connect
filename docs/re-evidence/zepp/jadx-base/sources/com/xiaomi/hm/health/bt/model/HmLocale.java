package com.xiaomi.hm.health.bt.model;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.alipay.sdk.m.s.a;
import com.huami.module.homepage.cards.business.healthstate.HealthStateCardView;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public enum HmLocale {
    SIMPLIFIED_CHINESE("CN", "zh", 0, "Hans"),
    TRADITIONAL_CHINESE("TW", "zh", 1, "Hant"),
    ENGLISH("US", "en", 2),
    SPANISH("ES", "es", 3),
    RUSSIAN("RU", HealthStateCardView.LANGUAGE_RU, 4),
    KOREAN("KR", "ko", 5),
    FRENCH("FR", "fr", 6),
    GERMAN("DE", "de", 7),
    INDONESIAN("ID", "id", 8),
    POLISH("PL", "pl", 9),
    ITALIAN("IT", "it", 10),
    JAPANESE("JP", "ja", 11),
    THAI("TH", "th", 12),
    ARABIC("", "ar", 13),
    VIETNAMESE("VN", "vi", 14),
    PORTUGUESE("PT", "pt", 15),
    DUTCH("NL", "nl", 16),
    TURKISH("TR", "tr", 17),
    UKRAINIAN("UA", "uk", 18),
    HEBREW("IL", "he", 19),
    BRAZILIAN_PORTUGUESE(Country.BR, "pt", 20),
    ROMANIAN("", Language.RO, 21),
    CZECH("CZ", Language.CS, 22),
    GREEK("GR", Language.EL, 23),
    Serbian("RS", "sr", 24, "Latn"),
    Catalan("ES", "ca", 25),
    Finnish("FI", "fi", 26),
    Norwegian("NO", "nb", 27),
    Danish("DK", Command.DISABLE, 28),
    Swedish("SE", a.r, 29),
    Hungarian("HU", "hu", 30),
    Malay("", "ms", 31),
    Slovak("SK", "sk", 32),
    Hindi("IN", "hi", 33);

    private static final String TAG = "HmLocale";
    private String country;
    private String lang;
    private int langCode;
    private String script;

    HmLocale(String country, String lang, int langCode) {
        this.script = "";
        this.lang = lang;
        this.country = country;
        this.langCode = langCode;
    }

    private static String a(HmLocale hmLocale, Boolean isDistinguishCountry) {
        StringBuilder sb = new StringBuilder();
        sb.append(hmLocale.lang);
        if (!TextUtils.isEmpty(hmLocale.script)) {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            sb.append(hmLocale.script);
        }
        if (!TextUtils.isEmpty(hmLocale.country) && isDistinguishCountry.booleanValue()) {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            sb.append(hmLocale.country);
        }
        return sb.toString();
    }

    @RequiresApi(api = 26)
    public static Locale calibrationChineseLocale(Locale locale) {
        if (!locale.equals(new Locale("zh", "TW")) && !locale.equals(new Locale("zh", "CN"))) {
            try {
                List<Locale.LanguageRange> list = Locale.LanguageRange.parse(locale.toLanguageTag());
                ArrayList arrayList = new ArrayList();
                arrayList.add(Locale.forLanguageTag("zh-CN"));
                arrayList.add(Locale.forLanguageTag("zh-Hans"));
                arrayList.add(Locale.forLanguageTag("zh-SG"));
                arrayList.add(Locale.forLanguageTag("zh-MY"));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Locale.forLanguageTag("zh-Hant"));
                arrayList2.add(Locale.forLanguageTag("zh-TW"));
                arrayList2.add(Locale.forLanguageTag("zh-HK"));
                arrayList2.add(Locale.forLanguageTag("zh-MO"));
                if (Locale.lookup(list, arrayList2) != null) {
                    return new Locale("zh", "TW");
                }
                if (Locale.lookup(list, arrayList) != null) {
                    return new Locale("zh", "CN");
                }
            } catch (Exception e) {
                Debug.fi(TAG, "LanguageTag: " + locale.toLanguageTag());
                Debug.fi(TAG, e.toString());
            }
        }
        return locale;
    }

    public static Locale correctionCountry(Locale locale) {
        Locale locale2 = Locale.getDefault();
        if (locale.getLanguage().equals(locale2.getLanguage()) && locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            return (Build.VERSION.SDK_INT < 21 || TextUtils.isEmpty(locale.getScript())) ? new Locale(locale.getLanguage(), locale2.getCountry()) : new Locale.Builder().setLanguage(locale.getLanguage()).setRegion(locale2.getCountry()).setScript(locale.getScript()).build();
        }
        return locale;
    }

    public static Locale getLocale(int langCode) throws Throwable {
        for (HmLocale hmLocale : values()) {
            if (langCode == hmLocale.langCode) {
                return (Build.VERSION.SDK_INT < 21 || TextUtils.isEmpty(hmLocale.script)) ? new Locale(hmLocale.lang, hmLocale.country) : new Locale.Builder().setLanguage(hmLocale.lang).setRegion(hmLocale.country).setScript(hmLocale.script).build();
            }
        }
        throw new Throwable("HmLocale: No support for HmLocale found");
    }

    public static Locale getLocaleWitchLanguageTag(int langCode, Boolean isDistinguishCountry) throws Throwable {
        for (HmLocale hmLocale : values()) {
            if (langCode == hmLocale.langCode) {
                return Build.VERSION.SDK_INT >= 21 ? new Locale.Builder().setLanguage(hmLocale.lang).setRegion(hmLocale.country).setScript(hmLocale.script).setLanguageTag(a(hmLocale, isDistinguishCountry)).build() : new Locale(hmLocale.lang, hmLocale.country);
            }
        }
        throw new Throwable("HmLocale: No support for HmLocale found");
    }

    public static Boolean isSimpleChinese(Locale locale) {
        if (!Locale.CHINESE.getLanguage().equals(locale.getLanguage()) || isTraditionalChinese(locale).booleanValue()) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                List<Locale.LanguageRange> list = Locale.LanguageRange.parse(locale.toLanguageTag());
                ArrayList arrayList = new ArrayList();
                arrayList.add(Locale.forLanguageTag("zh-CN"));
                arrayList.add(Locale.forLanguageTag("zh-Hans"));
                arrayList.add(Locale.forLanguageTag("zh-SG"));
                arrayList.add(Locale.forLanguageTag("zh-MY"));
                return Boolean.valueOf(Locale.lookup(list, arrayList) != null);
            } catch (Exception e) {
                Debug.fi(TAG, "LanguageTag: " + locale.toLanguageTag());
                Debug.fi(TAG, e.toString());
            }
        }
        if (Locale.SIMPLIFIED_CHINESE.getCountry().equals(locale.getCountry()) || "SG".equals(locale.getCountry()) || "MY".equals(locale.getCountry()) || TextUtils.isEmpty(locale.getCountry()) || (Build.VERSION.SDK_INT >= 21 && "Hans".equals(locale.getScript()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean isTraditionalChinese(Locale locale) {
        if (!Locale.CHINESE.getLanguage().equals(locale.getLanguage())) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                List<Locale.LanguageRange> list = Locale.LanguageRange.parse(locale.toLanguageTag());
                ArrayList arrayList = new ArrayList();
                arrayList.add(Locale.forLanguageTag("zh-Hant"));
                arrayList.add(Locale.forLanguageTag("zh-TW"));
                arrayList.add(Locale.forLanguageTag("zh-HK"));
                arrayList.add(Locale.forLanguageTag("zh-MO"));
                return Boolean.valueOf(Locale.lookup(list, arrayList) != null);
            } catch (Exception e) {
                Debug.fi(TAG, "LanguageTag: " + locale.toLanguageTag());
                Debug.fi(TAG, e.toString());
            }
        }
        if (locale.getCountry().equals(Locale.TRADITIONAL_CHINESE.getCountry()) || "HK".equals(locale.getCountry()) || "MO".equals(locale.getCountry()) || (Build.VERSION.SDK_INT >= 21 && "Hant".equals(locale.getScript()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public String getCountry() {
        return this.country;
    }

    public String getLang() {
        return this.lang;
    }

    public int getLangCode() {
        return this.langCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setLangCode(int langCode) {
        this.langCode = langCode;
    }

    HmLocale(String country, String lang, int langCode, String script) {
        this.script = "";
        this.lang = lang;
        this.country = country;
        this.langCode = langCode;
        this.script = script;
    }
}
