package io.sentry.android.core;

import android.app.Activity;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.ae8;
import defpackage.c8c;
import defpackage.dm1;
import io.sentry.SentryLevel;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class ScreenshotEventProcessor implements ae8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryAndroidOptions f21406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final r0 f21407b;

    @NotNull
    public final io.sentry.android.core.internal.util.g c = new io.sentry.android.core.internal.util.g(io.sentry.android.core.internal.util.b.b(), VibrateModeProgressBar.sLongToLong, 3);

    public ScreenshotEventProcessor(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull r0 r0Var) {
        this.f21406a = (SentryAndroidOptions) io.sentry.util.p.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21407b = (r0) io.sentry.util.p.c(r0Var, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.k.a("Screenshot");
        }
    }

    @Override // defpackage.ae8
    @NotNull
    public io.sentry.s a(@NotNull io.sentry.s sVar, @NotNull c8c c8cVar) {
        byte[] bArrF;
        if (!sVar.y0()) {
            return sVar;
        }
        if (!this.f21406a.isAttachScreenshot()) {
            this.f21406a.getLogger().c(SentryLevel.DEBUG, "attachScreenshot is disabled.", new Object[0]);
            return sVar;
        }
        Activity activityB = v0.c().b();
        if (activityB != null && !io.sentry.util.j.i(c8cVar)) {
            boolean zA = this.c.a();
            this.f21406a.getBeforeScreenshotCaptureCallback();
            if (zA || (bArrF = io.sentry.android.core.internal.util.p.f(activityB, this.f21406a.getMainThreadChecker(), this.f21406a.getLogger(), this.f21407b)) == null) {
                return sVar;
            }
            c8cVar.n(dm1.a(bArrF));
            c8cVar.l("android:activity", activityB);
        }
        return sVar;
    }

    @Override // defpackage.ae8
    @NotNull
    public io.sentry.protocol.w b(@NotNull io.sentry.protocol.w wVar, @NotNull c8c c8cVar) {
        return wVar;
    }
}
