package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class s {
    public static boolean a(@Nullable Double d) {
        return b(d, true);
    }

    public static boolean b(@Nullable Double d, boolean z) {
        if (d == null) {
            return z;
        }
        return !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    public static boolean c(@Nullable Double d) {
        return b(d, true);
    }

    public static boolean d(@Nullable Double d) {
        return e(d, true);
    }

    public static boolean e(@Nullable Double d, boolean z) {
        return b(d, z);
    }
}
