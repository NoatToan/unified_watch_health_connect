package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import ch.qos.logback.classic.spi.CallerData;
import jg.b;
import oi0.c;

/* JADX INFO: loaded from: classes7.dex */
public class UmidSdkWrapper {
    public static final String UMIDTOKEN_FILE_NAME = "xxxwww_v2";
    public static final String UMIDTOKEN_KEY_NAME = "umidtk";
    public static volatile String cachedUmidToken = "";
    public static volatile boolean initUmidFinished = false;

    public static String compatUmidBug(Context context, String str) {
        if (!c.g(str) && !c.h(str, "000000000000000000000000")) {
            return str;
        }
        String utdid = UtdidWrapper.getUtdid(context);
        if (utdid != null && utdid.contains(CallerData.NA)) {
            utdid = "";
        }
        return c.g(utdid) ? "" : utdid;
    }

    public static synchronized String getSecurityToken(Context context) {
        return cachedUmidToken;
    }

    public static String startUmidTaskSync(Context context, int i14) {
        return "";
    }

    public static synchronized void updateLocalUmidToken(Context context, String str) {
        if (c.k(str)) {
            b.k(context, str);
            cachedUmidToken = str;
        }
    }
}
