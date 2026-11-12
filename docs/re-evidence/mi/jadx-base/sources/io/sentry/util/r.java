package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f21896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f21897b;

    static {
        try {
            f21896a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f21896a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f21897b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f21897b = false;
            }
        } catch (Throwable unused2) {
            f21897b = false;
        }
    }

    public static boolean a() {
        return f21896a;
    }

    public static boolean b() {
        return f21897b;
    }

    public static boolean c() {
        return !f21896a;
    }
}
