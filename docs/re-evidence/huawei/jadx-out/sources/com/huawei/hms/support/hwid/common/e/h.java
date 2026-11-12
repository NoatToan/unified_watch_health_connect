package com.huawei.hms.support.hwid.common.e;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
public class h {
    public static String a(String str, String[] strArr) {
        return Pattern.compile(strArr[0]).matcher(str).replaceAll(strArr[1]);
    }

    public static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            e.c("StringUtil", "paseInt error " + e.getClass().getSimpleName(), true);
            return -1;
        }
    }
}
