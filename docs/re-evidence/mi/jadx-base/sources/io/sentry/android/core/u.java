package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class u implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f21593a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21594a;

        static {
            int[] iArr = new int[SentryLevel.values().length];
            f21594a = iArr;
            try {
                iArr[SentryLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21594a[SentryLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21594a[SentryLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21594a[SentryLevel.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21594a[SentryLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public u() {
        this("Sentry");
    }

    @Override // io.sentry.ILogger
    public void a(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Throwable th) {
        if (a.f21594a[sentryLevel.ordinal()] != 4) {
            return;
        }
        Log.wtf(this.f21593a, str, th);
    }

    @Override // io.sentry.ILogger
    public void b(@NotNull SentryLevel sentryLevel, @Nullable Throwable th, @NotNull String str, @Nullable Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            a(sentryLevel, str, th);
        } else {
            a(sentryLevel, String.format(str, objArr), th);
        }
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(sentryLevel), this.f21593a, str);
        } else {
            Log.println(e(sentryLevel), this.f21593a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(@Nullable SentryLevel sentryLevel) {
        return true;
    }

    public final int e(@NotNull SentryLevel sentryLevel) {
        int i = a.f21594a[sentryLevel.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            return i != 4 ? 3 : 7;
        }
        return 5;
    }

    public u(@NotNull String str) {
        this.f21593a = str;
    }
}
