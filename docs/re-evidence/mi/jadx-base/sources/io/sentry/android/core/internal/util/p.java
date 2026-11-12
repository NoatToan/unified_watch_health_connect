package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class p {
    public static boolean c(@NotNull Activity activity) {
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static /* synthetic */ void d(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i) {
        atomicBoolean.set(i == 0);
        countDownLatch.countDown();
    }

    public static /* synthetic */ void e(View view, Canvas canvas, ILogger iLogger, CountDownLatch countDownLatch) {
        try {
            view.draw(canvas);
        } catch (Throwable th) {
            try {
                iLogger.a(SentryLevel.ERROR, "Taking screenshot failed (view.draw).", th);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r7 == false) goto L42;
     */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] f(@org.jetbrains.annotations.NotNull android.app.Activity r11, @org.jetbrains.annotations.NotNull io.sentry.util.thread.a r12, @org.jetbrains.annotations.NotNull final io.sentry.ILogger r13, @org.jetbrains.annotations.NotNull io.sentry.android.core.r0 r14) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.p.f(android.app.Activity, io.sentry.util.thread.a, io.sentry.ILogger, io.sentry.android.core.r0):byte[]");
    }
}
