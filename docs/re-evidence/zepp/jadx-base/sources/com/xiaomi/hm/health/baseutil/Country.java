package com.xiaomi.hm.health.baseutil;

import com.huami.module.homepage.cards.business.healthstate.HealthStateCardView;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public final class Country {
    public static final String BR = "BR";

    public static boolean isBelarus() {
        return Locale.getDefault().getCountry().equals("BY") && Locale.getDefault().getLanguage().equals("be");
    }

    public static boolean isChina() {
        return Locale.getDefault().getLanguage().equals(Locale.CHINA.getLanguage()) && Locale.getDefault().getCountry().equals(Locale.CHINA.getCountry());
    }

    public static boolean isHK() {
        return Locale.getDefault().getLanguage().equals(Locale.CHINA.getLanguage()) && Locale.getDefault().getCountry().equals("HK");
    }

    public static boolean isRussia() {
        return Locale.getDefault().getCountry().equals("RU") && Locale.getDefault().getLanguage().equals(HealthStateCardView.LANGUAGE_RU);
    }

    public static boolean isSingapore() {
        return Locale.getDefault().getCountry().equals("SG") && Locale.getDefault().getLanguage().equals(Locale.US.getLanguage());
    }

    public static boolean isTW() {
        return Locale.getDefault().getLanguage().equals(Locale.TAIWAN.getLanguage()) && Locale.getDefault().getCountry().equals(Locale.TAIWAN.getCountry());
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
