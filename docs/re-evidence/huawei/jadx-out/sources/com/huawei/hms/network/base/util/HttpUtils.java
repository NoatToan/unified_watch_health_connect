package com.huawei.hms.network.base.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class HttpUtils {
    public static final String HTTPS_PREFIX = "https://";
    public static final String HTTP_PREFIX = "http://";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14512a = "HttpUtils";

    public static boolean isHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean isHttpOrGrsUrl(String str) {
        return isHttpUrl(str) || str.startsWith("grs://");
    }
}
