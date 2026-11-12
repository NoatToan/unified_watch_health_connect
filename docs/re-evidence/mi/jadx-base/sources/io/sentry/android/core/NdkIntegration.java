package io.sentry.android.core;

import com.miui.tsmclient.util.Constants;
import defpackage.ftc;
import defpackage.ucd;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class NdkIntegration implements ucd, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Class<?> f21393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SentryAndroidOptions f21394b;

    public NdkIntegration(@Nullable Class<?> cls) {
        this.f21393a = cls;
    }

    public final void a(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f21394b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.f21393a;
        try {
            if (cls != null) {
                try {
                    cls.getMethod(Constants.EXTRA_CLOSE_TAI, new Class[0]).invoke(null, new Object[0]);
                    this.f21394b.getLogger().c(SentryLevel.DEBUG, "NdkIntegration removed.", new Object[0]);
                } catch (NoSuchMethodException e) {
                    this.f21394b.getLogger().a(SentryLevel.ERROR, "Failed to invoke the SentryNdk.close method.", e);
                } catch (Throwable th) {
                    this.f21394b.getLogger().a(SentryLevel.ERROR, "Failed to close SentryNdk.", th);
                }
                a(this.f21394b);
            }
        } catch (Throwable th2) {
            a(this.f21394b);
            throw th2;
        }
    }

    @Override // defpackage.ucd
    public final void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        io.sentry.util.p.c(ftcVar, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.f21394b = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f21394b.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.c(sentryLevel, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || this.f21393a == null) {
            a(this.f21394b);
            return;
        }
        if (this.f21394b.getCacheDirPath() == null) {
            this.f21394b.getLogger().c(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            a(this.f21394b);
            return;
        }
        try {
            this.f21393a.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f21394b);
            this.f21394b.getLogger().c(sentryLevel, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.k.a("Ndk");
        } catch (NoSuchMethodException e) {
            a(this.f21394b);
            this.f21394b.getLogger().a(SentryLevel.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            a(this.f21394b);
            this.f21394b.getLogger().a(SentryLevel.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }
}
