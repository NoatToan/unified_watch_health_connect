package com.mapbox.maps.extension.localization;

import com.mapbox.maps.MapboxLogger;
import d53.u;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013\"\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001b"}, d2 = {"NAME", "", "NAME_AR", "NAME_DE", "NAME_EN", "NAME_ES", "NAME_FR", "NAME_IT", "NAME_JA", "NAME_KO", "NAME_PT", "NAME_RU", "NAME_VI", "NAME_ZH", "NAME_ZH_HANS", "NAME_ZH_HANT", "TAG", "supportedV7", "", "[Ljava/lang/String;", "supportedV8", "getLanguageNameV7", "locale", "Ljava/util/Locale;", "getLanguageNameV8", "isSupportedLanguage", "", "extension-localization_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SupportedLanguagesKt {
    public static final String NAME = "name";
    private static final String TAG = "Localization";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String NAME_ES = "name_es";
    public static final String NAME_FR = "name_fr";
    public static final String NAME_DE = "name_de";
    public static final String NAME_PT = "name_pt";
    public static final String NAME_RU = "name_ru";
    public static final String NAME_JA = "name_ja";
    public static final String NAME_KO = "name_ko";
    public static final String NAME_ZH = "name_zh";
    public static final String NAME_ZH_HANS = "name_zh-Hans";
    private static final String[] supportedV7 = {"name", NAME_AR, NAME_EN, NAME_ES, NAME_FR, NAME_DE, NAME_PT, NAME_RU, NAME_JA, NAME_KO, NAME_ZH, NAME_ZH_HANS};
    public static final String NAME_IT = "name_it";
    public static final String NAME_ZH_HANT = "name_zh-Hant";
    public static final String NAME_VI = "name_vi";
    private static final String[] supportedV8 = {"name", NAME_AR, NAME_EN, NAME_ES, NAME_FR, NAME_DE, NAME_IT, NAME_PT, NAME_RU, NAME_JA, NAME_KO, NAME_ZH_HANS, NAME_ZH_HANT, NAME_VI};

    public static final String getLanguageNameV7(Locale locale) {
        locale.getClass();
        String language = locale.getLanguage();
        language.getClass();
        if (u.y(language, "zh", false)) {
            return (locale.equals(Locale.SIMPLIFIED_CHINESE) || s.g(locale.getScript(), "Hans")) ? NAME_ZH_HANS : NAME_ZH;
        }
        String str = "name_" + locale.getLanguage();
        if (!p13.u.z(supportedV7, str)) {
            MapboxLogger.logW(TAG, "Language " + locale.getDisplayLanguage() + " is not supported in the current style");
        }
        return str;
    }

    public static final String getLanguageNameV8(Locale locale) {
        locale.getClass();
        String language = locale.getLanguage();
        language.getClass();
        if (u.y(language, "zh", false)) {
            return (locale.equals(Locale.TAIWAN) || s.g(locale.getScript(), "Hant")) ? NAME_ZH_HANT : NAME_ZH_HANS;
        }
        String str = "name_" + locale.getLanguage();
        if (!p13.u.z(supportedV8, str)) {
            MapboxLogger.logW(TAG, "Language " + locale.getDisplayLanguage() + " is not supported in the current style");
        }
        return str;
    }

    public static final boolean isSupportedLanguage(String str) {
        str.getClass();
        return p13.u.z(supportedV7, str) || p13.u.z(supportedV8, str);
    }
}
