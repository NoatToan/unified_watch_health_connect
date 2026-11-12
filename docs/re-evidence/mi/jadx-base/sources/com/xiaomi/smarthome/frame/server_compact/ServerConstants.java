package com.xiaomi.smarthome.frame.server_compact;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerConstants {
    public static final String ES_COUNTRY_CODE = "ES";
    public static final String FR_COUNTRY_CODE = "FR";
    public static final String GB_COUNTRY_CODE = "GB";
    public static final String ID_COUNTRY_CODE = "ID";
    public static final String IT_COUNTRY_CODE = "IT";
    public static final String NEW_CN_MACHINE_CODE = "cn";
    public static final String NEW_DE_MACHINE_CODE = "de";
    public static final String NEW_HK_MACHINE_CODE = "sg";
    public static final String NEW_IN_COUNTRY_CODE = "IN";
    public static final String NEW_IN_MACHINE_CODE = "sg";
    public static final String NEW_IN_TRUE_COUNTRY_CODE = "IN";
    public static final String NEW_IN_TRUE_MACHINE_CODE = "i2";
    public static final String NEW_KR_MACHINE_CODE = "sg";
    public static final String NEW_RU_MACHINE_CODE = "ru";
    public static final String NEW_SG_MACHINE_CODE = "sg";
    public static final String NEW_ST_COUNTRY_CODE = "st";
    public static final String NEW_ST_MACHINE_CODE = "st";
    public static final String NEW_TK_COUNTRY_CODE = "TK";
    public static final String NEW_TK_MACHINE_CODE = "sg";
    public static final String NEW_TW_MACHINE_CODE = "sg";
    public static final String NEW_US_COUNTRY_CODE = "US_SG";
    public static final String NEW_US_MACHINE_CODE = "sg";
    public static final String NEW_US_TRUE_MACHINE_CODE = "us";
    public static final String OLD_CN_COUNTRY_CODE = "cn";
    public static final String OLD_DE_COUNTRY_CODE = "de";
    public static final String OLD_HK_COUNTRY_CODE = "hk";
    public static final String OLD_IN_COUNTRY_CODE = "in";
    public static final String OLD_IN_TRUE_COUNTRY_CODE = "i2";
    public static final String OLD_KR_COUNTRY_CODE = "kr";
    public static final String OLD_RU_COUNTRY_CODE = "ru";
    public static final String OLD_SG_COUNTRY_CODE = "sg";
    public static final String OLD_ST_COUNTRY_CODE = "st";
    public static final String OLD_TK_COUNTRY_CODE = "tr";
    public static final String OLD_TW_COUNTRY_CODE = "tw";
    public static final String OLD_US_COUNTRY_CODE = "us";
    public static final String OLD_US_TRUE_COUNTRY_CODE = "us_true";
    public static final String NEW_CN_COUNTRY_CODE = "CN";
    private static final ServerBean CN_SERVER = new ServerBean("cn", NEW_CN_COUNTRY_CODE, "");
    public static final String NEW_TW_COUNTRY_CODE = "TW";
    private static final ServerBean TW_SERVER = new ServerBean("sg", NEW_TW_COUNTRY_CODE, "");
    public static final String NEW_HK_COUNTRY_CODE = "HK";
    private static final ServerBean HK_SERVER = new ServerBean("sg", NEW_HK_COUNTRY_CODE, "");
    public static final String NEW_SG_COUNTRY_CODE = "SG";
    private static final ServerBean SG_SERVER = new ServerBean("sg", NEW_SG_COUNTRY_CODE, "");
    private static final ServerBean IN_SERVER = new ServerBean("i2", "IN", "");
    public static final String NEW_US_TRUE_COUNTRY_CODE = "US";
    private static final ServerBean US_SERVER = new ServerBean("us", NEW_US_TRUE_COUNTRY_CODE, "");
    public static final String NEW_DE_COUNTRY_CODE = "DE";
    private static final ServerBean DE_SERVER = new ServerBean("de", NEW_DE_COUNTRY_CODE, "");
    public static final String NEW_KR_COUNTRY_CODE = "KR";
    private static final ServerBean KR_SERVER = new ServerBean("sg", NEW_KR_COUNTRY_CODE, "");
    public static final String NEW_RU_COUNTRY_CODE = "RU";
    private static final ServerBean RU_SERVER = new ServerBean("ru", NEW_RU_COUNTRY_CODE, "");
    private static final ServerBean ST_SERVER = new ServerBean("st", "st", "");

    public static ServerBean CN_SERVER() {
        return (ServerBean) CN_SERVER.clone();
    }

    public static ServerBean DE_SERVER() {
        return (ServerBean) DE_SERVER.clone();
    }

    public static ServerBean HK_SERVER() {
        return (ServerBean) HK_SERVER.clone();
    }

    public static ServerBean IN_SERVER() {
        return (ServerBean) IN_SERVER.clone();
    }

    public static ServerBean KR_SERVER() {
        return (ServerBean) KR_SERVER.clone();
    }

    public static ServerBean RU_SERVER() {
        return (ServerBean) RU_SERVER.clone();
    }

    public static ServerBean SG_SERVER() {
        return (ServerBean) SG_SERVER.clone();
    }

    public static ServerBean ST_SERVER() {
        return (ServerBean) ST_SERVER.clone();
    }

    public static ServerBean TW_SERVER() {
        return (ServerBean) TW_SERVER.clone();
    }

    public static ServerBean US_SERVER() {
        return (ServerBean) US_SERVER.clone();
    }

    public static boolean isAmerica(ServerBean serverBean) {
        return isInRegion(serverBean, NEW_US_TRUE_COUNTRY_CODE);
    }

    public static boolean isAmericaServer(ServerBean serverBean) {
        return isInServer(serverBean, "us");
    }

    public static boolean isChinaMainLand(ServerBean serverBean) {
        return isInRegion(serverBean, NEW_CN_COUNTRY_CODE);
    }

    public static boolean isEurope(ServerBean serverBean) {
        return serverBean != null && TextUtils.equals(serverBean.machineCode, "de");
    }

    public static boolean isEuropeServer(ServerBean serverBean) {
        return isInServer(serverBean, "de");
    }

    public static boolean isInRegion(ServerBean serverBean, String str) {
        return (serverBean == null || str == null || !str.equalsIgnoreCase(serverBean.countryCode)) ? false : true;
    }

    private static boolean isInServer(ServerBean serverBean, String str) {
        return (serverBean == null || str == null || !str.equalsIgnoreCase(serverBean.machineCode)) ? false : true;
    }

    public static boolean isIndia(ServerBean serverBean) {
        return isInRegion(serverBean, "IN");
    }

    public static boolean isIndiaServer(ServerBean serverBean) {
        return isInServer(serverBean, "i2");
    }

    public static boolean isInternationalServer(ServerBean serverBean) {
        return (serverBean == null || isChinaMainLand(serverBean) || isStaging(serverBean)) ? false : true;
    }

    public static boolean isKorea(ServerBean serverBean) {
        return isInRegion(serverBean, NEW_KR_COUNTRY_CODE);
    }

    public static boolean isRussia(ServerBean serverBean) {
        return isInRegion(serverBean, NEW_RU_COUNTRY_CODE);
    }

    public static boolean isRussiaServer(ServerBean serverBean) {
        return isInServer(serverBean, "ru");
    }

    public static boolean isSingapore(ServerBean serverBean) {
        return isInRegion(serverBean, NEW_SG_COUNTRY_CODE);
    }

    public static boolean isSingaporeServer(ServerBean serverBean) {
        return isInServer(serverBean, "sg");
    }

    public static boolean isStaging(ServerBean serverBean) {
        return isInRegion(serverBean, "st");
    }

    public static boolean isTW(ServerBean serverBean) {
        return isInRegion(serverBean, NEW_TW_COUNTRY_CODE);
    }

    public static boolean isUK(ServerBean serverBean) {
        return isInRegion(serverBean, GB_COUNTRY_CODE);
    }
}
