package com.xiaomi.fitness.common.utils;

import android.text.TextUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0006\u0010\u0018\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0005J\b\u0010\u001c\u001a\u00020\u0014H\u0007J\u0006\u0010\u001d\u001a\u00020\u0014J\u0006\u0010\u001e\u001a\u00020\u0014J\u0006\u0010\u001f\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/common/utils/LocaleUtil;", "", "<init>", "()V", "PROFILE_KEY_FOR_LOCALE", "", "COUNTRY_CODE_KR", "COUNTRY_CODE_TR", "COUNTRY_LNGUAGE_CN", "currentLocale", "getCurrentLocale$annotations", "getCurrentLocale", "()Ljava/lang/String;", "currentLocalNewISOCodes", "getCurrentLocalNewISOCodes", "currentRegion", "getCurrentRegion", "currentCountyCode", "getCurrentCountyCode", "countryLowerCase", "", "newISOCodes", "convertNewISOCodes", "language", "isTR", "isSameCountry", "country", "isSameLanguage", "isCN", "isChinese", "isSimplifiedChinese", "isTraditionalChinese", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocaleUtil {

    @NotNull
    public static final String COUNTRY_CODE_KR = "kr";

    @NotNull
    public static final String COUNTRY_CODE_TR = "tr";

    @NotNull
    private static final String COUNTRY_LNGUAGE_CN = "zh";

    @NotNull
    public static final LocaleUtil INSTANCE = new LocaleUtil();

    @NotNull
    public static final String PROFILE_KEY_FOR_LOCALE = "locale";

    private LocaleUtil() {
    }

    private final String convertNewISOCodes(String language) {
        int iHashCode = language.hashCode();
        if (iHashCode != 3365) {
            if (iHashCode != 3374) {
                if (iHashCode == 3391 && language.equals("ji")) {
                    return "yi";
                }
            } else if (language.equals("iw")) {
                return "he";
            }
        } else if (language.equals("in")) {
            return "id";
        }
        return language;
    }

    @NotNull
    public static final String getCurrentLocale() {
        return INSTANCE.getCurrentLocale(true, false);
    }

    @JvmStatic
    public static /* synthetic */ void getCurrentLocale$annotations() {
    }

    public static /* synthetic */ String getCurrentLocale$default(LocaleUtil localeUtil, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return localeUtil.getCurrentLocale(z, z2);
    }

    @JvmStatic
    public static final boolean isCN() {
        String lowerCase = getCurrentLocale$default(INSTANCE, false, false, 3, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt__StringsJVMKt.startsWith$default(lowerCase, COUNTRY_LNGUAGE_CN, false, 2, null);
    }

    @NotNull
    public final String getCurrentCountyCode() {
        Locale locale = Locale.getDefault();
        if (TextUtils.isEmpty(locale.getLanguage())) {
            return ServerConstants.NEW_CN_COUNTRY_CODE;
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country)) {
            return ServerConstants.NEW_CN_COUNTRY_CODE;
        }
        Intrinsics.checkNotNull(country);
        return country;
    }

    @NotNull
    public final String getCurrentLocalNewISOCodes() {
        return getCurrentLocale(true, true);
    }

    @NotNull
    public final String getCurrentRegion() {
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = country.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final boolean isChinese() {
        return isSimplifiedChinese() || isTraditionalChinese();
    }

    public final boolean isSameCountry(@NotNull String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        return StringsKt__StringsJVMKt.equals(country, getCurrentCountyCode(), true);
    }

    public final boolean isSameLanguage(@NotNull String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        return StringsKt__StringsJVMKt.equals(language, Locale.getDefault().getLanguage(), true);
    }

    public final boolean isSimplifiedChinese() {
        return isSameCountry("cn") && isSameLanguage(COUNTRY_LNGUAGE_CN);
    }

    public final boolean isTR() {
        return isSameCountry("tr");
    }

    public final boolean isTraditionalChinese() {
        return Intrinsics.areEqual(Locale.TRADITIONAL_CHINESE, Locale.getDefault());
    }

    @NotNull
    public final String getCurrentLocale(boolean countryLowerCase, boolean newISOCodes) {
        String upperCase;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return countryLowerCase ? "zh_cn" : "zh_CN";
        }
        String country = locale.getCountry();
        Intrinsics.checkNotNull(language);
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = language.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (TextUtils.isEmpty(country)) {
            return newISOCodes ? convertNewISOCodes(lowerCase) : lowerCase;
        }
        if (newISOCodes) {
            lowerCase = convertNewISOCodes(lowerCase);
        }
        if (countryLowerCase) {
            Intrinsics.checkNotNull(country);
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            upperCase = country.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toLowerCase(...)");
        } else {
            Intrinsics.checkNotNull(country);
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            upperCase = country.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        }
        return lowerCase + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + upperCase;
    }
}
