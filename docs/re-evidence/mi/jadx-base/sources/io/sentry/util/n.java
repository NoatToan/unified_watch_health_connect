package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class n {
    public static void a(@NotNull Class<?> cls, @Nullable Object obj, @NotNull ILogger iLogger) {
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        Object[] objArr = new Object[2];
        objArr[0] = obj != null ? obj.getClass().getCanonicalName() : "Hint";
        objArr[1] = cls.getCanonicalName();
        iLogger.c(sentryLevel, "%s is not %s", objArr);
    }
}
