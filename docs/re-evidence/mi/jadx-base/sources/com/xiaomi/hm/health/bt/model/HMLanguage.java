package com.xiaomi.hm.health.bt.model;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.wg;
import java.io.Serializable;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
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
    private int language;
    private String mLang = null;

    public HMLanguage(int i) {
        this.language = i;
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
        Locale localeA = wg.a(locale);
        return getLanguageCode(localeA) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + localeA.getCountry();
    }

    public String getLang() {
        return this.mLang;
    }

    public int getLanguage() {
        return this.language;
    }

    public void setLang(String str) {
        this.mLang = str;
    }

    public void setLanguage(int i) {
        this.language = i;
    }

    public String toString() {
        return "HMLanguage{language=" + this.language + ",mLang=" + this.mLang + AbstractJsonLexerKt.END_OBJ;
    }
}
