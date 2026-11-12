package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 {
    public boolean a(@NotNull String str, @Nullable ILogger iLogger) {
        return c(str, iLogger) != null;
    }

    public boolean b(@NotNull String str, @Nullable SentryOptions sentryOptions) {
        return a(str, sentryOptions != null ? sentryOptions.getLogger() : null);
    }

    @Nullable
    public Class<?> c(@NotNull String str, @Nullable ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(SentryLevel.DEBUG, "Class not available:" + str, e);
            return null;
        } catch (UnsatisfiedLinkError e2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(SentryLevel.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e2);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(SentryLevel.ERROR, "Failed to initialize " + str, th);
            return null;
        }
    }
}
