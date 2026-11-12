package com.huawei.hms.kit.awareness.barrier.internal.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes34.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14027c = 2;
    public static final int d = 3;
    public static final int e = 4;

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    @interface a {
    }

    public static boolean a(int i) {
        return i == 2 || i == 3 || i == 4;
    }

    public static String b(int i) {
        if (i == 2) {
            return "beginning";
        }
        if (i != 3) {
            return i != 4 ? "unknown" : "keeping";
        }
        return "ending";
    }

    private c() {
    }
}
