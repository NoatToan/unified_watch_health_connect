package com.xiaomi.hm.health.baseutil;

import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class Country {
    public static final String BR = "BR";

    public static boolean isBelarus() {
        return Locale.getDefault().getCountry().equals("BY") && Locale.getDefault().getLanguage().equals("be");
    }

    public static boolean isChina() {
        String language = Locale.getDefault().getLanguage();
        Locale locale = Locale.CHINA;
        return language.equals(locale.getLanguage()) && Locale.getDefault().getCountry().equals(locale.getCountry());
    }

    public static boolean isHK() {
        return Locale.getDefault().getLanguage().equals(Locale.CHINA.getLanguage()) && Locale.getDefault().getCountry().equals(ServerConstants.NEW_HK_COUNTRY_CODE);
    }

    public static boolean isRussia() {
        return Locale.getDefault().getCountry().equals(ServerConstants.NEW_RU_COUNTRY_CODE) && Locale.getDefault().getLanguage().equals("ru");
    }

    public static boolean isSingapore() {
        return Locale.getDefault().getCountry().equals(ServerConstants.NEW_SG_COUNTRY_CODE) && Locale.getDefault().getLanguage().equals(Locale.US.getLanguage());
    }

    public static boolean isTW() {
        String language = Locale.getDefault().getLanguage();
        Locale locale = Locale.TAIWAN;
        return language.equals(locale.getLanguage()) && Locale.getDefault().getCountry().equals(locale.getCountry());
    }

    public static boolean isUS() {
        String language = Locale.getDefault().getLanguage();
        Locale locale = Locale.US;
        return language.equals(locale.getLanguage()) && Locale.getDefault().getCountry().equals(locale.getCountry());
    }

    public static boolean isUkraine() {
        return Locale.getDefault().getCountry().equals("UA") && Locale.getDefault().getLanguage().equals("uk");
    }
}
