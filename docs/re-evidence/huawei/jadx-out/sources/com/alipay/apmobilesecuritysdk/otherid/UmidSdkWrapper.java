package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import defpackage.kj;
import defpackage.lg;

/* JADX INFO: loaded from: classes4.dex */
public class UmidSdkWrapper {
    private static final String UMIDTOKEN_FILE_NAME = "xxxwww_v2";
    private static final String UMIDTOKEN_KEY_NAME = "umidtk";
    private static volatile String cachedUmidToken = "";
    private static volatile boolean initUmidFinished = false;

    private static void updateLocalUmidToken(Context context, String str) {
        synchronized (UmidSdkWrapper.class) {
            if (kj.e(str)) {
                lg.c(context, UMIDTOKEN_FILE_NAME, UMIDTOKEN_KEY_NAME, str);
                cachedUmidToken = str;
            }
        }
    }

    public static String startUmidTaskSync(Context context, int i) {
        return "";
    }

    public static String getSecurityToken(Context context) {
        String str;
        synchronized (UmidSdkWrapper.class) {
            str = cachedUmidToken;
        }
        return str;
    }

    private static String compatUmidBug(Context context, String str) {
        if (!kj.c(str) && !kj.c(str, "000000000000000000000000")) {
            return str;
        }
        String utdid = UtdidWrapper.getUtdid(context);
        if (utdid != null && utdid.contains("?")) {
            utdid = "";
        }
        return kj.c(utdid) ? "" : utdid;
    }
}
