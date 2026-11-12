package io.sentry.util;

import java.util.Arrays;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class p {
    public static boolean a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(@Nullable Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static <T> T c(@Nullable T t, @NotNull String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }
}
