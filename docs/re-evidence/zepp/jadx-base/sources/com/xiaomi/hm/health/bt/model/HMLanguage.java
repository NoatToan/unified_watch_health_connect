package com.xiaomi.hm.health.bt.model;

import android.os.Build;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class HMLanguage implements Serializable {
    public static final int LANG_AR = 13;
    public static final int LANG_CA_ES = 25;
    public static final int LANG_CS = 22;
    public static final int LANG_DA = 28;
    public static final int LANG_DE = 7;
    public static final int LANG_EL = 23;
    public static final int LANG_ENGLISH = 2;
    public static final int LANG_FI = 26;
    public static final int LANG_FR = 6;
    public static final int LANG_HE = 19;
    public static final int LANG_HI = 33;
    public static final int LANG_HU = 30;
    public static final int LANG_IN = 8;
    public static final int LANG_IT = 10;
    public static final int LANG_JA = 11;
    public static final int LANG_KO = 5;
    public static final int LANG_MS = 31;
    public static final int LANG_NL = 16;
    public static final int LANG_NO = 27;
    public static final int LANG_PL = 9;
    public static final int LANG_PT = 15;
    public static final int LANG_PT_BR = 20;
    public static final int LANG_RO = 21;
    public static final int LANG_RUSSIA = 4;
    public static final int LANG_SIMPLE_CHINESE = 0;
    public static final int LANG_SK = 32;
    public static final int LANG_SPAINISH = 3;
    public static final int LANG_SR_LATN_RS = 24;
    public static final int LANG_SV = 29;
    public static final int LANG_TH = 12;
    public static final int LANG_TR = 17;
    public static final int LANG_TRADITIONAL_CHINESE = 1;
    public static final int LANG_UK = 18;
    public static final int LANG_VI = 14;
    private static final long serialVersionUID = 1;
    private int a;
    private String b = null;

    public HMLanguage(int language) {
        this.a = 0;
        this.a = language;
    }

    public static String getLanguageCode(Locale locale) {
        String language = locale.getLanguage();
        if (language.equalsIgnoreCase("IW")) {
            return "he";
        }
        if (language.equalsIgnoreCase("IN")) {
            return "id";
        }
        return language.equalsIgnoreCase("JI") ? "yi" : language;
    }

    public static String getLanguageStr(Locale locale) {
        if (Build.VERSION.SDK_INT >= 26) {
            locale = HmLocale.calibrationChineseLocale(locale);
        }
        return getLanguageCode(locale) + "_" + locale.getCountry();
    }

    public String getLang() {
        return this.b;
    }

    public int getLanguage() {
        return this.a;
    }

    public void setLang(String language) {
        this.b = language;
    }

    public void setLanguage(int language) {
        this.a = language;
    }

    public String toString() {
        return "HMLanguage{language=" + this.a + ",mLang=" + this.b + '}';
    }
}
