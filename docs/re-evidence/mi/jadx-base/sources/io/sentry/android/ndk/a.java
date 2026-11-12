package io.sentry.android.ndk;

import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.c1;
import io.sentry.util.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c1 {

    @NotNull
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NativeModuleListLoader f21623b;

    public a(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull NativeModuleListLoader nativeModuleListLoader) {
        this.f21622a = (SentryOptions) p.c(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f21623b = (NativeModuleListLoader) p.c(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}
