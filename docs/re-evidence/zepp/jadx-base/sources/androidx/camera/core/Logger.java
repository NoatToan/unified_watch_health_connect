package androidx.camera.core;

import android.os.Build;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Logger {
    public static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    private Logger() {
    }

    public static void d(@NonNull String tag, @NonNull String message) {
        d(tag, message, null);
    }

    public static void e(@NonNull String tag, @NonNull String message) {
        e(tag, message, null);
    }

    public static void i(@NonNull String tag, @NonNull String message) {
        i(tag, message, null);
    }

    public static boolean isDebugEnabled(@NonNull String tag) {
        return sMinLogLevel <= 3 || Log.isLoggable(truncateTag(tag), 3);
    }

    public static boolean isErrorEnabled(@NonNull String tag) {
        return sMinLogLevel <= 6 || Log.isLoggable(truncateTag(tag), 6);
    }

    public static boolean isInfoEnabled(@NonNull String tag) {
        return sMinLogLevel <= 4 || Log.isLoggable(truncateTag(tag), 4);
    }

    public static boolean isWarnEnabled(@NonNull String tag) {
        return sMinLogLevel <= 5 || Log.isLoggable(truncateTag(tag), 5);
    }

    public static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    public static void setMinLogLevel(@IntRange(from = 3, to = 6) int logLevel) {
        sMinLogLevel = logLevel;
    }

    @NonNull
    private static String truncateTag(@NonNull String tag) {
        return (23 >= tag.length() || Build.VERSION.SDK_INT >= 24) ? tag : tag.substring(0, 23);
    }

    public static void w(@NonNull String tag, @NonNull String message) {
        w(tag, message, null);
    }

    public static void d(@NonNull String tag, @NonNull String message, @Nullable final Throwable throwable) {
        if (isDebugEnabled(tag)) {
            Log.d(truncateTag(tag), message, throwable);
        }
    }

    public static void e(@NonNull String tag, @NonNull String message, @Nullable final Throwable throwable) {
        if (isErrorEnabled(tag)) {
            Log.e(truncateTag(tag), message, throwable);
        }
    }

    public static void i(@NonNull String tag, @NonNull String message, @Nullable final Throwable throwable) {
        if (isInfoEnabled(tag)) {
            Log.i(truncateTag(tag), message, throwable);
        }
    }

    public static void w(@NonNull String tag, @NonNull String message, @Nullable final Throwable throwable) {
        if (isWarnEnabled(tag)) {
            Log.w(truncateTag(tag), message, throwable);
        }
    }
}
