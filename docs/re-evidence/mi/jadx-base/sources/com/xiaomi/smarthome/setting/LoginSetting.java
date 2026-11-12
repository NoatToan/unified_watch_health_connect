package com.xiaomi.smarthome.setting;

import android.net.Uri;
import android.util.Pair;
import com.mi.health.uri_parser.links.UriMapKt;

/* JADX INFO: loaded from: classes2.dex */
public class LoginSetting {
    public static final String ACCOUNT_TYPE_MI = "com.xiaomi";
    public static final String COOKIE_DOMAIN_MIOT_STORE = "shopapi.io.mi.com";
    public static final String COOKIE_DOMAIN_MI_ESHOPM = "m.mi.com";
    public static final String COOKIE_DOMAIN_MI_HUODONG = ".huodong.mi.com";
    public static final String COOKIE_DOMAIN_PASSPORT_API = "account.xiaomi.com";
    public static final String COOKIE_DOMAIN_RECHARGE_WEB = "web.recharge.pay.xiaomi.com";
    public static final String COOKIE_DOMAIN_XIAOMI_HOME = ".home.mi.com";
    public static final String COOKIE_DOMAIN_XIAOMI_IO = ".io.mi.com";
    public static final String COOKIE_DOMAIN_XIAO_QIANG = "api.gorouter.info";
    public static final String SID_I_AI = "i.ai.mi.com";
    public static final String SID_KFS_CHAT = "kfs_chat";
    public static final String SID_MIOT_STORE = "miotstore";
    public static final String SID_MIUI_BBS = "miui_mijia";
    public static final String SID_MI_ESHOPM = "mi_eshopm_go";
    public static final String SID_MI_HUODONG = "mi_huodong";
    public static final String SID_PASSPORT_API = "passportapi";
    public static final String SID_RECHARGE_WEB = "mipaycom";
    public static final String SID_STAGING = "miot-third-test";
    public static final String SID_TVIDEO = "tvideo";
    public static final String SID_XIAOMI_HOME = "xiaomihome";
    public static final String SID_XIAOMI_IO = "xiaomiio";
    public static final String SID_XIAO_QIANG = "xiaoqiang";
    public static final String UNLOGGEDIN_USERID = "0";

    /* JADX WARN: Code duplicated, block: B:10:0x001b A[PHI: r1
      0x001b: PHI (r1v7 java.lang.String) = (r1v2 java.lang.String), (r1v3 java.lang.String), (r1v4 java.lang.String), (r1v5 java.lang.String) binds: [B:9:0x0019, B:12:0x0023, B:15:0x002c, B:18:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    public static Pair<String, String> getDomainAndSidFromUrl(Uri uri) {
        String str;
        String host = uri.getHost();
        if (host == null) {
            return null;
        }
        if (host.contains(UriMapKt.linkMijiaHost)) {
            str = COOKIE_DOMAIN_XIAOMI_HOME;
        } else {
            String str2 = COOKIE_DOMAIN_PASSPORT_API;
            if (host.contains(COOKIE_DOMAIN_PASSPORT_API)) {
                str = str2;
            } else {
                str2 = COOKIE_DOMAIN_MIOT_STORE;
                if (host.contains(COOKIE_DOMAIN_MIOT_STORE)) {
                    str = str2;
                } else {
                    str2 = COOKIE_DOMAIN_RECHARGE_WEB;
                    if (host.contains(COOKIE_DOMAIN_RECHARGE_WEB)) {
                        str = str2;
                    } else {
                        str2 = COOKIE_DOMAIN_MI_ESHOPM;
                        if (host.contains(COOKIE_DOMAIN_MI_ESHOPM)) {
                            str = str2;
                        } else {
                            str = host.contains("huodong.mi.com") ? COOKIE_DOMAIN_MI_HUODONG : null;
                        }
                    }
                }
            }
        }
        if (str == null) {
            return null;
        }
        return Pair.create(str, getSidByDomain(str));
    }

    public static String getDomainBySid(String str) {
        str.hashCode();
        switch (str) {
            case "mi_huodong":
                return COOKIE_DOMAIN_MI_HUODONG;
            case "mipaycom":
                return COOKIE_DOMAIN_RECHARGE_WEB;
            case "miot-third-test":
                return COOKIE_DOMAIN_XIAOMI_IO;
            case "passportapi":
                return COOKIE_DOMAIN_PASSPORT_API;
            case "xiaoqiang":
                return COOKIE_DOMAIN_XIAO_QIANG;
            case "xiaomiio":
                return COOKIE_DOMAIN_XIAOMI_IO;
            case "xiaomihome":
                return COOKIE_DOMAIN_XIAOMI_HOME;
            case "mi_eshopm_go":
                return COOKIE_DOMAIN_MI_ESHOPM;
            case "miotstore":
                return COOKIE_DOMAIN_MIOT_STORE;
            default:
                return "";
        }
    }

    public static String getSidByDomain(String str) {
        str.hashCode();
        switch (str) {
            case "api.gorouter.info":
                return SID_XIAO_QIANG;
            case ".io.mi.com":
                return SID_XIAOMI_IO;
            case ".huodong.mi.com":
                return SID_MI_HUODONG;
            case ".home.mi.com":
                return SID_XIAOMI_HOME;
            case "account.xiaomi.com":
                return "passportapi";
            case "web.recharge.pay.xiaomi.com":
                return SID_RECHARGE_WEB;
            case "shopapi.io.mi.com":
                return SID_MIOT_STORE;
            case "m.mi.com":
                return SID_MI_ESHOPM;
            default:
                return "";
        }
    }
}
