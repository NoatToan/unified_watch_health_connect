package com.huawei.phoneservice.feedback.media.impl.utils;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    private static String e;

    public static boolean c() {
        synchronized (c.class) {
            if (e == null) {
                e = e.b("ro.build.characteristics");
            }
        }
        return "tablet".equals(e) || "car".equals(e);
    }

    private c() {
    }
}
