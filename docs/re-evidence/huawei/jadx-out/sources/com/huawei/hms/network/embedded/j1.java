package com.huawei.hms.network.embedded;

import android.content.Context;
import android.os.Build;
import com.huawei.hms.framework.common.PackageUtils;
import com.huawei.hms.framework.common.StringUtils;

/* JADX INFO: loaded from: classes34.dex */
public class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14933a = "8.0.1.320";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14934b = "2026-04-03";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14935c = r.h.intValue();
    public static String d = null;

    public static class a {
        public static final int CATTLE = 3;
        public static final int DRAGON = 6;
        public static final int RABBIT = 5;
        public static final int RAT = 2;
        public static final int SNAKE = 7;
        public static final int TIGER = 4;
    }

    public static String getVersion() {
        return "8.0.1.320";
    }

    public static String getUserAgent(Context context) {
        if (d == null) {
            d = getAgent(context);
        }
        return d;
    }

    public static String getBuildTime() {
        return "2026-04-03";
    }

    public static int getApiLevel() {
        return f14935c;
    }

    public static String getAgent(Context context) {
        return context == null ? StringUtils.format("RestClient/%s", getVersion()) : StringUtils.format("%s/%s (Linux; Android %s; %s) RestClient/%s", context.getPackageName(), PackageUtils.getVersionName(context), Build.VERSION.RELEASE, Build.MODEL, getVersion());
    }
}
