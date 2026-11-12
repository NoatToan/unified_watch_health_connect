package com.huawei.hms.ads.uiengineloader;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12911a = "StringUtils";

    private static boolean b(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            af.c(f12911a, "parseIntOrDefault exception: " + e.getClass().getSimpleName());
            return 0;
        }
    }
}
