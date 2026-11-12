package io.sentry.android.core;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import defpackage.ftc;
import defpackage.ucd;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class PhoneStateBreadcrumbsIntegration implements ucd, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SentryAndroidOptions f21404b;

    @TestOnly
    @Nullable
    public a c;

    @Nullable
    public TelephonyManager d;
    public boolean e = false;

    @NotNull
    public final Object f = new Object();

    public static final class a extends PhoneStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ftc f21405a;

        public a(@NotNull ftc ftcVar) {
            this.f21405a = ftcVar;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            if (i == 1) {
                io.sentry.a aVar = new io.sentry.a();
                aVar.q("system");
                aVar.m("device.event");
                aVar.n("action", "CALL_STATE_RINGING");
                aVar.p("Device ringing");
                aVar.o(SentryLevel.INFO);
                this.f21405a.m(aVar);
            }
        }
    }

    public PhoneStateBreadcrumbsIntegration(@NotNull Context context) {
        this.f21403a = (Context) io.sentry.util.p.c(u0.a(context), "Context is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ftc ftcVar, SentryOptions sentryOptions) {
        synchronized (this.f) {
            try {
                if (!this.e) {
                    c(ftcVar, sentryOptions);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f21403a.getSystemService("phone");
        this.d = telephonyManager;
        if (telephonyManager == null) {
            sentryOptions.getLogger().c(SentryLevel.INFO, "TelephonyManager is not available", new Object[0]);
            return;
        }
        try {
            a aVar = new a(ftcVar);
            this.c = aVar;
            this.d.listen(aVar, 32);
            sentryOptions.getLogger().c(SentryLevel.DEBUG, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
            io.sentry.util.k.a("PhoneStateBreadcrumbs");
        } catch (Throwable th) {
            sentryOptions.getLogger().b(SentryLevel.INFO, th, "TelephonyManager is not available or ready to use.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a aVar;
        synchronized (this.f) {
            this.e = true;
        }
        TelephonyManager telephonyManager = this.d;
        if (telephonyManager == null || (aVar = this.c) == null) {
            return;
        }
        telephonyManager.listen(aVar, 0);
        this.c = null;
        SentryAndroidOptions sentryAndroidOptions = this.f21404b;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // defpackage.ucd
    public void register(@NotNull final ftc ftcVar, @NotNull final SentryOptions sentryOptions) {
        io.sentry.util.p.c(ftcVar, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.f21404b = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f21404b.isEnableSystemEventBreadcrumbs()));
        if (this.f21404b.isEnableSystemEventBreadcrumbs() && io.sentry.android.core.internal.util.l.a(this.f21403a, "android.permission.READ_PHONE_STATE")) {
            try {
                sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.m1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21548a.b(ftcVar, sentryOptions);
                    }
                });
            } catch (Throwable th) {
                sentryOptions.getLogger().a(SentryLevel.DEBUG, "Failed to start PhoneStateBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }
}
