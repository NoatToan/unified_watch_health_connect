package ohos.ace.plugin.i18nplugin;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.icu.text.NumberingSystem;
import android.os.LocaleList;
import android.text.format.DateFormat;
import android.util.Log;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes46.dex */
public class I18NPlugin {
    private static final String KEY_LANGUAGE = "app_language";
    private static final String LANGUAGE_SHARE_PREFERENCE = "language_prefs";
    private static final String LOG_TAG = "I18NPlugin";
    private static final Map<String, String> localDigitMap = new HashMap<String, String>() { // from class: ohos.ace.plugin.i18nplugin.I18NPlugin.1
        {
            put("ar", "arab");
            put("as", "beng");
            put("bn", "beng");
            put("fa", "arabext");
            put("mr", "deva");
            put("my", "mymr");
            put("ne", "deva");
            put(Constants.URDU_LANG, "latn");
        }
    };
    private static I18NSetAppPreferredLanguage mRestartFunc;
    private Context mContext;

    protected native void nativeInit();

    public I18NPlugin(Context context) {
        this.mContext = context;
        nativeInit();
    }

    public boolean is24HourClock() {
        Context context = this.mContext;
        if (context == null) {
            Log.e(LOG_TAG, "I18NPlugin: context not registered");
            return true;
        }
        return DateFormat.is24HourFormat(context);
    }

    public String getSystemLocale() {
        Locale systemLocaleCompat = getSystemLocaleCompat();
        String str = "";
        if (systemLocaleCompat != null) {
            str = "" + systemLocaleCompat.getLanguage();
            if (systemLocaleCompat.getScript().length() > 0) {
                str = str + Constants.LINK + systemLocaleCompat.getScript();
            }
            if (systemLocaleCompat.getCountry().length() > 0) {
                return str + Constants.LINK + systemLocaleCompat.getCountry();
            }
        }
        return str;
    }

    public String getSystemLanguage() {
        Locale systemLocaleCompat = getSystemLocaleCompat();
        String str = "";
        if (systemLocaleCompat != null) {
            str = "" + systemLocaleCompat.getLanguage();
            if (systemLocaleCompat.getScript().length() > 0) {
                return str + Constants.LINK + systemLocaleCompat.getScript();
            }
        }
        return str;
    }

    public String getSystemRegion() {
        Locale systemLocaleCompat = getSystemLocaleCompat();
        if (systemLocaleCompat == null) {
            return "";
        }
        return systemLocaleCompat.getCountry();
    }

    public String getSystemTimezone() {
        return TimeZone.getDefault().getID();
    }

    public String getAppPreferredLanguage() {
        Context context = this.mContext;
        if (context == null) {
            Log.w(LOG_TAG, "I18NPlugin: context not registered");
            return getSystemLocale();
        }
        String string = context.getSharedPreferences(LANGUAGE_SHARE_PREFERENCE, 0).getString(KEY_LANGUAGE, null);
        return (string == null || string.isEmpty()) ? getSystemLocale() : string;
    }

    public void setAppPreferredLanguage(String str) {
        Context context = this.mContext;
        if (context == null) {
            Log.w(LOG_TAG, "I18NPlugin: context not registered");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(LANGUAGE_SHARE_PREFERENCE, 0).edit();
        editorEdit.putString(KEY_LANGUAGE, str);
        editorEdit.commit();
        I18NSetAppPreferredLanguage i18NSetAppPreferredLanguage = mRestartFunc;
        if (i18NSetAppPreferredLanguage != null) {
            i18NSetAppPreferredLanguage.restartApp();
        }
    }

    public static void setRestartFunc(I18NSetAppPreferredLanguage i18NSetAppPreferredLanguage) {
        mRestartFunc = i18NSetAppPreferredLanguage;
    }

    public static void clearRestartFunc() {
        mRestartFunc = null;
    }

    private Locale getSystemLocaleCompat() {
        return Resources.getSystem().getConfiguration().getLocales().get(0);
    }

    public String[] getSystemLanguages() {
        Locale[] availableLocales = Locale.getAvailableLocales();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < availableLocales.length; i++) {
            if (availableLocales[i] != null) {
                String str = "" + availableLocales[i].getLanguage();
                if (availableLocales[i].getScript().length() > 0) {
                    str = str + Constants.LINK + availableLocales[i].getScript();
                }
                linkedHashSet.add(str);
            }
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public String[] getAvailableIDs() {
        return TimeZone.getAvailableIDs();
    }

    public String[] getSystemCountries(String str) {
        Locale[] availableLocales = Locale.getAvailableLocales();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < availableLocales.length; i++) {
            Locale locale = availableLocales[i];
            if (locale != null && locale.getCountry() != null && !availableLocales[i].getCountry().isEmpty() && !availableLocales[i].getCountry().matches("\\d{3}")) {
                if (str == null || str.isEmpty()) {
                    linkedHashSet.add(availableLocales[i].getCountry().toUpperCase(Locale.ROOT));
                } else if (availableLocales[i].getLanguage().toUpperCase(Locale.ROOT).equals(str.toUpperCase(Locale.ROOT))) {
                    linkedHashSet.add(availableLocales[i].getCountry().toUpperCase(Locale.ROOT));
                }
            }
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    private boolean checkParamValid(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    private boolean checkLocaleValid(Locale locale) {
        return (locale == null || locale.getLanguage() == null || locale.getLanguage().isEmpty() || locale.getCountry() == null || locale.getCountry().isEmpty()) ? false : true;
    }

    public boolean isSuggested(String str, String str2) {
        if (!checkParamValid(str)) {
            return false;
        }
        if (!checkParamValid(str2)) {
            Locale systemLocaleCompat = getSystemLocaleCompat();
            if (systemLocaleCompat == null) {
                return false;
            }
            str2 = systemLocaleCompat.getCountry();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i = 0; i < availableLocales.length; i++) {
            if (checkLocaleValid(availableLocales[i]) && availableLocales[i].getCountry().equals(str2) && availableLocales[i].getLanguage().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String[] getPreferredLanguageList() {
        LocaleList localeList = LocaleList.getDefault();
        String[] strArr = new String[localeList.size()];
        for (int i = 0; i < localeList.size(); i++) {
            if (localeList.get(i) != null) {
                String str = "" + localeList.get(i).getLanguage();
                if (localeList.get(i).getScript().length() > 0) {
                    str = str + Constants.LINK + localeList.get(i).getScript();
                }
                strArr[i] = str;
            }
        }
        return strArr;
    }

    public String getFirstPreferredLanguage() {
        LocaleList localeList = LocaleList.getDefault();
        String[] strArr = new String[localeList.size()];
        for (int i = 0; i < localeList.size(); i++) {
            if (localeList.get(i) != null) {
                String str = "" + localeList.get(i).getLanguage();
                if (localeList.get(i).getScript().length() <= 0) {
                    return str;
                }
                return str + Constants.LINK + localeList.get(i).getScript();
            }
        }
        return "";
    }

    public boolean getUsingLocalDigit() {
        NumberingSystem numberingSystem;
        Locale systemLocaleCompat = getSystemLocaleCompat();
        if (systemLocaleCompat == null) {
            return false;
        }
        Map<String, String> map = localDigitMap;
        if (!map.containsKey(systemLocaleCompat.getLanguage()) || (numberingSystem = NumberingSystem.getInstance(systemLocaleCompat)) == null) {
            return false;
        }
        return map.get(systemLocaleCompat.getLanguage()).equals(numberingSystem.getName());
    }
}
