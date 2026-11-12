package com.zoontek.rnlocalize;

import android.icu.number.NumberFormatter;
import android.icu.util.MeasureUnit;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.o8j;
import defpackage.vne;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001d\u0010\u0011\u001a\n \u0012*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\"\u001a\u00020\u0005J\u000e\u0010#\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010%\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010&\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010'\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/zoontek/rnlocalize/RNLocalizeModuleImpl;", "", "<init>", "()V", "NAME", "", "USES_FAHRENHEIT", "", "USES_IMPERIAL", "createLanguageTag", "languageCode", "scriptCode", "countryCode", "getCountryCodeForLocale", "locale", "Ljava/util/Locale;", "getCurrencyCodeForLocale", "getLanguageCodeForLocale", "kotlin.jvm.PlatformType", "(Ljava/util/Locale;)Ljava/lang/String;", "getScriptCodeForLocale", "getSystemLocale", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getSystemLocales", "getMiuiRegionCode", "getCalendar", "getCountry", "getCurrencies", "Lcom/facebook/react/bridge/WritableArray;", "getLocales", "getNumberFormatSettings", "Lcom/facebook/react/bridge/WritableMap;", "getTemperatureUnit", "getTimeZone", "uses24HourClock", "", "usesMetricSystem", "usesAutoDateAndTime", "usesAutoTimeZone", "react-native-localize_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRNLocalizeModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNLocalizeModuleImpl.kt\ncom/zoontek/rnlocalize/RNLocalizeModuleImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1#2:223\n1863#3,2:224\n*S KotlinDebug\n*F\n+ 1 RNLocalizeModuleImpl.kt\ncom/zoontek/rnlocalize/RNLocalizeModuleImpl\n*L\n129#1:224,2\n*E\n"})
public final class RNLocalizeModuleImpl {

    @NotNull
    public static final String NAME = "RNLocalize";

    @NotNull
    public static final RNLocalizeModuleImpl INSTANCE = new RNLocalizeModuleImpl();

    @NotNull
    private static final List<String> USES_FAHRENHEIT = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"BS", "BZ", "KY", "PR", "PW", ServerConstants.NEW_US_TRUE_COUNTRY_CODE});

    @NotNull
    private static final List<String> USES_IMPERIAL = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"LR", "MM", ServerConstants.NEW_US_TRUE_COUNTRY_CODE});

    private RNLocalizeModuleImpl() {
    }

    private final String createLanguageTag(String languageCode, String scriptCode, String countryCode) {
        StringBuilder sb = new StringBuilder();
        sb.append(languageCode);
        if (scriptCode.length() > 0) {
            sb.append("-" + scriptCode);
        }
        sb.append("-" + countryCode);
        return sb.toString();
    }

    private final String getCountryCodeForLocale(Locale locale) {
        try {
            String country = locale.getCountry();
            if (Intrinsics.areEqual(country, "419")) {
                return "UN";
            }
            Intrinsics.checkNotNull(country);
            if (country.length() <= 0) {
                return "";
            }
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            String upperCase = country.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        } catch (Exception unused) {
            return "";
        }
    }

    private final String getCurrencyCodeForLocale(Locale locale) {
        String currencyCode;
        try {
            Currency currency = Currency.getInstance(locale);
            return (currency == null || (currencyCode = currency.getCurrencyCode()) == null) ? "" : currencyCode;
        } catch (Exception unused) {
            return "";
        }
    }

    private final String getLanguageCodeForLocale(Locale locale) {
        String language = locale.getLanguage();
        if (language == null) {
            return language;
        }
        int iHashCode = language.hashCode();
        if (iHashCode == 3365) {
            return !language.equals("in") ? language : "id";
        }
        if (iHashCode != 3374) {
            return (iHashCode == 3391 && language.equals("ji")) ? "yi" : language;
        }
        return !language.equals("iw") ? language : "he";
    }

    private final String getMiuiRegionCode() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class).invoke(cls, "ro.miui.region");
            Objects.requireNonNull(objInvoke);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Exception unused) {
            return "";
        }
    }

    private final String getScriptCodeForLocale(Locale locale) {
        String script = locale.getScript();
        return script.length() == 0 ? "" : script;
    }

    private final Locale getSystemLocale(ReactApplicationContext reactContext) {
        Locale locale = reactContext.getResources().getConfiguration().getLocales().get(0);
        Intrinsics.checkNotNullExpressionValue(locale, "get(...)");
        return locale;
    }

    private final List<Locale> getSystemLocales(ReactApplicationContext reactContext) {
        reactContext.getResources().getConfiguration();
        vne vneVarC = vne.c();
        Intrinsics.checkNotNullExpressionValue(vneVarC, "getDefault(...)");
        int iD = vneVarC.d();
        ArrayList arrayList = new ArrayList(iD);
        for (int i = 0; i < iD; i++) {
            Locale localeB = vneVarC.b(i);
            Intrinsics.checkNotNull(localeB);
            arrayList.add(localeB);
        }
        return arrayList;
    }

    @NotNull
    public final String getCalendar() {
        return "gregorian";
    }

    @NotNull
    public final String getCountry(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        String miuiRegionCode = getMiuiRegionCode();
        String countryCodeForLocale = getCountryCodeForLocale(getSystemLocale(reactContext));
        if (miuiRegionCode.length() > 0) {
            return miuiRegionCode;
        }
        return countryCodeForLocale.length() == 0 ? ServerConstants.NEW_US_TRUE_COUNTRY_CODE : countryCodeForLocale;
    }

    @NotNull
    public final WritableArray getCurrencies(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List<Locale> systemLocales = getSystemLocales(reactContext);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<T> it = systemLocales.iterator();
        while (it.hasNext()) {
            String currencyCodeForLocale = INSTANCE.getCurrencyCodeForLocale((Locale) it.next());
            if (currencyCodeForLocale.length() > 0 && linkedHashSet.add(currencyCodeForLocale)) {
                writableArrayCreateArray.pushString(currencyCodeForLocale);
            }
        }
        if (writableArrayCreateArray.size() == 0) {
            writableArrayCreateArray.pushString("USD");
        }
        Intrinsics.checkNotNull(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    @NotNull
    public final WritableArray getLocales(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List<Locale> systemLocales = getSystemLocales(reactContext);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        String country = getCountry(reactContext);
        for (Locale locale : systemLocales) {
            String languageCodeForLocale = getLanguageCodeForLocale(locale);
            String scriptCodeForLocale = getScriptCodeForLocale(locale);
            String countryCodeForLocale = getCountryCodeForLocale(locale);
            if (countryCodeForLocale.length() == 0) {
                countryCodeForLocale = country;
            }
            Intrinsics.checkNotNull(languageCodeForLocale);
            Intrinsics.checkNotNull(scriptCodeForLocale);
            String strCreateLanguageTag = createLanguageTag(languageCodeForLocale, scriptCodeForLocale, countryCodeForLocale);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("languageCode", languageCodeForLocale);
            writableMapCreateMap.putString("countryCode", countryCodeForLocale);
            writableMapCreateMap.putString("languageTag", strCreateLanguageTag);
            writableMapCreateMap.putBoolean("isRTL", TextUtils.getLayoutDirectionFromLocale(locale) == 1);
            if (scriptCodeForLocale.length() > 0) {
                writableMapCreateMap.putString("scriptCode", scriptCodeForLocale);
            }
            if (linkedHashSet.add(strCreateLanguageTag)) {
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
        }
        Intrinsics.checkNotNull(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    @NotNull
    public final WritableMap getNumberFormatSettings(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(getSystemLocale(reactContext));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("decimalSeparator", String.valueOf(decimalFormatSymbols.getDecimalSeparator()));
        writableMapCreateMap.putString("groupingSeparator", String.valueOf(decimalFormatSymbols.getGroupingSeparator()));
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    @NotNull
    public final String getTemperatureUnit(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Build.VERSION.SDK_INT >= 33) {
            String identifier = o8j.a(o8j.a(NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(getSystemLocale(reactContext)).format(1L).getOutputUnit().getIdentifier();
            Intrinsics.checkNotNull(identifier);
            if (!StringsKt__StringsJVMKt.startsWith$default(identifier, "fahrenhe", false, 2, null)) {
                return "celsius";
            }
        } else if (!USES_FAHRENHEIT.contains(getCountry(reactContext))) {
            return "celsius";
        }
        return "fahrenheit";
    }

    @NotNull
    public final String getTimeZone() {
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "getID(...)");
        return id;
    }

    public final boolean uses24HourClock(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return DateFormat.is24HourFormat(reactContext);
    }

    public final boolean usesAutoDateAndTime(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return Settings.Global.getInt(reactContext.getContentResolver(), "auto_time", 0) != 0;
    }

    public final boolean usesAutoTimeZone(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return Settings.Global.getInt(reactContext.getContentResolver(), "auto_time_zone", 0) != 0;
    }

    public final boolean usesMetricSystem(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return !USES_IMPERIAL.contains(getCountry(reactContext));
    }
}
