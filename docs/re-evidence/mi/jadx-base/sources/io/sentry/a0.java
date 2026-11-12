package io.sentry;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface a0 {

    public static final class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21367a = new a();

        public static a0 c() {
            return f21367a;
        }

        @Override // io.sentry.a0
        public void a(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.a0
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}
